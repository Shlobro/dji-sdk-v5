/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class HighSensitivityMode
extends Enum<HighSensitivityMode>
implements JNIProguardKeepTag {
    public static final /* enum */ HighSensitivityMode CLOSED = new HighSensitivityMode(0);
    public static final /* enum */ HighSensitivityMode OPENED = new HighSensitivityMode(1);
    public static final /* enum */ HighSensitivityMode UNKNOWN = new HighSensitivityMode(65535);
    private int value;
    private static final HighSensitivityMode[] allValues;
    private static final /* synthetic */ HighSensitivityMode[] $VALUES;

    public static HighSensitivityMode[] values() {
        return null;
    }

    public static HighSensitivityMode valueOf(String string) {
        return null;
    }

    private HighSensitivityMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HighSensitivityMode find(int n) {
        return null;
    }

    private static /* synthetic */ HighSensitivityMode[] $values() {
        return null;
    }

    static {
        $VALUES = HighSensitivityMode.$values();
        allValues = HighSensitivityMode.values();
    }
}

