/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.CameraType;
import com.dji.wpmzsdk.common.utils.kml.model.CameraUtil;
import com.dji.wpmzsdk.common.utils.kml.model.DroneCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadInfoModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineCustomPayloadActionInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0016\u00a8\u0006\u0013"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylinePayloadInfoTransform;", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/ModelTransform;", "Lcom/dji/wpmzsdk/common/utils/kml/model/DroneCameraModel;", "Ldji/sdk/wpmz/value/mission/WaylinePayloadInfo;", "()V", "transFrom", "droneCameraModel", "transPayloadTypeFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadType;", "cameraType", "", "payloadCameraType", "transPayloadTypeTo", "Lkotlin/Pair;", "Lcom/dji/wpmzsdk/common/utils/kml/model/CameraType;", "Lcom/dji/wpmzsdk/common/utils/kml/model/PayloadCameraType;", "payloadType", "transTo", "r", "wpmzsdk_release"})
public final class WaylinePayloadInfoTransform
implements ModelTransform<DroneCameraModel, WaylinePayloadInfo> {
    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public WaylinePayloadInfo transFrom(@NotNull DroneCameraModel droneCameraModel) {
        Intrinsics.checkNotNullParameter((Object)droneCameraModel, (String)"droneCameraModel");
        WaylinePayloadInfo payloadInfo = new WaylinePayloadInfo();
        payloadInfo.setPayloadPositionIndex(droneCameraModel.getCameraIndex());
        payloadInfo.setIsPayloadPositionIndexSet(true);
        payloadInfo.setPayloadType(this.transPayloadTypeFrom(droneCameraModel.getCameraType(), droneCameraModel.getPayloadCameraType()));
        if (droneCameraModel.getPayloadInfo() != null) {
            List list;
            PayloadInfoModel payloadInfoModel = droneCameraModel.getPayloadInfo();
            List<PayloadInfoModel.PayloadWidgetInfo> widgetModelList = payloadInfoModel.getWidgetModels();
            payloadInfo.setPayloadName(payloadInfoModel.getName());
            payloadInfo.setIsSetThirdPartyCameraParam(true);
            WaylinePayloadInfo waylinePayloadInfo = payloadInfo;
            List<PayloadInfoModel.PayloadWidgetInfo> list2 = widgetModelList;
            if (list2 == null) {
                list = null;
            } else {
                void $this$mapTo$iv$iv;
                void $this$map$iv;
                Iterable iterable = list2;
                WaylinePayloadInfo waylinePayloadInfo2 = waylinePayloadInfo;
                boolean $i$f$map = false;
                void var10_9 = $this$map$iv;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                boolean $i$f$mapTo = false;
                for (Object item$iv$iv : $this$mapTo$iv$iv) {
                    void it;
                    WaylineCustomPayloadActionInfo waylineCustomPayloadActionInfo;
                    PayloadInfoModel.PayloadWidgetInfo payloadWidgetInfo = (PayloadInfoModel.PayloadWidgetInfo)item$iv$iv;
                    Collection collection = destination$iv$iv;
                    boolean bl = false;
                    WaylineCustomPayloadActionInfo $this$transFrom_u24lambda_u2d1_u24lambda_u2d0 = waylineCustomPayloadActionInfo = new WaylineCustomPayloadActionInfo();
                    boolean bl2 = false;
                    $this$transFrom_u24lambda_u2d1_u24lambda_u2d0.setActionName(it.getName());
                    $this$transFrom_u24lambda_u2d1_u24lambda_u2d0.setActionType(it.getType());
                    $this$transFrom_u24lambda_u2d1_u24lambda_u2d0.setActionIndex(it.getIndex());
                    $this$transFrom_u24lambda_u2d1_u24lambda_u2d0.setMaxParamValue(Double.valueOf(it.getMinValue()));
                    $this$transFrom_u24lambda_u2d1_u24lambda_u2d0.setMinParamValue(Double.valueOf(it.getMaxValue()));
                    collection.add(waylineCustomPayloadActionInfo);
                }
                waylinePayloadInfo = waylinePayloadInfo2;
                List list3 = (List)destination$iv$iv;
                list = CollectionsKt.toMutableList((Collection)list3);
            }
            List list4 = list;
            waylinePayloadInfo.setCustomActionInfos(list4 == null ? (List)new ArrayList() : list4);
        }
        return payloadInfo;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public DroneCameraModel transTo(@NotNull WaylinePayloadInfo r) {
        Intrinsics.checkNotNullParameter((Object)r, (String)"r");
        DroneCameraModel droneCameraModel = new DroneCameraModel();
        Integer n = r.getPayloadPositionIndex();
        Intrinsics.checkNotNullExpressionValue((Object)n, (String)"r.payloadPositionIndex");
        droneCameraModel.setCameraIndex(((Number)n).intValue());
        WaylinePayloadType waylinePayloadType = r.getPayloadType();
        Intrinsics.checkNotNullExpressionValue((Object)waylinePayloadType, (String)"r.payloadType");
        Pair<CameraType, PayloadCameraType> cameraTypePair = this.transPayloadTypeTo(waylinePayloadType);
        droneCameraModel.setCameraType(((CameraType)cameraTypePair.getFirst()).value());
        droneCameraModel.setPayloadCameraType(((PayloadCameraType)cameraTypePair.getSecond()).value());
        droneCameraModel.setCameraName(CameraUtil.getCameraDisplayName());
        if (r.getCustomActionInfos() != null && r.getCustomActionInfos().size() > 0) {
            void $this$mapTo$iv$iv;
            void $this$map$iv;
            PayloadInfoModel payloadInfo = new PayloadInfoModel();
            payloadInfo.setName(r.getPayloadName());
            Iterable<WaylineCustomPayloadActionInfo> iterable = r.getCustomActionInfos();
            Intrinsics.checkNotNullExpressionValue(iterable, (String)"r.customActionInfos");
            iterable = iterable;
            PayloadInfoModel payloadInfoModel = payloadInfo;
            boolean $i$f$map = false;
            void var7_8 = $this$map$iv;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
            boolean $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                void it;
                PayloadInfoModel.PayloadWidgetInfo payloadWidgetInfo;
                WaylineCustomPayloadActionInfo waylineCustomPayloadActionInfo = (WaylineCustomPayloadActionInfo)item$iv$iv;
                Collection collection = destination$iv$iv;
                boolean bl = false;
                PayloadInfoModel.PayloadWidgetInfo $this$transTo_u24lambda_u2d3_u24lambda_u2d2 = payloadWidgetInfo = new PayloadInfoModel.PayloadWidgetInfo();
                boolean bl2 = false;
                $this$transTo_u24lambda_u2d3_u24lambda_u2d2.setName(it.getActionName());
                Integer n2 = it.getActionType();
                Intrinsics.checkNotNullExpressionValue((Object)n2, (String)"it.actionType");
                $this$transTo_u24lambda_u2d3_u24lambda_u2d2.setType(((Number)n2).intValue());
                n2 = it.getActionIndex();
                Intrinsics.checkNotNullExpressionValue((Object)n2, (String)"it.actionIndex");
                $this$transTo_u24lambda_u2d3_u24lambda_u2d2.setIndex(((Number)n2).intValue());
                $this$transTo_u24lambda_u2d3_u24lambda_u2d2.setMinValue((int)it.getMinParamValue().doubleValue());
                $this$transTo_u24lambda_u2d3_u24lambda_u2d2.setMaxValue((int)it.getMaxParamValue().doubleValue());
                collection.add(payloadWidgetInfo);
            }
            payloadInfoModel.setWidgetModels(CollectionsKt.toMutableList((Collection)((List)destination$iv$iv)));
            droneCameraModel.setPayloadInfo(payloadInfo);
            droneCameraModel.setCameraName(droneCameraModel.getCameraName());
        }
        return droneCameraModel;
    }

    private final WaylinePayloadType transPayloadTypeFrom(int cameraType, int payloadCameraType) {
        return cameraType == CameraType.DJICameraTypeGD610DualLight.value() ? WaylinePayloadType.ZENMUSE_H20 : (cameraType == CameraType.DJICameraTypeGD610TripleLight.value() ? WaylinePayloadType.ZENMUSE_H20T : (cameraType == CameraType.GD612.value() ? WaylinePayloadType.ZENMUSE_H20N : (cameraType == CameraType.DJICameraTypePM320DualLight.value() ? WaylinePayloadType.PM320_DUAL : (cameraType == CameraType.DJICameraTypePM320TripleLight.value() ? WaylinePayloadType.PM320_TRIPLE : (cameraType == CameraType.WM265_E.value() ? WaylinePayloadType.WM265E : (cameraType == CameraType.WM265_T.value() ? WaylinePayloadType.WM265T : (cameraType == CameraType.WM265_M.value() ? WaylinePayloadType.WM265M : (cameraType == CameraType.ZENMUSE_X30.value() ? WaylinePayloadType.ZENMUSE_Z30 : (cameraType == CameraType.ZENMUSE_XT2.value() ? WaylinePayloadType.ZENMUSE_XT2 : (cameraType == CameraType.ZENMUSE_XTS.value() ? WaylinePayloadType.ZENMUSE_XTS : (cameraType == CameraType.Payload.value() && payloadCameraType == PayloadCameraType.EP600.value() ? WaylinePayloadType.ZENMUSE_P1 : (cameraType == CameraType.Payload.value() && payloadCameraType == PayloadCameraType.EP800.value() ? WaylinePayloadType.ZENMUSE_L1 : (cameraType == CameraType.Payload.value() && payloadCameraType == PayloadCameraType.UNKNOWN.value() ? WaylinePayloadType.PAYLOAD_CAMERA : WaylinePayloadType.UNKNOWN)))))))))))));
    }

    private final Pair<CameraType, PayloadCameraType> transPayloadTypeTo(WaylinePayloadType payloadType) {
        Pair pair;
        switch (WhenMappings.$EnumSwitchMapping$0[payloadType.ordinal()]) {
            case 1: {
                pair = new Pair((Object)CameraType.DJICameraTypeGD610DualLight, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 2: {
                pair = new Pair((Object)CameraType.DJICameraTypeGD610TripleLight, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 3: {
                pair = new Pair((Object)CameraType.GD612, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 4: {
                pair = new Pair((Object)CameraType.DJICameraTypePM320DualLight, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 5: {
                pair = new Pair((Object)CameraType.DJICameraTypePM320TripleLight, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 6: {
                pair = new Pair((Object)CameraType.WM265_E, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 7: {
                pair = new Pair((Object)CameraType.WM265_T, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 8: {
                pair = new Pair((Object)CameraType.WM265_M, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 9: {
                pair = new Pair((Object)CameraType.ZENMUSE_X30, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 10: {
                pair = new Pair((Object)CameraType.ZENMUSE_XTS, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 11: {
                pair = new Pair((Object)CameraType.ZENMUSE_XT2, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            case 12: {
                pair = new Pair((Object)CameraType.Payload, (Object)PayloadCameraType.EP600);
                break;
            }
            case 13: {
                pair = new Pair((Object)CameraType.Payload, (Object)PayloadCameraType.EP800);
                break;
            }
            case 14: {
                pair = new Pair((Object)CameraType.Payload, (Object)PayloadCameraType.UNKNOWN);
                break;
            }
            default: {
                pair = new Pair((Object)CameraType.UNKNOWN, (Object)PayloadCameraType.UNKNOWN);
            }
        }
        return pair;
    }

    @Metadata(mv={1, 6, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[WaylinePayloadType.values().length];
            nArray[WaylinePayloadType.ZENMUSE_H20.ordinal()] = 1;
            nArray[WaylinePayloadType.ZENMUSE_H20T.ordinal()] = 2;
            nArray[WaylinePayloadType.ZENMUSE_H20N.ordinal()] = 3;
            nArray[WaylinePayloadType.PM320_DUAL.ordinal()] = 4;
            nArray[WaylinePayloadType.PM320_TRIPLE.ordinal()] = 5;
            nArray[WaylinePayloadType.WM265E.ordinal()] = 6;
            nArray[WaylinePayloadType.WM265T.ordinal()] = 7;
            nArray[WaylinePayloadType.WM265M.ordinal()] = 8;
            nArray[WaylinePayloadType.ZENMUSE_Z30.ordinal()] = 9;
            nArray[WaylinePayloadType.ZENMUSE_XTS.ordinal()] = 10;
            nArray[WaylinePayloadType.ZENMUSE_XT2.ordinal()] = 11;
            nArray[WaylinePayloadType.ZENMUSE_P1.ordinal()] = 12;
            nArray[WaylinePayloadType.ZENMUSE_L1.ordinal()] = 13;
            nArray[WaylinePayloadType.PAYLOAD_CAMERA.ordinal()] = 14;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

