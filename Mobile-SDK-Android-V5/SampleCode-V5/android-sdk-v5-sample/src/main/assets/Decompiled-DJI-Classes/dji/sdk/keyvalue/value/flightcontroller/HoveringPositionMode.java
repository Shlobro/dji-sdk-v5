/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class HoveringPositionMode
extends Enum<HoveringPositionMode>
implements JNIProguardKeepTag {
    public static final /* enum */ HoveringPositionMode LOCK = new HoveringPositionMode(1);
    public static final /* enum */ HoveringPositionMode UNLOCK = new HoveringPositionMode(2);
    public static final /* enum */ HoveringPositionMode UNKNOWN = new HoveringPositionMode(65535);
    private int value;
    private static final HoveringPositionMode[] allValues;
    private static final /* synthetic */ HoveringPositionMode[] $VALUES;

    public static HoveringPositionMode[] values() {
        return null;
    }

    public static HoveringPositionMode valueOf(String string) {
        return null;
    }

    private HoveringPositionMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HoveringPositionMode find(int n) {
        return null;
    }

    private static /* synthetic */ HoveringPositionMode[] $values() {
        return null;
    }

    static {
        $VALUES = HoveringPositionMode.$values();
        allValues = HoveringPositionMode.values();
    }
}

