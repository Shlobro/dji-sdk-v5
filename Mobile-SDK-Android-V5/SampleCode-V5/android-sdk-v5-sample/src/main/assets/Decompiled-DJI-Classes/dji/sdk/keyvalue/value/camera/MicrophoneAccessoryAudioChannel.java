/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MicrophoneAccessoryAudioChannel
extends Enum<MicrophoneAccessoryAudioChannel>
implements JNIProguardKeepTag {
    public static final /* enum */ MicrophoneAccessoryAudioChannel DEFAULT = new MicrophoneAccessoryAudioChannel(0);
    public static final /* enum */ MicrophoneAccessoryAudioChannel MONOPHONIC = new MicrophoneAccessoryAudioChannel(1);
    public static final /* enum */ MicrophoneAccessoryAudioChannel STEREOPHONIC = new MicrophoneAccessoryAudioChannel(2);
    public static final /* enum */ MicrophoneAccessoryAudioChannel UNKNOWN = new MicrophoneAccessoryAudioChannel(65535);
    private int value;
    private static final MicrophoneAccessoryAudioChannel[] allValues;
    private static final /* synthetic */ MicrophoneAccessoryAudioChannel[] $VALUES;

    public static MicrophoneAccessoryAudioChannel[] values() {
        return null;
    }

    public static MicrophoneAccessoryAudioChannel valueOf(String string) {
        return null;
    }

    private MicrophoneAccessoryAudioChannel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MicrophoneAccessoryAudioChannel find(int n) {
        return null;
    }

    private static /* synthetic */ MicrophoneAccessoryAudioChannel[] $values() {
        return null;
    }

    static {
        $VALUES = MicrophoneAccessoryAudioChannel.$values();
        allValues = MicrophoneAccessoryAudioChannel.values();
    }
}

