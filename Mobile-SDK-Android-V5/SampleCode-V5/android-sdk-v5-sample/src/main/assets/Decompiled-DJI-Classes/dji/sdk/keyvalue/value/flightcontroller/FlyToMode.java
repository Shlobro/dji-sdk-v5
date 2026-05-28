/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlyToMode
extends Enum<FlyToMode>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyToMode SMART_HEIGHT = new FlyToMode(0);
    public static final /* enum */ FlyToMode SET_HEIGHT = new FlyToMode(1);
    public static final /* enum */ FlyToMode UNKNOWN = new FlyToMode(65535);
    private int value;
    private static final FlyToMode[] allValues;
    private static final /* synthetic */ FlyToMode[] $VALUES;

    public static FlyToMode[] values() {
        return null;
    }

    public static FlyToMode valueOf(String string) {
        return null;
    }

    private FlyToMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyToMode find(int n) {
        return null;
    }

    private static /* synthetic */ FlyToMode[] $values() {
        return null;
    }

    static {
        $VALUES = FlyToMode.$values();
        allValues = FlyToMode.values();
    }
}

