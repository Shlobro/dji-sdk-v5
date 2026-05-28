/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class CommonRcLogExportState
extends Enum<CommonRcLogExportState>
implements JNIProguardKeepTag {
    public static final /* enum */ CommonRcLogExportState PREPARE = new CommonRcLogExportState(0);
    public static final /* enum */ CommonRcLogExportState EXPORTING = new CommonRcLogExportState(1);
    public static final /* enum */ CommonRcLogExportState FAILED = new CommonRcLogExportState(2);
    public static final /* enum */ CommonRcLogExportState SUCCESSFUL = new CommonRcLogExportState(3);
    public static final /* enum */ CommonRcLogExportState UNKNOWN = new CommonRcLogExportState(255);
    private int value;
    private static final CommonRcLogExportState[] allValues;
    private static final /* synthetic */ CommonRcLogExportState[] $VALUES;

    public static CommonRcLogExportState[] values() {
        return null;
    }

    public static CommonRcLogExportState valueOf(String string) {
        return null;
    }

    private CommonRcLogExportState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CommonRcLogExportState find(int n) {
        return null;
    }

    private static /* synthetic */ CommonRcLogExportState[] $values() {
        return null;
    }

    static {
        $VALUES = CommonRcLogExportState.$values();
        allValues = CommonRcLogExportState.values();
    }
}

