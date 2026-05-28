/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.key.DJICameraKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraMode;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraModeRange;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraStorageInfo;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraType;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraVideoStreamSource;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraVideoStreamSourceRange;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraZoomFocalLength;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraZoomRatios;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraZoomRatiosRange;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCaptureCameraStreamSettings;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMultiSpectralDisplayMode;
import dji.sdk.keyvalue.msdkkeyinfo.KeyPhotoRatio;
import dji.sdk.keyvalue.msdkkeyinfo.KeyPhotoSize;
import dji.sdk.keyvalue.msdkkeyinfo.KeyRecordCameraStreamSettings;
import dji.sdk.keyvalue.msdkkeyinfo.KeyRegionMeteringArea;
import dji.sdk.keyvalue.msdkkeyinfo.KeySpotMeteringPoint;
import dji.sdk.keyvalue.msdkkeyinfo.KeyThermalFocalLength;
import dji.sdk.keyvalue.msdkkeyinfo.KeyThermalZoomRatios;
import dji.sdk.keyvalue.msdkkeyinfo.KeyThermalZoomRatiosRange;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.camera.CameraStorageInfos;
import dji.sdk.keyvalue.value.camera.CameraStreamSettingsInfo;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType;
import dji.sdk.keyvalue.value.camera.MultiSpectralDisplayMode;
import dji.sdk.keyvalue.value.camera.PhotoRatio;
import dji.sdk.keyvalue.value.camera.PhotoSize;
import dji.sdk.keyvalue.value.camera.ZoomRatiosRange;
import dji.sdk.keyvalue.value.common.DoublePoint2D;
import dji.sdk.keyvalue.value.common.DoubleRect;
import java.util.List;

@Keep
public class CameraKey
extends DJICameraKey {
    public static final DJIKeyInfo<CameraMode> KeyCameraMode = new KeyCameraMode().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<List<CameraMode>> KeyCameraModeRange = new KeyCameraModeRange().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<ZoomRatiosRange> KeyCameraZoomRatiosRange = new KeyCameraZoomRatiosRange().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Double> KeyCameraZoomRatios = new KeyCameraZoomRatios().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Integer> KeyCameraZoomFocalLength = new KeyCameraZoomFocalLength().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Double> KeyThermalZoomRatios = new KeyThermalZoomRatios().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Integer> KeyThermalFocalLength = new KeyThermalFocalLength().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<CameraStorageInfos> KeyCameraStorageInfos = new KeyCameraStorageInfo().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<CameraType> KeyCameraType = new KeyCameraType().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<List<CameraVideoStreamSourceType>> KeyCameraVideoStreamSourceRange = new KeyCameraVideoStreamSourceRange().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<CameraVideoStreamSourceType> KeyCameraVideoStreamSource = new KeyCameraVideoStreamSource().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<DoublePoint2D> KeySpotMeteringPoint = new KeySpotMeteringPoint().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<DoubleRect> KeyRegionMeteringArea = new KeyRegionMeteringArea().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<ZoomRatiosRange> KeyThermalZoomRatiosRange = new KeyThermalZoomRatiosRange().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<MultiSpectralDisplayMode> KeyMultiSpectralDisplayMode = new KeyMultiSpectralDisplayMode().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<CameraStreamSettingsInfo> KeyCaptureCameraStreamSettings = new KeyCaptureCameraStreamSettings().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<CameraStreamSettingsInfo> KeyRecordCameraStreamSettings = new KeyRecordCameraStreamSettings().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<PhotoRatio> KeyPhotoRatio = new KeyPhotoRatio().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<PhotoSize> KeyPhotoSize = new KeyPhotoSize().canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);

    public static List<DJIKeyInfo<?>> getKeyList() {
        return null;
    }

    static {
        keyList.add(KeyCameraMode);
        keyList.add(KeyCameraModeRange);
        keyList.add(KeyCameraZoomRatios);
        keyList.add(KeyCameraZoomFocalLength);
        keyList.add(KeyThermalZoomRatios);
        keyList.add(KeyThermalFocalLength);
        keyList.add(KeyCameraStorageInfos);
        keyList.add(KeyCameraType);
        keyList.add(KeyCameraVideoStreamSourceRange);
        keyList.add(KeyCameraVideoStreamSource);
        keyList.add(KeySpotMeteringPoint);
        keyList.add(KeyRegionMeteringArea);
        keyList.add(KeyCameraZoomRatiosRange);
        keyList.add(KeyThermalZoomRatiosRange);
        keyList.add(KeyMultiSpectralDisplayMode);
        keyList.add(KeyCaptureCameraStreamSettings);
        keyList.add(KeyRecordCameraStreamSettings);
        keyList.add(KeyPhotoRatio);
        keyList.add(KeyPhotoSize);
    }
}

