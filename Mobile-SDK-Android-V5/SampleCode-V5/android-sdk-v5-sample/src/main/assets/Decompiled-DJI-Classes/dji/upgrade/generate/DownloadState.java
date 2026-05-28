/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class DownloadState
extends Enum<DownloadState>
implements JNIProguardKeepTag {
    public static final /* enum */ DownloadState Init = new DownloadState(0);
    public static final /* enum */ DownloadState Downloading = new DownloadState(1);
    public static final /* enum */ DownloadState DownloadFailure = new DownloadState(2);
    public static final /* enum */ DownloadState DownloadSuccess = new DownloadState(3);
    private int value;
    private static final DownloadState[] allValues;
    private static final /* synthetic */ DownloadState[] $VALUES;

    public static DownloadState[] values() {
        return null;
    }

    public static DownloadState valueOf(String string2) {
        return null;
    }

    private DownloadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
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

