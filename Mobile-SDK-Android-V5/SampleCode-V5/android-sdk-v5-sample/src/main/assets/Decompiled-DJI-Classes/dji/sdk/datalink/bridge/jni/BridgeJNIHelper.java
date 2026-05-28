/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.datalink.bridge.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.datalink.bridge.DataLinkBridgeServerCallback;
import dji.sdk.keyvalue.value.common.BridgeDataLinkInfo;

public class BridgeJNIHelper
implements JNIProguardKeepTag {
    private static BridgeDataLinkInfo createBridgeDataLinkInfo(String string, int n, boolean bl, boolean bl2, String string2, int n2) {
        return null;
    }

    private static void callReceiveCallback(DataLinkBridgeServerCallback dataLinkBridgeServerCallback, BridgeDataLinkInfo bridgeDataLinkInfo, int n, byte[] byArray) {
    }

    private static void callConnectCallback(DataLinkBridgeServerCallback dataLinkBridgeServerCallback, BridgeDataLinkInfo bridgeDataLinkInfo) {
    }

    private static void callDisconnectCallback(DataLinkBridgeServerCallback dataLinkBridgeServerCallback, BridgeDataLinkInfo bridgeDataLinkInfo) {
    }
}

