/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GPIOWorkModeOnBoard
extends Enum<GPIOWorkModeOnBoard>
implements JNIProguardKeepTag {
    public static final /* enum */ GPIOWorkModeOnBoard FLOAT_INPUT = new GPIOWorkModeOnBoard(0);
    public static final /* enum */ GPIOWorkModeOnBoard PULL_UP_INPUT = new GPIOWorkModeOnBoard(1);
    public static final /* enum */ GPIOWorkModeOnBoard PULL_DOWN_INPUT = new GPIOWorkModeOnBoard(2);
    public static final /* enum */ GPIOWorkModeOnBoard PUSH_PULL_OUTPUT = new GPIOWorkModeOnBoard(3);
    public static final /* enum */ GPIOWorkModeOnBoard UNKNOWN = new GPIOWorkModeOnBoard(255);
    private int value;
    private static final GPIOWorkModeOnBoard[] allValues;
    private static final /* synthetic */ GPIOWorkModeOnBoard[] $VALUES;

    public static GPIOWorkModeOnBoard[] values() {
        return null;
    }

    public static GPIOWorkModeOnBoard valueOf(String string) {
        return null;
    }

    private GPIOWorkModeOnBoard(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GPIOWorkModeOnBoard find(int n) {
        return null;
    }

    private static /* synthetic */ GPIOWorkModeOnBoard[] $values() {
        return null;
    }

    static {
        $VALUES = GPIOWorkModeOnBoard.$values();
        allValues = GPIOWorkModeOnBoard.values();
    }
}

