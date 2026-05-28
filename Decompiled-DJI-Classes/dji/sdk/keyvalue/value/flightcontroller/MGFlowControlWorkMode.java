/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFlowControlWorkMode
extends Enum<MGFlowControlWorkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFlowControlWorkMode SOWING_HATCH_DOOR_MODE = new MGFlowControlWorkMode(0);
    public static final /* enum */ MGFlowControlWorkMode SPRAY_MU_MODE = new MGFlowControlWorkMode(1);
    public static final /* enum */ MGFlowControlWorkMode UNKNOWN = new MGFlowControlWorkMode(65535);
    private int value;
    private static final MGFlowControlWorkMode[] allValues;
    private static final /* synthetic */ MGFlowControlWorkMode[] $VALUES;

    public static MGFlowControlWorkMode[] values() {
        return null;
    }

    public static MGFlowControlWorkMode valueOf(String string) {
        return null;
    }

    private MGFlowControlWorkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFlowControlWorkMode find(int n) {
        return null;
    }

    private static /* synthetic */ MGFlowControlWorkMode[] $values() {
        return null;
    }

    static {
        $VALUES = MGFlowControlWorkMode.$values();
        allValues = MGFlowControlWorkMode.values();
    }
}

