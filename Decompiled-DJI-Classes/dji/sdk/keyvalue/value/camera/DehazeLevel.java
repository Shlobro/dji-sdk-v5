/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class DehazeLevel
extends Enum<DehazeLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ DehazeLevel LEVEL_1 = new DehazeLevel(1);
    public static final /* enum */ DehazeLevel LEVEL_2 = new DehazeLevel(2);
    public static final /* enum */ DehazeLevel LEVEL_3 = new DehazeLevel(3);
    public static final /* enum */ DehazeLevel LEVEL_4 = new DehazeLevel(4);
    public static final /* enum */ DehazeLevel UNKNOWN = new DehazeLevel(65535);
    private int value;
    private static final DehazeLevel[] allValues;
    private static final /* synthetic */ DehazeLevel[] $VALUES;

    public static DehazeLevel[] values() {
        return null;
    }

    public static DehazeLevel valueOf(String string) {
        return null;
    }

    private DehazeLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DehazeLevel find(int n) {
        return null;
    }

    private static /* synthetic */ DehazeLevel[] $values() {
        return null;
    }

    static {
        $VALUES = DehazeLevel.$values();
        allValues = DehazeLevel.values();
    }
}

