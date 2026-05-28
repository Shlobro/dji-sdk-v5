/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.key;

import dji.sdk.keyvalue.converter.DJIValueConverter;
import dji.sdk.keyvalue.converter.EmptyValueConverter;
import dji.sdk.keyvalue.converter.SingleValueConverter;
import dji.sdk.keyvalue.key.ComponentType;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.key.SubComponentType;
import dji.sdk.keyvalue.value.accessory.PlayingAudioFileInfo;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioDataPack;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioDataSendingResult;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioDataSendingResultMsg;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioDeleteFilesInfo;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioFileInfo;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioFileList;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioFileUploadingInfo;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioFilesIndexes;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioSendingState;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioSendingStateMsg;
import dji.sdk.keyvalue.value.accessory.SpeakerFileRenameInfo;
import dji.sdk.keyvalue.value.accessory.SpeakerPlayModeType;
import dji.sdk.keyvalue.value.accessory.SpeakerPlayModeTypeMsg;
import dji.sdk.keyvalue.value.common.CalibrationFileStatus;
import dji.sdk.keyvalue.value.common.CalibrationFileStatusMsg;
import dji.sdk.keyvalue.value.common.CalibrationFileUpdatingInfo;
import dji.sdk.keyvalue.value.common.CommonFileUpdatingInfo;
import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.sdk.keyvalue.value.common.IntMinMax;
import dji.sdk.keyvalue.value.common.SelfDiagnosticCapability;
import dji.sdk.keyvalue.value.common.SelfDiagnosticCapabilityMsg;
import dji.sdk.keyvalue.value.common.SelfDiagnosticErrorCode;
import dji.sdk.keyvalue.value.common.SelfDiagnosticErrorCodeMsg;
import dji.sdk.keyvalue.value.common.SelfDiagnosticInfo;
import dji.sdk.keyvalue.value.common.SelfDiagnosticPartsInfo;
import dji.sdk.keyvalue.value.common.SelfDiagnosticProgress;
import dji.sdk.keyvalue.value.common.SelfDiagnosticRequestInfo;
import dji.sdk.keyvalue.value.common.UpgradeNotifyInfo;
import java.util.ArrayList;
import java.util.List;

