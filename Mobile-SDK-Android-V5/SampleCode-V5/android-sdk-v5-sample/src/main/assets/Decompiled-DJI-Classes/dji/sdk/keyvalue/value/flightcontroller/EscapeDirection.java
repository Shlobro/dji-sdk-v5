/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class EscapeDirection
extends Enum<EscapeDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ EscapeDirection NO_ACTION = new EscapeDirection(0);
    public static final /* enum */ EscapeDirection UP_ESCAPE = new EscapeDirection(1);
    public static final /* enum */ EscapeDirection DOWN_ESCAPE = new EscapeDirection(2);
    public static final /* enum */ EscapeDirection HORIZONTAL_ESCAPE = new EscapeDirection(3);
    public static final /* enum */ EscapeDirection UNKNOWN = new EscapeDirection(65535);
    private int value;
    private static final EscapeDirection[] allValues;
    private static final /* synthetic */ EscapeDirection[] $VALUES;

    public static EscapeDirection[] values() {
        return null;
    }

    public static EscapeDirection valueOf(String string) {
        return null;
    }

    private EscapeDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EscapeDirection find(int n) {
        return null;
    }

    private static /* synthetic */ EscapeDirection[] $values() {
        return null;
    }

    static {
        $VALUES = EscapeDirection.$values();
        allValues = EscapeDirection.values();
    }
}

