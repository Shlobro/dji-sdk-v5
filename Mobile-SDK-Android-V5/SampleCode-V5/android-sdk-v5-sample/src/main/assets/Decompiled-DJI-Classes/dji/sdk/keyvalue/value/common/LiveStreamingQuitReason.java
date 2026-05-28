/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LiveStreamingQuitReason
extends Enum<LiveStreamingQuitReason>
implements JNIProguardKeepTag {
    public static final /* enum */ LiveStreamingQuitReason NORMAL = new LiveStreamingQuitReason(0);
    public static final /* enum */ LiveStreamingQuitReason WIFI_DISCONNECTED = new LiveStreamingQuitReason(1);
    public static final /* enum */ LiveStreamingQuitReason PUSH_TARGET_UNREACHABLE = new LiveStreamingQuitReason(2);
    public static final /* enum */ LiveStreamingQuitReason UNKNOWN = new LiveStreamingQuitReason(65535);
    private int value;
    private static final LiveStreamingQuitReason[] allValues;
    private static final /* synthetic */ LiveStreamingQuitReason[] $VALUES;

    public static LiveStreamingQuitReason[] values() {
        return null;
    }

    public static LiveStreamingQuitReason valueOf(String string) {
        return null;
    }

    private LiveStreamingQuitReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LiveStreamingQuitReason find(int n) {
        return null;
    }

    private static /* synthetic */ LiveStreamingQuitReason[] $values() {
        return null;
    }

    static {
        $VALUES = LiveStreamingQuitReason.$values();
        allValues = LiveStreamingQuitReason.values();
    }
}

