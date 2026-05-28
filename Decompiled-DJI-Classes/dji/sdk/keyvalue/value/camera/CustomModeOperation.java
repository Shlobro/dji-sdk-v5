/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CustomModeOperation
extends Enum<CustomModeOperation>
implements JNIProguardKeepTag {
    public static final /* enum */ CustomModeOperation ADD = new CustomModeOperation(0);
    public static final /* enum */ CustomModeOperation REPLACE = new CustomModeOperation(1);
    public static final /* enum */ CustomModeOperation DELETE = new CustomModeOperation(2);
    public static final /* enum */ CustomModeOperation SET = new CustomModeOperation(3);
    public static final /* enum */ CustomModeOperation UNKNOWN = new CustomModeOperation(65535);
    private int value;
    private static final CustomModeOperation[] allValues;
    private static final /* synthetic */ CustomModeOperation[] $VALUES;

    public static CustomModeOperation[] values() {
        return null;
    }

    public static CustomModeOperation valueOf(String string) {
        return null;
    }

    private CustomModeOperation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CustomModeOperation find(int n) {
        return null;
    }

    private static /* synthetic */ CustomModeOperation[] $values() {
        return null;
    }

    static {
        $VALUES = CustomModeOperation.$values();
        allValues = CustomModeOperation.values();
    }
}