public class DJISpeakerKey {
    protected static final List<DJIKeyInfo<?>> keyList = new ArrayList();
    private static final ComponentType componentType = ComponentType.ACCESSORY;
    private static final SubComponentType subComponentType = SubComponentType.SPEAKER;
    public static final DJIKeyInfo<Integer> KeyVolume = new DJIKeyInfo(componentType.value(), subComponentType.value(), "Volume", SingleValueConverter.IntegerConverter).canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<IntMinMax> KeyVolumeRange = new DJIKeyInfo(componentType.value(), subComponentType.value(), "VolumeRange", new DJIValueConverter<IntMinMax>(IntMinMax.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<SpeakerPlayModeType> KeySpeakerPlayMode = new DJIKeyInfo<SpeakerPlayModeType>(componentType.value(), subComponentType.value(), "SpeakerPlayMode", new SingleValueConverter<SpeakerPlayModeType, SpeakerPlayModeTypeMsg>(SpeakerPlayModeType.class, SpeakerPlayModeTypeMsg.class)).canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<PlayingAudioFileInfo> KeyPlayingAudioFileInfo = new DJIKeyInfo(componentType.value(), subComponentType.value(), "PlayingAudioFileInfo", new DJIValueConverter<PlayingAudioFileInfo>(PlayingAudioFileInfo.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<Integer, EmptyMsg> KeyPlayAudio = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "PlayAudio", SingleValueConverter.IntegerConverter, EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<EmptyMsg, EmptyMsg> KeyStopAudio = new DJIActionKeyInfo<EmptyMsg, EmptyMsg>(componentType.value(), subComponentType.value(), "StopAudio", EmptyValueConverter.converter, EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<SpeakerFileRenameInfo, EmptyMsg> KeyFileRename = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "FileRename", new DJIValueConverter<SpeakerFileRenameInfo>(SpeakerFileRenameInfo.class), EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<SpeakerAudioFileUploadingInfo, EmptyMsg> KeySendAudioFile = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "SendAudioFile", new DJIValueConverter<SpeakerAudioFileUploadingInfo>(SpeakerAudioFileUploadingInfo.class), EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<SpeakerAudioFileUploadingInfo, EmptyMsg> KeyPrepareSendAudioData = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "PrepareSendAudioData", new DJIValueConverter<SpeakerAudioFileUploadingInfo>(SpeakerAudioFileUploadingInfo.class), EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<SpeakerAudioDataPack, SpeakerAudioDataSendingResult> KeyDoSendAudioData = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "DoSendAudioData", new DJIValueConverter<SpeakerAudioDataPack>(SpeakerAudioDataPack.class), new SingleValueConverter<SpeakerAudioDataSendingResult, SpeakerAudioDataSendingResultMsg>(SpeakerAudioDataSendingResult.class, SpeakerAudioDataSendingResultMsg.class)).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<SpeakerAudioSendingState> KeySpeakerAudioSendingState = new DJIKeyInfo<SpeakerAudioSendingState>(componentType.value(), subComponentType.value(), "SpeakerAudioSendingState", new SingleValueConverter<SpeakerAudioSendingState, SpeakerAudioSendingStateMsg>(SpeakerAudioSendingState.class, SpeakerAudioSendingStateMsg.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Integer> KeySendAudioFileProgress = new DJIKeyInfo(componentType.value(), subComponentType.value(), "SendAudioFileProgress", SingleValueConverter.IntegerConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Integer> KeySendAudioFileIndex = new DJIKeyInfo(componentType.value(), subComponentType.value(), "SendAudioFileIndex", SingleValueConverter.IntegerConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<List<SpeakerAudioFileInfo>> KeyAudioFileList = new DJIKeyInfo<List>(componentType.value(), subComponentType.value(), "AudioFileList", new SingleValueConverter<List, SpeakerAudioFileList>(List.class, SpeakerAudioFileList.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<SpeakerAudioDeleteFilesInfo, List<Integer>> KeyDeleteAudioFiles = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "DeleteAudioFiles", new DJIValueConverter<SpeakerAudioDeleteFilesInfo>(SpeakerAudioDeleteFilesInfo.class), new SingleValueConverter<List, SpeakerAudioFilesIndexes>(List.class, SpeakerAudioFilesIndexes.class)).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<Integer> KeyDeviceID = new DJIKeyInfo(componentType.value(), subComponentType.value(), "DeviceID", SingleValueConverter.IntegerConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Boolean> KeyConnection = new DJIKeyInfo(componentType.value(), subComponentType.value(), "Connection", SingleValueConverter.BooleanConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<String, EmptyMsg> KeyForceUpdateCacheValue = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "ForceUpdateCacheValue", SingleValueConverter.StringConverter, EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<CalibrationFileStatus> KeyCalibrationFileStatus = new DJIKeyInfo<CalibrationFileStatus>(componentType.value(), subComponentType.value(), "CalibrationFileStatus", new SingleValueConverter<CalibrationFileStatus, CalibrationFileStatusMsg>(CalibrationFileStatus.class, CalibrationFileStatusMsg.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<CalibrationFileUpdatingInfo> KeyCalibrationFileUpdatingInfo = new DJIKeyInfo(componentType.value(), subComponentType.value(), "CalibrationFileUpdatingInfo", new DJIValueConverter<CalibrationFileUpdatingInfo>(CalibrationFileUpdatingInfo.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<String, EmptyMsg> KeyUpdateCalibrationFile = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "UpdateCalibrationFile", SingleValueConverter.StringConverter, EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<UpgradeNotifyInfo> KeyUpgradeNotifyInfo = new DJIKeyInfo(componentType.value(), subComponentType.value(), "UpgradeNotifyInfo", new DJIValueConverter<UpgradeNotifyInfo>(UpgradeNotifyInfo.class)).canGet(false).canSet(true).canListen(false).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Boolean> KeyEnforceUpgradeEnable = new DJIKeyInfo(componentType.value(), subComponentType.value(), "EnforceUpgradeEnable", SingleValueConverter.BooleanConverter).canGet(true).canSet(true).canListen(false).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Boolean> KeyIsInEnforceUpgradeStatus = new DJIKeyInfo(componentType.value(), subComponentType.value(), "IsInEnforceUpgradeStatus", SingleValueConverter.BooleanConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Boolean> KeyIsDirectDevice = new DJIKeyInfo(componentType.value(), subComponentType.value(), "IsDirectDevice", SingleValueConverter.BooleanConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<CommonFileUpdatingInfo> KeyCommonFileUpdatingInfo = new DJIKeyInfo(componentType.value(), subComponentType.value(), "CommonFileUpdatingInfo", new DJIValueConverter<CommonFileUpdatingInfo>(CommonFileUpdatingInfo.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<String, EmptyMsg> KeyStartCommonFileUpdate = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "StartCommonFileUpdate", SingleValueConverter.StringConverter, EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<EmptyMsg, EmptyMsg> KeyStopCommonFileUpdate = new DJIActionKeyInfo<EmptyMsg, EmptyMsg>(componentType.value(), subComponentType.value(), "StopCommonFileUpdate", EmptyValueConverter.converter, EmptyValueConverter.converter).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<SelfDiagnosticInfo, SelfDiagnosticErrorCode> KeySelfDiagnosticMode = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "SelfDiagnosticMode", new DJIValueConverter<SelfDiagnosticInfo>(SelfDiagnosticInfo.class), new SingleValueConverter<SelfDiagnosticErrorCode, SelfDiagnosticErrorCodeMsg>(SelfDiagnosticErrorCode.class, SelfDiagnosticErrorCodeMsg.class)).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<SelfDiagnosticRequestInfo, SelfDiagnosticErrorCode> KeySelfDiagnosticRequest = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "SelfDiagnosticRequest", new DJIValueConverter<SelfDiagnosticRequestInfo>(SelfDiagnosticRequestInfo.class), new SingleValueConverter<SelfDiagnosticErrorCode, SelfDiagnosticErrorCodeMsg>(SelfDiagnosticErrorCode.class, SelfDiagnosticErrorCodeMsg.class)).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIActionKeyInfo<EmptyMsg, SelfDiagnosticErrorCode> KeySelfDiagnosticCancel = new DJIActionKeyInfo<EmptyMsg, SelfDiagnosticErrorCode>(componentType.value(), subComponentType.value(), "SelfDiagnosticCancel", EmptyValueConverter.converter, new SingleValueConverter<SelfDiagnosticErrorCode, SelfDiagnosticErrorCodeMsg>(SelfDiagnosticErrorCode.class, SelfDiagnosticErrorCodeMsg.class)).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);
    public static final DJIKeyInfo<SelfDiagnosticProgress> KeySelfDiagnosticStatus = new DJIKeyInfo(componentType.value(), subComponentType.value(), "SelfDiagnosticStatus", new DJIValueConverter<SelfDiagnosticProgress>(SelfDiagnosticProgress.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIActionKeyInfo<SelfDiagnosticCapability, SelfDiagnosticPartsInfo> KeySelfDiagnosticParts = new DJIActionKeyInfo(componentType.value(), subComponentType.value(), "SelfDiagnosticParts", new SingleValueConverter<SelfDiagnosticCapability, SelfDiagnosticCapabilityMsg>(SelfDiagnosticCapability.class, SelfDiagnosticCapabilityMsg.class), new DJIValueConverter<SelfDiagnosticPartsInfo>(SelfDiagnosticPartsInfo.class)).canGet(false).canSet(false).canListen(false).canPerformAction(true).setIsEvent(false);

    static {
        keyList.add(KeyVolume);
        keyList.add(KeyVolumeRange);
        keyList.add(KeySpeakerPlayMode);
        keyList.add(KeyPlayingAudioFileInfo);
        keyList.add(KeyPlayAudio);
        keyList.add(KeyStopAudio);
        keyList.add(KeyFileRename);
        keyList.add(KeySendAudioFile);
        keyList.add(KeyPrepareSendAudioData);
        keyList.add(KeyDoSendAudioData);
        keyList.add(KeySpeakerAudioSendingState);
        keyList.add(KeySendAudioFileProgress);
        keyList.add(KeySendAudioFileIndex);
        keyList.add(KeyAudioFileList);
        keyList.add(KeyDeleteAudioFiles);
        keyList.add(KeyDeviceID);
        keyList.add(KeyConnection);
        keyList.add(KeyForceUpdateCacheValue);
        keyList.add(KeyCalibrationFileStatus);
        keyList.add(KeyCalibrationFileUpdatingInfo);
        keyList.add(KeyUpdateCalibrationFile);
        keyList.add(KeyUpgradeNotifyInfo);
        keyList.add(KeyEnforceUpgradeEnable);
        keyList.add(KeyIsInEnforceUpgradeStatus);
        keyList.add(KeyIsDirectDevice);
        keyList.add(KeyCommonFileUpdatingInfo);
        keyList.add(KeyStartCommonFileUpdate);
        keyList.add(KeyStopCommonFileUpdate);
        keyList.add(KeySelfDiagnosticMode);
        keyList.add(KeySelfDiagnosticRequest);
        keyList.add(KeySelfDiagnosticCancel);
        keyList.add(KeySelfDiagnosticStatus);
        keyList.add(KeySelfDiagnosticParts);
    }
}

