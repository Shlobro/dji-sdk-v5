/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class AirLinkType
extends Enum<AirLinkType>
implements JNIProguardKeepTag {
    public static final /* enum */ AirLinkType WIFI = new AirLinkType(0);
    public static final /* enum */ AirLinkType LIGHT_BRIDGE = new AirLinkType(1);
    public static final /* enum */ AirLinkType OCU_SYNC = new AirLinkType(2);
    public static final /* enum */ AirLinkType UNKNOWN = new AirLinkType(255);
    private int value;
    private static final AirLinkType[] allValues;
    private static final /* synthetic */ AirLinkType[] $VALUES;

    public static AirLinkType[] values() {
        return null;
    }

    public static AirLinkType valueOf(String string) {
        return null;
    }

    private AirLinkType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AirLinkType find(int n) {
        return null;
    }

    private static /* synthetic */ AirLinkType[] $values() {
        return null;
    }

    static {
        $VALUES = AirLinkType.$values();
        allValues = AirLinkType.values();
    }
}

