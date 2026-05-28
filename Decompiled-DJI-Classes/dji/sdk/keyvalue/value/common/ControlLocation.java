/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class ControlLocation
extends Enum<ControlLocation>
implements JNIProguardKeepTag {
    public static final /* enum */ ControlLocation LEFT_TOP = new ControlLocation(0);
    public static final /* enum */ ControlLocation LEFT_BOTTOM = new ControlLocation(1);
    public static final /* enum */ ControlLocation RIGHT_TOP = new ControlLocation(2);
    public static final /* enum */ ControlLocation RIGHT_BOTTOM = new ControlLocation(3);
    public static final /* enum */ ControlLocation UNKNOWN = new ControlLocation(65535);
    private int value;
    private static final ControlLocation[] allValues;
    private static final /* synthetic */ ControlLocation[] $VALUES;

    public static ControlLocation[] values() {
        return null;
    }

    public static ControlLocation valueOf(String string) {
        return null;
    }

    private ControlLocation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ControlLocation find(int n) {
        return null;
    }

    private static /* synthetic */ ControlLocation[] $values() {
        return null;
    }

    static {
        $VALUES = ControlLocation.$values();
        allValues = ControlLocation.values();
    }
}

