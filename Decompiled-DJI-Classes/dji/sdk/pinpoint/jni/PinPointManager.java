/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.pinpoint.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.flightcontroller.PinPointParamMsg;
import dji.sdk.keyvalue.value.flightcontroller.PinPointResultMsg;

public class PinPointManager
implements JNIProguardKeepTag {
    public static PinPointResultMsg gpsPointToLiveview(PinPointParamMsg pinPointParamMsg) {
        return null;
    }

    private static native byte[] native_GpsPointToLiveview(byte[] var0);
}

