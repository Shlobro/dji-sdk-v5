/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SDRQualityDetectCmd
extends Enum<SDRQualityDetectCmd>
implements JNIProguardKeepTag {
    public static final /* enum */ SDRQualityDetectCmd START = new SDRQualityDetectCmd(0);
    public static final /* enum */ SDRQualityDetectCmd STOP = new SDRQualityDetectCmd(1);
    public static final /* enum */ SDRQualityDetectCmd QUERY = new SDRQualityDetectCmd(2);
    public static final /* enum */ SDRQualityDetectCmd UNKNOWN = new SDRQualityDetectCmd(65535);
    private int value;
    private static final SDRQualityDetectCmd[] allValues;
    private static final /* synthetic */ SDRQualityDetectCmd[] $VALUES;

    public static SDRQualityDetectCmd[] values() {
        return null;
    }

    public static SDRQualityDetectCmd valueOf(String string) {
        return null;
    }

    private SDRQualityDetectCmd(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDRQualityDetectCmd find(int n) {
        return null;
    }

    private static /* synthetic */ SDRQualityDetectCmd[] $values() {
        return null;
    }

    static {
        $VALUES = SDRQualityDetectCmd.$values();
        allValues = SDRQualityDetectCmd.values();
    }
}

