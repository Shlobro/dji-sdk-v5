/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.analytics.helper;

import dji.sdk.keyvalue.key.AirLinkKey;
import dji.sdk.keyvalue.key.CameraKey;
import dji.sdk.keyvalue.key.FlightAssistantKey;
import dji.sdk.keyvalue.key.FlightControllerKey;
import dji.sdk.keyvalue.key.OnboardKey;
import dji.sdk.keyvalue.key.PayloadKey;
import dji.sdk.keyvalue.key.RemoteControllerKey;
import dji.sdk.keyvalue.key.RtkBaseStationKey;
import dji.sdk.keyvalue.key.RtkMobileStationKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DJIAnalyticsFilterHelper {
    private static final String[] BLACK_LIST = new String[]{FlightControllerKey.KeySendVirtualStickFlightControlData.getIdentifier(), AirLinkKey.KeyM300RTKRequestIFrame.getIdentifier(), AirLinkKey.KeyChannelCodecFormat.getIdentifier(), AirLinkKey.KeyManageSDRSource.getIdentifier(), FlightControllerKey.KeyFCUUIDSetting.getIdentifier(), FlightControllerKey.KeyCECountryType.getIdentifier(), FlightControllerKey.KeyIsLandingConfirmationNeeded.getIdentifier(), AirLinkKey.KeyReadWlmDongleSubscribeInfo.getIdentifier(), RemoteControllerKey.KeyRcAppWorkStage.getIdentifier(), AirLinkKey.KeyReportWlmAgentFreqInfo.getIdentifier(), FlightControllerKey.KeySdrLostPreventNeverTakeoffEnable.getIdentifier(), FlightControllerKey.KeySdrLostPreventHasTakeoffEnable.getIdentifier(), AirLinkKey.KeyLTENetInfo.getIdentifier(), CameraKey.KeyCameraHybridZoomFocalLength.getIdentifier(), AirLinkKey.KeyWlmLinkMode.getIdentifier(), RtkMobileStationKey.KeyRTKEnable.getIdentifier(), RtkBaseStationKey.KeyRTKReferenceStationSource.getIdentifier(), OnboardKey.KeyAppSystemInfo.getIdentifier(), PayloadKey.KeyAppSystemInfo.getIdentifier(), RemoteControllerKey.KeyRecordShutterButtonEnable.getIdentifier(), FlightAssistantKey.KeyLandingProtectionEnabled.getIdentifier(), RtkMobileStationKey.KeyRTKKeepStatusEnable.getIdentifier(), RemoteControllerKey.KeyRcAppWorkStage.getIdentifier(), FlightAssistantKey.KeyOmniHorizontalObstacleAvoidanceEnabled.getIdentifier(), FlightAssistantKey.KeyOmniUpwardsObstacleAvoidanceEnabled.getIdentifier(), FlightAssistantKey.KeyRadarUpwardsObstacleAvoidanceEnabled.getIdentifier(), FlightAssistantKey.KeyRadarHorizontalObstacleAvoidanceEnabled.getIdentifier(), FlightAssistantKey.KeyActiveObstacleAvoidanceEnabled.getIdentifier(), AirLinkKey.KeyAreaCodeFromGround.getIdentifier(), FlightControllerKey.KeyObstacleActionType.getIdentifier(), FlightControllerKey.KeyHoveringPositionMode.getIdentifier(), FlightControllerKey.KeyAircraftAutoHoverMode.getIdentifier()};
    private static final List<String> blackList = new ArrayList<String>(Arrays.asList(BLACK_LIST));
    private static final Map<String, Long> timestampMap = new ConcurrentHashMap<String, Long>();

    private DJIAnalyticsFilterHelper() {
    }

    public static boolean isInBlackList(String string) {
        return false;
    }

    public static boolean shouldTrackEvent(String string) {
        return false;
    }
}

