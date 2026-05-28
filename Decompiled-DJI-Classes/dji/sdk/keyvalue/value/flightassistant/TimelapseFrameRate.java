/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TimelapseFrameRate
extends Enum<TimelapseFrameRate>
implements JNIProguardKeepTag {
    public static final /* enum */ TimelapseFrameRate FPS_25 = new TimelapseFrameRate(0);
    public static final /* enum */ TimelapseFrameRate FPS_30 = new TimelapseFrameRate(1);
    public static final /* enum */ TimelapseFrameRate UNKNOWN = new TimelapseFrameRate(255);
    private int value;
    private static final TimelapseFrameRate[] allValues;
    private static final /* synthetic */ TimelapseFrameRate[] $VALUES;

    public static TimelapseFrameRate[] values() {
        return null;
    }

    public static TimelapseFrameRate valueOf(String string) {
        return null;
    }

    private TimelapseFrameRate(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimelapseFrameRate find(int n) {
        return null;
    }

    private static /* synthetic */ TimelapseFrameRate[] $values() {
        return null;
    }

    static {
        $VALUES = TimelapseFrameRate.$values();
        allValues = TimelapseFrameRate.values();
    }
}

