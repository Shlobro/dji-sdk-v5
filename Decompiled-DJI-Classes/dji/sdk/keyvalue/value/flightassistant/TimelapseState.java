/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TimelapseState
extends Enum<TimelapseState>
implements JNIProguardKeepTag {
    public static final /* enum */ TimelapseState IDLE = new TimelapseState(0);
    public static final /* enum */ TimelapseState RUNNING = new TimelapseState(1);
    public static final /* enum */ TimelapseState PROCESSING = new TimelapseState(2);
    public static final /* enum */ TimelapseState PAUSE = new TimelapseState(3);
    public static final /* enum */ TimelapseState INTERRUPTED = new TimelapseState(4);
    public static final /* enum */ TimelapseState READY_TO_GO = new TimelapseState(5);
    public static final /* enum */ TimelapseState WATCHING = new TimelapseState(6);
    public static final /* enum */ TimelapseState ESTIMATING = new TimelapseState(7);
    public static final /* enum */ TimelapseState UNKNOWN = new TimelapseState(255);
    private int value;
    private static final TimelapseState[] allValues;
    private static final /* synthetic */ TimelapseState[] $VALUES;

    public static TimelapseState[] values() {
        return null;
    }

    public static TimelapseState valueOf(String string) {
        return null;
    }

    private TimelapseState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimelapseState find(int n) {
        return null;
    }

    private static /* synthetic */ TimelapseState[] $values() {
        return null;
    }

    static {
        $VALUES = TimelapseState.$values();
        allValues = TimelapseState.values();
    }
}

