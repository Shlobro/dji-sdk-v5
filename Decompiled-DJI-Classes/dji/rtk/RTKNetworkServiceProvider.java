/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.rtk;

import android.content.Context;
import dji.rtk.CoordinateSystem;
import dji.rtk.RTKNetworkServiceImplPM430;
import dji.rtk.callback.NetworkServiceState;
import dji.rtk.callback.RTKCoordinateSystemCallback;
import dji.rtk.callback.RTKNetworkServiceRTKParamCallback;
import dji.rtk.qx.QxRtkDssInfo;
import dji.sdk.common.DJIErrorCodeCallback;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.rtkbasestation.RTKBaseStationType;
import dji.sdk.keyvalue.value.rtkbasestation.RTKCustomNetworkSetting;
import dji.sdk.keyvalue.value.rtkbasestation.RTKDPSNetworkConfig;
import dji.sdk.keyvalue.value.rtkbasestation.RTKNetworkServicePlanType;
import dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource;
import dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState;
import java.util.List;

public class RTKNetworkServiceProvider {
    private static final String TAG = "[RTKNetworkServiceProvider]";
    private RTKNetworkServiceImplPM430 rtkService;
    private QxRtkDssInfo qxDssInfo;
    private boolean isRCUserIdSet;
    private RTKReferenceStationSource rtkSource;
    private RTKServiceState currentState;
    private CoordinateSystem currentCoordinateSystem;
    public static String DPS_IP = "dps.djiservice.org";
    public static String DPS_IP_TEST = "ag-rtk.aasky.net";
    public static int DPS_PORT = 32102;
    public static String DPS_MOUNTPOINT = "RTCM32_GGB";
    private RTKBaseStationType baseStationType;
    private List<NetworkServiceState.StateCallback> stateCallbackInfoList;

    public static synchronized RTKNetworkServiceProvider getInstance(RTKBaseStationType rTKBaseStationType) {
        return null;
    }

    public static synchronized RTKNetworkServiceProvider getInstance() {
        return null;
    }

    private RTKNetworkServiceProvider(RTKBaseStationType rTKBaseStationType) {
    }

    public void initRTKNetworkService(String string2) {
    }

    public void setCustomNetworkSettings(RTKCustomNetworkSetting rTKCustomNetworkSetting) {
    }

    public RTKCustomNetworkSetting getCustomNetworkSettings() {
        return null;
    }

    public void setDPSNetworkSettings(RTKDPSNetworkConfig rTKDPSNetworkConfig, DJIErrorCodeCallback dJIErrorCodeCallback) {
    }

    public RTKDPSNetworkConfig getDPSNetworkSettings() {
        return null;
    }

    public void setNetworkUserIdForRTKEncRequest(String string2) {
    }

    public boolean isRCUserIdSet() {
        return false;
    }

    public QxRtkDssInfo getQxNetworkDss() {
        return null;
    }

    public void startQxNetworkService(QxRtkDssInfo qxRtkDssInfo, DJIErrorCodeCallback dJIErrorCodeCallback, CoordinateSystem coordinateSystem, Context context) {
    }

    public void startQxNetworkService(QxRtkDssInfo qxRtkDssInfo, DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    public void startSharedNetworkRtkService(DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    public void startSharedNetworkService(DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    private void freeSharedRtkAccessInfo() {
    }

    public void startNetworkRtkService(DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    public void startNetworkService(DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    private void startInnerNetworkService(DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    public void stopNetworkService(DJIErrorCodeCallback dJIErrorCodeCallback) {
    }

    public void addNetworkServiceStateCallback(NetworkServiceState.StateCallback stateCallback) {
    }

    public void removeNetworkServiceStateCallback(NetworkServiceState.StateCallback stateCallback) {
    }

    public void purchaseNetworkServicePlan(RTKNetworkServiceRTKParamCallback rTKNetworkServiceRTKParamCallback, Context context) {
    }

    public void renewNetworkServicePlan(RTKNetworkServiceRTKParamCallback rTKNetworkServiceRTKParamCallback, Context context) {
    }

    public void activateNetworkService(RTKNetworkServicePlanType rTKNetworkServicePlanType, RTKNetworkServiceRTKParamCallback rTKNetworkServiceRTKParamCallback, Context context) {
    }

    public void setNetworkServiceCoordinateSystem(CoordinateSystem coordinateSystem, DJIErrorCodeCallback dJIErrorCodeCallback) {
    }

    public void getNetworkServiceCoordinateSystem(RTKCoordinateSystemCallback rTKCoordinateSystemCallback) {
    }

    private boolean isCustomNetworkSettingsInvalid(RTKCustomNetworkSetting rTKCustomNetworkSetting) {
        return false;
    }

    private boolean isDpsNetworkSettingsInvalid(RTKDPSNetworkConfig rTKDPSNetworkConfig) {
        return false;
    }

    private /* synthetic */ void lambda$removeNetworkServiceStateCallback$2(NetworkServiceState.StateCallback stateCallback) {
    }

    private /* synthetic */ void lambda$addNetworkServiceStateCallback$1(NetworkServiceState.StateCallback stateCallback) {
    }

    private /* synthetic */ void lambda$startSharedNetworkRtkService$0(DJIErrorCodeCallback dJIErrorCodeCallback, DJIErrorCode dJIErrorCode) {
    }

    /* synthetic */ RTKNetworkServiceProvider(RTKBaseStationType rTKBaseStationType, 1 var2_2) {
    }

    static /* synthetic */ RTKReferenceStationSource access$100(RTKNetworkServiceProvider rTKNetworkServiceProvider) {
        return null;
    }

    static /* synthetic */ List access$200(RTKNetworkServiceProvider rTKNetworkServiceProvider) {
        return null;
    }

    static /* synthetic */ RTKServiceState access$302(RTKNetworkServiceProvider rTKNetworkServiceProvider, RTKServiceState rTKServiceState) {
        return null;
    }

    static /* synthetic */ RTKReferenceStationSource access$102(RTKNetworkServiceProvider rTKNetworkServiceProvider, RTKReferenceStationSource rTKReferenceStationSource) {
        return null;
    }

    static /* synthetic */ boolean access$402(RTKNetworkServiceProvider rTKNetworkServiceProvider, boolean bl) {
        return false;
    }

    static /* synthetic */ RTKBaseStationType access$500(RTKNetworkServiceProvider rTKNetworkServiceProvider) {
        return null;
    }

    static /* synthetic */ QxRtkDssInfo access$602(RTKNetworkServiceProvider rTKNetworkServiceProvider, QxRtkDssInfo qxRtkDssInfo) {
        return null;
    }

    static /* synthetic */ void access$700(RTKNetworkServiceProvider rTKNetworkServiceProvider, DJIErrorCodeCallback dJIErrorCodeCallback, Context context) {
    }

    private static class Holder {
        static RTKNetworkServiceProvider RC_DOCK_INSTANCE = new RTKNetworkServiceProvider(RTKBaseStationType.RC_OR_DOCK, null);
        static RTKNetworkServiceProvider RELAY_INSTANCE = new RTKNetworkServiceProvider(RTKBaseStationType.RELAY, null);

        private Holder() {
        }
    }
}

