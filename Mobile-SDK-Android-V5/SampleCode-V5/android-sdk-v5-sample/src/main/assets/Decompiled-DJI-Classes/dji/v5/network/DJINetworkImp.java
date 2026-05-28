/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 *  dji.v5.common.error.DJILDMError
 *  dji.v5.common.error.DJINetworkError
 *  dji.v5.common.error.IDJIError
 *  dji.v5.common.ldm.LDMExemptModule
 *  dji.v5.manager.interfaces.ILDMManager
 *  dji.v5.manager.ldm.LDMManager
 *  dji.v5.network.DJIHttpCallback
 *  dji.v5.network.DJIHttpRequest
 *  dji.v5.network.DJIHttpResponse
 *  dji.v5.network.IDJINetworkManager
 *  dji.v5.utils.common.LogPath
 *  dji.v5.utils.common.LogUtils
 *  dji.v5.utils.common.NetworkUtils
 *  okhttp3.Call
 *  okhttp3.Callback
 *  okhttp3.Headers
 *  okhttp3.Headers$Builder
 *  okhttp3.HttpUrl
 *  okhttp3.MediaType
 *  okhttp3.MultipartBody$Builder
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package dji.v5.network;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.v5.common.error.DJILDMError;
import dji.v5.common.error.DJINetworkError;
import dji.v5.common.error.IDJIError;
import dji.v5.common.ldm.LDMExemptModule;
import dji.v5.manager.interfaces.ILDMManager;
import dji.v5.manager.ldm.LDMManager;
import dji.v5.network.DJIHttpCallback;
import dji.v5.network.DJIHttpRequest;
import dji.v5.network.DJIHttpResponse;
import dji.v5.network.IDJINetworkManager;
import dji.v5.network.OkHttpManager;
import dji.v5.network.ProgressResponseBody;
import dji.v5.utils.common.LogPath;
import dji.v5.utils.common.LogUtils;
import dji.v5.utils.common.NetworkUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class DJINetworkImp
implements IDJINetworkManager {
    public final String ut_a;
    public final OkHttpClient ut_b;
    public final HashMap<DJIHttpRequest, Call> ut_c;
    public final HashMap<Call, ProgressResponseBody.InnerProgressListener> ut_d;
    public final ILDMManager ut_e;

    @Keep
    public DJINetworkImp() {
        HashMap hashMap;
        DJINetworkImp dJINetworkImp = hashMap2;
        String string = LogUtils.getTag((Object)dJINetworkImp);
        DJINetworkImp dJINetworkImp2 = hashMap2;
        dJINetworkImp2.ut_a = string;
        dJINetworkImp2.ut_c = new HashMap();
        HashMap hashMap2 = hashMap;
        dJINetworkImp2.ut_d = new HashMap();
        dJINetworkImp2.ut_b = OkHttpManager.getInstance().setProgressListener(hashMap2).newClient();
        dJINetworkImp2.ut_e = LDMManager.getInstance();
        LogUtils.i((String)string, (Object[])new Object[]{"DJINetworkImp init"});
    }

    public static void ut_a(DJINetworkImp dJINetworkImp, DJIHttpRequest dJIHttpRequest, Call call) {
        DJINetworkImp dJINetworkImp2 = dJINetworkImp;
        dJINetworkImp2.ut_c.remove(dJIHttpRequest);
        dJINetworkImp2.ut_d.remove(call);
    }

    public static /* synthetic */ DJIHttpResponse ut_a(DJINetworkImp dJINetworkImp, Response response) {
        return dJINetworkImp.ut_a(response);
    }

    public String getSign() {
        return "XX";
    }

    public void enqueue(final @NonNull DJIHttpRequest dJIHttpRequest, final DJIHttpCallback<DJIHttpResponse> dJIHttpCallback) {
        Object[] objectArray;
        if (!NetworkUtils.isNetworkAvailable()) {
            Object[] objectArray2 = new Object[1];
            objectArray = objectArray2;
            objectArray2[0] = "no net work";
            dJIHttpCallback.onFailure((IDJIError)DJINetworkError.FACTORY.buildWithResValue("NETWORK_ACCESS_FAIL", objectArray));
            return;
        }
        if (!objectArray.ut_e.isNetworkServiceEnabledForModule(dJIHttpRequest.getLdmExemptModule())) {
            dJIHttpCallback.onFailure((IDJIError)DJILDMError.FACTORY.build("LDM_NETWORK_ACCESS_FAILED"));
            return;
        }
        LogUtils.i((LogPath)LogPath.COMMON, (Object[])new Object[]{"DJINetworkImp start enqueue request:", dJIHttpRequest});
        Call call = objectArray.ut_d(dJIHttpRequest);
        if (call == null) {
            Object[] objectArray3 = new Object[1];
            objectArray = objectArray3;
            objectArray3[0] = "input http error";
            dJIHttpCallback.onFailure((IDJIError)DJINetworkError.FACTORY.buildWithResValue("NETWORK_ACCESS_FAIL", objectArray));
            return;
        }
        objectArray.ut_c.put(dJIHttpRequest, call);
        objectArray.ut_d.put(call, (l, l2, bl) -> dJIHttpCallback.onLoading(l, l2));
        call.enqueue(new Callback(){

            public void onFailure(@NonNull Call call, @NonNull IOException object) {
                if (dJIHttpCallback != null) {
                    if (call.isCanceled()) {
                        dJIHttpCallback.onFailure((IDJIError)DJINetworkError.FACTORY.build("CALL_CANCELED"));
                    } else {
                        object = ((Throwable)object).getMessage();
                        Object[] objectArray = new Object[1];
                        Object[] objectArray2 = objectArray;
                        objectArray[0] = object;
                        dJIHttpCallback.onFailure((IDJIError)DJINetworkError.FACTORY.buildWithResValue("NETWORK_ACCESS_FAIL", objectArray2));
                    }
                }
                DJINetworkImp.ut_a(DJINetworkImp.this, dJIHttpRequest, call);
            }

            public void onResponse(@NonNull Call call, @NonNull Response response) {
                DJIHttpCallback dJIHttpCallback2 = dJIHttpCallback;
                if (dJIHttpCallback2 != null) {
                    dJIHttpCallback2.onResponse((Object)DJINetworkImp.this.ut_a(response));
                }
                DJINetworkImp.ut_a(DJINetworkImp.this, dJIHttpRequest, call);
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DJIHttpResponse execute(@NonNull DJIHttpRequest var1_1) {
        block9: {
            if (!NetworkUtils.isNetworkAvailable()) {
                return null;
            }
            if (!this.ut_e.isNetworkServiceEnabledForModule(var1_1.getLdmExemptModule())) {
                return null;
            }
            LogUtils.i((LogPath)LogPath.COMMON, (Object[])new Object[]{"DJINetworkImp start execute request:", var1_1});
            var2_2 = null;
            var3_4 = null;
            var3_4 = this.ut_d(var1_1);
            this.ut_c.put(var1_1, var3_4);
            if (var3_4 == null) break block9;
            try {
                var2_2 = this.ut_a(var3_4.execute());
                return var2_2;
            }
            catch (Throwable var2_3) {}
            catch (Exception var4_5) {}
            ** finally { 
        }
        v0 = this;
        v0.ut_c.remove(var1_1);
        v0.ut_d.remove(var3_4);
        return var2_2;
    }

    public void cancel(@NonNull DJIHttpRequest dJIHttpRequest) {
        Call call = this.ut_c.get(dJIHttpRequest);
        if (call != null) {
            call.cancel();
        }
        DJINetworkImp dJINetworkImp = this;
        dJINetworkImp.ut_c.remove(dJIHttpRequest);
        dJINetworkImp.ut_d.remove(call);
    }

    public void cancel(@NonNull LDMExemptModule lDMExemptModule) {
        for (Map.Entry<DJIHttpRequest, Call> entry : this.ut_c.entrySet()) {
            if (entry.getKey().getLdmExemptModule() != lDMExemptModule) continue;
            DJINetworkImp dJINetworkImp = this;
            Map.Entry<DJIHttpRequest, Call> entry2 = entry;
            entry2.getValue().cancel();
            DJIHttpRequest dJIHttpRequest = entry2.getKey();
            Call call = entry2.getValue();
            dJINetworkImp.ut_c.remove(dJIHttpRequest);
            dJINetworkImp.ut_d.remove(call);
        }
    }

    public void cancelAll() {
        DJINetworkImp dJINetworkImp = this;
        dJINetworkImp.ut_b.dispatcher().cancelAll();
        dJINetworkImp.ut_c.clear();
    }

    public final void ut_a(DJIHttpRequest dJIHttpRequest, Call call) {
        DJINetworkImp dJINetworkImp = this;
        dJINetworkImp.ut_c.remove(dJIHttpRequest);
        dJINetworkImp.ut_d.remove(call);
    }

    public final Call ut_d(DJIHttpRequest dJIHttpRequest) {
        int n = 2.ut_a[dJIHttpRequest.getRequestType().ordinal()];
        dJIHttpRequest = n != 1 ? (n != 2 ? this.ut_a(dJIHttpRequest) : this.ut_c(dJIHttpRequest)) : this.ut_b(dJIHttpRequest);
        if (dJIHttpRequest == null) {
            return null;
        }
        return this.ut_b.newCall((Request)dJIHttpRequest);
    }

    public final DJIHttpResponse ut_a(Response response) {
        DJIHttpResponse dJIHttpResponse;
        DJIHttpResponse dJIHttpResponse2;
        DJIHttpResponse dJIHttpResponse3 = dJIHttpResponse2;
        dJIHttpResponse2 = new DJIHttpResponse(-1);
        if (response == null) {
            return dJIHttpResponse3;
        }
        DJIHttpResponse dJIHttpResponse4 = dJIHttpResponse;
        DJINetworkImp dJINetworkImp = string2;
        Response response2 = response;
        Response response3 = response2;
        Response response4 = response2;
        int n = response2.code();
        String string = response4.body().string();
        Map<String, String> map = dJINetworkImp.ut_b(response3);
        try {
            dJIHttpResponse = new DJIHttpResponse(n, string, map);
            dJIHttpResponse3 = dJIHttpResponse4;
        }
        catch (Exception exception) {
            String string2 = exception.getMessage();
            LogUtils.e((String)((DJINetworkImp)((Object)string2)).ut_a, (Object[])new Object[]{string2});
        }
        return dJIHttpResponse3;
    }

    public final Request ut_a(DJIHttpRequest dJIHttpRequest) {
        Request.Builder builder;
        HttpUrl httpUrl = HttpUrl.parse((String)dJIHttpRequest.getUrl());
        if (httpUrl == null) {
            return null;
        }
        httpUrl = httpUrl.newBuilder();
        Map map = dJIHttpRequest.getParams();
        if (map != null) {
            for (String string : dJIHttpRequest.getParams().keySet()) {
                httpUrl.addQueryParameter(string, (String)map.get(string));
            }
        }
        map = builder;
        map();
        return builder.headers(this.ut_a(dJIHttpRequest.getHeaders())).url(httpUrl.build()).build();
    }

    public final Request ut_b(DJIHttpRequest dJIHttpRequest) {
        HttpUrl httpUrl = HttpUrl.parse((String)dJIHttpRequest.getUrl());
        if (httpUrl == null) {
            return null;
        }
        httpUrl = httpUrl.newBuilder();
        return new Request.Builder().url(httpUrl.build()).headers(this.ut_a(dJIHttpRequest.getHeaders())).post(RequestBody.create((MediaType)MediaType.parse((String)dJIHttpRequest.getMediaType().value()), (String)dJIHttpRequest.getBody())).build();
    }

    public final Request ut_c(DJIHttpRequest dJIHttpRequest) {
        HttpUrl httpUrl = HttpUrl.parse((String)dJIHttpRequest.getUrl());
        if (httpUrl == null) {
            return null;
        }
        httpUrl = httpUrl.newBuilder();
        MediaType mediaType = MediaType.parse((String)dJIHttpRequest.getMediaType().value());
        if (mediaType == null) {
            return null;
        }
        mediaType = new MultipartBody.Builder().setType(mediaType);
        if (dJIHttpRequest.getParams() != null) {
            for (String string : dJIHttpRequest.getParams().keySet()) {
                mediaType.addFormDataPart(string, (String)dJIHttpRequest.getParams().get(string));
            }
        }
        return new Request.Builder().url(httpUrl.build()).headers(this.ut_a(dJIHttpRequest.getHeaders())).post((RequestBody)mediaType.build()).build();
    }

    public final Headers ut_a(Map<String, String> object) {
        Headers.Builder builder;
        DJINetworkImp dJINetworkImp = builder;
        builder = new Headers.Builder();
        if (object != null) {
            for (Map.Entry entry : object.entrySet()) {
                dJINetworkImp.add((String)entry.getKey(), (String)entry.getValue());
            }
        }
        return dJINetworkImp.build();
    }

    public final Map<String, String> ut_b(Response response) {
        HashMap hashMap;
        HashMap hashMap2 = hashMap;
        hashMap = new HashMap();
        response = response.headers();
        int n = response.size();
        for (int i = 0; i < n; ++i) {
            Response response2 = response;
            String string = response2.name(i);
            hashMap2.put(string, response2.value(i));
        }
        return hashMap2;
    }
}

