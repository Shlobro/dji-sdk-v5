/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Request
 *  okhttp3.Response
 */
package dji.v5.network;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RetryInterceptor
implements Interceptor {
    public int ut_a;
    public int ut_b = 0;

    public RetryInterceptor(int n) {
        this.ut_a = n;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        int n;
        Interceptor.Chain chain2 = chain;
        Request request = chain2.request();
        Response response = chain2.proceed(request);
        while (!response.isSuccessful() && (n = this.ut_b) < this.ut_a) {
            this.ut_b = n + 1;
            response = chain.proceed(request);
        }
        return response;
    }
}

