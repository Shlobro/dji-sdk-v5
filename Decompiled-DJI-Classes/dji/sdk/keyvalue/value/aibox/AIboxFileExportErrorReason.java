/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;

public final class AIboxFileExportErrorReason
extends Enum<AIboxFileExportErrorReason>
implements JNIProguardKeepTag {
    public static final /* enum */ AIboxFileExportErrorReason NoError = new AIboxFileExportErrorReason(0);
    public static final /* enum */ AIboxFileExportErrorReason SDCardPullOut = new AIboxFileExportErrorReason(1);
    public static final /* enum */ AIboxFileExportErrorReason SDCardNoSpace = new AIboxFileExportErrorReason(2);
    public static final /* enum */ AIboxFileExportErrorReason SDCardError = new AIboxFileExportErrorReason(3);
    public static final /* enum */ AIboxFileExportErrorReason SDCardReadError = new AIboxFileExportErrorReason(4);
    public static final /* enum */ AIboxFileExportErrorReason SDCardWriteError = new AIboxFileExportErrorReason(5);
    public static final /* enum */ AIboxFileExportErrorReason UNKNOWN = new AIboxFileExportErrorReason(255);
    private int value;
    private static final AIboxFileExportErrorReason[] allValues;
    private static final /* synthetic */ AIboxFileExportErrorReason[] $VALUES;

    public static AIboxFileExportErrorReason[] values() {
        return null;
    }

    public static AIboxFileExportErrorReason valueOf(String string) {
        return null;
    }

    private AIboxFileExportErrorReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIboxFileExportErrorReason find(int n) {
        return null;
    }

    private static /* synthetic */ AIboxFileExportErrorReason[] $values() {
        return null;
    }

    static {
        $VALUES = AIboxFileExportErrorReason.$values();
        allValues = AIboxFileExportErrorReason.values();
    }
}

