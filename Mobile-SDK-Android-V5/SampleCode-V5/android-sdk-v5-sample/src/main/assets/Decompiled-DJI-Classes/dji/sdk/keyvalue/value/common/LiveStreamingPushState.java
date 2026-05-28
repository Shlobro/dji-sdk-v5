/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LiveStreamingPushState
extends Enum<LiveStreamingPushState>
implements JNIProguardKeepTag {
    public static final /* enum */ LiveStreamingPushState CAMERA_LIVE_STREAMING_PUSH_START = new LiveStreamingPushState(0);
    public static final /* enum */ LiveStreamingPushState CAMERA_LIVE_STREAMING_PUSH_STOP = new LiveStreamingPushState(1);
    public static final /* enum */ LiveStreamingPushState UNKNOWN = new LiveStreamingPushState(65535);
    private int value;
    private static final LiveStreamingPushState[] allValues;
    private static final /* synthetic */ LiveStreamingPushState[] $VALUES;

    public static LiveStreamingPushState[] values() {
        return null;
    }

    public static LiveStreamingPushState valueOf(String string) {
        return null;
    }

    private LiveStreamingPushState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LiveStreamingPushState find(int n) {
        return null;
    }

    private static /* synthetic */ LiveStreamingPushState[] $values() {
        return null;
    }

    static {
        $VALUES = LiveStreamingPushState.$values();
        allValues = LiveStreamingPushState.values();
    }
}

