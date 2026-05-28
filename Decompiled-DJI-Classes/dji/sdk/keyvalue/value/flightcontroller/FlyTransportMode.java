/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlyTransportMode
extends Enum<FlyTransportMode>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyTransportMode CONTAINER = new FlyTransportMode(0);
    public static final /* enum */ FlyTransportMode LIFTING = new FlyTransportMode(1);
    public static final /* enum */ FlyTransportMode NORMAL = new FlyTransportMode(254);
    public static final /* enum */ FlyTransportMode UNKNOWN = new FlyTransportMode(65535);
    private int value;
    private static final FlyTransportMode[] allValues;
    private static final /* synthetic */ FlyTransportMode[] $VALUES;

    public static FlyTransportMode[] values() {
        return null;
    }

    public static FlyTransportMode valueOf(String string) {
        return null;
    }

    private FlyTransportMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyTransportMode find(int n) {
        return null;
    }

    private static /* synthetic */ FlyTransportMode[] $values() {
        return null;
    }

    static {
        $VALUES = FlyTransportMode.$values();
        allValues = FlyTransportMode.values();
    }
}

