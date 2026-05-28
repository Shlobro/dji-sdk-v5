/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.industry.mission;

import com.dji.industry.mission.waypointv2.action.WaypointV2Action;
import com.dji.industry.mission.waypointv2.error.DJIWaypointV2Error;
import dji.sdk.keyvalue.value.flightcontroller.FCRemoteControllerSwitchMode;
import dji.sdk.keyvalue.value.waypointv3.MissionInfo;
import dji.sdk.keyvalue.value.waypointv3.PointInfo;
import dji.sdk.keyvalue.value.waypointv3.PrecisePhotoFileFileInfo;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3BreakPointInfo;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.aircraft.waypoint3.model.BreakPointInfo;
import dji.v5.utils.common.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J$\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0005R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006)"}, d2={"Lcom/dji/industry/mission/MissionUtils;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "getMissionInfo", "Ldji/sdk/keyvalue/value/waypointv3/MissionInfo;", "waylineIds", "", "", "getPointInfo", "Ldji/sdk/keyvalue/value/waypointv3/PointInfo;", "breakPointInfo", "Ldji/v5/manager/aircraft/waypoint3/model/BreakPointInfo;", "transError", "Ldji/v5/common/error/IDJIError;", "errorCode", "Ldji/sdk/keyvalue/value/waypointv3/Waypoint3ErrorCode;", "Ldji/sdk/keyvalue/value/waypointv3/WaypointV3BreakPointInfo;", "mode", "Ldji/sdk/keyvalue/value/flightcontroller/FCRemoteControllerSwitchMode;", "waypointV2Error", "Lcom/dji/industry/mission/waypointv2/error/DJIWaypointV2Error;", "convertAction", "Lcom/dji/industry/mission/waypointv2/action/WaypointV2Action;", "data", "", "hasBreakPoint", "", "getAllPreciseImages", "Ldji/sdk/keyvalue/value/waypointv3/PrecisePhotoFileFileInfo;", "kmzPath", "localPath", "getAllAudioFiles", "getAllUploadFiles", "localImagePath", "localAudioPath", "checkPrecise", "aircraft_release"})
@SourceDebugExtension(value={"SMAP\nMissionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MissionUtils.kt\ncom/dji/industry/mission/MissionUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n774#2:207\n865#2,2:208\n1557#2:210\n1628#2,3:211\n1863#2,2:214\n1368#2:216\n1454#2,5:217\n1368#2:222\n1454#2,5:223\n774#2:228\n865#2,2:229\n1557#2:231\n1628#2,3:232\n1368#2:235\n1454#2,5:236\n1368#2:241\n1454#2,5:242\n774#2:247\n865#2,2:248\n1557#2:250\n1628#2,3:251\n1368#2:254\n1454#2,5:255\n1368#2:260\n1454#2,5:261\n774#2:266\n865#2,2:267\n1557#2:269\n1628#2,3:270\n*S KotlinDebug\n*F\n+ 1 MissionUtils.kt\ncom/dji/industry/mission/MissionUtils\n*L\n36#1:207\n36#1:208,2\n38#1:210\n38#1:211,3\n120#1:214,2\n151#1:216\n151#1:217,5\n152#1:222\n152#1:223,5\n153#1:228\n153#1:229,2\n157#1:231\n157#1:232,3\n172#1:235\n172#1:236,5\n173#1:241\n173#1:242,5\n174#1:247\n174#1:248,2\n175#1:250\n175#1:251,3\n195#1:254\n195#1:255,5\n196#1:260\n196#1:261,5\n197#1:266\n197#1:267,2\n199#1:269\n199#1:270,3\n*E\n"})
public final class MissionUtils {
    @NotNull
    public static final MissionUtils INSTANCE = new MissionUtils();
    private static final String TAG = LogUtils.getTag(INSTANCE);

    private MissionUtils() {
    }

    @NotNull
    public final MissionInfo getMissionInfo(@NotNull List<Integer> list) {
        return null;
    }

    @NotNull
    public final PointInfo getPointInfo(@NotNull BreakPointInfo breakPointInfo) {
        return null;
    }

    @NotNull
    public final MissionInfo getMissionInfo(@NotNull BreakPointInfo breakPointInfo) {
        return null;
    }

    @NotNull
    public final IDJIError transError(@Nullable Waypoint3ErrorCode waypoint3ErrorCode) {
        return null;
    }

    @NotNull
    public final IDJIError transError(@Nullable WaypointV3BreakPointInfo waypointV3BreakPointInfo, @NotNull FCRemoteControllerSwitchMode fCRemoteControllerSwitchMode) {
        return null;
    }

    @NotNull
    public final IDJIError transError(@NotNull DJIWaypointV2Error dJIWaypointV2Error) {
        return null;
    }

    @NotNull
    public final List<WaypointV2Action> convertAction(@NotNull List<byte[]> list) {
        return null;
    }

    private final boolean hasBreakPoint(BreakPointInfo breakPointInfo) {
        return false;
    }

    private final List<PrecisePhotoFileFileInfo> getAllPreciseImages(String string, String string2) {
        return null;
    }

    private final List<PrecisePhotoFileFileInfo> getAllAudioFiles(String string, String string2) {
        return null;
    }

    @NotNull
    public final List<PrecisePhotoFileFileInfo> getAllUploadFiles(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        return null;
    }

    public final boolean checkPrecise(@NotNull String string) {
        return false;
    }
}

