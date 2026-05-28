/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AiAlarmTargetType
extends Enum<AiAlarmTargetType>
implements JNIProguardKeepTag {
    public static final /* enum */ AiAlarmTargetType PERSON = new AiAlarmTargetType(0);
    public static final /* enum */ AiAlarmTargetType CAR = new AiAlarmTargetType(1);
    public static final /* enum */ AiAlarmTargetType BOAT = new AiAlarmTargetType(2);
    public static final /* enum */ AiAlarmTargetType TEMP = new AiAlarmTargetType(3);
    public static final /* enum */ AiAlarmTargetType MOVE_TARGET = new AiAlarmTargetType(4);
    public static final /* enum */ AiAlarmTargetType CUSTOM_1 = new AiAlarmTargetType(128);
    public static final /* enum */ AiAlarmTargetType CUSTOM_2 = new AiAlarmTargetType(129);
    public static final /* enum */ AiAlarmTargetType CUSTOM_3 = new AiAlarmTargetType(130);
    public static final /* enum */ AiAlarmTargetType CUSTOM_4 = new AiAlarmTargetType(131);
    public static final /* enum */ AiAlarmTargetType CUSTOM_5 = new AiAlarmTargetType(132);
    public static final /* enum */ AiAlarmTargetType CUSTOM_6 = new AiAlarmTargetType(133);
    public static final /* enum */ AiAlarmTargetType CUSTOM_7 = new AiAlarmTargetType(134);
    public static final /* enum */ AiAlarmTargetType CUSTOM_8 = new AiAlarmTargetType(135);
    public static final /* enum */ AiAlarmTargetType CUSTOM_9 = new AiAlarmTargetType(136);
    public static final /* enum */ AiAlarmTargetType CUSTOM_10 = new AiAlarmTargetType(137);
    public static final /* enum */ AiAlarmTargetType UNKNOWN = new AiAlarmTargetType(65535);
    private int value;
    private static final AiAlarmTargetType[] allValues;
    private static final /* synthetic */ AiAlarmTargetType[] $VALUES;

    public static AiAlarmTargetType[] values() {
        return null;
    }

    public static AiAlarmTargetType valueOf(String string) {
        return null;
    }

    private AiAlarmTargetType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AiAlarmTargetType find(int n) {
        return null;
    }

    private static /* synthetic */ AiAlarmTargetType[] $values() {
        return null;
    }

    static {
        $VALUES = AiAlarmTargetType.$values();
        allValues = AiAlarmTargetType.values();
    }
}

