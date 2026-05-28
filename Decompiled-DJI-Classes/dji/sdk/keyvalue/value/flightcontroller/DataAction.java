/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DataAction
extends Enum<DataAction>
implements JNIProguardKeepTag {
    public static final /* enum */ DataAction SET = new DataAction(0);
    public static final /* enum */ DataAction DELETE = new DataAction(1);
    public static final /* enum */ DataAction UNKNOWN = new DataAction(65535);
    private int value;
    private static final DataAction[] allValues;
    private static final /* synthetic */ DataAction[] $VALUES;

    public static DataAction[] values() {
        return null;
    }

    public static DataAction valueOf(String string) {
        return null;
    }

    private DataAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DataAction find(int n) {
        return null;
    }

    private static /* synthetic */ DataAction[] $values() {
        return null;
    }

    static {
        $VALUES = DataAction.$values();
        allValues = DataAction.values();
    }
}

