/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import dji.sdk.wpmz.value.mission.WaylineDroneInfo;
import dji.sdk.wpmz.value.mission.WaylineDroneType;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a8\u0006\f"}, d2={"createExecuteConfig", "Ldji/sdk/wpmz/value/mission/WaylineExecuteMissionConfig;", "config", "Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;", "createWaylineMission", "Ldji/sdk/wpmz/value/mission/WaylineMission;", "infoModel", "Lcom/dji/wpmzsdk/common/utils/kml/mission/MissionInfoModel;", "getDroneInfoFromCamera", "Ldji/sdk/wpmz/value/mission/WaylineDroneInfo;", "cameraType", "Lcom/dji/wpmzsdk/common/utils/kml/model/MappingCameraType;", "wpmzsdk_release"})
public final class WaylineInfoTransformKt {
    @NotNull
    public static final WaylineExecuteMissionConfig createExecuteConfig(@NotNull WaylineMissionConfig config) {
        Intrinsics.checkNotNullParameter((Object)config, (String)"config");
        WaylineExecuteMissionConfig executeMissionConfig = new WaylineExecuteMissionConfig();
        executeMissionConfig.setDroneInfo(config.getDroneInfo());
        executeMissionConfig.setExitOnRCLostBehavior(config.getExitOnRCLostBehavior());
        executeMissionConfig.setFinishAction(config.getFinishAction());
        executeMissionConfig.setExitOnRCLostType(config.getExitOnRCLostType());
        executeMissionConfig.setFlyToWaylineMode(config.getFlyToWaylineMode());
        executeMissionConfig.setGlobalRTHHeight(config.getGlobalRTHHeight());
        executeMissionConfig.setIsGlobalRTHHeightSet(config.getIsGlobalRTHHeightSet());
        executeMissionConfig.setGlobalTransitionalSpeed(config.getGlobalTransitionalSpeed());
        executeMissionConfig.setIsSecurityTakeOffHeightSet(config.getIsSecurityTakeOffHeightSet());
        executeMissionConfig.setPayloadInfo(config.getPayloadInfo());
        executeMissionConfig.setSecurityTakeOffHeight(config.getSecurityTakeOffHeight());
        return executeMissionConfig;
    }

    @NotNull
    public static final WaylineMission createWaylineMission(@NotNull MissionInfoModel infoModel) {
        Intrinsics.checkNotNullParameter((Object)infoModel, (String)"infoModel");
        WaylineMission mission = new WaylineMission();
        mission.setUpdateTime(Double.valueOf(infoModel.getUpdateTime()));
        mission.setCreateTime(Double.valueOf(infoModel.getCreateTime()));
        return mission;
    }

    @NotNull
    public static final WaylineDroneInfo getDroneInfoFromCamera(@Nullable MappingCameraType cameraType) {
        if (cameraType == null) {
            return new WaylineDroneInfo();
        }
        WaylineDroneInfo droneInfo = new WaylineDroneInfo();
        switch (WhenMappings.$EnumSwitchMapping$0[cameraType.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                droneInfo.setDroneType(WaylineDroneType.PM320);
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                droneInfo.setDroneType(WaylineDroneType.WM265);
                break;
            }
            case 12: {
                droneInfo.setDroneType(WaylineDroneType.Phantom4);
                break;
            }
            case 13: {
                droneInfo.setDroneType(WaylineDroneType.Phantom4Advanced);
                break;
            }
            case 14: 
            case 15: {
                droneInfo.setDroneType(WaylineDroneType.Phantom4Pro);
                break;
            }
            case 16: {
                droneInfo.setDroneType(WaylineDroneType.Phantom4RTK);
                break;
            }
            case 17: 
            case 18: {
                droneInfo.setDroneType(WaylineDroneType.UNKNOWN);
                break;
            }
            default: {
                droneInfo.setDroneType(WaylineDroneType.PM430);
            }
        }
        return droneInfo;
    }

    @Metadata(mv={1, 6, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[MappingCameraType.values().length];
            nArray[MappingCameraType.PM320.ordinal()] = 1;
            nArray[MappingCameraType.PM320T_WIDE.ordinal()] = 2;
            nArray[MappingCameraType.PM320_IR.ordinal()] = 3;
            nArray[MappingCameraType.PM320_WIDE_IR.ordinal()] = 4;
            nArray[MappingCameraType.WM265_WIDE.ordinal()] = 5;
            nArray[MappingCameraType.WM265_T_WIDE.ordinal()] = 6;
            nArray[MappingCameraType.WM265_IR.ordinal()] = 7;
            nArray[MappingCameraType.WM265_WIDE_IR.ordinal()] = 8;
            nArray[MappingCameraType.WM265_M_WIDE.ordinal()] = 9;
            nArray[MappingCameraType.WM265_M_NARROWBAND.ordinal()] = 10;
            nArray[MappingCameraType.WM265_M_WIDE_NARROWBAND.ordinal()] = 11;
            nArray[MappingCameraType.P4.ordinal()] = 12;
            nArray[MappingCameraType.P4A.ordinal()] = 13;
            nArray[MappingCameraType.P4P.ordinal()] = 14;
            nArray[MappingCameraType.P4PV2.ordinal()] = 15;
            nArray[MappingCameraType.P4R.ordinal()] = 16;
            nArray[MappingCameraType.WM245_ZOOM.ordinal()] = 17;
            nArray[MappingCameraType.WM246.ordinal()] = 18;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

