/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestDeploymentEvaluation
extends Enum<DroneNestDeploymentEvaluation>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestDeploymentEvaluation NONE = new DroneNestDeploymentEvaluation(0);
    public static final /* enum */ DroneNestDeploymentEvaluation POOL = new DroneNestDeploymentEvaluation(1);
    public static final /* enum */ DroneNestDeploymentEvaluation GOOD = new DroneNestDeploymentEvaluation(2);
    public static final /* enum */ DroneNestDeploymentEvaluation EXCELLENT = new DroneNestDeploymentEvaluation(3);
    public static final /* enum */ DroneNestDeploymentEvaluation UNKNOWN = new DroneNestDeploymentEvaluation(65535);
    private int value;
    private static final DroneNestDeploymentEvaluation[] allValues;
    private static final /* synthetic */ DroneNestDeploymentEvaluation[] $VALUES;

    public static DroneNestDeploymentEvaluation[] values() {
        return null;
    }

    public static DroneNestDeploymentEvaluation valueOf(String string) {
        return null;
    }

    private DroneNestDeploymentEvaluation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestDeploymentEvaluation find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestDeploymentEvaluation[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestDeploymentEvaluation.$values();
        allValues = DroneNestDeploymentEvaluation.values();
    }
}

