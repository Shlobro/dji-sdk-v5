/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.provider;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public interface ISSLSocketFactoryProvider {
    public SSLSocketFactory sslSocketFactory();

    public X509TrustManager trustManager();
}

