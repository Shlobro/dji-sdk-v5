/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class TerrainApasExitReason
extends Enum<TerrainApasExitReason>
implements JNIProguardKeepTag {
    public static final /* enum */ TerrainApasExitReason NO_ERROR = new TerrainApasExitReason(0);
    public static final /* enum */ TerrainApasExitReason USING_S_MODE = new TerrainApasExitReason(1);
    public static final /* enum */ TerrainApasExitReason ENTER_OTHERS = new TerrainApasExitReason(2);
    public static final /* enum */ TerrainApasExitReason OUT_OF_LIMIT = new TerrainApasExitReason(3);
    public static final /* enum */ TerrainApasExitReason LOW_LIGHT = new TerrainApasExitReason(4);
    public static final /* enum */ TerrainApasExitReason INVALID_MAP_DATA = new TerrainApasExitReason(5);
    public static final /* enum */ TerrainApasExitReason INVALID_MAP_FRAME_RATE = new TerrainApasExitReason(6);
    public static final /* enum */ TerrainApasExitReason FC_UNKNOWN = new TerrainApasExitReason(7);
    public static final /* enum */ TerrainApasExitReason UNKNOWN = new TerrainApasExitReason(65535);
    private int value;
    private static final TerrainApasExitReason[] allValues;
    private static final /* synthetic */ TerrainApasExitReason[] $VALUES;

    public static TerrainApasExitReason[] values() {
        return null;
    }

    public static TerrainApasExitReason valueOf(String string) {
        return null;
    }

    private TerrainApasExitReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TerrainApasExitReason find(int n) {
        return null;
    }

    private static /* synthetic */ TerrainApasExitReason[] $values() {
        return null;
    }

    static {
        $VALUES = TerrainApasExitReason.$values();
        allValues = TerrainApasExitReason.values();
    }
}

