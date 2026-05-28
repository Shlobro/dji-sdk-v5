/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class AuxiliaryLightEffectiveStage
extends Enum<AuxiliaryLightEffectiveStage>
implements JNIProguardKeepTag {
    public static final /* enum */ AuxiliaryLightEffectiveStage IMMEDIATELY = new AuxiliaryLightEffectiveStage(0);
    public static final /* enum */ AuxiliaryLightEffectiveStage AFTER_TAKEOFF = new AuxiliaryLightEffectiveStage(1);
    public static final /* enum */ AuxiliaryLightEffectiveStage UNKNOWN = new AuxiliaryLightEffectiveStage(65535);
    private int value;
    private static final AuxiliaryLightEffectiveStage[] allValues;
    private static final /* synthetic */ AuxiliaryLightEffectiveStage[] $VALUES;

    public static AuxiliaryLightEffectiveStage[] values() {
        return null;
    }

    public static AuxiliaryLightEffectiveStage valueOf(String string) {
        return null;
    }

    private AuxiliaryLightEffectiveStage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AuxiliaryLightEffectiveStage find(int n) {
        return null;
    }

    private static /* synthetic */ AuxiliaryLightEffectiveStage[] $values() {
        return null;
    }

    static {
        $VALUES = AuxiliaryLightEffectiveStage.$values();
        allValues = AuxiliaryLightEffectiveStage.values();
    }
}

