/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;

public final class SpeakerAudioDataSendingResult
extends Enum<SpeakerAudioDataSendingResult>
implements JNIProguardKeepTag {
    public static final /* enum */ SpeakerAudioDataSendingResult SUCCESSFUL = new SpeakerAudioDataSendingResult(0);
    public static final /* enum */ SpeakerAudioDataSendingResult OVER_MAX_SIZE = new SpeakerAudioDataSendingResult(1);
    public static final /* enum */ SpeakerAudioDataSendingResult IS_END = new SpeakerAudioDataSendingResult(2);
    public static final /* enum */ SpeakerAudioDataSendingResult UNKNOWN = new SpeakerAudioDataSendingResult(65535);
    private int value;
    private static final SpeakerAudioDataSendingResult[] allValues;
    private static final /* synthetic */ SpeakerAudioDataSendingResult[] $VALUES;

    public static SpeakerAudioDataSendingResult[] values() {
        return null;
    }

    public static SpeakerAudioDataSendingResult valueOf(String string) {
        return null;
    }

    private SpeakerAudioDataSendingResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SpeakerAudioDataSendingResult find(int n) {
        return null;
    }

    private static /* synthetic */ SpeakerAudioDataSendingResult[] $values() {
        return null;
    }

    static {
        $VALUES = SpeakerAudioDataSendingResult.$values();
        allValues = SpeakerAudioDataSendingResult.values();
    }
}

