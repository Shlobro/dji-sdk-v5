/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CommonFileUpdateState
extends Enum<CommonFileUpdateState>
implements JNIProguardKeepTag {
    public static final /* enum */ CommonFileUpdateState PREPARE = new CommonFileUpdateState(0);
    public static final /* enum */ CommonFileUpdateState TRANSFER = new CommonFileUpdateState(1);
    public static final /* enum */ CommonFileUpdateState VERIFY = new CommonFileUpdateState(2);
    public static final /* enum */ CommonFileUpdateState FAILED = new CommonFileUpdateState(3);
    public static final /* enum */ CommonFileUpdateState SUCCESSFUL = new CommonFileUpdateState(4);
    public static final /* enum */ CommonFileUpdateState UNKNOWN = new CommonFileUpdateState(255);
    private int value;
    private static final CommonFileUpdateState[] allValues;
    private static final /* synthetic */ CommonFileUpdateState[] $VALUES;

    public static CommonFileUpdateState[] values() {
        return null;
    }

    public static CommonFileUpdateState valueOf(String string) {
        return null;
    }

    private CommonFileUpdateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CommonFileUpdateState find(int n) {
        return null;
    }

    private static /* synthetic */ CommonFileUpdateState[] $values() {
        return null;
    }

    static {
        $VALUES = CommonFileUpdateState.$values();
        allValues = CommonFileUpdateState.values();
    }
}

