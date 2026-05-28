/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AutoExploreState
extends Enum<AutoExploreState>
implements JNIProguardKeepTag {
    public static final /* enum */ AutoExploreState STANDDOWN = new AutoExploreState(0);
    public static final /* enum */ AutoExploreState PREPROCESS = new AutoExploreState(1);
    public static final /* enum */ AutoExploreState MARCHON_TARGET_AREA = new AutoExploreState(2);
    public static final /* enum */ AutoExploreState EXPLORE_TARGET_AREA = new AutoExploreState(3);
    public static final /* enum */ AutoExploreState MANUAL = new AutoExploreState(4);
    public static final /* enum */ AutoExploreState EMERGENCY = new AutoExploreState(5);
    public static final /* enum */ AutoExploreState DONE = new AutoExploreState(6);
    public static final /* enum */ AutoExploreState UNKNOWN = new AutoExploreState(65535);
    private int value;
    private static final AutoExploreState[] allValues;
    private static final /* synthetic */ AutoExploreState[] $VALUES;

    public static AutoExploreState[] values() {
        return null;
    }

    public static AutoExploreState valueOf(String string) {
        return null;
    }

    private AutoExploreState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AutoExploreState find(int n) {
        return null;
    }

    private static /* synthetic */ AutoExploreState[] $values() {
        return null;
    }

    static {
        $VALUES = AutoExploreState.$values();
        allValues = AutoExploreState.values();
    }
}

