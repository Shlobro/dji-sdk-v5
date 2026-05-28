/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.WireEnum
 */
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public final class RecordPointCloudOperateType
extends Enum<RecordPointCloudOperateType>
implements WireEnum {
    public static final /* enum */ RecordPointCloudOperateType StopRecordPointCloud = new RecordPointCloudOperateType(0);
    public static final /* enum */ RecordPointCloudOperateType StartRecordPointCloud = new RecordPointCloudOperateType(1);
    public static final /* enum */ RecordPointCloudOperateType PauseRecordPointCloud = new RecordPointCloudOperateType(2);
    public static final /* enum */ RecordPointCloudOperateType ResumeRecordPointCloud = new RecordPointCloudOperateType(3);
    public static final ProtoAdapter<RecordPointCloudOperateType> ADAPTER;
    private final int value;
    private static final /* synthetic */ RecordPointCloudOperateType[] $VALUES;

    public static RecordPointCloudOperateType[] values() {
        return null;
    }

    public static RecordPointCloudOperateType valueOf(String string) {
        return null;
    }

    private RecordPointCloudOperateType(int n2) {
    }

    public static RecordPointCloudOperateType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ RecordPointCloudOperateType[] $values() {
        return null;
    }

    static {
        $VALUES = RecordPointCloudOperateType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(RecordPointCloudOperateType.class);
    }
}

