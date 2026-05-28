/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartActionType
extends Enum<SmartActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartActionType DRAW_BOX = new SmartActionType(1);
    public static final /* enum */ SmartActionType SELECT_TARGET = new SmartActionType(2);
    public static final /* enum */ SmartActionType CONFIRM_TARGET = new SmartActionType(3);
    public static final /* enum */ SmartActionType TRACK_GPS = new SmartActionType(4);
    public static final /* enum */ SmartActionType UNKNOWN = new SmartActionType(255);
    private int value;
    private static final SmartActionType[] allValues;
    private static final /* synthetic */ SmartActionType[] $VALUES;

    public static SmartActionType[] values() {
        return null;
    }

    public static SmartActionType valueOf(String string) {
        return null;
    }

    private SmartActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartActionType find(int n) {
        return null;
    }

    private static /* synthetic */ SmartActionType[] $values() {
        return null;
    }

    static {
        $VALUES = SmartActionType.$values();
        allValues = SmartActionType.values();
    }
}

