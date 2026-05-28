/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AutoExploreModelFixState
extends Enum<AutoExploreModelFixState>
implements JNIProguardKeepTag {
    public static final /* enum */ AutoExploreModelFixState STANDDOWN = new AutoExploreModelFixState(0);
    public static final /* enum */ AutoExploreModelFixState PREPROCESS = new AutoExploreModelFixState(1);
    public static final /* enum */ AutoExploreModelFixState FXING = new AutoExploreModelFixState(2);
    public static final /* enum */ AutoExploreModelFixState FIX_DONE = new AutoExploreModelFixState(3);
    public static final /* enum */ AutoExploreModelFixState UNKNOWN = new AutoExploreModelFixState(65535);
    private int value;
    private static final AutoExploreModelFixState[] allValues;
    private static final /* synthetic */ AutoExploreModelFixState[] $VALUES;

    public static AutoExploreModelFixState[] values() {
        return null;
    }

    public static AutoExploreModelFixState valueOf(String string) {
        return null;
    }

    private AutoExploreModelFixState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AutoExploreModelFixState find(int n) {
        return null;
    }

    private static /* synthetic */ AutoExploreModelFixState[] $values() {
        return null;
    }

    static {
        $VALUES = AutoExploreModelFixState.$values();
        allValues = AutoExploreModelFixState.values();
    }
}

