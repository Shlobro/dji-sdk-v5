/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class H1CurrentChangingParam
extends Enum<H1CurrentChangingParam>
implements JNIProguardKeepTag {
    public static final /* enum */ H1CurrentChangingParam ISO = new H1CurrentChangingParam(0);
    public static final /* enum */ H1CurrentChangingParam SHUTTER = new H1CurrentChangingParam(1);
    public static final /* enum */ H1CurrentChangingParam EV = new H1CurrentChangingParam(2);
    public static final /* enum */ H1CurrentChangingParam IRIS = new H1CurrentChangingParam(3);
    public static final /* enum */ H1CurrentChangingParam FOCUS = new H1CurrentChangingParam(4);
    public static final /* enum */ H1CurrentChangingParam UNKNOWN = new H1CurrentChangingParam(65535);
    private int value;
    private static final H1CurrentChangingParam[] allValues;
    private static final /* synthetic */ H1CurrentChangingParam[] $VALUES;

    public static H1CurrentChangingParam[] values() {
        return null;
    }

    public static H1CurrentChangingParam valueOf(String string) {
        return null;
    }

    private H1CurrentChangingParam(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static H1CurrentChangingParam find(int n) {
        return null;
    }

    private static /* synthetic */ H1CurrentChangingParam[] $values() {
        return null;
    }

    static {
        $VALUES = H1CurrentChangingParam.$values();
        allValues = H1CurrentChangingParam.values();
    }
}

