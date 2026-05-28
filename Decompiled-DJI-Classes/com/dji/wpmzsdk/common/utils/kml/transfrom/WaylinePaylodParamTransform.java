/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadConfigInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.ScanMode;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.CameraLensType;
import dji.sdk.wpmz.value.mission.WaylinePayloadMeteringMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylinePayloadRate;
import dji.sdk.wpmz.value.mission.WaylinePayloadReturnMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadScanningMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0003H\u0016\u00a8\u0006\u001f"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/transfrom/WaylinePaylodParamTransform;", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/ModelTransform;", "Lcom/dji/wpmzsdk/common/utils/kml/model/PayloadConfigInfoModel;", "Ldji/sdk/wpmz/value/mission/WaylinePayloadParam;", "()V", "transEchoModeFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadReturnMode;", "echoMode", "", "transEchoModeTo", "transFrom", "configInfoModel", "transImageFormatFrom", "", "Ldji/sdk/wpmz/value/mission/CameraLensType;", "cameraType", "Lcom/dji/wpmzsdk/common/utils/kml/model/MappingCameraType;", "transMeteringModeFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadMeteringMode;", "meteringMode", "transMeteringModeTo", "transSampleRateFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadRate;", "sampleRate", "transSampleRateTo", "transScanModeFrom", "Ldji/sdk/wpmz/value/mission/WaylinePayloadScanningMode;", "scanMode", "transScanModeTo", "transTo", "r", "wpmzsdk_release"})
public final class WaylinePaylodParamTransform
implements ModelTransform<PayloadConfigInfoModel, WaylinePayloadParam> {
    @Override
    @NotNull
    public WaylinePayloadParam transFrom(@NotNull PayloadConfigInfoModel configInfoModel) {
        Intrinsics.checkNotNullParameter((Object)configInfoModel, (String)"configInfoModel");
        WaylinePayloadParam payloadParam = new WaylinePayloadParam();
        payloadParam.setMeteringMode(this.transMeteringModeFrom(configInfoModel.getMeteringMode()));
        payloadParam.setIsDewarpingEnableSet(true);
        payloadParam.setDewarpingEnable(configInfoModel.isEnableDewarp());
        payloadParam.setReturnMode(this.transEchoModeFrom(configInfoModel.getEchoMode()));
        int n = configInfoModel.getSampleRate();
        WaylinePayloadReturnMode waylinePayloadReturnMode = payloadParam.getReturnMode();
        Intrinsics.checkNotNullExpressionValue((Object)waylinePayloadReturnMode, (String)"payloadParam.returnMode");
        payloadParam.setSamplingRate(this.transSampleRateFrom(n, waylinePayloadReturnMode));
        payloadParam.setScanningMode(this.transScanModeFrom(configInfoModel.getScanMode()));
        payloadParam.setIsModelColoringEnableSet(true);
        payloadParam.setModelColoringEnable(configInfoModel.isNeedVariegation());
        return payloadParam;
    }

    @Override
    @NotNull
    public PayloadConfigInfoModel transTo(@NotNull WaylinePayloadParam r) {
        Intrinsics.checkNotNullParameter((Object)r, (String)"r");
        PayloadConfigInfoModel configInfoModel = new PayloadConfigInfoModel();
        Enum enum_ = r.getMeteringMode();
        Intrinsics.checkNotNullExpressionValue((Object)enum_, (String)"r.meteringMode");
        configInfoModel.setMeteringMode(this.transMeteringModeTo((WaylinePayloadMeteringMode)enum_));
        Boolean bl = r.getDewarpingEnable();
        configInfoModel.setEnableDewarp(bl == null ? false : bl);
        enum_ = r.getReturnMode();
        Intrinsics.checkNotNullExpressionValue((Object)enum_, (String)"r.returnMode");
        configInfoModel.setEchoMode(this.transEchoModeTo((WaylinePayloadReturnMode)enum_));
        enum_ = r.getSamplingRate();
        Intrinsics.checkNotNullExpressionValue((Object)enum_, (String)"r.samplingRate");
        Enum enum_2 = enum_;
        enum_ = r.getReturnMode();
        Intrinsics.checkNotNullExpressionValue((Object)enum_, (String)"r.returnMode");
        configInfoModel.setSampleRate(this.transSampleRateTo((WaylinePayloadRate)enum_2, (WaylinePayloadReturnMode)enum_));
        enum_ = r.getScanningMode();
        Intrinsics.checkNotNullExpressionValue((Object)enum_, (String)"r.scanningMode");
        configInfoModel.setScanMode(this.transScanModeTo((WaylinePayloadScanningMode)enum_));
        Boolean bl2 = r.getModelColoringEnable();
        configInfoModel.setNeedVariegation(bl2 == null ? false : bl2);
        return configInfoModel;
    }

    private final WaylinePayloadMeteringMode transMeteringModeFrom(int meteringMode) {
        WaylinePayloadMeteringMode waylinePayloadMeteringMode;
        switch (meteringMode) {
            case 1: {
                waylinePayloadMeteringMode = WaylinePayloadMeteringMode.SPOT;
                break;
            }
            case 0: {
                waylinePayloadMeteringMode = WaylinePayloadMeteringMode.AVERAGE;
                break;
            }
            default: {
                waylinePayloadMeteringMode = WaylinePayloadMeteringMode.AVERAGE;
            }
        }
        return waylinePayloadMeteringMode;
    }

    private final int transMeteringModeTo(WaylinePayloadMeteringMode meteringMode) {
        int n;
        switch (WhenMappings.$EnumSwitchMapping$0[meteringMode.ordinal()]) {
            case 1: {
                n = 0;
                break;
            }
            case 2: {
                n = 1;
                break;
            }
            default: {
                n = 0;
            }
        }
        return n;
    }

    private final WaylinePayloadReturnMode transEchoModeFrom(int echoMode) {
        WaylinePayloadReturnMode waylinePayloadReturnMode;
        switch (echoMode) {
            case 3: {
                waylinePayloadReturnMode = WaylinePayloadReturnMode.TRIPLE_RETURN;
                break;
            }
            case 2: {
                waylinePayloadReturnMode = WaylinePayloadReturnMode.DUAL_RETURN;
                break;
            }
            case 1: {
                waylinePayloadReturnMode = WaylinePayloadReturnMode.SINGLE_RETURN_STRONGEST;
                break;
            }
            case 0: {
                waylinePayloadReturnMode = WaylinePayloadReturnMode.SINGLE_RETURN_FIRST;
                break;
            }
            default: {
                waylinePayloadReturnMode = WaylinePayloadReturnMode.SINGLE_RETURN_STRONGEST;
            }
        }
        return waylinePayloadReturnMode;
    }

    private final int transEchoModeTo(WaylinePayloadReturnMode echoMode) {
        int n;
        switch (WhenMappings.$EnumSwitchMapping$1[echoMode.ordinal()]) {
            case 1: {
                n = 3;
                break;
            }
            case 2: {
                n = 2;
                break;
            }
            case 3: {
                n = 1;
                break;
            }
            case 4: {
                n = 0;
                break;
            }
            default: {
                n = 1;
            }
        }
        return n;
    }

    @NotNull
    public final WaylinePayloadRate transSampleRateFrom(int sampleRate, @NotNull WaylinePayloadReturnMode echoMode) {
        Intrinsics.checkNotNullParameter((Object)echoMode, (String)"echoMode");
        return echoMode == WaylinePayloadReturnMode.TRIPLE_RETURN && sampleRate == 0 ? WaylinePayloadRate.RATE_160KHz : (echoMode == WaylinePayloadReturnMode.TRIPLE_RETURN && sampleRate == 1 ? WaylinePayloadRate.RATE_120KHz : (echoMode == WaylinePayloadReturnMode.TRIPLE_RETURN && sampleRate == 2 ? WaylinePayloadRate.RATE_80KHz : (sampleRate == 0 ? WaylinePayloadRate.RATE_240KHz : (sampleRate == 1 ? WaylinePayloadRate.RATE_180KHz : (sampleRate == 2 ? WaylinePayloadRate.RATE_120KHz : (sampleRate == 3 ? WaylinePayloadRate.RATE_60KHz : WaylinePayloadRate.UNKNOWN))))));
    }

    public final int transSampleRateTo(@NotNull WaylinePayloadRate sampleRate, @NotNull WaylinePayloadReturnMode echoMode) {
        Intrinsics.checkNotNullParameter((Object)sampleRate, (String)"sampleRate");
        Intrinsics.checkNotNullParameter((Object)echoMode, (String)"echoMode");
        return echoMode == WaylinePayloadReturnMode.TRIPLE_RETURN && sampleRate == WaylinePayloadRate.RATE_160KHz ? 0 : (echoMode == WaylinePayloadReturnMode.TRIPLE_RETURN && sampleRate == WaylinePayloadRate.RATE_120KHz ? 1 : (echoMode == WaylinePayloadReturnMode.TRIPLE_RETURN && sampleRate == WaylinePayloadRate.RATE_80KHz ? 2 : (sampleRate == WaylinePayloadRate.RATE_240KHz ? 0 : (sampleRate == WaylinePayloadRate.RATE_180KHz ? 1 : (sampleRate == WaylinePayloadRate.RATE_120KHz ? 2 : (sampleRate == WaylinePayloadRate.RATE_60KHz ? 3 : 0))))));
    }

    private final WaylinePayloadScanningMode transScanModeFrom(int scanMode) {
        int n = scanMode;
        return n == ScanMode.REPEAT.value() ? WaylinePayloadScanningMode.REPETITIVE : (n == ScanMode.NON_REPEAT.value() ? WaylinePayloadScanningMode.NON_REPETITIVE : WaylinePayloadScanningMode.REPETITIVE);
    }

    private final int transScanModeTo(WaylinePayloadScanningMode scanMode) {
        int n;
        switch (WhenMappings.$EnumSwitchMapping$2[scanMode.ordinal()]) {
            case 1: {
                n = ScanMode.REPEAT.value();
                break;
            }
            case 2: {
                n = ScanMode.NON_REPEAT.value();
                break;
            }
            default: {
                n = ScanMode.NON_REPEAT.value();
            }
        }
        return n;
    }

    @NotNull
    public final List<CameraLensType> transImageFormatFrom(@NotNull MappingCameraType cameraType) {
        Intrinsics.checkNotNullParameter((Object)((Object)cameraType), (String)"cameraType");
        List imageFormat = new ArrayList();
        switch (WhenMappings.$EnumSwitchMapping$3[cameraType.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                imageFormat.add(CameraLensType.WIDE);
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                imageFormat.add(CameraLensType.IR);
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                imageFormat.add(CameraLensType.WIDE);
                imageFormat.add(CameraLensType.IR);
                break;
            }
            case 17: {
                imageFormat.add(CameraLensType.NARROW_BAND);
                break;
            }
            case 18: {
                imageFormat.add(CameraLensType.WIDE);
                imageFormat.add(CameraLensType.NARROW_BAND);
                break;
            }
        }
        return CollectionsKt.toList((Iterable)imageFormat);
    }

    @Metadata(mv={1, 6, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] nArray = new int[WaylinePayloadMeteringMode.values().length];
            nArray[WaylinePayloadMeteringMode.AVERAGE.ordinal()] = 1;
            nArray[WaylinePayloadMeteringMode.SPOT.ordinal()] = 2;
            $EnumSwitchMapping$0 = nArray;
            nArray = new int[WaylinePayloadReturnMode.values().length];
            nArray[WaylinePayloadReturnMode.TRIPLE_RETURN.ordinal()] = 1;
            nArray[WaylinePayloadReturnMode.DUAL_RETURN.ordinal()] = 2;
            nArray[WaylinePayloadReturnMode.SINGLE_RETURN_STRONGEST.ordinal()] = 3;
            nArray[WaylinePayloadReturnMode.SINGLE_RETURN_FIRST.ordinal()] = 4;
            $EnumSwitchMapping$1 = nArray;
            nArray = new int[WaylinePayloadScanningMode.values().length];
            nArray[WaylinePayloadScanningMode.REPETITIVE.ordinal()] = 1;
            nArray[WaylinePayloadScanningMode.NON_REPETITIVE.ordinal()] = 2;
            $EnumSwitchMapping$2 = nArray;
            nArray = new int[MappingCameraType.values().length];
            nArray[MappingCameraType.GD610.ordinal()] = 1;
            nArray[MappingCameraType.GD610T_WIDE.ordinal()] = 2;
            nArray[MappingCameraType.GD612_WIDE.ordinal()] = 3;
            nArray[MappingCameraType.PM320.ordinal()] = 4;
            nArray[MappingCameraType.PM320T_WIDE.ordinal()] = 5;
            nArray[MappingCameraType.WM265_WIDE.ordinal()] = 6;
            nArray[MappingCameraType.WM265_T_WIDE.ordinal()] = 7;
            nArray[MappingCameraType.WM265_M_WIDE.ordinal()] = 8;
            nArray[MappingCameraType.GD610_IR.ordinal()] = 9;
            nArray[MappingCameraType.GD612_IR.ordinal()] = 10;
            nArray[MappingCameraType.PM320_IR.ordinal()] = 11;
            nArray[MappingCameraType.WM265_IR.ordinal()] = 12;
            nArray[MappingCameraType.GD610_WIDE_IR.ordinal()] = 13;
            nArray[MappingCameraType.GD612_WIDE_IR.ordinal()] = 14;
            nArray[MappingCameraType.PM320_WIDE_IR.ordinal()] = 15;
            nArray[MappingCameraType.WM265_WIDE_IR.ordinal()] = 16;
            nArray[MappingCameraType.WM265_M_NARROWBAND.ordinal()] = 17;
            nArray[MappingCameraType.WM265_M_WIDE_NARROWBAND.ordinal()] = 18;
            $EnumSwitchMapping$3 = nArray;
        }
    }
}

