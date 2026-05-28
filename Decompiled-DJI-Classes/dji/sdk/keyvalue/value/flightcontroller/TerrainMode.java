/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class TerrainMode
extends Enum<TerrainMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TerrainMode FLAT = new TerrainMode(0);
    public static final /* enum */ TerrainMode MOUNTAIN = new TerrainMode(1);
    public static final /* enum */ TerrainMode UNKNOWN = new TerrainMode(65535);
    private int value;
    private static final TerrainMode[] allValues;
    private static final /* synthetic */ TerrainMode[] $VALUES;

    public static TerrainMode[] values() {
        return null;
    }

    public static TerrainMode valueOf(String string) {
        return null;
    }

    private TerrainMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TerrainMode find(int n) {
        return null;
    }

    private static /* synthetic */ TerrainMode[] $values() {
        return null;
    }

    static {
        $VALUES = TerrainMode.$values();
        allValues = TerrainMode.values();
    }
}

