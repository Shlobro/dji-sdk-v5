/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphoneErrorCode
extends Enum<MegaphoneErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphoneErrorCode INVALID_PARAM = new MegaphoneErrorCode(-6);
    public static final /* enum */ MegaphoneErrorCode REQUEST_HANDLER_NOT_FOUND = new MegaphoneErrorCode(-1);
    public static final /* enum */ MegaphoneErrorCode NO_ERROR = new MegaphoneErrorCode(0);
    public static final /* enum */ MegaphoneErrorCode START_TRANSFER_FAILED = new MegaphoneErrorCode(1);
    public static final /* enum */ MegaphoneErrorCode ADD_BUFFER_FAILED = new MegaphoneErrorCode(2);
    public static final /* enum */ MegaphoneErrorCode CANNOT_START_TRANSFER_WHILE_IN_TRANSMISSION = new MegaphoneErrorCode(3);
    public static final /* enum */ MegaphoneErrorCode CANNOT_ADD_BUFFER_WHILE_NOT_IN_TRANSMISSION = new MegaphoneErrorCode(4);
    public static final /* enum */ MegaphoneErrorCode CANNOT_FINISH_TRANSFER_WHILE_NOT_IN_TRANSMISSION = new MegaphoneErrorCode(5);
    public static final /* enum */ MegaphoneErrorCode UNKNOWN = new MegaphoneErrorCode(65535);
    private int value;
    private static final MegaphoneErrorCode[] allValues;
    private static final /* synthetic */ MegaphoneErrorCode[] $VALUES;

    public static MegaphoneErrorCode[] values() {
        return null;
    }

    public static MegaphoneErrorCode valueOf(String string) {
        return null;
    }

    private MegaphoneErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphoneErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneErrorCode.$values();
        allValues = MegaphoneErrorCode.values();
    }
}

