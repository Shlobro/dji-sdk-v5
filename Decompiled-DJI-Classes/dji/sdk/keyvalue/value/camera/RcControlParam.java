/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class RcControlParam
extends Enum<RcControlParam>
implements JNIProguardKeepTag {
    public static final /* enum */ RcControlParam ISO = new RcControlParam(0);
    public static final /* enum */ RcControlParam SHUTTER = new RcControlParam(1);
    public static final /* enum */ RcControlParam EV = new RcControlParam(2);
    public static final /* enum */ RcControlParam IRIS = new RcControlParam(3);
    public static final /* enum */ RcControlParam FOCUS = new RcControlParam(4);
    public static final /* enum */ RcControlParam UNKNOWN = new RcControlParam(255);
    private int value;
    private static final RcControlParam[] allValues;
    private static final /* synthetic */ RcControlParam[] $VALUES;

    public static RcControlParam[] values() {
        return null;
    }

    public static RcControlParam valueOf(String string) {
        return null;
    }

    private RcControlParam(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcControlParam find(int n) {
        return null;
    }

    private static /* synthetic */ RcControlParam[] $values() {
        return null;
    }

    static {
        $VALUES = RcControlParam.$values();
        allValues = RcControlParam.values();
    }
}

