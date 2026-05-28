/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MicrophoneAccessoryConnectionState
extends Enum<MicrophoneAccessoryConnectionState>
implements JNIProguardKeepTag {
    public static final /* enum */ MicrophoneAccessoryConnectionState DISCONNECTED = new MicrophoneAccessoryConnectionState(0);
    public static final /* enum */ MicrophoneAccessoryConnectionState DETECTING = new MicrophoneAccessoryConnectionState(1);
    public static final /* enum */ MicrophoneAccessoryConnectionState CONNECTED = new MicrophoneAccessoryConnectionState(2);
    public static final /* enum */ MicrophoneAccessoryConnectionState EXCEPTION = new MicrophoneAccessoryConnectionState(3);
    public static final /* enum */ MicrophoneAccessoryConnectionState UNKNOWN = new MicrophoneAccessoryConnectionState(65535);
    private int value;
    private static final MicrophoneAccessoryConnectionState[] allValues;
    private static final /* synthetic */ MicrophoneAccessoryConnectionState[] $VALUES;

    public static MicrophoneAccessoryConnectionState[] values() {
        return null;
    }

    public static MicrophoneAccessoryConnectionState valueOf(String string) {
        return null;
    }

    private MicrophoneAccessoryConnectionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MicrophoneAccessoryConnectionState find(int n) {
        return null;
    }

    private static /* synthetic */ MicrophoneAccessoryConnectionState[] $values() {
        return null;
    }

    static {
        $VALUES = MicrophoneAccessoryConnectionState.$values();
        allValues = MicrophoneAccessoryConnectionState.values();
    }
}

