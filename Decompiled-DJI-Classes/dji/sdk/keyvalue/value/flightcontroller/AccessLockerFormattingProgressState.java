/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AccessLockerFormattingProgressState
extends Enum<AccessLockerFormattingProgressState>
implements JNIProguardKeepTag {
    public static final /* enum */ AccessLockerFormattingProgressState INITIAL = new AccessLockerFormattingProgressState(0);
    public static final /* enum */ AccessLockerFormattingProgressState FORMATTING = new AccessLockerFormattingProgressState(1);
    public static final /* enum */ AccessLockerFormattingProgressState SUCCESSFUL = new AccessLockerFormattingProgressState(2);
    public static final /* enum */ AccessLockerFormattingProgressState FAILED = new AccessLockerFormattingProgressState(3);
    public static final /* enum */ AccessLockerFormattingProgressState UNKNOWN = new AccessLockerFormattingProgressState(65535);
    private int value;
    private static final AccessLockerFormattingProgressState[] allValues;
    private static final /* synthetic */ AccessLockerFormattingProgressState[] $VALUES;

    public static AccessLockerFormattingProgressState[] values() {
        return null;
    }

    public static AccessLockerFormattingProgressState valueOf(String string) {
        return null;
    }

    private AccessLockerFormattingProgressState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AccessLockerFormattingProgressState find(int n) {
        return null;
    }

    private static /* synthetic */ AccessLockerFormattingProgressState[] $values() {
        return null;
    }

    static {
        $VALUES = AccessLockerFormattingProgressState.$values();
        allValues = AccessLockerFormattingProgressState.values();
    }
}

