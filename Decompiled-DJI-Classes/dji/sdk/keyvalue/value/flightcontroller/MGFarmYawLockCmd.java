/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFarmYawLockCmd
extends Enum<MGFarmYawLockCmd>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFarmYawLockCmd LOCK = new MGFarmYawLockCmd(0);
    public static final /* enum */ MGFarmYawLockCmd UNLOCK = new MGFarmYawLockCmd(1);
    public static final /* enum */ MGFarmYawLockCmd UNKNOWN = new MGFarmYawLockCmd(65535);
    private int value;
    private static final MGFarmYawLockCmd[] allValues;
    private static final /* synthetic */ MGFarmYawLockCmd[] $VALUES;

    public static MGFarmYawLockCmd[] values() {
        return null;
    }

    public static MGFarmYawLockCmd valueOf(String string) {
        return null;
    }

    private MGFarmYawLockCmd(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFarmYawLockCmd find(int n) {
        return null;
    }

    private static /* synthetic */ MGFarmYawLockCmd[] $values() {
        return null;
    }

    static {
        $VALUES = MGFarmYawLockCmd.$values();
        allValues = MGFarmYawLockCmd.values();
    }
}

