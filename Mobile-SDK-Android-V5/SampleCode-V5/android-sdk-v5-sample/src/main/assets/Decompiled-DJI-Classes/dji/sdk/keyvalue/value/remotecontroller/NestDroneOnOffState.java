/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class NestDroneOnOffState
extends Enum<NestDroneOnOffState>
implements JNIProguardKeepTag {
    public static final /* enum */ NestDroneOnOffState SHUT = new NestDroneOnOffState(0);
    public static final /* enum */ NestDroneOnOffState BOOT = new NestDroneOnOffState(1);
    public static final /* enum */ NestDroneOnOffState BOOTING = new NestDroneOnOffState(2);
    public static final /* enum */ NestDroneOnOffState SHUTTING = new NestDroneOnOffState(3);
    public static final /* enum */ NestDroneOnOffState REBOOT = new NestDroneOnOffState(4);
    public static final /* enum */ NestDroneOnOffState UNCONNECT = new NestDroneOnOffState(255);
    public static final /* enum */ NestDroneOnOffState UNKNOWN = new NestDroneOnOffState(65535);
    private int value;
    private static final NestDroneOnOffState[] allValues;
    private static final /* synthetic */ NestDroneOnOffState[] $VALUES;

    public static NestDroneOnOffState[] values() {
        return null;
    }

    public static NestDroneOnOffState valueOf(String string) {
        return null;
    }

    private NestDroneOnOffState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NestDroneOnOffState find(int n) {
        return null;
    }

    private static /* synthetic */ NestDroneOnOffState[] $values() {
        return null;
    }

    static {
        $VALUES = NestDroneOnOffState.$values();
        allValues = NestDroneOnOffState.values();
    }
}

