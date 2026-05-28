/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;

public final class UOMCancelType
extends Enum<UOMCancelType>
implements JNIProguardKeepTag {
    public static final /* enum */ UOMCancelType EXIT = new UOMCancelType(1);
    public static final /* enum */ UOMCancelType OWNERSHIP_CHANGE = new UOMCancelType(2);
    public static final /* enum */ UOMCancelType OTHER = new UOMCancelType(3);
    public static final /* enum */ UOMCancelType UNKNOWN = new UOMCancelType(65535);
    private int value;
    private static final UOMCancelType[] allValues;
    private static final /* synthetic */ UOMCancelType[] $VALUES;

    public static UOMCancelType[] values() {
        return null;
    }

    public static UOMCancelType valueOf(String string) {
        return null;
    }

    private UOMCancelType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UOMCancelType find(int n) {
        return null;
    }

    private static /* synthetic */ UOMCancelType[] $values() {
        return null;
    }

    static {
        $VALUES = UOMCancelType.$values();
        allValues = UOMCancelType.values();
    }
}

