/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class OfflineMapServiceStatus
extends Enum<OfflineMapServiceStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ OfflineMapServiceStatus INITIALIZING = new OfflineMapServiceStatus(0);
    public static final /* enum */ OfflineMapServiceStatus READY = new OfflineMapServiceStatus(1);
    public static final /* enum */ OfflineMapServiceStatus IMPORTING = new OfflineMapServiceStatus(2);
    public static final /* enum */ OfflineMapServiceStatus READING = new OfflineMapServiceStatus(3);
    public static final /* enum */ OfflineMapServiceStatus FAIL = new OfflineMapServiceStatus(255);
    public static final /* enum */ OfflineMapServiceStatus UNKNOWN = new OfflineMapServiceStatus(65535);
    private int value;
    private static final OfflineMapServiceStatus[] allValues;
    private static final /* synthetic */ OfflineMapServiceStatus[] $VALUES;

    public static OfflineMapServiceStatus[] values() {
        return null;
    }

    public static OfflineMapServiceStatus valueOf(String string) {
        return null;
    }

    private OfflineMapServiceStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static OfflineMapServiceStatus find(int n) {
        return null;
    }

    private static /* synthetic */ OfflineMapServiceStatus[] $values() {
        return null;
    }

    static {
        $VALUES = OfflineMapServiceStatus.$values();
        allValues = OfflineMapServiceStatus.values();
    }
}

