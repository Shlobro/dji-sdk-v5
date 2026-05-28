/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;

public final class HMSDiagnosticSenderType
extends Enum<HMSDiagnosticSenderType>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSDiagnosticSenderType AIRCRAFT = new HMSDiagnosticSenderType(0);
    public static final /* enum */ HMSDiagnosticSenderType BATTERYBOX = new HMSDiagnosticSenderType(1);
    public static final /* enum */ HMSDiagnosticSenderType REMOTECONTROLLER = new HMSDiagnosticSenderType(2);
    public static final /* enum */ HMSDiagnosticSenderType DRONE_NEST = new HMSDiagnosticSenderType(3);
    public static final /* enum */ HMSDiagnosticSenderType RELAY = new HMSDiagnosticSenderType(4);
    public static final /* enum */ HMSDiagnosticSenderType MAX_TYPE = new HMSDiagnosticSenderType(5);
    public static final /* enum */ HMSDiagnosticSenderType UNKNOWN = new HMSDiagnosticSenderType(65535);
    private int value;
    private static final HMSDiagnosticSenderType[] allValues;
    private static final /* synthetic */ HMSDiagnosticSenderType[] $VALUES;

    public static HMSDiagnosticSenderType[] values() {
        return null;
    }

    public static HMSDiagnosticSenderType valueOf(String string) {
        return null;
    }

    private HMSDiagnosticSenderType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSDiagnosticSenderType find(int n) {
        return null;
    }

    private static /* synthetic */ HMSDiagnosticSenderType[] $values() {
        return null;
    }

    static {
        $VALUES = HMSDiagnosticSenderType.$values();
        allValues = HMSDiagnosticSenderType.values();
    }
}

