/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIFlightControllerKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.msdkkeyinfo.KeyFlightMode;
import dji.sdk.keyvalue.msdkkeyinfo.KeyGoHomeConfirm;
import dji.sdk.keyvalue.msdkkeyinfo.KeyGoHomeInfo;
import dji.sdk.keyvalue.msdkkeyinfo.KeyGoHomeStatus;
import dji.sdk.keyvalue.msdkkeyinfo.KeyLookAt;
import dji.sdk.keyvalue.msdkkeyinfo.KeyLowBatteryRTHConfirm;
import dji.sdk.keyvalue.msdkkeyinfo.KeyLowBatteryRTHInfo;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMaxHorizontalSpeedInNormal;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMaxHorizontalSpeedInNormalRange;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMaxHorizontalSpeedInSport;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMaxHorizontalSpeedInSportRange;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMaxHorizontalSpeedInTripod;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMaxHorizontalSpeedInTripodRange;
import dji.sdk.keyvalue.msdkkeyinfo.KeyRemoteControllerFlightMode;
import dji.sdk.keyvalue.value.common.DoubleValueConfig;
import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.sdk.keyvalue.value.flightcontroller.FlightMode;
import dji.sdk.keyvalue.value.flightcontroller.GoHomeInfo;
import dji.sdk.keyvalue.value.flightcontroller.GoHomeState;
import dji.sdk.keyvalue.value.flightcontroller.LookAtInfo;
import dji.sdk.keyvalue.value.flightcontroller.LowBatteryRTHInfo;
import dji.sdk.keyvalue.value.flightcontroller.RemoteControllerFlightMode;
import java.util.List;

@Keep
public class FlightControllerKey
extends DJIFlightControllerKey {
    public static final DJIKeyInfo<RemoteControllerFlightMode> KeyRemoteControllerFlightMode = new KeyRemoteControllerFlightMode().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<GoHomeState> KeyGoHomeStatus = new KeyGoHomeStatus().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<FlightMode> KeyFlightMode = new KeyFlightMode().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<LowBatteryRTHInfo> KeyLowBatteryRTHInfo = new KeyLowBatteryRTHInfo().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<Boolean, EmptyMsg> KeyLowBatteryRTHConfirm = new KeyLowBatteryRTHConfirm().canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<GoHomeInfo> KeyGoHomeInfo = new KeyGoHomeInfo().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<Boolean, EmptyMsg> KeyGoHomeConfirm = new KeyGoHomeConfirm().canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<Double> KeyMaxHorizontalSpeedInTripod = new KeyMaxHorizontalSpeedInTripod().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<DoubleValueConfig> KeyMaxHorizontalSpeedInTripodRange = new KeyMaxHorizontalSpeedInTripodRange().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Double> KeyMaxHorizontalSpeedInNormal = new KeyMaxHorizontalSpeedInNormal().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<DoubleValueConfig> KeyMaxHorizontalSpeedInNormalRange = new KeyMaxHorizontalSpeedInNormalRange().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Double> KeyMaxHorizontalSpeedInSport = new KeyMaxHorizontalSpeedInSport().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<DoubleValueConfig> KeyMaxHorizontalSpeedInSportRange = new KeyMaxHorizontalSpeedInSportRange().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<LookAtInfo, EmptyMsg> KeyLookAt = new KeyLookAt().canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);

    public static List<DJIKeyInfo<?>> getKeyList() {
        return null;
    }

    static {
        keyList.add(KeyRemoteControllerFlightMode);
        keyList.add(KeyGoHomeStatus);
        keyList.add(KeyFlightMode);
        keyList.add(KeyLowBatteryRTHInfo);
        keyList.add(KeyLowBatteryRTHConfirm);
        keyList.add(KeyMaxHorizontalSpeedInTripod);
        keyList.add(KeyMaxHorizontalSpeedInTripodRange);
        keyList.add(KeyMaxHorizontalSpeedInNormal);
        keyList.add(KeyMaxHorizontalSpeedInNormalRange);
        keyList.add(KeyMaxHorizontalSpeedInSport);
        keyList.add(KeyMaxHorizontalSpeedInSportRange);
        keyList.add(KeyLookAt);
        keyList.add(KeyGoHomeInfo);
        keyList.add(KeyGoHomeConfirm);
    }
}

