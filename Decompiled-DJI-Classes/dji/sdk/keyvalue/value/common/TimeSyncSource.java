/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class TimeSyncSource
extends Enum<TimeSyncSource>
implements JNIProguardKeepTag {
    public static final /* enum */ TimeSyncSource FROM_NETWORK = new TimeSyncSource(0);
    public static final /* enum */ TimeSyncSource FROM_GPS = new TimeSyncSource(1);
    public static final /* enum */ TimeSyncSource FROM_SYSTEM = new TimeSyncSource(2);
    public static final /* enum */ TimeSyncSource TIME_INVALID = new TimeSyncSource(3);
    public static final /* enum */ TimeSyncSource UNKNOWN = new TimeSyncSource(65535);
    private int value;
    private static final TimeSyncSource[] allValues;
    private static final /* synthetic */ TimeSyncSource[] $VALUES;

    public static TimeSyncSource[] values() {
        return null;
    }

    public static TimeSyncSource valueOf(String string) {
        return null;
    }

    private TimeSyncSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimeSyncSource find(int n) {
        return null;
    }

    private static /* synthetic */ TimeSyncSource[] $values() {
        return null;
    }

    static {
        $VALUES = TimeSyncSource.$values();
        allValues = TimeSyncSource.values();
    }
}

