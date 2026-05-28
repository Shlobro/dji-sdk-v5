/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.djinetworkrtkhelper;

import dji.sdk.djinetworkrtkhelper.DJIRtcmSnippet;

public interface DJINetworkRTKListener {
    public void onRtcmDatachanged(DJIRtcmSnippet var1);

    public void onStatusChanged(int var1, String var2);
}

