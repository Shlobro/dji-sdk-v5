/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GoHomeNeedConfirmType
extends Enum<GoHomeNeedConfirmType>
implements JNIProguardKeepTag {
    public static final /* enum */ GoHomeNeedConfirmType NONE = new GoHomeNeedConfirmType(0);
    public static final /* enum */ GoHomeNeedConfirmType NORMAL = new GoHomeNeedConfirmType(1);
    public static final /* enum */ GoHomeNeedConfirmType UNKNOWN = new GoHomeNeedConfirmType(65535);
    private int value;
    private static final GoHomeNeedConfirmType[] allValues;
    private static final /* synthetic */ GoHomeNeedConfirmType[] $VALUES;

    public static GoHomeNeedConfirmType[] values() {
        return null;
    }

    public static GoHomeNeedConfirmType valueOf(String string) {
        return null;
    }

    private GoHomeNeedConfirmType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GoHomeNeedConfirmType find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomeNeedConfirmType[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomeNeedConfirmType.$values();
        allValues = GoHomeNeedConfirmType.values();
    }
}

