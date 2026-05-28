/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class OfflineMapFileStatus
extends Enum<OfflineMapFileStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ OfflineMapFileStatus IMPORTED = new OfflineMapFileStatus(0);
    public static final /* enum */ OfflineMapFileStatus NOT_IMPORTED = new OfflineMapFileStatus(1);
    public static final /* enum */ OfflineMapFileStatus IMPORTING = new OfflineMapFileStatus(2);
    public static final /* enum */ OfflineMapFileStatus IMPORT_FAILED = new OfflineMapFileStatus(3);
    public static final /* enum */ OfflineMapFileStatus UNKNOWN = new OfflineMapFileStatus(65535);
    private int value;
    private static final OfflineMapFileStatus[] allValues;
    private static final /* synthetic */ OfflineMapFileStatus[] $VALUES;

    public static OfflineMapFileStatus[] values() {
        return null;
    }

    public static OfflineMapFileStatus valueOf(String string) {
        return null;
    }

    private OfflineMapFileStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static OfflineMapFileStatus find(int n) {
        return null;
    }

    private static /* synthetic */ OfflineMapFileStatus[] $values() {
        return null;
    }

    static {
        $VALUES = OfflineMapFileStatus.$values();
        allValues = OfflineMapFileStatus.values();
    }
}

