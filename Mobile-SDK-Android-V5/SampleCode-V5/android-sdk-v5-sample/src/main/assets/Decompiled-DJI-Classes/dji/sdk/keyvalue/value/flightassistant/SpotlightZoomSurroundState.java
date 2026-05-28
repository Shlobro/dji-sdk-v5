/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SpotlightZoomSurroundState
extends Enum<SpotlightZoomSurroundState>
implements JNIProguardKeepTag {
    public static final /* enum */ SpotlightZoomSurroundState IDLE = new SpotlightZoomSurroundState(0);
    public static final /* enum */ SpotlightZoomSurroundState PAUSE = new SpotlightZoomSurroundState(1);
    public static final /* enum */ SpotlightZoomSurroundState SURROUNDING = new SpotlightZoomSurroundState(2);
    public static final /* enum */ SpotlightZoomSurroundState UNKNOWN = new SpotlightZoomSurroundState(255);
    private int value;
    private static final SpotlightZoomSurroundState[] allValues;
    private static final /* synthetic */ SpotlightZoomSurroundState[] $VALUES;

    public static SpotlightZoomSurroundState[] values() {
        return null;
    }

    public static SpotlightZoomSurroundState valueOf(String string) {
        return null;
    }

    private SpotlightZoomSurroundState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SpotlightZoomSurroundState find(int n) {
        return null;
    }

    private static /* synthetic */ SpotlightZoomSurroundState[] $values() {
        return null;
    }

    static {
        $VALUES = SpotlightZoomSurroundState.$values();
        allValues = SpotlightZoomSurroundState.values();
    }
}

