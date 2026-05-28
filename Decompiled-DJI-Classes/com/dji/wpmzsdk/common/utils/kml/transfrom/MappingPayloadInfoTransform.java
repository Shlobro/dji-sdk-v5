/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.industry.pilot.data.cache.model.MappingCameraModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylinePayloadType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u001e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u001b"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingPayloadInfoTransform;", "", "()V", "trans265PayloadTypeTo", "Lcom/dji/wpmzsdk/common/utils/kml/model/MappingCameraType;", "payloadType", "Ldji/sdk/wpmz/value/mission/WaylinePayloadType;", "subType", "", "doubleImage", "", "transOtherPayloadTypeTo", "transPM430PayloadTypeTo", "transPayloadInfoFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadInfo;", "cameraModel", "Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "Lcom/dji/wpmzsdk/common/utils/kml/model/MappingCameraModel;", "transPayloadInfoTo", "payloadInfo", "payloadParam", "Ldji/sdk/wpmz/value/mission/WaylinePayloadParam;", "transPayloadTypeFrom", "Lkotlin/Pair;", "cameraType", "transPayloadTypeTo", "SubType", "wpmzsdk_release"})
public final class MappingPayloadInfoTransform {
    @NotNull
    public static final SubType SubType = new SubType(null);
    public static final int P1_24MM = 0;
    public static final int P1_35MM = 1;
    public static final int P1_50MM = 2;
    public static final int L1_VISUAL = 0;
    public static final int L1_LIDAR = 1;
    public static final int H20_WIDE = 0;
    public static final int H20_ZOOM = 1;
    public static final int H20_IR = 2;
    public static final int X7_24MM = 0;
    public static final int X7_35MM = 1;
    public static final int M30_WIDE = 0;
    public static final int M30_ZOOM = 1;
    public static final int M30_IR = 2;
    public static final int M3_WIDE = 0;
    public static final int M3_IR = 2;
    public static final int M3_NARROWBAND = 3;

    @NotNull
    public final WaylinePayloadInfo transPayloadInfoFrom(@NotNull MappingCameraModelGreenDao cameraModel) {
        Intrinsics.checkNotNullParameter((Object)cameraModel, (String)"cameraModel");
        WaylinePayloadInfo payloadInfo = new WaylinePayloadInfo();
        MappingCameraType cameraType = MappingCameraType.find(cameraModel.getName());
        Intrinsics.checkNotNullExpressionValue((Object)((Object)cameraType), (String)"cameraType");
        Pair<WaylinePayloadType, Integer> payloadPair = this.transPayloadTypeFrom(cameraType);
        payloadInfo.setPayloadType((WaylinePayloadType)payloadPair.getFirst());
        payloadInfo.setPayloadSubType((Integer)payloadPair.getSecond());
        if (cameraType == MappingCameraType.OTHER || cameraType == MappingCameraType.SHARE_102S) {
            payloadInfo.setIsSetThirdPartyCameraParam(true);
            payloadInfo.setFocalLength(Double.valueOf(cameraModel.getFocalLength()));
            payloadInfo.setSensorW(Double.valueOf(cameraModel.getSensorWidth()));
            payloadInfo.setSensorH(Double.valueOf(cameraModel.getSensorHeight()));
            payloadInfo.setImageW(cameraModel.getImageWidth());
            payloadInfo.setImageH(cameraModel.getImageHeight());
            payloadInfo.setMinShootInterval(Double.valueOf(cameraModel.getShotInterval()));
            payloadInfo.setPayloadName(cameraModel.getName());
        }
        return payloadInfo;
    }

    @NotNull
    public final WaylinePayloadInfo transPayloadInfoFrom(@NotNull MappingCameraModel cameraModel) {
        Intrinsics.checkNotNullParameter((Object)cameraModel, (String)"cameraModel");
        WaylinePayloadInfo payloadInfo = new WaylinePayloadInfo();
        MappingCameraType cameraType = MappingCameraType.find(cameraModel.getName());
        Intrinsics.checkNotNullExpressionValue((Object)((Object)cameraType), (String)"cameraType");
        Pair<WaylinePayloadType, Integer> payloadPair = this.transPayloadTypeFrom(cameraType);
        payloadInfo.setPayloadType((WaylinePayloadType)payloadPair.getFirst());
        payloadInfo.setPayloadSubType((Integer)payloadPair.getSecond());
        if (cameraType == MappingCameraType.OTHER || cameraType == MappingCameraType.SHARE_102S) {
            payloadInfo.setIsSetThirdPartyCameraParam(true);
            payloadInfo.setFocalLength(Double.valueOf(cameraModel.getFocalLength()));
            payloadInfo.setSensorW(Double.valueOf(cameraModel.getSensorWidth()));
            payloadInfo.setSensorH(Double.valueOf(cameraModel.getSensorHeight()));
            payloadInfo.setImageW(cameraModel.getImageWidth());
            payloadInfo.setImageH(cameraModel.getImageHeight());
            payloadInfo.setMinShootInterval(Double.valueOf(cameraModel.getShotInterval()));
            payloadInfo.setPayloadName(cameraModel.getName());
        }
        return payloadInfo;
    }

