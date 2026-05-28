/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class GoHomeStage
extends Enum<GoHomeStage>
implements JNIProguardKeepTag {
    public static final /* enum */ GoHomeStage RISING = new GoHomeStage(1);
    public static final /* enum */ GoHomeStage HEADING_ADJUST = new GoHomeStage(2);
    public static final /* enum */ GoHomeStage RETURING = new GoHomeStage(3);
    public static final /* enum */ GoHomeStage DIVING = new GoHomeStage(4);
    public static final /* enum */ GoHomeStage RETRACE = new GoHomeStage(5);
    public static final /* enum */ GoHomeStage CLIMB = new GoHomeStage(6);
    public static final /* enum */ GoHomeStage SAFELY = new GoHomeStage(7);
    public static final /* enum */ GoHomeStage UNKNOWN = new GoHomeStage(255);
    private int value;
    private static final GoHomeStage[] allValues;
    private static final /* synthetic */ GoHomeStage[] $VALUES;

    public static GoHomeStage[] values() {
        return null;
    }

    public static GoHomeStage valueOf(String string) {
        return null;
    }

    private GoHomeStage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GoHomeStage find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomeStage[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomeStage.$values();
        allValues = GoHomeStage.values();
    }
}

