/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class CableInspectionCmd
extends Enum<CableInspectionCmd>
implements JNIProguardKeepTag {
    public static final /* enum */ CableInspectionCmd ADJUST_POS = new CableInspectionCmd(1);
    public static final /* enum */ CableInspectionCmd BEGIN_FOLLOW = new CableInspectionCmd(2);
    public static final /* enum */ CableInspectionCmd CMD_EXIT = new CableInspectionCmd(3);
    public static final /* enum */ CableInspectionCmd UNKNOWN = new CableInspectionCmd(65535);
    private int value;
    private static final CableInspectionCmd[] allValues;
    private static final /* synthetic */ CableInspectionCmd[] $VALUES;

    public static CableInspectionCmd[] values() {
        return null;
    }

    public static CableInspectionCmd valueOf(String string) {
        return null;
    }

    private CableInspectionCmd(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CableInspectionCmd find(int n) {
        return null;
    }

    private static /* synthetic */ CableInspectionCmd[] $values() {
        return null;
    }

    static {
        $VALUES = CableInspectionCmd.$values();
        allValues = CableInspectionCmd.values();
    }
}

