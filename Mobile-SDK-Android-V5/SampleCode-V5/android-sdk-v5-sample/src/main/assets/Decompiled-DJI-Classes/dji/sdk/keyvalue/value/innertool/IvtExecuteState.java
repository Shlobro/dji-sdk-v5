/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;

public final class IvtExecuteState
extends Enum<IvtExecuteState>
implements JNIProguardKeepTag {
    public static final /* enum */ IvtExecuteState IDEL = new IvtExecuteState(0);
    public static final /* enum */ IvtExecuteState BEGIN = new IvtExecuteState(1);
    public static final /* enum */ IvtExecuteState FINISH = new IvtExecuteState(2);
    public static final /* enum */ IvtExecuteState UNKNOWN = new IvtExecuteState(65535);
    private int value;
    private static final IvtExecuteState[] allValues;
    private static final /* synthetic */ IvtExecuteState[] $VALUES;

    public static IvtExecuteState[] values() {
        return null;
    }

    public static IvtExecuteState valueOf(String string) {
        return null;
    }

    private IvtExecuteState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IvtExecuteState find(int n) {
        return null;
    }

    private static /* synthetic */ IvtExecuteState[] $values() {
        return null;
    }

    static {
        $VALUES = IvtExecuteState.$values();
        allValues = IvtExecuteState.values();
    }
}

