/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestDeploymentMode
extends Enum<DroneNestDeploymentMode>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestDeploymentMode NO_DEPLOYMENT = new DroneNestDeploymentMode(0);
    public static final /* enum */ DroneNestDeploymentMode FIXED_DEPLOYMENT = new DroneNestDeploymentMode(1);
    public static final /* enum */ DroneNestDeploymentMode MOVE_DEPLOYMENT = new DroneNestDeploymentMode(2);
    public static final /* enum */ DroneNestDeploymentMode UNKNOWN = new DroneNestDeploymentMode(65535);
    private int value;
    private static final DroneNestDeploymentMode[] allValues;
    private static final /* synthetic */ DroneNestDeploymentMode[] $VALUES;

    public static DroneNestDeploymentMode[] values() {
        return null;
    }

    public static DroneNestDeploymentMode valueOf(String string) {
        return null;
    }

    private DroneNestDeploymentMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestDeploymentMode find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestDeploymentMode[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestDeploymentMode.$values();
        allValues = DroneNestDeploymentMode.values();
    }
}

