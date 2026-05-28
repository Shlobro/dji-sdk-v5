/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AtmosphereLightMode
extends Enum<AtmosphereLightMode>
implements JNIProguardKeepTag {
    public static final /* enum */ AtmosphereLightMode ALWAYS_CLOSE = new AtmosphereLightMode(0);
    public static final /* enum */ AtmosphereLightMode ALWAYS_OPEN = new AtmosphereLightMode(1);
    public static final /* enum */ AtmosphereLightMode BREATHE = new AtmosphereLightMode(2);
    public static final /* enum */ AtmosphereLightMode SLOW_FLASHING = new AtmosphereLightMode(3);
    public static final /* enum */ AtmosphereLightMode FAST_FLASHING = new AtmosphereLightMode(4);
    public static final /* enum */ AtmosphereLightMode RAINBOW = new AtmosphereLightMode(5);
    public static final /* enum */ AtmosphereLightMode UNKNOWN = new AtmosphereLightMode(255);
    private int value;
    private static final AtmosphereLightMode[] allValues;
    private static final /* synthetic */ AtmosphereLightMode[] $VALUES;

    public static AtmosphereLightMode[] values() {
        return null;
    }

    public static AtmosphereLightMode valueOf(String string) {
        return null;
    }

    private AtmosphereLightMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AtmosphereLightMode find(int n) {
        return null;
    }

    private static /* synthetic */ AtmosphereLightMode[] $values() {
        return null;
    }

    static {
        $VALUES = AtmosphereLightMode.$values();
        allValues = AtmosphereLightMode.values();
    }
}

