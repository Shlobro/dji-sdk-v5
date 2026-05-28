/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class TerrainFollowingMode
extends Enum<TerrainFollowingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TerrainFollowingMode PLAIN = new TerrainFollowingMode(0);
    public static final /* enum */ TerrainFollowingMode MOUNTAIN = new TerrainFollowingMode(1);
    public static final /* enum */ TerrainFollowingMode TREE = new TerrainFollowingMode(2);
    public static final /* enum */ TerrainFollowingMode UNKNOWN = new TerrainFollowingMode(65535);
    private int value;
    private static final TerrainFollowingMode[] allValues;
    private static final /* synthetic */ TerrainFollowingMode[] $VALUES;

    public static TerrainFollowingMode[] values() {
        return null;
    }

    public static TerrainFollowingMode valueOf(String string) {
        return null;
    }

    private TerrainFollowingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TerrainFollowingMode find(int n) {
        return null;
    }

    private static /* synthetic */ TerrainFollowingMode[] $values() {
        return null;
    }

    static {
        $VALUES = TerrainFollowingMode.$values();
        allValues = TerrainFollowingMode.values();
    }
}

