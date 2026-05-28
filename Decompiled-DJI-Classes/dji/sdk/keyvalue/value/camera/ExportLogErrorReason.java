/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ExportLogErrorReason
extends Enum<ExportLogErrorReason>
implements JNIProguardKeepTag {
    public static final /* enum */ ExportLogErrorReason NoError = new ExportLogErrorReason(0);
    public static final /* enum */ ExportLogErrorReason SDCardPullOut = new ExportLogErrorReason(1);
    public static final /* enum */ ExportLogErrorReason SDCardNoSpace = new ExportLogErrorReason(2);
    public static final /* enum */ ExportLogErrorReason UNKNOWN = new ExportLogErrorReason(255);
    private int value;
    private static final ExportLogErrorReason[] allValues;
    private static final /* synthetic */ ExportLogErrorReason[] $VALUES;

    public static ExportLogErrorReason[] values() {
        return null;
    }

    public static ExportLogErrorReason valueOf(String string) {
        return null;
    }

    private ExportLogErrorReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ExportLogErrorReason find(int n) {
        return null;
    }

    private static /* synthetic */ ExportLogErrorReason[] $values() {
        return null;
    }

    static {
        $VALUES = ExportLogErrorReason.$values();
        allValues = ExportLogErrorReason.values();
    }
}