    private final Pair<WaylinePayloadType, Integer> transPayloadTypeFrom(MappingCameraType cameraType) {
        Pair pair;
        switch (WhenMappings.$EnumSwitchMapping$0[cameraType.ordinal()]) {
            case 1: {
                pair = new Pair((Object)WaylinePayloadType.PM320_DUAL, (Object)0);
                break;
            }
            case 2: {
                pair = new Pair((Object)WaylinePayloadType.PM320_TRIPLE, (Object)0);
                break;
            }
            case 3: {
                pair = new Pair((Object)WaylinePayloadType.PM320_TRIPLE, (Object)2);
                break;
            }
            case 4: {
                pair = new Pair((Object)WaylinePayloadType.PM320_TRIPLE, (Object)2);
                break;
            }
            case 5: {
                pair = new Pair((Object)WaylinePayloadType.WM265E, (Object)0);
                break;
            }
            case 6: {
                pair = new Pair((Object)WaylinePayloadType.WM265T, (Object)0);
                break;
            }
            case 7: 
            case 8: {
                pair = new Pair((Object)WaylinePayloadType.WM265T, (Object)2);
                break;
            }
            case 9: {
                pair = new Pair((Object)WaylinePayloadType.WM265M, (Object)0);
                break;
            }
            case 10: 
            case 11: {
                pair = new Pair((Object)WaylinePayloadType.WM265M, (Object)3);
                break;
            }
            case 12: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_P1, (Object)0);
                break;
            }
            case 13: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_P1, (Object)1);
                break;
            }
            case 14: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_P1, (Object)2);
                break;
            }
            case 15: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_L1, (Object)1);
                break;
            }
            case 16: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_L1, (Object)0);
                break;
            }
            case 17: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_H20, (Object)0);
                break;
            }
            case 18: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_H20T, (Object)0);
                break;
            }
            case 19: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_H20T, (Object)2);
                break;
            }
            case 20: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_H20T, (Object)2);
                break;
            }
            case 21: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_H20N, (Object)0);
                break;
            }
            case 22: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_H20N, (Object)2);
                break;
            }
            case 23: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_H20N, (Object)2);
                break;
            }
            case 24: {
                pair = new Pair((Object)WaylinePayloadType.P4, (Object)0);
                break;
            }
            case 25: {
                pair = new Pair((Object)WaylinePayloadType.P4A, (Object)0);
                break;
            }
            case 26: {
                pair = new Pair((Object)WaylinePayloadType.P4P_PRO, (Object)0);
                break;
            }
            case 27: {
                pair = new Pair((Object)WaylinePayloadType.P4P_PRO_V2, (Object)0);
                break;
            }
            case 28: {
                pair = new Pair((Object)WaylinePayloadType.P4R, (Object)0);
                break;
            }
            case 29: {
                pair = new Pair((Object)WaylinePayloadType.WM245_ZOOM, (Object)0);
                break;
            }
            case 30: {
                pair = new Pair((Object)WaylinePayloadType.WM246, (Object)0);
                break;
            }
            case 31: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_X7, (Object)0);
                break;
            }
            case 32: {
                pair = new Pair((Object)WaylinePayloadType.ZENMUSE_X7, (Object)1);
                break;
            }
            default: {
                pair = new Pair((Object)WaylinePayloadType.UNKNOWN, (Object)0);
            }
        }
        return pair;
    }

    @NotNull
    public final MappingCameraModel transPayloadInfoTo(@NotNull WaylinePayloadInfo payloadInfo, @NotNull WaylinePayloadParam payloadParam) {
        Intrinsics.checkNotNullParameter((Object)payloadInfo, (String)"payloadInfo");
        Intrinsics.checkNotNullParameter((Object)payloadParam, (String)"payloadParam");
        MappingCameraModel cameraModel = new MappingCameraModel();
        boolean doubleImage = payloadParam.getImageFormat().size() > 1;
        Object object = payloadInfo.getPayloadType();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"payloadInfo.payloadType");
        WaylinePayloadType waylinePayloadType = object;
        object = payloadInfo.getPayloadSubType();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"payloadInfo.payloadSubType");
        MappingCameraType cameraType = this.transPayloadTypeTo(waylinePayloadType, ((Number)object).intValue(), doubleImage);
        if (Intrinsics.areEqual((Object)payloadInfo.getPayloadName(), (Object)MappingCameraType.SHARE_102S.getNameStr())) {
            cameraType = MappingCameraType.SHARE_102S;
        }
        object = payloadInfo.getIsSetThirdPartyCameraParam();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"payloadInfo.isSetThirdPartyCameraParam");
        if (((Boolean)object).booleanValue()) {
            cameraModel.setFocalLength((float)payloadInfo.getFocalLength().doubleValue());
            cameraModel.setSensorWidth((float)payloadInfo.getSensorW().doubleValue());
            cameraModel.setSensorHeight((float)payloadInfo.getSensorH().doubleValue());
            object = payloadInfo.getImageW();
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"payloadInfo.imageW");
            cameraModel.setImageWidth(((Number)object).intValue());
            object = payloadInfo.getImageH();
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"payloadInfo.imageH");
            cameraModel.setImageHeight(((Number)object).intValue());
            cameraModel.setShotInterval((float)payloadInfo.getMinShootInterval().doubleValue());
            cameraModel.setName(payloadInfo.getPayloadName());
        } else {
            cameraModel.setFocalLength(cameraType.getFocalLength());
            cameraModel.setSensorWidth(cameraType.getSensorW());
            cameraModel.setSensorHeight(cameraType.getSensorH());
            cameraModel.setImageWidth(cameraType.getImageWidth());
            cameraModel.setImageHeight(cameraType.getImageHeight());
            cameraModel.setName(cameraType.getNameStr());
        }
        return cameraModel;
    }

    @NotNull
    public final MappingCameraType transPayloadTypeTo(@NotNull WaylinePayloadType payloadType, int subType, boolean doubleImage) {
        Intrinsics.checkNotNullParameter((Object)payloadType, (String)"payloadType");
        MappingCameraType cameraType = this.trans265PayloadTypeTo(payloadType, subType, doubleImage);
        if (cameraType == MappingCameraType.OTHER) {
            cameraType = this.transPM430PayloadTypeTo(payloadType, subType, doubleImage);
        }
        if (cameraType == MappingCameraType.OTHER) {
            cameraType = payloadType == WaylinePayloadType.PM320_DUAL && subType == 0 ? MappingCameraType.PM320 : (payloadType == WaylinePayloadType.PM320_TRIPLE && subType == 0 ? MappingCameraType.PM320T_WIDE : (payloadType == WaylinePayloadType.PM320_TRIPLE && subType == 2 && !doubleImage ? MappingCameraType.PM320_IR : (payloadType == WaylinePayloadType.PM320_TRIPLE && subType == 2 && doubleImage ? MappingCameraType.PM320_WIDE_IR : this.transOtherPayloadTypeTo(payloadType, subType))));
        }
        return cameraType;
    }

    private final MappingCameraType transPM430PayloadTypeTo(WaylinePayloadType payloadType, int subType, boolean doubleImage) {
        return payloadType == WaylinePayloadType.ZENMUSE_P1 && subType == 0 ? MappingCameraType.EP600_24MM : (payloadType == WaylinePayloadType.ZENMUSE_P1 && subType == 1 ? MappingCameraType.EP600_35MM : (payloadType == WaylinePayloadType.ZENMUSE_P1 && subType == 2 ? MappingCameraType.EP600_50MM : (payloadType == WaylinePayloadType.ZENMUSE_L1 && subType == 1 ? MappingCameraType.EP800_LIDAR : (payloadType == WaylinePayloadType.ZENMUSE_L1 && subType == 0 ? MappingCameraType.EP800_VISUAL : (payloadType == WaylinePayloadType.ZENMUSE_H20 && subType == 0 ? MappingCameraType.GD610 : (payloadType == WaylinePayloadType.ZENMUSE_H20T && subType == 0 ? MappingCameraType.GD610T_WIDE : (payloadType == WaylinePayloadType.ZENMUSE_H20T && subType == 2 && !doubleImage ? MappingCameraType.GD610_IR : (payloadType == WaylinePayloadType.ZENMUSE_H20T && subType == 2 && doubleImage ? MappingCameraType.GD610_WIDE_IR : (payloadType == WaylinePayloadType.ZENMUSE_H20N && subType == 0 ? MappingCameraType.GD612_WIDE : (payloadType == WaylinePayloadType.ZENMUSE_H20N && subType == 2 && !doubleImage ? MappingCameraType.GD612_IR : (payloadType == WaylinePayloadType.ZENMUSE_H20N && subType == 2 && doubleImage ? MappingCameraType.GD612_WIDE_IR : MappingCameraType.OTHER)))))))))));
    }

    private final MappingCameraType transOtherPayloadTypeTo(WaylinePayloadType payloadType, int subType) {
        return payloadType == WaylinePayloadType.P4 ? MappingCameraType.P4 : (payloadType == WaylinePayloadType.P4P_PRO ? MappingCameraType.P4P : (payloadType == WaylinePayloadType.P4P_PRO_V2 ? MappingCameraType.P4PV2 : (payloadType == WaylinePayloadType.P4A ? MappingCameraType.P4A : (payloadType == WaylinePayloadType.P4R ? MappingCameraType.P4R : (payloadType == WaylinePayloadType.WM245_ZOOM ? MappingCameraType.WM245_ZOOM : (payloadType == WaylinePayloadType.WM246 ? MappingCameraType.WM246 : (payloadType == WaylinePayloadType.ZENMUSE_X7 && subType == 0 ? MappingCameraType.X7_24MM : (payloadType == WaylinePayloadType.ZENMUSE_X7 && subType == 1 ? MappingCameraType.X7_35MM : MappingCameraType.OTHER))))))));
    }

    private final MappingCameraType trans265PayloadTypeTo(WaylinePayloadType payloadType, int subType, boolean doubleImage) {
        return payloadType == WaylinePayloadType.WM265E && subType == 0 ? MappingCameraType.WM265_WIDE : (payloadType == WaylinePayloadType.WM265T ? (subType == 2 ? (doubleImage ? MappingCameraType.WM265_WIDE_IR : MappingCameraType.WM265_IR) : MappingCameraType.WM265_T_WIDE) : (payloadType == WaylinePayloadType.WM265M ? (subType == 3 ? (doubleImage ? MappingCameraType.WM265_M_WIDE_NARROWBAND : MappingCameraType.WM265_M_NARROWBAND) : MappingCameraType.WM265_M_WIDE) : MappingCameraType.OTHER));
    }

    @Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MappingPayloadInfoTransform$SubType;", "", "()V", "H20_IR", "", "H20_WIDE", "H20_ZOOM", "L1_LIDAR", "L1_VISUAL", "M30_IR", "M30_WIDE", "M30_ZOOM", "M3_IR", "M3_NARROWBAND", "M3_WIDE", "P1_24MM", "P1_35MM", "P1_50MM", "X7_24MM", "X7_35MM", "wpmzsdk_release"})
    public static final class SubType {
        private SubType() {
        }

        public /* synthetic */ SubType(DefaultConstructorMarker $constructor_marker) {
            this();
        }
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
            nArray[MappingCameraType.EP600_24MM.ordinal()] = 12;
            nArray[MappingCameraType.EP600_35MM.ordinal()] = 13;
            nArray[MappingCameraType.EP600_50MM.ordinal()] = 14;
            nArray[MappingCameraType.EP800_LIDAR.ordinal()] = 15;
            nArray[MappingCameraType.EP800_VISUAL.ordinal()] = 16;
            nArray[MappingCameraType.GD610.ordinal()] = 17;
            nArray[MappingCameraType.GD610T_WIDE.ordinal()] = 18;
            nArray[MappingCameraType.GD610_IR.ordinal()] = 19;
            nArray[MappingCameraType.GD610_WIDE_IR.ordinal()] = 20;
            nArray[MappingCameraType.GD612_WIDE.ordinal()] = 21;
            nArray[MappingCameraType.GD612_IR.ordinal()] = 22;
            nArray[MappingCameraType.GD612_WIDE_IR.ordinal()] = 23;
            nArray[MappingCameraType.P4.ordinal()] = 24;
            nArray[MappingCameraType.P4A.ordinal()] = 25;
            nArray[MappingCameraType.P4P.ordinal()] = 26;
            nArray[MappingCameraType.P4PV2.ordinal()] = 27;
            nArray[MappingCameraType.P4R.ordinal()] = 28;
            nArray[MappingCameraType.WM245_ZOOM.ordinal()] = 29;
            nArray[MappingCameraType.WM246.ordinal()] = 30;
            nArray[MappingCameraType.X7_24MM.ordinal()] = 31;
            nArray[MappingCameraType.X7_35MM.ordinal()] = 32;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

