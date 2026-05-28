/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKSurveyorPointPostionType
extends Enum<RTKSurveyorPointPostionType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKSurveyorPointPostionType NONE = new RTKSurveyorPointPostionType(15);
    public static final /* enum */ RTKSurveyorPointPostionType SINGLE_POINT = new RTKSurveyorPointPostionType(16);
    public static final /* enum */ RTKSurveyorPointPostionType FLOAT = new RTKSurveyorPointPostionType(34);
    public static final /* enum */ RTKSurveyorPointPostionType FIXED_POINT = new RTKSurveyorPointPostionType(50);
    public static final /* enum */ RTKSurveyorPointPostionType UNKNOWN = new RTKSurveyorPointPostionType(65535);
    private int value;
    private static final RTKSurveyorPointPostionType[] allValues;
    private static final /* synthetic */ RTKSurveyorPointPostionType[] $VALUES;

    public static RTKSurveyorPointPostionType[] values() {
        return null;
    }

    public static RTKSurveyorPointPostionType valueOf(String string) {
        return null;
    }

    private RTKSurveyorPointPostionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKSurveyorPointPostionType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKSurveyorPointPostionType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKSurveyorPointPostionType.$values();
        allValues = RTKSurveyorPointPostionType.values();
    }
}

