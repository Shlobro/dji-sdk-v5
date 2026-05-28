/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCUrgentStopMotorMode
extends Enum<FCUrgentStopMotorMode>
implements JNIProguardKeepTag {
    public static final /* enum */ FCUrgentStopMotorMode CSC = new FCUrgentStopMotorMode(0);
    public static final /* enum */ FCUrgentStopMotorMode NEVER = new FCUrgentStopMotorMode(1);
    public static final /* enum */ FCUrgentStopMotorMode IN_OUT_ALWAYS = new FCUrgentStopMotorMode(2);
    public static final /* enum */ FCUrgentStopMotorMode IN_OUT_WHEN_BREAKDOWN = new FCUrgentStopMotorMode(3);
    public static final /* enum */ FCUrgentStopMotorMode UNKNOWN = new FCUrgentStopMotorMode(65535);
    private int value;
    private static final FCUrgentStopMotorMode[] allValues;
    private static final /* synthetic */ FCUrgentStopMotorMode[] $VALUES;

    public static FCUrgentStopMotorMode[] values() {
        return null;
    }

    public static FCUrgentStopMotorMode valueOf(String string) {
        return null;
    }

    private FCUrgentStopMotorMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCUrgentStopMotorMode find(int n) {
        return null;
    }

    private static /* synthetic */ FCUrgentStopMotorMode[] $values() {
        return null;
    }

    static {
        $VALUES = FCUrgentStopMotorMode.$values();
        allValues = FCUrgentStopMotorMode.values();
    }
}

