/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalFeatureState
extends Enum<GimbalFeatureState>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalFeatureState IDLE = new GimbalFeatureState(0);
    public static final /* enum */ GimbalFeatureState OUTSIDE_MODULE_DISABLE = new GimbalFeatureState(1);
    public static final /* enum */ GimbalFeatureState ONLY_CURRENT_MODULE_ENABLE = new GimbalFeatureState(2);
    public static final /* enum */ GimbalFeatureState UNKNOWN = new GimbalFeatureState(65535);
    private int value;
    private static final GimbalFeatureState[] allValues;
    private static final /* synthetic */ GimbalFeatureState[] $VALUES;

    public static GimbalFeatureState[] values() {
        return null;
    }

    public static GimbalFeatureState valueOf(String string) {
        return null;
    }

    private GimbalFeatureState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalFeatureState find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalFeatureState[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalFeatureState.$values();
        allValues = GimbalFeatureState.values();
    }
}

