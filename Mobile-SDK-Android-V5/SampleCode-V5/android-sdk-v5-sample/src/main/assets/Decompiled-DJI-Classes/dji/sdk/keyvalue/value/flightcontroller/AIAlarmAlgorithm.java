/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AIAlarmAlgorithm
extends Enum<AIAlarmAlgorithm>
implements JNIProguardKeepTag {
    public static final /* enum */ AIAlarmAlgorithm OFFICIAL_VISABLE_AI = new AIAlarmAlgorithm(1);
    public static final /* enum */ AIAlarmAlgorithm OFFICIAL_IR_AI = new AIAlarmAlgorithm(2);
    public static final /* enum */ AIAlarmAlgorithm OFFICIAL_IR_TEMP = new AIAlarmAlgorithm(3);
    public static final /* enum */ AIAlarmAlgorithm THIRD_IR_AI = new AIAlarmAlgorithm(5);
    public static final /* enum */ AIAlarmAlgorithm THIRD_VISABLE_AI = new AIAlarmAlgorithm(255);
    public static final /* enum */ AIAlarmAlgorithm UNKNOWN = new AIAlarmAlgorithm(65535);
    private int value;
    private static final AIAlarmAlgorithm[] allValues;
    private static final /* synthetic */ AIAlarmAlgorithm[] $VALUES;

    public static AIAlarmAlgorithm[] values() {
        return null;
    }

    public static AIAlarmAlgorithm valueOf(String string) {
        return null;
    }

    private AIAlarmAlgorithm(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIAlarmAlgorithm find(int n) {
        return null;
    }

    private static /* synthetic */ AIAlarmAlgorithm[] $values() {
        return null;
    }

    static {
        $VALUES = AIAlarmAlgorithm.$values();
        allValues = AIAlarmAlgorithm.values();
    }
}

