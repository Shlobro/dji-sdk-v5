/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.Network;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.handler.Network.IDownloadCallback;
import dji.sdk.handler.Network.IDownloadSizeCallback;
import dji.sdk.handler.Network.INetworkRequestCallback;
import java.util.Map;

public interface INetworkHandler
extends JNIProguardKeepTag {
    public boolean initialize();

    public void uninitialize();

    public boolean get(String var1, Map<String, String> var2, INetworkRequestCallback var3);

    public boolean post(String var1, byte[] var2, Map<String, String> var3, INetworkRequestCallback var4, byte[] var5);

    public void download(int var1, String var2, Map<String, String> var3, String var4, IDownloadCallback var5);

    public void download(int var1, String var2, Map<String, String> var3, String var4, IDownloadSizeCallback var5);

    public void stopDownload(int var1);

    public boolean networkStatus();

    public boolean isDebugUrl();
}

