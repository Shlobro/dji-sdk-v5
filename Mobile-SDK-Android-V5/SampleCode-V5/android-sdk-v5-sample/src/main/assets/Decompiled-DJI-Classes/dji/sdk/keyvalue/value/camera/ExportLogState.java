/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ExportLogState
extends Enum<ExportLogState>
implements JNIProguardKeepTag {
    public static final /* enum */ ExportLogState Exporting = new ExportLogState(0);
    public static final /* enum */ ExportLogState ExportFinished = new ExportLogState(1);
    public static final /* enum */ ExportLogState ExportFailed = new ExportLogState(2);
    public static final /* enum */ ExportLogState UNKNOWN = new ExportLogState(255);
    private int value;
    private static final ExportLogState[] allValues;
    private static final /* synthetic */ ExportLogState[] $VALUES;

    public static ExportLogState[] values() {
        return null;
    }

    public static ExportLogState valueOf(String string) {
        return null;
    }

    private ExportLogState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ExportLogState find(int n) {
        return null;
    }

    private static /* synthetic */ ExportLogState[] $values() {
        return null;
    }

    static {
        $VALUES = ExportLogState.$values();
        allValues = ExportLogState.values();
    }
}

