/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class GoHomeMode
extends Enum<GoHomeMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GoHomeMode STRAIGHT = new GoHomeMode(0);
    public static final /* enum */ GoHomeMode ENERGY_EFFICIENT = new GoHomeMode(1);
    public static final /* enum */ GoHomeMode RETRACE = new GoHomeMode(2);
    public static final /* enum */ GoHomeMode UNKNOWN = new GoHomeMode(255);
    private int value;
    private static final GoHomeMode[] allValues;
    private static final /* synthetic */ GoHomeMode[] $VALUES;

    public static GoHomeMode[] values() {
        return null;
    }

    public static GoHomeMode valueOf(String string) {
        return null;
    }

    private GoHomeMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GoHomeMode find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomeMode[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomeMode.$values();
        allValues = GoHomeMode.values();
    }
}

