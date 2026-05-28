/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestWorkMode
extends Enum<DroneNestWorkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestWorkMode READY = new DroneNestWorkMode(0);
    public static final /* enum */ DroneNestWorkMode LOCAL_DEBUG = new DroneNestWorkMode(1);
    public static final /* enum */ DroneNestWorkMode REMOTE_DEBUG = new DroneNestWorkMode(2);
    public static final /* enum */ DroneNestWorkMode UPGRADE = new DroneNestWorkMode(3);
    public static final /* enum */ DroneNestWorkMode TASK_EXECUTE = new DroneNestWorkMode(4);
    public static final /* enum */ DroneNestWorkMode GO_HOME = new DroneNestWorkMode(5);
    public static final /* enum */ DroneNestWorkMode MANUAL_FLIGHT = new DroneNestWorkMode(6);
    public static final /* enum */ DroneNestWorkMode UNKNOWN = new DroneNestWorkMode(65535);
    private int value;
    private static final DroneNestWorkMode[] allValues;
    private static final /* synthetic */ DroneNestWorkMode[] $VALUES;

    public static DroneNestWorkMode[] values() {
        return null;
    }

    public static DroneNestWorkMode valueOf(String string) {
        return null;
    }

    private DroneNestWorkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestWorkMode find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestWorkMode[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestWorkMode.$values();
        allValues = DroneNestWorkMode.values();
    }
}

