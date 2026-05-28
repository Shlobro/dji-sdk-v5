/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.inner.aircraft.rtk.station;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkbasestation.RTKBaseStationBatteryState;
import dji.sdk.keyvalue.value.rtkbasestation.RTKBaseStationResetPasswordInfo;
import dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState;
import dji.sdk.keyvalue.value.rtkbasestation.RTKStationInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.rtk.RTKBaseListener;
import dji.v5.manager.aircraft.rtk.RTKLocationInfo;
import dji.v5.manager.aircraft.rtk.station.ConnectedRTKStationInfo;
import dji.v5.manager.aircraft.rtk.station.ConnectedRTKStationInfoListener;
import dji.v5.manager.aircraft.rtk.station.RTKStationConnectStatusListener;
import dji.v5.manager.aircraft.rtk.station.SearchRTKStationListener;
import dji.v5.manager.interfaces.IRTKStationManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.aspectj.lang.JoinPoint;

public class RTKStationManager
implements IRTKStationManager {
    public static final String TAG = "RTKStationManager";
    private final List<SearchRTKStationListener> searchStationListenerList;
    private final List<RTKStationConnectStatusListener> stationConnectStatusListeners;
    private final List<ConnectedRTKStationInfoListener> connectedStationInfoListenerList;
    private DJIAnalyticsPerformHelper analyticsPerformHelper;
    private final AtomicBoolean isInit;
    private ConnectedRTKStationInfo connectInfoCache;
    private RTKStationConnetState currentConnectState;
    private int connectedStationId;
    private boolean isConnecting;
    private RTKLocationInfo rtkLocationInfo;
    private int MAX_DISTANCE;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;

    @Override
    public void init() {
    }

    @Override
    @TrackEvent(eventName="startSearchRTKStation", category="ManagerAnnotation")
    public void startSearchRTKStation(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopSearchRTKStation", category="ManagerAnnotation")
    public void stopSearchRTKStation(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startConnectToRTKStation(int n, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addSearchRTKStationListener(@NonNull SearchRTKStationListener searchRTKStationListener) {
    }

    @Override
    public void removeSearchRTKStationListener(@NonNull SearchRTKStationListener searchRTKStationListener) {
    }

    @Override
    public void addRTKStationConnectStatusListener(@NonNull RTKStationConnectStatusListener rTKStationConnectStatusListener) {
    }

    @Override
    public void removeRTKStationConnectStatusListener(@NonNull RTKStationConnectStatusListener rTKStationConnectStatusListener) {
    }

    @Override
    public void addConnectedRTKStationInfoListener(@NonNull ConnectedRTKStationInfoListener connectedRTKStationInfoListener) {
    }

    @Override
    public void removeConnectedRTKStationInfoListener(@NonNull ConnectedRTKStationInfoListener connectedRTKStationInfoListener) {
    }

    @Override
    @TrackEvent(eventName="loginRTKStation", category="ManagerAnnotation")
    public void loginRTKStation(@TrackElements(value="password") String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="setRTKStationReferencePosition", category="ManagerAnnotation")
    public void setRTKStationReferencePosition(@TrackElements(value="locationCoordinate3D") LocationCoordinate3D locationCoordinate3D, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getRTKStationReferencePosition(@NonNull CommonCallbacks.CompletionCallbackWithParam<LocationCoordinate3D> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="resetRTKStationReferencePosition", category="ManagerAnnotation")
    public void resetRTKStationReferencePosition(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="resetRTKStationPassword", category="ManagerAnnotation")
    public void resetRTKStationPassword(@TrackElements(value="passwordInfo") RTKBaseStationResetPasswordInfo rTKBaseStationResetPasswordInfo, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="setRTKStationName", category="ManagerAnnotation")
    public void setRTKStationName(@TrackElements(value="name") String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void clearAllConnectedRTKStationInfoListener() {
    }

    @Override
    public void clearAllSearchRTKStationListener() {
    }

    @Override
    public void clearAllRTKStationConnectStatusListener() {
    }

    private void observeConnectStatus() {
    }

    private void observeSearchStation() {
    }

    private void obServeStationConnectedInfo() {
    }

    private void updateStationBatteryState(RTKBaseStationBatteryState rTKBaseStationBatteryState) {
    }

    private ConnectedRTKStationInfo updateStationConnectInfo(RTKStationInfo rTKStationInfo) {
        return null;
    }

    private <R, T extends RTKBaseListener<R>> void notifyListener(List<T> list, R r) {
    }

    private /* synthetic */ void lambda$obServeStationConnectedInfo$4(RTKStationInfo rTKStationInfo, RTKStationInfo rTKStationInfo2) {
    }

    private /* synthetic */ void lambda$obServeStationConnectedInfo$3(RTKBaseStationBatteryState rTKBaseStationBatteryState, RTKBaseStationBatteryState rTKBaseStationBatteryState2) {
    }

    private /* synthetic */ void lambda$observeSearchStation$2(List list, List list2) {
    }

    private /* synthetic */ void lambda$observeConnectStatus$1(RTKStationConnetState rTKStationConnetState, RTKStationConnetState rTKStationConnetState2) {
    }

    private /* synthetic */ void lambda$init$0(RTKLocationInfo rTKLocationInfo) {
    }

    static /* synthetic */ boolean access$002(RTKStationManager rTKStationManager, boolean bl) {
        return false;
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$100(RTKStationManager rTKStationManager) {
        return null;
    }

    static {
        RTKStationManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }
}

