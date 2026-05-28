/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class NPIBuriedDataProviderType
extends Enum<NPIBuriedDataProviderType>
implements JNIProguardKeepTag {
    public static final /* enum */ NPIBuriedDataProviderType CAMERA = new NPIBuriedDataProviderType(1);
    public static final /* enum */ NPIBuriedDataProviderType GIMBAL = new NPIBuriedDataProviderType(4);
    public static final /* enum */ NPIBuriedDataProviderType CENTER_BOARD = new NPIBuriedDataProviderType(5);
    public static final /* enum */ NPIBuriedDataProviderType UNKNOWN = new NPIBuriedDataProviderType(65535);
    private int value;
    private static final NPIBuriedDataProviderType[] allValues;
    private static final /* synthetic */ NPIBuriedDataProviderType[] $VALUES;

    public static NPIBuriedDataProviderType[] values() {
        return null;
    }

    public static NPIBuriedDataProviderType valueOf(String string) {
        return null;
    }

    private NPIBuriedDataProviderType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NPIBuriedDataProviderType find(int n) {
        return null;
    }

    private static /* synthetic */ NPIBuriedDataProviderType[] $values() {
        return null;
    }

    static {
        $VALUES = NPIBuriedDataProviderType.$values();
        allValues = NPIBuriedDataProviderType.values();
    }
}

