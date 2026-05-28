/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionMultipleTrackState
extends Enum<VisionMultipleTrackState>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionMultipleTrackState NONE = new VisionMultipleTrackState(0);
    public static final /* enum */ VisionMultipleTrackState IS_WAITING_CONFIRM = new VisionMultipleTrackState(1);
    public static final /* enum */ VisionMultipleTrackState IS_TRACKING = new VisionMultipleTrackState(2);
    public static final /* enum */ VisionMultipleTrackState UNKNOWN = new VisionMultipleTrackState(255);
    private int value;
    private static final VisionMultipleTrackState[] allValues;
    private static final /* synthetic */ VisionMultipleTrackState[] $VALUES;

    public static VisionMultipleTrackState[] values() {
        return null;
    }

    public static VisionMultipleTrackState valueOf(String string) {
        return null;
    }

    private VisionMultipleTrackState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionMultipleTrackState find(int n) {
        return null;
    }

    private static /* synthetic */ VisionMultipleTrackState[] $values() {
        return null;
    }

    static {
        $VALUES = VisionMultipleTrackState.$values();
        allValues = VisionMultipleTrackState.values();
    }
}

