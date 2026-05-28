/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlyTransportContainer
extends Enum<FlyTransportContainer>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyTransportContainer OFFICIAL_0 = new FlyTransportContainer(0);
    public static final /* enum */ FlyTransportContainer OFFICIAL_1 = new FlyTransportContainer(1);
    public static final /* enum */ FlyTransportContainer NOT_SUPPORT = new FlyTransportContainer(254);
    public static final /* enum */ FlyTransportContainer UNKNOWN = new FlyTransportContainer(65535);
    private int value;
    private static final FlyTransportContainer[] allValues;
    private static final /* synthetic */ FlyTransportContainer[] $VALUES;

    public static FlyTransportContainer[] values() {
        return null;
    }

    public static FlyTransportContainer valueOf(String string) {
        return null;
    }

    private FlyTransportContainer(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyTransportContainer find(int n) {
        return null;
    }

    private static /* synthetic */ FlyTransportContainer[] $values() {
        return null;
    }

    static {
        $VALUES = FlyTransportContainer.$values();
        allValues = FlyTransportContainer.values();
    }
}

