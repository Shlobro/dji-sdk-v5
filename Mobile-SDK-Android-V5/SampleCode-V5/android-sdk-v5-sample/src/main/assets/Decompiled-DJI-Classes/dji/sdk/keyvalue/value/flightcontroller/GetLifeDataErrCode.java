/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GetLifeDataErrCode
extends Enum<GetLifeDataErrCode>
implements JNIProguardKeepTag {
    public static final /* enum */ GetLifeDataErrCode SUCCESSFUL = new GetLifeDataErrCode(0);
    public static final /* enum */ GetLifeDataErrCode OFFSET_EXCEED = new GetLifeDataErrCode(1);
    public static final /* enum */ GetLifeDataErrCode ACQUIRE_DATA_FAIL = new GetLifeDataErrCode(2);
    public static final /* enum */ GetLifeDataErrCode DATA_CHECK_FAIL = new GetLifeDataErrCode(3);
    public static final /* enum */ GetLifeDataErrCode UNKNOWN = new GetLifeDataErrCode(65535);
    private int value;
    private static final GetLifeDataErrCode[] allValues;
    private static final /* synthetic */ GetLifeDataErrCode[] $VALUES;

    public static GetLifeDataErrCode[] values() {
        return null;
    }

    public static GetLifeDataErrCode valueOf(String string) {
        return null;
    }

    private GetLifeDataErrCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GetLifeDataErrCode find(int n) {
        return null;
    }

    private static /* synthetic */ GetLifeDataErrCode[] $values() {
        return null;
    }

    static {
        $VALUES = GetLifeDataErrCode.$values();
        allValues = GetLifeDataErrCode.values();
    }
}

