/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DecodeAbilityType
extends Enum<DecodeAbilityType>
implements JNIProguardKeepTag {
    public static final /* enum */ DecodeAbilityType NONE = new DecodeAbilityType(0);
    public static final /* enum */ DecodeAbilityType RESOLUTION = new DecodeAbilityType(1);
    public static final /* enum */ DecodeAbilityType CODECTYPE = new DecodeAbilityType(2);
    public static final /* enum */ DecodeAbilityType BITDEPTH = new DecodeAbilityType(3);
    public static final /* enum */ DecodeAbilityType BITRATE = new DecodeAbilityType(4);
    public static final /* enum */ DecodeAbilityType FRAMERATE = new DecodeAbilityType(5);
    public static final /* enum */ DecodeAbilityType UNKNOWN = new DecodeAbilityType(65535);
    private int value;
    private static final DecodeAbilityType[] allValues;
    private static final /* synthetic */ DecodeAbilityType[] $VALUES;

    public static DecodeAbilityType[] values() {
        return null;
    }

    public static DecodeAbilityType valueOf(String string) {
        return null;
    }

    private DecodeAbilityType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DecodeAbilityType find(int n) {
        return null;
    }

    private static /* synthetic */ DecodeAbilityType[] $values() {
        return null;
    }

    static {
        $VALUES = DecodeAbilityType.$values();
        allValues = DecodeAbilityType.values();
    }
}

