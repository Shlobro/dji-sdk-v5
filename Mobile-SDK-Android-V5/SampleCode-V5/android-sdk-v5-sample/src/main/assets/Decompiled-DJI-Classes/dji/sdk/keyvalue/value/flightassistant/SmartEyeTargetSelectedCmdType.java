/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartEyeTargetSelectedCmdType
extends Enum<SmartEyeTargetSelectedCmdType>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartEyeTargetSelectedCmdType NONE = new SmartEyeTargetSelectedCmdType(0);
    public static final /* enum */ SmartEyeTargetSelectedCmdType MOT_TO_WAITING = new SmartEyeTargetSelectedCmdType(1);
    public static final /* enum */ SmartEyeTargetSelectedCmdType WAITING_TO_EXECUTING = new SmartEyeTargetSelectedCmdType(2);
    public static final /* enum */ SmartEyeTargetSelectedCmdType MOT_TO_EXECUTING = new SmartEyeTargetSelectedCmdType(3);
    public static final /* enum */ SmartEyeTargetSelectedCmdType UNKNOWN = new SmartEyeTargetSelectedCmdType(255);
    private int value;
    private static final SmartEyeTargetSelectedCmdType[] allValues;
    private static final /* synthetic */ SmartEyeTargetSelectedCmdType[] $VALUES;

    public static SmartEyeTargetSelectedCmdType[] values() {
        return null;
    }

    public static SmartEyeTargetSelectedCmdType valueOf(String string) {
        return null;
    }

    private SmartEyeTargetSelectedCmdType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartEyeTargetSelectedCmdType find(int n) {
        return null;
    }

    private static /* synthetic */ SmartEyeTargetSelectedCmdType[] $values() {
        return null;
    }

    static {
        $VALUES = SmartEyeTargetSelectedCmdType.$values();
        allValues = SmartEyeTargetSelectedCmdType.values();
    }
}

