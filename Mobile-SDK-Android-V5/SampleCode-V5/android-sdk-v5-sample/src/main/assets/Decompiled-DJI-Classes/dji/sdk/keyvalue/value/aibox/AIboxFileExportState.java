/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;

public final class AIboxFileExportState
extends Enum<AIboxFileExportState>
implements JNIProguardKeepTag {
    public static final /* enum */ AIboxFileExportState ExportIdle = new AIboxFileExportState(0);
    public static final /* enum */ AIboxFileExportState Exporting = new AIboxFileExportState(1);
    public static final /* enum */ AIboxFileExportState ExportFinished = new AIboxFileExportState(2);
    public static final /* enum */ AIboxFileExportState ExportFailed = new AIboxFileExportState(3);
    public static final /* enum */ AIboxFileExportState ExportCancel = new AIboxFileExportState(4);
    public static final /* enum */ AIboxFileExportState UNKNOWN = new AIboxFileExportState(255);
    private int value;
    private static final AIboxFileExportState[] allValues;
    private static final /* synthetic */ AIboxFileExportState[] $VALUES;

    public static AIboxFileExportState[] values() {
        return null;
    }

    public static AIboxFileExportState valueOf(String string) {
        return null;
    }

    private AIboxFileExportState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIboxFileExportState find(int n) {
        return null;
    }

    private static /* synthetic */ AIboxFileExportState[] $values() {
        return null;
    }

    static {
        $VALUES = AIboxFileExportState.$values();
        allValues = AIboxFileExportState.values();
    }
}

