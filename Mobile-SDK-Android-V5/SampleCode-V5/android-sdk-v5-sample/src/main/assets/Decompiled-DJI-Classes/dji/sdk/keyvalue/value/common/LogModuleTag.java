/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LogModuleTag
extends Enum<LogModuleTag>
implements JNIProguardKeepTag {
    public static final /* enum */ LogModuleTag None = new LogModuleTag(0);
    public static final /* enum */ LogModuleTag Camera = new LogModuleTag(1);
    public static final /* enum */ LogModuleTag Gimbal = new LogModuleTag(2);
    public static final /* enum */ LogModuleTag Battery = new LogModuleTag(3);
    public static final /* enum */ LogModuleTag FlightController = new LogModuleTag(4);
    public static final /* enum */ LogModuleTag RemoteController = new LogModuleTag(5);
    public static final /* enum */ LogModuleTag Airlink = new LogModuleTag(6);
    public static final /* enum */ LogModuleTag Payload = new LogModuleTag(7);
    public static final /* enum */ LogModuleTag MOP = new LogModuleTag(8);
    public static final /* enum */ LogModuleTag RTK = new LogModuleTag(9);
    public static final /* enum */ LogModuleTag UTMISS = new LogModuleTag(10);
    public static final /* enum */ LogModuleTag Waypoint = new LogModuleTag(11);
    public static final /* enum */ LogModuleTag Flysafe = new LogModuleTag(12);
    public static final /* enum */ LogModuleTag Upgrade = new LogModuleTag(13);
    public static final /* enum */ LogModuleTag LDM = new LogModuleTag(14);
    public static final /* enum */ LogModuleTag Product = new LogModuleTag(15);
    public static final /* enum */ LogModuleTag RealName = new LogModuleTag(16);
    public static final /* enum */ LogModuleTag Activation = new LogModuleTag(17);
    public static final /* enum */ LogModuleTag FlightHub = new LogModuleTag(18);
    public static final /* enum */ LogModuleTag Mission = new LogModuleTag(19);
    public static final /* enum */ LogModuleTag Datalink = new LogModuleTag(20);
    public static final /* enum */ LogModuleTag UNKNOWN = new LogModuleTag(65535);
    private int value;
    private static final LogModuleTag[] allValues;
    private static final /* synthetic */ LogModuleTag[] $VALUES;

    public static LogModuleTag[] values() {
        return null;
    }

    public static LogModuleTag valueOf(String string) {
        return null;
    }

    private LogModuleTag(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogModuleTag find(int n) {
        return null;
    }

    private static /* synthetic */ LogModuleTag[] $values() {
        return null;
    }

    static {
        $VALUES = LogModuleTag.$values();
        allValues = LogModuleTag.values();
    }
}

