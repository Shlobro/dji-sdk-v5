/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GeoCagingStatus
extends Enum<GeoCagingStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ GeoCagingStatus NO_POS = new GeoCagingStatus(0);
    public static final /* enum */ GeoCagingStatus IN_FG = new GeoCagingStatus(1);
    public static final /* enum */ GeoCagingStatus NEAR_FG_H = new GeoCagingStatus(2);
    public static final /* enum */ GeoCagingStatus NEAR_FG_V = new GeoCagingStatus(3);
    public static final /* enum */ GeoCagingStatus IN_CV = new GeoCagingStatus(4);
    public static final /* enum */ GeoCagingStatus NEAR_CV_H = new GeoCagingStatus(5);
    public static final /* enum */ GeoCagingStatus NEAR_CV_V = new GeoCagingStatus(6);
    public static final /* enum */ GeoCagingStatus FTS = new GeoCagingStatus(7);
    public static final /* enum */ GeoCagingStatus NEAR_FG_H_V = new GeoCagingStatus(8);
    public static final /* enum */ GeoCagingStatus NEAR_CV_H_V = new GeoCagingStatus(9);
    public static final /* enum */ GeoCagingStatus NO_GEOCAGE_DATA = new GeoCagingStatus(10);
    public static final /* enum */ GeoCagingStatus UNKNOWN = new GeoCagingStatus(65535);
    private int value;
    private static final GeoCagingStatus[] allValues;
    private static final /* synthetic */ GeoCagingStatus[] $VALUES;

    public static GeoCagingStatus[] values() {
        return null;
    }

    public static GeoCagingStatus valueOf(String string) {
        return null;
    }

    private GeoCagingStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GeoCagingStatus find(int n) {
        return null;
    }

    private static /* synthetic */ GeoCagingStatus[] $values() {
        return null;
    }

    static {
        $VALUES = GeoCagingStatus.$values();
        allValues = GeoCagingStatus.values();
    }
}

