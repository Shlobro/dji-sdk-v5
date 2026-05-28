/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class LidarIndex
extends Enum<LidarIndex>
implements JNIProguardKeepTag {
    public static final /* enum */ LidarIndex INDEX_0 = new LidarIndex(0);
    public static final /* enum */ LidarIndex INDEX_1 = new LidarIndex(1);
    public static final /* enum */ LidarIndex UNKNOWN = new LidarIndex(65535);
    private int value;
    private static final LidarIndex[] allValues;
    private static final /* synthetic */ LidarIndex[] $VALUES;

    public static LidarIndex[] values() {
        return null;
    }

    public static LidarIndex valueOf(String string) {
        return null;
    }

    private LidarIndex(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LidarIndex find(int n) {
        return null;
    }

    private static /* synthetic */ LidarIndex[] $values() {
        return null;
    }

    static {
        $VALUES = LidarIndex.$values();
        allValues = LidarIndex.values();
    }
}

