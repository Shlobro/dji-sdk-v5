/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MultipleTrackStatusState
extends Enum<MultipleTrackStatusState>
implements JNIProguardKeepTag {
    public static final /* enum */ MultipleTrackStatusState NONE = new MultipleTrackStatusState(0);
    public static final /* enum */ MultipleTrackStatusState IS_WAITING_COMFIRM = new MultipleTrackStatusState(1);
    public static final /* enum */ MultipleTrackStatusState IS_TRACKING = new MultipleTrackStatusState(2);
    public static final /* enum */ MultipleTrackStatusState UNKNOWN = new MultipleTrackStatusState(255);
    private int value;
    private static final MultipleTrackStatusState[] allValues;
    private static final /* synthetic */ MultipleTrackStatusState[] $VALUES;

    public static MultipleTrackStatusState[] values() {
        return null;
    }

    public static MultipleTrackStatusState valueOf(String string) {
        return null;
    }

    private MultipleTrackStatusState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MultipleTrackStatusState find(int n) {
        return null;
    }

    private static /* synthetic */ MultipleTrackStatusState[] $values() {
        return null;
    }

    static {
        $VALUES = MultipleTrackStatusState.$values();
        allValues = MultipleTrackStatusState.values();
    }
}

