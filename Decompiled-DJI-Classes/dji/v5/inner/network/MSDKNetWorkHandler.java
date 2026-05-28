/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.inner.network;

import android.content.Context;
import dji.sdk.handler.Network.DJINetworkHandler;
import dji.sdk.handler.Network.IDownloadCallback;
import dji.sdk.handler.Network.IDownloadSizeCallback;
import dji.sdk.handler.Network.INetworkRequestCallback;
import java.util.Map;

public class MSDKNetWorkHandler
extends DJINetworkHandler {
    public MSDKNetWorkHandler(Context context) {
    }

    @Override
    public boolean get(String string, Map<String, String> map, INetworkRequestCallback iNetworkRequestCallback) {
        return false;
    }

    @Override
    public boolean post(String string, byte[] byArray, Map<String, String> map, INetworkRequestCallback iNetworkRequestCallback, byte[] byArray2) {
        return false;
    }

    @Override
    public void download(int n, String string, Map<String, String> map, String string2, IDownloadCallback iDownloadCallback) {
    }

    @Override
    public void download(int n, String string, Map<String, String> map, String string2, IDownloadSizeCallback iDownloadSizeCallback) {
    }
}

