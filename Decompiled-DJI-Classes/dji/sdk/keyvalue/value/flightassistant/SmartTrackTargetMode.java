/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartTrackTargetMode
extends Enum<SmartTrackTargetMode>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartTrackTargetMode TRACK_LOST = new SmartTrackTargetMode(0);
    public static final /* enum */ SmartTrackTargetMode TRACK_NORMAL = new SmartTrackTargetMode(1);
    public static final /* enum */ SmartTrackTargetMode TRACK_UNCERTAIN = new SmartTrackTargetMode(2);
    public static final /* enum */ SmartTrackTargetMode TRACK_VIRTUAL_POINT = new SmartTrackTargetMode(3);
    public static final /* enum */ SmartTrackTargetMode TRACK_EXCEPTION = new SmartTrackTargetMode(4);
    public static final /* enum */ SmartTrackTargetMode TRACK_TO_CONFIRM = new SmartTrackTargetMode(5);
    public static final /* enum */ SmartTrackTargetMode TRACK_HUMAN_DETECTED = new SmartTrackTargetMode(6);
    public static final /* enum */ SmartTrackTargetMode TRACK_MODE_TO_SELECT = new SmartTrackTargetMode(7);
    public static final /* enum */ SmartTrackTargetMode UNKNOWN = new SmartTrackTargetMode(65535);
    private int value;
    private static final SmartTrackTargetMode[] allValues;
    private static final /* synthetic */ SmartTrackTargetMode[] $VALUES;

    public static SmartTrackTargetMode[] values() {
        return null;
    }

    public static SmartTrackTargetMode valueOf(String string) {
        return null;
    }

    private SmartTrackTargetMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartTrackTargetMode find(int n) {
        return null;
    }

    private static /* synthetic */ SmartTrackTargetMode[] $values() {
        return null;
    }

    static {
        $VALUES = SmartTrackTargetMode.$values();
        allValues = SmartTrackTargetMode.values();
    }
}

