/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class State
extends Enum<State>
implements JNIProguardKeepTag {
    public static final /* enum */ State Init = new State(0);
    public static final /* enum */ State Transferring = new State(1);
    public static final /* enum */ State TransferFailed = new State(2);
    public static final /* enum */ State TransferSuccess = new State(3);
    public static final /* enum */ State Upgrading = new State(4);
    public static final /* enum */ State UpgradeFailed = new State(5);
    public static final /* enum */ State UpgradeSuccess = new State(6);
    public static final /* enum */ State TransferEnd = new State(15);
    private int value;
    private static final State[] allValues;
    private static final /* synthetic */ State[] $VALUES;

    public static State[] values() {
        return null;
    }

    public static State valueOf(String string2) {
        return null;
    }

    private State(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static State find(int n) {
        return null;
    }

    private static /* synthetic */ State[] $values() {
        return null;
    }

    static {
        $VALUES = State.$values();
        allValues = State.values();
    }
}

