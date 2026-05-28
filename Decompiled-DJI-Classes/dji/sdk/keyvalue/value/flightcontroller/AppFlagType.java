/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AppFlagType
extends Enum<AppFlagType>
implements JNIProguardKeepTag {
    public static final /* enum */ AppFlagType DJI_FLY = new AppFlagType(1);
    public static final /* enum */ AppFlagType UNKNOWN = new AppFlagType(65535);
    private int value;
    private static final AppFlagType[] allValues;
    private static final /* synthetic */ AppFlagType[] $VALUES;

    public static AppFlagType[] values() {
        return null;
    }

    public static AppFlagType valueOf(String string) {
        return null;
    }

    private AppFlagType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AppFlagType find(int n) {
        return null;
    }

    private static /* synthetic */ AppFlagType[] $values() {
        return null;
    }

    static {
        $VALUES = AppFlagType.$values();
        allValues = AppFlagType.values();
    }
}

