/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class FlyingOnShipHomePointStatus
extends Enum<FlyingOnShipHomePointStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyingOnShipHomePointStatus NOT_USE_DYNAMIC_HOMEPOINT = new FlyingOnShipHomePointStatus(0);
    public static final /* enum */ FlyingOnShipHomePointStatus REFRSSH = new FlyingOnShipHomePointStatus(1);
    public static final /* enum */ FlyingOnShipHomePointStatus SUSPEND = new FlyingOnShipHomePointStatus(2);
    public static final /* enum */ FlyingOnShipHomePointStatus UNKNOWN = new FlyingOnShipHomePointStatus(65535);
    private int value;
    private static final FlyingOnShipHomePointStatus[] allValues;
    private static final /* synthetic */ FlyingOnShipHomePointStatus[] $VALUES;

    public static FlyingOnShipHomePointStatus[] values() {
        return null;
    }

    public static FlyingOnShipHomePointStatus valueOf(String string) {
        return null;
    }

    private FlyingOnShipHomePointStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyingOnShipHomePointStatus find(int n) {
        return null;
    }

    private static /* synthetic */ FlyingOnShipHomePointStatus[] $values() {
        return null;
    }

    static {
        $VALUES = FlyingOnShipHomePointStatus.$values();
        allValues = FlyingOnShipHomePointStatus.values();
    }
}

