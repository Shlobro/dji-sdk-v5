/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FTSInfoStatus
extends Enum<FTSInfoStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ FTSInfoStatus DISCONNECT = new FTSInfoStatus(0);
    public static final /* enum */ FTSInfoStatus FTS_IS_READY = new FTSInfoStatus(1);
    public static final /* enum */ FTSInfoStatus FTS_CLOUD_DISCONNECT = new FTSInfoStatus(2);
    public static final /* enum */ FTSInfoStatus FTS_TRIGGER = new FTSInfoStatus(3);
    public static final /* enum */ FTSInfoStatus FTS_DONGLE_LOST = new FTSInfoStatus(4);
    public static final /* enum */ FTSInfoStatus FTS_UNKNOWN_ERROR = new FTSInfoStatus(99);
    public static final /* enum */ FTSInfoStatus UNKNOWN = new FTSInfoStatus(65535);
    private int value;
    private static final FTSInfoStatus[] allValues;
    private static final /* synthetic */ FTSInfoStatus[] $VALUES;

    public static FTSInfoStatus[] values() {
        return null;
    }

    public static FTSInfoStatus valueOf(String string) {
        return null;
    }

    private FTSInfoStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FTSInfoStatus find(int n) {
        return null;
    }

    private static /* synthetic */ FTSInfoStatus[] $values() {
        return null;
    }

    static {
        $VALUES = FTSInfoStatus.$values();
        allValues = FTSInfoStatus.values();
    }
}

