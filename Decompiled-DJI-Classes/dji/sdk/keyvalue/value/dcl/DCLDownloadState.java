/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.dcl;

import dji.jni.JNIProguardKeepTag;

public final class DCLDownloadState
extends Enum<DCLDownloadState>
implements JNIProguardKeepTag {
    public static final /* enum */ DCLDownloadState IDLE = new DCLDownloadState(0);
    public static final /* enum */ DCLDownloadState DOWNLOADING_DCL_LIST = new DCLDownloadState(1);
    public static final /* enum */ DCLDownloadState DOWNLOADING_FILE = new DCLDownloadState(2);
    public static final /* enum */ DCLDownloadState DELETING_FILE = new DCLDownloadState(3);
    public static final /* enum */ DCLDownloadState FAILED = new DCLDownloadState(4);
    public static final /* enum */ DCLDownloadState FINISHED = new DCLDownloadState(5);
    public static final /* enum */ DCLDownloadState UNKNOWN = new DCLDownloadState(65535);
    private int value;
    private static final DCLDownloadState[] allValues;
    private static final /* synthetic */ DCLDownloadState[] $VALUES;

    public static DCLDownloadState[] values() {
        return null;
    }

    public static DCLDownloadState valueOf(String string) {
        return null;
    }

    private DCLDownloadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DCLDownloadState find(int n) {
        return null;
    }

    private static /* synthetic */ DCLDownloadState[] $values() {
        return null;
    }

    static {
        $VALUES = DCLDownloadState.$values();
        allValues = DCLDownloadState.values();
    }
}

