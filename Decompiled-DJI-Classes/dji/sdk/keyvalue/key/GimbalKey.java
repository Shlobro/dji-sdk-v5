/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIGimbalKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.msdkkeyinfo.KeyGimbalMode;
import dji.sdk.keyvalue.msdkkeyinfo.KeyLightGimbalCalibrate;
import dji.sdk.keyvalue.msdkkeyinfo.KeyLightGimbalCalibrationStatus;
import dji.sdk.keyvalue.msdkkeyinfo.KeyLightGimbalFineTunePitchInDegrees;
import dji.sdk.keyvalue.msdkkeyinfo.KeyLightGimbalPitchTotalInDegrees;
import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.sdk.keyvalue.value.gimbal.GimbalCalibrationStatusInfo;
import dji.sdk.keyvalue.value.gimbal.GimbalMode;
import dji.sdk.keyvalue.value.gimbal.LightGimbalAdjustInfo;
import dji.sdk.keyvalue.value.gimbal.LightGimbalTotalAdjustInfo;
import java.util.List;

@Keep
public class GimbalKey
extends DJIGimbalKey {
    public static final DJIActionKeyInfo<EmptyMsg, EmptyMsg> KeyLightGimbalCalibrate = new KeyLightGimbalCalibrate().canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<GimbalCalibrationStatusInfo> KeyLightGimbalCalibrationStatus = new KeyLightGimbalCalibrationStatus().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<LightGimbalAdjustInfo, EmptyMsg> KeyLightGimbalFineTunePitchInDegrees = new KeyLightGimbalFineTunePitchInDegrees().canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<LightGimbalTotalAdjustInfo> KeyLightGimbalPitchTotalInDegrees = new KeyLightGimbalPitchTotalInDegrees().canGet(true).canSet(false).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<GimbalMode> KeyGimbalMode = new KeyGimbalMode().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);

    public static List<DJIKeyInfo<?>> getKeyList() {
        return null;
    }

    static {
        keyList.add(KeyLightGimbalCalibrate);
        keyList.add(KeyLightGimbalCalibrationStatus);
        keyList.add(KeyLightGimbalFineTunePitchInDegrees);
        keyList.add(KeyLightGimbalPitchTotalInDegrees);
        keyList.add(KeyGimbalMode);
    }
}

