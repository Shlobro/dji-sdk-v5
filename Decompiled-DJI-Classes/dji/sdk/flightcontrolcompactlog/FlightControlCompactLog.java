/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.flightcontrolcompactlog;

import dji.jni.JNIProguardKeepTag;

public class FlightControlCompactLog
implements JNIProguardKeepTag {
    public static String getFlightControlCompactLogDirPath() {
        return null;
    }

    private static native String native_GetFlightControlCompactLogDirPath();
}

