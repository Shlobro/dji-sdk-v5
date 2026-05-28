/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class NestDroneOnOff
extends Enum<NestDroneOnOff>
implements JNIProguardKeepTag {
    public static final /* enum */ NestDroneOnOff ON = new NestDroneOnOff(0);
    public static final /* enum */ NestDroneOnOff OFF = new NestDroneOnOff(1);
    public static final /* enum */ NestDroneOnOff REBOOT = new NestDroneOnOff(2);
    public static final /* enum */ NestDroneOnOff UNKNOWN = new NestDroneOnOff(65535);
    private int value;
    private static final NestDroneOnOff[] allValues;
    private static final /* synthetic */ NestDroneOnOff[] $VALUES;

    public static NestDroneOnOff[] values() {
        return null;
    }

    public static NestDroneOnOff valueOf(String string) {
        return null;
    }

    private NestDroneOnOff(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NestDroneOnOff find(int n) {
        return null;
    }

    private static /* synthetic */ NestDroneOnOff[] $values() {
        return null;
    }

    static {
        $VALUES = NestDroneOnOff.$values();
        allValues = NestDroneOnOff.values();
    }
}

