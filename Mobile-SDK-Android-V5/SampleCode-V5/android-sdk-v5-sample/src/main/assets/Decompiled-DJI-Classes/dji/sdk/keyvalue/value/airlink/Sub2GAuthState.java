/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class Sub2GAuthState
extends Enum<Sub2GAuthState>
implements JNIProguardKeepTag {
    public static final /* enum */ Sub2GAuthState UNAUTHORIZED = new Sub2GAuthState(0);
    public static final /* enum */ Sub2GAuthState CIVILIAN_CHANNEL = new Sub2GAuthState(1);
    public static final /* enum */ Sub2GAuthState POLICE_CHANNEL = new Sub2GAuthState(2);
    public static final /* enum */ Sub2GAuthState DUAL_CHANNEL = new Sub2GAuthState(3);
    public static final /* enum */ Sub2GAuthState UNKNOWN = new Sub2GAuthState(65535);
    private int value;
    private static final Sub2GAuthState[] allValues;
    private static final /* synthetic */ Sub2GAuthState[] $VALUES;

    public static Sub2GAuthState[] values() {
        return null;
    }

    public static Sub2GAuthState valueOf(String string) {
        return null;
    }

    private Sub2GAuthState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static Sub2GAuthState find(int n) {
        return null;
    }

    private static /* synthetic */ Sub2GAuthState[] $values() {
        return null;
    }

    static {
        $VALUES = Sub2GAuthState.$values();
        allValues = Sub2GAuthState.values();
    }
}

