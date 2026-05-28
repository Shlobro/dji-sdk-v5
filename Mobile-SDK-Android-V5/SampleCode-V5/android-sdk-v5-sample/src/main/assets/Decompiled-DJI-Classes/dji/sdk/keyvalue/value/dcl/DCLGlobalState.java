/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.dcl;

import dji.jni.JNIProguardKeepTag;

public final class DCLGlobalState
extends Enum<DCLGlobalState>
implements JNIProguardKeepTag {
    public static final /* enum */ DCLGlobalState IDLE = new DCLGlobalState(0);
    public static final /* enum */ DCLGlobalState WORKING = new DCLGlobalState(1);
    public static final /* enum */ DCLGlobalState ERROR = new DCLGlobalState(2);
    public static final /* enum */ DCLGlobalState UNKNOWN = new DCLGlobalState(65535);
    private int value;
    private static final DCLGlobalState[] allValues;
    private static final /* synthetic */ DCLGlobalState[] $VALUES;

    public static DCLGlobalState[] values() {
        return null;
    }

    public static DCLGlobalState valueOf(String string) {
        return null;
    }

    private DCLGlobalState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DCLGlobalState find(int n) {
        return null;
    }

    private static /* synthetic */ DCLGlobalState[] $values() {
        return null;
    }

    static {
        $VALUES = DCLGlobalState.$values();
        allValues = DCLGlobalState.values();
    }
}

