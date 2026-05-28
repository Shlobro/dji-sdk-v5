/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalVersion
extends Enum<ThermalVersion>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalVersion XT_STANDARD = new ThermalVersion(0);
    public static final /* enum */ ThermalVersion XT_ADVANCED_RADIOMETRY_ENABLED = new ThermalVersion(1);
    public static final /* enum */ ThermalVersion UNKNOWN = new ThermalVersion(65535);
    private int value;
    private static final ThermalVersion[] allValues;
    private static final /* synthetic */ ThermalVersion[] $VALUES;

    public static ThermalVersion[] values() {
        return null;
    }

    public static ThermalVersion valueOf(String string) {
        return null;
    }

    private ThermalVersion(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalVersion find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalVersion[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalVersion.$values();
        allValues = ThermalVersion.values();
    }
}

