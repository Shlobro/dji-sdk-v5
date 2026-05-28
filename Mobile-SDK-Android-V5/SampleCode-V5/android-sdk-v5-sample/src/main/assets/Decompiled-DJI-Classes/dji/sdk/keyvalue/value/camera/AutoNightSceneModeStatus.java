/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class AutoNightSceneModeStatus
extends Enum<AutoNightSceneModeStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ AutoNightSceneModeStatus DISABLED = new AutoNightSceneModeStatus(0);
    public static final /* enum */ AutoNightSceneModeStatus ENABLED = new AutoNightSceneModeStatus(1);
    public static final /* enum */ AutoNightSceneModeStatus UNKNOWN = new AutoNightSceneModeStatus(255);
    private int value;
    private static final AutoNightSceneModeStatus[] allValues;
    private static final /* synthetic */ AutoNightSceneModeStatus[] $VALUES;

    public static AutoNightSceneModeStatus[] values() {
        return null;
    }

    public static AutoNightSceneModeStatus valueOf(String string) {
        return null;
    }

    private AutoNightSceneModeStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AutoNightSceneModeStatus find(int n) {
        return null;
    }

    private static /* synthetic */ AutoNightSceneModeStatus[] $values() {
        return null;
    }

    static {
        $VALUES = AutoNightSceneModeStatus.$values();
        allValues = AutoNightSceneModeStatus.values();
    }
}

