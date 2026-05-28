/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class PointCloudRecordCommand
extends Enum<PointCloudRecordCommand>
implements JNIProguardKeepTag {
    public static final /* enum */ PointCloudRecordCommand STOP = new PointCloudRecordCommand(0);
    public static final /* enum */ PointCloudRecordCommand START = new PointCloudRecordCommand(1);
    public static final /* enum */ PointCloudRecordCommand PAUSE = new PointCloudRecordCommand(2);
    public static final /* enum */ PointCloudRecordCommand RESUME = new PointCloudRecordCommand(3);
    public static final /* enum */ PointCloudRecordCommand UNKNOWN = new PointCloudRecordCommand(65535);
    private int value;
    private static final PointCloudRecordCommand[] allValues;
    private static final /* synthetic */ PointCloudRecordCommand[] $VALUES;

    public static PointCloudRecordCommand[] values() {
        return null;
    }

    public static PointCloudRecordCommand valueOf(String string) {
        return null;
    }

    private PointCloudRecordCommand(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PointCloudRecordCommand find(int n) {
        return null;
    }

    private static /* synthetic */ PointCloudRecordCommand[] $values() {
        return null;
    }

    static {
        $VALUES = PointCloudRecordCommand.$values();
        allValues = PointCloudRecordCommand.values();
    }
}

