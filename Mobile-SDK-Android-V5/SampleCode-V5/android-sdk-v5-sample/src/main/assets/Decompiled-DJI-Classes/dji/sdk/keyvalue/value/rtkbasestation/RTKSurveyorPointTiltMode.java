/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKSurveyorPointTiltMode
extends Enum<RTKSurveyorPointTiltMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKSurveyorPointTiltMode NONE = new RTKSurveyorPointTiltMode(0);
    public static final /* enum */ RTKSurveyorPointTiltMode CENTER = new RTKSurveyorPointTiltMode(1);
    public static final /* enum */ RTKSurveyorPointTiltMode TILT = new RTKSurveyorPointTiltMode(2);
    public static final /* enum */ RTKSurveyorPointTiltMode UNKNOWN = new RTKSurveyorPointTiltMode(65535);
    private int value;
    private static final RTKSurveyorPointTiltMode[] allValues;
    private static final /* synthetic */ RTKSurveyorPointTiltMode[] $VALUES;

    public static RTKSurveyorPointTiltMode[] values() {
        return null;
    }

    public static RTKSurveyorPointTiltMode valueOf(String string) {
        return null;
    }

    private RTKSurveyorPointTiltMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKSurveyorPointTiltMode find(int n) {
        return null;
    }

    private static /* synthetic */ RTKSurveyorPointTiltMode[] $values() {
        return null;
    }

    static {
        $VALUES = RTKSurveyorPointTiltMode.$values();
        allValues = RTKSurveyorPointTiltMode.values();
    }
}

