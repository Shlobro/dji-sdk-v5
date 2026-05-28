/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.datalink.bridge.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.common.BridgeDataLinkInfo;
import dji.sdk.keyvalue.value.common.BridgeDataType;

public interface JNIDataLinkBridgeServerCallback
extends JNIProguardKeepTag {
    public void onConnect(BridgeDataLinkInfo var1);

    public void onDisconnect(BridgeDataLinkInfo var1);

    public void onReceiveData(BridgeDataLinkInfo var1, BridgeDataType var2, byte[] var3);
}

