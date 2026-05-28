/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.dcl;

import dji.jni.JNIProguardKeepTag;

public final class DCLErrorCode
extends Enum<DCLErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ DCLErrorCode NO_ERROR = new DCLErrorCode(0);
    public static final /* enum */ DCLErrorCode ERROR_INVALID_STATE = new DCLErrorCode(1);
    public static final /* enum */ DCLErrorCode ERROR_NOT_INITED = new DCLErrorCode(2);
    public static final /* enum */ DCLErrorCode ERROR_OPERATION_TOO_FREQUENT = new DCLErrorCode(3);
    public static final /* enum */ DCLErrorCode UNKNOWN = new DCLErrorCode(65535);
    private int value;
    private static final DCLErrorCode[] allValues;
    private static final /* synthetic */ DCLErrorCode[] $VALUES;

    public static DCLErrorCode[] values() {
        return null;
    }

    public static DCLErrorCode valueOf(String string) {
        return null;
    }

    private DCLErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DCLErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ DCLErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = DCLErrorCode.$values();
        allValues = DCLErrorCode.values();
    }
}

