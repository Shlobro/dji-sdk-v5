/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestDataStorageArea
extends Enum<DroneNestDataStorageArea>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestDataStorageArea CN = new DroneNestDataStorageArea(0);
    public static final /* enum */ DroneNestDataStorageArea UAS = new DroneNestDataStorageArea(1);
    public static final /* enum */ DroneNestDataStorageArea UNKNOWN = new DroneNestDataStorageArea(65535);
    private int value;
    private static final DroneNestDataStorageArea[] allValues;
    private static final /* synthetic */ DroneNestDataStorageArea[] $VALUES;

    public static DroneNestDataStorageArea[] values() {
        return null;
    }

    public static DroneNestDataStorageArea valueOf(String string) {
        return null;
    }

    private DroneNestDataStorageArea(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestDataStorageArea find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestDataStorageArea[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestDataStorageArea.$values();
        allValues = DroneNestDataStorageArea.values();
    }
}

