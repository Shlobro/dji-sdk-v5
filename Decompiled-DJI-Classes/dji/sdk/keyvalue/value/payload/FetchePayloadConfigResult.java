/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class FetchePayloadConfigResult
extends Enum<FetchePayloadConfigResult>
implements JNIProguardKeepTag {
    public static final /* enum */ FetchePayloadConfigResult SUCCESSED = new FetchePayloadConfigResult(0);
    public static final /* enum */ FetchePayloadConfigResult INVALID_PARAM = new FetchePayloadConfigResult(1);
    public static final /* enum */ FetchePayloadConfigResult NOT_EXISTS = new FetchePayloadConfigResult(2);
    public static final /* enum */ FetchePayloadConfigResult CREATE_FILE_FAILED = new FetchePayloadConfigResult(3);
    public static final /* enum */ FetchePayloadConfigResult BE_ABORTED = new FetchePayloadConfigResult(4);
    public static final /* enum */ FetchePayloadConfigResult SYS_ERROR = new FetchePayloadConfigResult(5);
    public static final /* enum */ FetchePayloadConfigResult UNKNOWN = new FetchePayloadConfigResult(65535);
    private int value;
    private static final FetchePayloadConfigResult[] allValues;
    private static final /* synthetic */ FetchePayloadConfigResult[] $VALUES;

    public static FetchePayloadConfigResult[] values() {
        return null;
    }

    public static FetchePayloadConfigResult valueOf(String string) {
        return null;
    }

    private FetchePayloadConfigResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FetchePayloadConfigResult find(int n) {
        return null;
    }

    private static /* synthetic */ FetchePayloadConfigResult[] $values() {
        return null;
    }

    static {
        $VALUES = FetchePayloadConfigResult.$values();
        allValues = FetchePayloadConfigResult.values();
    }
}

