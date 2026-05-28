/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class RIDInfoOpt
extends Enum<RIDInfoOpt>
implements JNIProguardKeepTag {
    public static final /* enum */ RIDInfoOpt SET = new RIDInfoOpt(0);
    public static final /* enum */ RIDInfoOpt QUERY = new RIDInfoOpt(1);
    public static final /* enum */ RIDInfoOpt DELETE = new RIDInfoOpt(2);
    public static final /* enum */ RIDInfoOpt UNKNOWN = new RIDInfoOpt(65535);
    private int value;
    private static final RIDInfoOpt[] allValues;
    private static final /* synthetic */ RIDInfoOpt[] $VALUES;

    public static RIDInfoOpt[] values() {
        return null;
    }

    public static RIDInfoOpt valueOf(String string) {
        return null;
    }

    private RIDInfoOpt(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RIDInfoOpt find(int n) {
        return null;
    }

    private static /* synthetic */ RIDInfoOpt[] $values() {
        return null;
    }

    static {
        $VALUES = RIDInfoOpt.$values();
        allValues = RIDInfoOpt.values();
    }
}

