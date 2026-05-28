/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class PointCloudExclusiveStatus
extends Enum<PointCloudExclusiveStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ PointCloudExclusiveStatus NO_MASKED = new PointCloudExclusiveStatus(0);
    public static final /* enum */ PointCloudExclusiveStatus RECORD_MASKED_BY_POINTCLOUD = new PointCloudExclusiveStatus(1);
    public static final /* enum */ PointCloudExclusiveStatus POINTCLOUD_MASKED_BY_RECORD = new PointCloudExclusiveStatus(2);
    public static final /* enum */ PointCloudExclusiveStatus UNKNOWN = new PointCloudExclusiveStatus(65535);
    private int value;
    private static final PointCloudExclusiveStatus[] allValues;
    private static final /* synthetic */ PointCloudExclusiveStatus[] $VALUES;

    public static PointCloudExclusiveStatus[] values() {
        return null;
    }

    public static PointCloudExclusiveStatus valueOf(String string) {
        return null;
    }

    private PointCloudExclusiveStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PointCloudExclusiveStatus find(int n) {
        return null;
    }

    private static /* synthetic */ PointCloudExclusiveStatus[] $values() {
        return null;
    }

    static {
        $VALUES = PointCloudExclusiveStatus.$values();
        allValues = PointCloudExclusiveStatus.values();
    }
}

