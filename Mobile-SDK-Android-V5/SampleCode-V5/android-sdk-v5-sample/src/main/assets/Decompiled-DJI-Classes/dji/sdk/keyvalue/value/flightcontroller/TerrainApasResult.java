/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class TerrainApasResult
extends Enum<TerrainApasResult>
implements JNIProguardKeepTag {
    public static final /* enum */ TerrainApasResult NO_ERROR = new TerrainApasResult(0);
    public static final /* enum */ TerrainApasResult INVALID_HEIGHT = new TerrainApasResult(1);
    public static final /* enum */ TerrainApasResult NEAR_LIMIT = new TerrainApasResult(2);
    public static final /* enum */ TerrainApasResult LOW_LIGHT = new TerrainApasResult(3);
    public static final /* enum */ TerrainApasResult IN_S_MODE = new TerrainApasResult(4);
    public static final /* enum */ TerrainApasResult DOWN_AVOIDANCE_OFF = new TerrainApasResult(5);
    public static final /* enum */ TerrainApasResult POSTURE_MODE = new TerrainApasResult(6);
    public static final /* enum */ TerrainApasResult ON_GROUND = new TerrainApasResult(7);
    public static final /* enum */ TerrainApasResult UNKNOWN = new TerrainApasResult(65535);
    private int value;
    private static final TerrainApasResult[] allValues;
    private static final /* synthetic */ TerrainApasResult[] $VALUES;

    public static TerrainApasResult[] values() {
        return null;
    }

    public static TerrainApasResult valueOf(String string) {
        return null;
    }

    private TerrainApasResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TerrainApasResult find(int n) {
        return null;
    }

    private static /* synthetic */ TerrainApasResult[] $values() {
        return null;
    }

    static {
        $VALUES = TerrainApasResult.$values();
        allValues = TerrainApasResult.values();
    }
}

