/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DownloadState
extends Enum<DownloadState>
implements JNIProguardKeepTag {
    public static final /* enum */ DownloadState NOT_STARTED = new DownloadState(0);
    public static final /* enum */ DownloadState DOWNLOADING = new DownloadState(1);
    public static final /* enum */ DownloadState FINISHED = new DownloadState(2);
    public static final /* enum */ DownloadState CANCELLED = new DownloadState(3);
    public static final /* enum */ DownloadState UNKNOWN = new DownloadState(65535);
    private int value;
    private static final DownloadState[] allValues;
    private static final /* synthetic */ DownloadState[] $VALUES;

    public static DownloadState[] values() {
        return null;
    }

    public static DownloadState valueOf(String string) {
        return null;
    }

    private DownloadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DownloadState find(int n) {
        return null;
    }

    private static /* synthetic */ DownloadState[] $values() {
        return null;
    }

    static {
        $VALUES = DownloadState.$values();
        allValues = DownloadState.values();
    }
}

