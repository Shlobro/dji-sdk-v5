/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SSDRecordingErrorTips
extends Enum<SSDRecordingErrorTips>
implements JNIProguardKeepTag {
    public static final /* enum */ SSDRecordingErrorTips LOSE_FRAME = new SSDRecordingErrorTips(0);
    public static final /* enum */ SSDRecordingErrorTips IS_FULL = new SSDRecordingErrorTips(1);
    public static final /* enum */ SSDRecordingErrorTips SHUT_DOWN = new SSDRecordingErrorTips(2);
    public static final /* enum */ SSDRecordingErrorTips START_FAILED = new SSDRecordingErrorTips(3);
    public static final /* enum */ SSDRecordingErrorTips UNKNOWN = new SSDRecordingErrorTips(65535);
    private int value;
    private static final SSDRecordingErrorTips[] allValues;
    private static final /* synthetic */ SSDRecordingErrorTips[] $VALUES;

    public static SSDRecordingErrorTips[] values() {
        return null;
    }

    public static SSDRecordingErrorTips valueOf(String string) {
        return null;
    }

    private SSDRecordingErrorTips(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SSDRecordingErrorTips find(int n) {
        return null;
    }

    private static /* synthetic */ SSDRecordingErrorTips[] $values() {
        return null;
    }

    static {
        $VALUES = SSDRecordingErrorTips.$values();
        allValues = SSDRecordingErrorTips.values();
    }
}

