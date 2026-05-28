/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class FirmwareState
extends Enum<FirmwareState>
implements JNIProguardKeepTag {
    public static final /* enum */ FirmwareState Init = new FirmwareState(0);
    public static final /* enum */ FirmwareState Checking = new FirmwareState(1);
    public static final /* enum */ FirmwareState UpToDate = new FirmwareState(2);
    public static final /* enum */ FirmwareState NeedForceUpdate = new FirmwareState(3);
    public static final /* enum */ FirmwareState NeedUpdate = new FirmwareState(4);
    public static final /* enum */ FirmwareState Unknown = new FirmwareState(255);
    private int value;
    private static final FirmwareState[] allValues;
    private static final /* synthetic */ FirmwareState[] $VALUES;

    public static FirmwareState[] values() {
        return null;
    }

    public static FirmwareState valueOf(String string2) {
        return null;
    }

    private FirmwareState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static FirmwareState find(int n) {
        return null;
    }

    private static /* synthetic */ FirmwareState[] $values() {
        return null;
    }

    static {
        $VALUES = FirmwareState.$values();
        allValues = FirmwareState.values();
    }
}

