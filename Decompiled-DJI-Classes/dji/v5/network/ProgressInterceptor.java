/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Response
 *  okhttp3.ResponseBody
 */
package dji.v5.network;

import dji.v5.network.ProgressResponseBody;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

class ProgressInterceptor
implements Interceptor {
    public final HashMap<Call, ProgressResponseBody.InnerProgressListener> ut_a;

    public ProgressInterceptor(HashMap<Call, ProgressResponseBody.InnerProgressListener> hashMap) {
        this.ut_a = hashMap;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        Response response = chain2.proceed(chain2.request());
        return response.newBuilder().body((ResponseBody)new ProgressResponseBody(response.body(), this.ut_a.get(chain.call()))).build();
    }
}

