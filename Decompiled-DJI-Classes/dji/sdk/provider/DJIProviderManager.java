/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.ConnectionSpec
 */
package dji.sdk.provider;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.provider.IClientAltitudeProvider;
import dji.sdk.provider.IClientLanguageProvider;
import dji.sdk.provider.IClientLocationProvider;
import dji.sdk.provider.IDebugUrlEnableProvider;
import dji.sdk.provider.IExtraAppInfoProvider;
import dji.sdk.provider.INetworkConfigProvider;
import dji.sdk.provider.ISSLSocketFactoryProvider;
import java.util.List;
import okhttp3.ConnectionSpec;

public class DJIProviderManager
implements JNIProguardKeepTag {
    private static volatile DJIProviderManager mInstance = null;
    private IClientLocationProvider clientLocationProvider;
    private IClientAltitudeProvider clientAltitudeProvider;
    private IExtraAppInfoProvider extraAppInfoProvider;
    private IClientLanguageProvider clientLanguageProvider;
    private ISSLSocketFactoryProvider sslSocketFactoryProvider;
    private INetworkConfigProvider networkConfigProvider;
    private IDebugUrlEnableProvider debugUrlEnableProvider;
    private List<ConnectionSpec> sslConnetionSpecs;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIProviderManager getInstance() {
        return null;
    }

    private DJIProviderManager() {
    }

    public IClientLocationProvider getClientLocationProvider() {
        return null;
    }

    public void setClientLocationProvider(IClientLocationProvider iClientLocationProvider) {
    }

    public IClientLanguageProvider getClientLanguageProvider() {
        return null;
    }

    public void setClientLanguageProvider(IClientLanguageProvider iClientLanguageProvider) {
    }

    public IClientAltitudeProvider getClientAltitudeProvider() {
        return null;
    }

    public void setClientAltitudeProvider(IClientAltitudeProvider iClientAltitudeProvider) {
    }

    public IExtraAppInfoProvider getExtraAppInfoProvider() {
        return null;
    }

    public void setExtraAppInfoProvider(IExtraAppInfoProvider iExtraAppInfoProvider) {
    }

    public ISSLSocketFactoryProvider getSslSocketFactoryProvider() {
        return null;
    }

    public void setSslSocketFactoryProvider(ISSLSocketFactoryProvider iSSLSocketFactoryProvider) {
    }

    public void setSslConnectionSpecs(List<ConnectionSpec> list) {
    }

    public List<ConnectionSpec> getSslConnetionSpecs() {
        return null;
    }

    public INetworkConfigProvider getNetworkConfigProvider() {
        return null;
    }

    public void setNetworkConfigProvider(INetworkConfigProvider iNetworkConfigProvider) {
    }
}

