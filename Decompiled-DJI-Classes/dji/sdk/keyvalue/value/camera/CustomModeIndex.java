/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CustomModeIndex
extends Enum<CustomModeIndex>
implements JNIProguardKeepTag {
    public static final /* enum */ CustomModeIndex IDEL = new CustomModeIndex(0);
    public static final /* enum */ CustomModeIndex C1 = new CustomModeIndex(1);
    public static final /* enum */ CustomModeIndex C2 = new CustomModeIndex(2);
    public static final /* enum */ CustomModeIndex C3 = new CustomModeIndex(3);
    public static final /* enum */ CustomModeIndex C4 = new CustomModeIndex(4);
    public static final /* enum */ CustomModeIndex C5 = new CustomModeIndex(5);
    public static final /* enum */ CustomModeIndex UNKNOWN = new CustomModeIndex(65535);
    private int value;
    private static final CustomModeIndex[] allValues;
    private static final /* synthetic */ CustomModeIndex[] $VALUES;

    public static CustomModeIndex[] values() {
        return null;
    }

    public static CustomModeIndex valueOf(String string) {
        return null;
    }

    private CustomModeIndex(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CustomModeIndex find(int n) {
        return null;
    }

    private static /* synthetic */ CustomModeIndex[] $values() {
        return null;
    }

    static {
        $VALUES = CustomModeIndex.$values();
        allValues = CustomModeIndex.values();
    }
}

