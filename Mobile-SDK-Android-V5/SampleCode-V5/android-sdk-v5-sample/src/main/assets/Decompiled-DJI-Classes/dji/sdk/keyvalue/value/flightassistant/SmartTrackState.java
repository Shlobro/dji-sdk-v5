/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartTrackState
extends Enum<SmartTrackState>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartTrackState STAND_BY = new SmartTrackState(0);
    public static final /* enum */ SmartTrackState WAIT_TO_SELECT = new SmartTrackState(1);
    public static final /* enum */ SmartTrackState WAIT_TO_CONFIRM = new SmartTrackState(2);
    public static final /* enum */ SmartTrackState SPOTLIGHT = new SmartTrackState(3);
    public static final /* enum */ SmartTrackState UNKNOWN = new SmartTrackState(65535);
    private int value;
    private static final SmartTrackState[] allValues;
    private static final /* synthetic */ SmartTrackState[] $VALUES;

    public static SmartTrackState[] values() {
        return null;
    }

    public static SmartTrackState valueOf(String string) {
        return null;
    }

    private SmartTrackState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartTrackState find(int n) {
        return null;
    }

    private static /* synthetic */ SmartTrackState[] $values() {
        return null;
    }

    static {
        $VALUES = SmartTrackState.$values();
        allValues = SmartTrackState.values();
    }
}

