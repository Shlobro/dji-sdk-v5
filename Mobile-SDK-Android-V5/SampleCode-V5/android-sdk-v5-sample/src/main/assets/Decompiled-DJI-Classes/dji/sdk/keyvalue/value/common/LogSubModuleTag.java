/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LogSubModuleTag
extends Enum<LogSubModuleTag>
implements JNIProguardKeepTag {
    public static final /* enum */ LogSubModuleTag None = new LogSubModuleTag(0);
    public static final /* enum */ LogSubModuleTag Shoot = new LogSubModuleTag(1);
    public static final /* enum */ LogSubModuleTag Record = new LogSubModuleTag(2);
    public static final /* enum */ LogSubModuleTag Media = new LogSubModuleTag(3);
    public static final /* enum */ LogSubModuleTag Playback = new LogSubModuleTag(4);
    public static final /* enum */ LogSubModuleTag Thermal = new LogSubModuleTag(5);
    public static final /* enum */ LogSubModuleTag Control = new LogSubModuleTag(6);
    public static final /* enum */ LogSubModuleTag Calibrate = new LogSubModuleTag(7);
    public static final /* enum */ LogSubModuleTag Voltage = new LogSubModuleTag(8);
    public static final /* enum */ LogSubModuleTag Temperature = new LogSubModuleTag(9);
    public static final /* enum */ LogSubModuleTag Charge = new LogSubModuleTag(10);
    public static final /* enum */ LogSubModuleTag Takeoff = new LogSubModuleTag(11);
    public static final /* enum */ LogSubModuleTag Flight = new LogSubModuleTag(12);
    public static final /* enum */ LogSubModuleTag Gohome = new LogSubModuleTag(13);
    public static final /* enum */ LogSubModuleTag Landing = new LogSubModuleTag(14);
    public static final /* enum */ LogSubModuleTag Mode = new LogSubModuleTag(15);
    public static final /* enum */ LogSubModuleTag Compass = new LogSubModuleTag(16);
    public static final /* enum */ LogSubModuleTag Simulator = new LogSubModuleTag(17);
    public static final /* enum */ LogSubModuleTag ESC = new LogSubModuleTag(18);
    public static final /* enum */ LogSubModuleTag ADSB = new LogSubModuleTag(19);
    public static final /* enum */ LogSubModuleTag Perception = new LogSubModuleTag(20);
    public static final /* enum */ LogSubModuleTag Pairing = new LogSubModuleTag(21);
    public static final /* enum */ LogSubModuleTag Channel = new LogSubModuleTag(22);
    public static final /* enum */ LogSubModuleTag Changing = new LogSubModuleTag(23);
    public static final /* enum */ LogSubModuleTag GimbalControl = new LogSubModuleTag(24);
    public static final /* enum */ LogSubModuleTag CustomButton = new LogSubModuleTag(25);
    public static final /* enum */ LogSubModuleTag RCMode = new LogSubModuleTag(26);
    public static final /* enum */ LogSubModuleTag SecondaryVideo = new LogSubModuleTag(27);
    public static final /* enum */ LogSubModuleTag WifiLink = new LogSubModuleTag(28);
    public static final /* enum */ LogSubModuleTag OcuSyncLink = new LogSubModuleTag(29);
    public static final /* enum */ LogSubModuleTag LBAirLink = new LogSubModuleTag(30);
    public static final /* enum */ LogSubModuleTag PayloadGimbal = new LogSubModuleTag(31);
    public static final /* enum */ LogSubModuleTag PayloadCamera = new LogSubModuleTag(32);
    public static final /* enum */ LogSubModuleTag PayloadLiveview = new LogSubModuleTag(33);
    public static final /* enum */ LogSubModuleTag QXRTK = new LogSubModuleTag(34);
    public static final /* enum */ LogSubModuleTag CustomRTK = new LogSubModuleTag(35);
    public static final /* enum */ LogSubModuleTag BaseStation = new LogSubModuleTag(36);
    public static final /* enum */ LogSubModuleTag ProductConnect = new LogSubModuleTag(37);
    public static final /* enum */ LogSubModuleTag ProductDisconnect = new LogSubModuleTag(38);
    public static final /* enum */ LogSubModuleTag Wifi = new LogSubModuleTag(39);
    public static final /* enum */ LogSubModuleTag BLE = new LogSubModuleTag(40);
    public static final /* enum */ LogSubModuleTag AOA = new LogSubModuleTag(41);
    public static final /* enum */ LogSubModuleTag MFI = new LogSubModuleTag(42);
    public static final /* enum */ LogSubModuleTag UDT = new LogSubModuleTag(43);
    public static final /* enum */ LogSubModuleTag UNKNOWN = new LogSubModuleTag(65535);
    private int value;
    private static final LogSubModuleTag[] allValues;
    private static final /* synthetic */ LogSubModuleTag[] $VALUES;

    public static LogSubModuleTag[] values() {
        return null;
    }

    public static LogSubModuleTag valueOf(String string) {
        return null;
    }

    private LogSubModuleTag(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogSubModuleTag find(int n) {
        return null;
    }

    private static /* synthetic */ LogSubModuleTag[] $values() {
        return null;
    }

    static {
        $VALUES = LogSubModuleTag.$values();
        allValues = LogSubModuleTag.values();
    }
}

