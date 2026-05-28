/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LiveStreamingWiFiState
extends Enum<LiveStreamingWiFiState>
implements JNIProguardKeepTag {
    public static final /* enum */ LiveStreamingWiFiState WIFI_STA_IDLE = new LiveStreamingWiFiState(0);
    public static final /* enum */ LiveStreamingWiFiState WIFI_AP_AUTH_FAILED = new LiveStreamingWiFiState(1);
    public static final /* enum */ LiveStreamingWiFiState WIFI_AP_CONNECTED = new LiveStreamingWiFiState(2);
    public static final /* enum */ LiveStreamingWiFiState WIFI_AP_DISCONNECTED = new LiveStreamingWiFiState(3);
    public static final /* enum */ LiveStreamingWiFiState UNKNOWN = new LiveStreamingWiFiState(65535);
    private int value;
    private static final LiveStreamingWiFiState[] allValues;
    private static final /* synthetic */ LiveStreamingWiFiState[] $VALUES;

    public static LiveStreamingWiFiState[] values() {
        return null;
    }

    public static LiveStreamingWiFiState valueOf(String string) {
        return null;
    }

    private LiveStreamingWiFiState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LiveStreamingWiFiState find(int n) {
        return null;
    }

    private static /* synthetic */ LiveStreamingWiFiState[] $values() {
        return null;
    }

    static {
        $VALUES = LiveStreamingWiFiState.$values();
        allValues = LiveStreamingWiFiState.values();
    }
}

