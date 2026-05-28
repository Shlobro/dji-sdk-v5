/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneStatusForUpload
extends Enum<DroneStatusForUpload>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneStatusForUpload NOT_READY = new DroneStatusForUpload(0);
    public static final /* enum */ DroneStatusForUpload READY = new DroneStatusForUpload(1);
    public static final /* enum */ DroneStatusForUpload UNKNOWN = new DroneStatusForUpload(65535);
    private int value;
    private static final DroneStatusForUpload[] allValues;
    private static final /* synthetic */ DroneStatusForUpload[] $VALUES;

    public static DroneStatusForUpload[] values() {
        return null;
    }

    public static DroneStatusForUpload valueOf(String string) {
        return null;
    }

    private DroneStatusForUpload(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneStatusForUpload find(int n) {
        return null;
    }

    private static /* synthetic */ DroneStatusForUpload[] $values() {
        return null;
    }

    static {
        $VALUES = DroneStatusForUpload.$values();
        allValues = DroneStatusForUpload.values();
    }
}

