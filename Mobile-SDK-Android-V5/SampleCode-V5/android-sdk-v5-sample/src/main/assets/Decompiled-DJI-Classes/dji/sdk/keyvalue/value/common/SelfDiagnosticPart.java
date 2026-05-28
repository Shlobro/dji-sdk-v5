/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SelfDiagnosticPart
extends Enum<SelfDiagnosticPart>
implements JNIProguardKeepTag {
    public static final /* enum */ SelfDiagnosticPart UNKNOWN = new SelfDiagnosticPart(0);
    public static final /* enum */ SelfDiagnosticPart ESC = new SelfDiagnosticPart(1);
    public static final /* enum */ SelfDiagnosticPart NOZZLE = new SelfDiagnosticPart(2);
    public static final /* enum */ SelfDiagnosticPart PUMP = new SelfDiagnosticPart(3);
    public static final /* enum */ SelfDiagnosticPart DELIVER = new SelfDiagnosticPart(4);
    public static final /* enum */ SelfDiagnosticPart THROW = new SelfDiagnosticPart(5);
    public static final /* enum */ SelfDiagnosticPart MATRIAL = new SelfDiagnosticPart(6);
    public static final /* enum */ SelfDiagnosticPart LINK = new SelfDiagnosticPart(7);
    public static final /* enum */ SelfDiagnosticPart AVIONICS = new SelfDiagnosticPart(8);
    public static final /* enum */ SelfDiagnosticPart DOCK_CONTROL = new SelfDiagnosticPart(257);
    public static final /* enum */ SelfDiagnosticPart DOCK_MET = new SelfDiagnosticPart(258);
    public static final /* enum */ SelfDiagnosticPart DOCK_HATCH = new SelfDiagnosticPart(259);
    public static final /* enum */ SelfDiagnosticPart DOCK_COOL_MODE = new SelfDiagnosticPart(260);
    public static final /* enum */ SelfDiagnosticPart DOCK_HEAT_MODE = new SelfDiagnosticPart(261);
    public static final /* enum */ SelfDiagnosticPart DOCK_FAN = new SelfDiagnosticPart(262);
    public static final /* enum */ SelfDiagnosticPart DOCK_CHARGING = new SelfDiagnosticPart(263);
    public static final /* enum */ SelfDiagnosticPart DOCK_RTK = new SelfDiagnosticPart(264);
    public static final /* enum */ SelfDiagnosticPart DOCK_SOUND_LIGNT = new SelfDiagnosticPart(265);
    public static final /* enum */ SelfDiagnosticPart DOCK_FPV = new SelfDiagnosticPart(266);
    public static final /* enum */ SelfDiagnosticPart DOCK_FILL_LIGHT = new SelfDiagnosticPart(267);
    public static final /* enum */ SelfDiagnosticPart DOCK_LANDING_LIGHT = new SelfDiagnosticPart(268);
    public static final /* enum */ SelfDiagnosticPart QUICK = new SelfDiagnosticPart(65534);
    public static final /* enum */ SelfDiagnosticPart ALL = new SelfDiagnosticPart(65535);
    private int value;
    private static final SelfDiagnosticPart[] allValues;
    private static final /* synthetic */ SelfDiagnosticPart[] $VALUES;

    public static SelfDiagnosticPart[] values() {
        return null;
    }

    public static SelfDiagnosticPart valueOf(String string) {
        return null;
    }

    private SelfDiagnosticPart(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SelfDiagnosticPart find(int n) {
        return null;
    }

    private static /* synthetic */ SelfDiagnosticPart[] $values() {
        return null;
    }

    static {
        $VALUES = SelfDiagnosticPart.$values();
        allValues = SelfDiagnosticPart.values();
    }
}

