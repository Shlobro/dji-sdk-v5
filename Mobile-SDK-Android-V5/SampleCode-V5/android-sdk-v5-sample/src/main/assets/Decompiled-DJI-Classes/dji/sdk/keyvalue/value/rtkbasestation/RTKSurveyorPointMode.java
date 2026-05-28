/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKSurveyorPointMode
extends Enum<RTKSurveyorPointMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKSurveyorPointMode NONE = new RTKSurveyorPointMode(0);
    public static final /* enum */ RTKSurveyorPointMode BROKENSTEP = new RTKSurveyorPointMode(1);
    public static final /* enum */ RTKSurveyorPointMode BENCHMARK = new RTKSurveyorPointMode(2);
    public static final /* enum */ RTKSurveyorPointMode UNKNOWN = new RTKSurveyorPointMode(65535);
    private int value;
    private static final RTKSurveyorPointMode[] allValues;
    private static final /* synthetic */ RTKSurveyorPointMode[] $VALUES;

    public static RTKSurveyorPointMode[] values() {
        return null;
    }

    public static RTKSurveyorPointMode valueOf(String string) {
        return null;
    }

    private RTKSurveyorPointMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKSurveyorPointMode find(int n) {
        return null;
    }

    private static /* synthetic */ RTKSurveyorPointMode[] $values() {
        return null;
    }

    static {
        $VALUES = RTKSurveyorPointMode.$values();
        allValues = RTKSurveyorPointMode.values();
    }
}

