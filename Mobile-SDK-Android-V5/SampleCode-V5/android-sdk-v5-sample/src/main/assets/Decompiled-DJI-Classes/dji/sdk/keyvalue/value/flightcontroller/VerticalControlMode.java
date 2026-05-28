/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class VerticalControlMode
extends Enum<VerticalControlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ VerticalControlMode VELOCITY = new VerticalControlMode(0);
    public static final /* enum */ VerticalControlMode POSITION = new VerticalControlMode(1);
    public static final /* enum */ VerticalControlMode UNKNOWN = new VerticalControlMode(65535);
    private int value;
    private static final VerticalControlMode[] allValues;
    private static final /* synthetic */ VerticalControlMode[] $VALUES;

    public static VerticalControlMode[] values() {
        return null;
    }

    public static VerticalControlMode valueOf(String string) {
        return null;
    }

    private VerticalControlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VerticalControlMode find(int n) {
        return null;
    }

    private static /* synthetic */ VerticalControlMode[] $values() {
        return null;
    }

    static {
        $VALUES = VerticalControlMode.$values();
        allValues = VerticalControlMode.values();
    }
}

