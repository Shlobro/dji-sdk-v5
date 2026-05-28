/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class SolutionState
extends Enum<SolutionState>
implements JNIProguardKeepTag {
    public static final /* enum */ SolutionState NA = new SolutionState(0);
    public static final /* enum */ SolutionState VAR_LARGE = new SolutionState(1);
    public static final /* enum */ SolutionState RSD_LARGE = new SolutionState(2);
    public static final /* enum */ SolutionState INS_FREE = new SolutionState(3);
    public static final /* enum */ SolutionState SOL_GOOD = new SolutionState(4);
    public static final /* enum */ SolutionState UNKNOWN = new SolutionState(65535);
    private int value;
    private static final SolutionState[] allValues;
    private static final /* synthetic */ SolutionState[] $VALUES;

    public static SolutionState[] values() {
        return null;
    }

    public static SolutionState valueOf(String string) {
        return null;
    }

    private SolutionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SolutionState find(int n) {
        return null;
    }

    private static /* synthetic */ SolutionState[] $values() {
        return null;
    }

    static {
        $VALUES = SolutionState.$values();
        allValues = SolutionState.values();
    }
}

