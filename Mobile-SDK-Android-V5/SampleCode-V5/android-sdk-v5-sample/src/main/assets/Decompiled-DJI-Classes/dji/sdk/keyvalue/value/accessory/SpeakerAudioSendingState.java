/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;

public final class SpeakerAudioSendingState
extends Enum<SpeakerAudioSendingState>
implements JNIProguardKeepTag {
    public static final /* enum */ SpeakerAudioSendingState SUCCESSFUL = new SpeakerAudioSendingState(0);
    public static final /* enum */ SpeakerAudioSendingState FILE_CHECK_FAILED = new SpeakerAudioSendingState(1);
    public static final /* enum */ SpeakerAudioSendingState FILE_RECEIVE_REQUEST_FAILDED = new SpeakerAudioSendingState(2);
    public static final /* enum */ SpeakerAudioSendingState FILE_TRANSFER_FAILED = new SpeakerAudioSendingState(3);
    public static final /* enum */ SpeakerAudioSendingState FILE_VERIFY_FAILED = new SpeakerAudioSendingState(4);
    public static final /* enum */ SpeakerAudioSendingState UNKNOWN = new SpeakerAudioSendingState(65535);
    private int value;
    private static final SpeakerAudioSendingState[] allValues;
    private static final /* synthetic */ SpeakerAudioSendingState[] $VALUES;

    public static SpeakerAudioSendingState[] values() {
        return null;
    }

    public static SpeakerAudioSendingState valueOf(String string) {
        return null;
    }

    private SpeakerAudioSendingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SpeakerAudioSendingState find(int n) {
        return null;
    }

    private static /* synthetic */ SpeakerAudioSendingState[] $values() {
        return null;
    }

    static {
        $VALUES = SpeakerAudioSendingState.$values();
        allValues = SpeakerAudioSendingState.values();
    }
}

