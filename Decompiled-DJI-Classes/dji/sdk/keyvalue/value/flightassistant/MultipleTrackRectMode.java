/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MultipleTrackRectMode
extends Enum<MultipleTrackRectMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MultipleTrackRectMode NONE = new MultipleTrackRectMode(0);
    public static final /* enum */ MultipleTrackRectMode TRACKING = new MultipleTrackRectMode(1);
    public static final /* enum */ MultipleTrackRectMode CONFUSING = new MultipleTrackRectMode(2);
    public static final /* enum */ MultipleTrackRectMode DETECTING = new MultipleTrackRectMode(3);
    public static final /* enum */ MultipleTrackRectMode READY_TO_TRACK = new MultipleTrackRectMode(4);
    public static final /* enum */ MultipleTrackRectMode WAITING_CONFIRM = new MultipleTrackRectMode(5);
    public static final /* enum */ MultipleTrackRectMode HUMAN_DETECTED = new MultipleTrackRectMode(6);
    public static final /* enum */ MultipleTrackRectMode WAITING_SELECT = new MultipleTrackRectMode(7);
    public static final /* enum */ MultipleTrackRectMode UNKNOWN = new MultipleTrackRectMode(255);
    private int value;
    private static final MultipleTrackRectMode[] allValues;
    private static final /* synthetic */ MultipleTrackRectMode[] $VALUES;

    public static MultipleTrackRectMode[] values() {
        return null;
    }

    public static MultipleTrackRectMode valueOf(String string) {
        return null;
    }

    private MultipleTrackRectMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MultipleTrackRectMode find(int n) {
        return null;
    }

    private static /* synthetic */ MultipleTrackRectMode[] $values() {
        return null;
    }

    static {
        $VALUES = MultipleTrackRectMode.$values();
        allValues = MultipleTrackRectMode.values();
    }
}

