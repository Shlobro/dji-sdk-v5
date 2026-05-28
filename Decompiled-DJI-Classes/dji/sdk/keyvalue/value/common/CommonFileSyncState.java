/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CommonFileSyncState
extends Enum<CommonFileSyncState>
implements JNIProguardKeepTag {
    public static final /* enum */ CommonFileSyncState PREPARE = new CommonFileSyncState(0);
    public static final /* enum */ CommonFileSyncState DOWNLOAD = new CommonFileSyncState(1);
    public static final /* enum */ CommonFileSyncState FAILED = new CommonFileSyncState(2);
    public static final /* enum */ CommonFileSyncState SUCCESSFUL = new CommonFileSyncState(3);
    public static final /* enum */ CommonFileSyncState UNKNOWN = new CommonFileSyncState(255);
    private int value;
    private static final CommonFileSyncState[] allValues;
    private static final /* synthetic */ CommonFileSyncState[] $VALUES;

    public static CommonFileSyncState[] values() {
        return null;
    }

    public static CommonFileSyncState valueOf(String string) {
        return null;
    }

    private CommonFileSyncState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CommonFileSyncState find(int n) {
        return null;
    }

    private static /* synthetic */ CommonFileSyncState[] $values() {
        return null;
    }

    static {
        $VALUES = CommonFileSyncState.$values();
        allValues = CommonFileSyncState.values();
    }
}

