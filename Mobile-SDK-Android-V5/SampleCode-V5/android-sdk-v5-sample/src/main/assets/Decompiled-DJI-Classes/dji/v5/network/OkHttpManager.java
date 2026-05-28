/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dji.v5.utils.common.LogPath
 *  dji.v5.utils.common.LogUtils
 *  dji.v5.utils.inner.HttpsUtils
 *  okhttp3.Call
 *  okhttp3.Interceptor
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 */
package dji.v5.network;

import dji.v5.network.ProgressInterceptor;
import dji.v5.network.ProgressResponseBody;
import dji.v5.network.RetryInterceptor;
import dji.v5.utils.common.LogPath;
import dji.v5.utils.common.LogUtils;
import dji.v5.utils.inner.HttpsUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

class OkHttpManager {
    public OkHttpClient.Builder ut_a;

    public OkHttpManager() {
        try {
            this.ut_a = new OkHttpClient.Builder().sslSocketFactory(HttpsUtils.getDJISSLSocketFactoryForJavax(), (X509TrustManager)HttpsUtils.getTrustManager());
        }
        catch (Exception exception) {
            String string = exception.getMessage();
            LogUtils.e((LogPath)LogPath.RUNNING_INFO, (Object[])new Object[]{string});
        }
    }

    public static OkHttpManager getInstance() {
        return Holder.INSTANCE;
    }

    public /* synthetic */ OkHttpManager(1 var1_1) {
        this();
    }

    public OkHttpManager setTimeout(int n) {
        OkHttpManager okHttpManager = this;
        long l = n;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpManager.ut_a.readTimeout(l, timeUnit);
        okHttpManager.ut_a.connectTimeout(l, timeUnit);
        return okHttpManager;
    }

    public OkHttpManager setRetryTimes(int n) {
        OkHttpManager okHttpManager = this;
        okHttpManager.ut_a.addInterceptor((Interceptor)new RetryInterceptor(n));
        return okHttpManager;
    }

    public OkHttpManager setProgressListener(HashMap<Call, ProgressResponseBody.InnerProgressListener> hashMap) {
        OkHttpManager okHttpManager = this;
        okHttpManager.ut_a.addNetworkInterceptor((Interceptor)new ProgressInterceptor(hashMap));
        return okHttpManager;
    }

    public OkHttpClient newClient() {
        return this.ut_a.build();
    }

    public static class Holder {
        public static final OkHttpManager INSTANCE = new OkHttpManager();
    }
}

