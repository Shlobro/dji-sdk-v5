/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.common.transferutils;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.remotecontroller.RCProductType;
import dji.sdk.keyvalue.value.remotecontroller.RemoteControllerType;

public class TransferUtils
implements JNIProguardKeepTag {
    public static RCProductType convertRCTypeToRCProductType(RemoteControllerType remoteControllerType) {
        return null;
    }

    private static native int native_ConvertRCTypeToRCProductType(int var0);
}

