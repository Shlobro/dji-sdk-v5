/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class PointCloudRecordStatus
extends Enum<PointCloudRecordStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ PointCloudRecordStatus STARTING = new PointCloudRecordStatus(0);
    public static final /* enum */ PointCloudRecordStatus STARTED = new PointCloudRecordStatus(1);
    public static final /* enum */ PointCloudRecordStatus PAUSING = new PointCloudRecordStatus(2);
    public static final /* enum */ PointCloudRecordStatus RESUME = new PointCloudRecordStatus(3);
    public static final /* enum */ PointCloudRecordStatus STOPPING = new PointCloudRecordStatus(4);
    public static final /* enum */ PointCloudRecordStatus STOPPED = new PointCloudRecordStatus(5);
    public static final /* enum */ PointCloudRecordStatus UNKNOWN = new PointCloudRecordStatus(65535);
    private int value;
    private static final PointCloudRecordStatus[] allValues;
    private static final /* synthetic */ PointCloudRecordStatus[] $VALUES;

    public static PointCloudRecordStatus[] values() {
        return null;
    }

    public static PointCloudRecordStatus valueOf(String string) {
        return null;
    }

    private PointCloudRecordStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PointCloudRecordStatus find(int n) {
        return null;
    }

    private static /* synthetic */ PointCloudRecordStatus[] $values() {
        return null;
    }

    static {
        $VALUES = PointCloudRecordStatus.$values();
        allValues = PointCloudRecordStatus.values();
    }
}

