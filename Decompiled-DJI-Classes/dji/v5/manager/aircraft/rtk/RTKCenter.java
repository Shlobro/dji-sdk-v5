/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.aircraft.rtk;

import android.os.Handler;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKError;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKHeading;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKLocation;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKSatelliteInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.rtk.network.CMCCRTKManager;
import dji.v5.inner.aircraft.rtk.network.CustomNetworkRTKManager;
import dji.v5.inner.aircraft.rtk.network.QXRTKManager;
import dji.v5.inner.aircraft.rtk.station.RTKStationManager;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.rtk.RTKBaseListener;
import dji.v5.manager.aircraft.rtk.RTKLocationInfo;
import dji.v5.manager.aircraft.rtk.RTKLocationInfoListener;
import dji.v5.manager.aircraft.rtk.RTKSystemState;
import dji.v5.manager.aircraft.rtk.RTKSystemStateListener;
import dji.v5.manager.interfaces.INetworkRTKManager;
import dji.v5.manager.interfaces.IRTKCenter;
import dji.v5.manager.interfaces.IRTKStationManager;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class RTKCenter
implements IRTKCenter {
    private final Handler handle;
    private final QXRTKManager qxRTKManager;
    private final CustomNetworkRTKManager customNetworkRTKManager;
    private final RTKStationManager rtkStationManager;
    private final CMCCRTKManager cmccrtkManager;
    private final List<RTKLocationInfoListener> rtkLocationInfoListenerList;
    private final List<RTKSystemStateListener> rtkSystemStateListenerList;
    private final RTKLocationInfo rtkLocationInfoCache;
    private final RTKSystemState rtkSystemStateCache;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;

    public static IRTKCenter getInstance() {
        return null;
    }

    private RTKCenter() {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public INetworkRTKManager getQXRTKManager() {
        return null;
    }

    @Override
    public INetworkRTKManager getCustomRTKManager() {
        return null;
    }

    @Override
    public INetworkRTKManager getCMCCRTKManager() {
        return null;
    }

    @Override
    public IRTKStationManager getRTKStationManager() {
        return null;
    }

    @Override
    public void setAircraftRTKModuleEnabled(boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getAircraftRTKModuleEnabled(CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setRTKReferenceStationSource", category="ManagerAnnotation")
    public void setRTKReferenceStationSource(@TrackElements(value="source") RTKReferenceStationSource rTKReferenceStationSource, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getRTKReferenceStationSource(CommonCallbacks.CompletionCallbackWithParam<RTKReferenceStationSource> completionCallbackWithParam) {
    }

    @Override
    public void addRTKLocationInfoListener(RTKLocationInfoListener rTKLocationInfoListener) {
    }

    @Override
    public void removeRTKLocationInfoListener(RTKLocationInfoListener rTKLocationInfoListener) {
    }

    @Override
    public void addRTKSystemStateListener(RTKSystemStateListener rTKSystemStateListener) {
    }

    @Override
    public void removeRTKSystemStateListener(RTKSystemStateListener rTKSystemStateListener) {
    }

    @Override
    public void clearAllRTKLocationInfoListener() {
    }

    @Override
    public void clearAllRTKSystemStateListener() {
    }

    @Override
    @TrackEvent(eventName="setRTKMaintainAccuracyEnabled", category="ManagerAnnotation")
    public void setRTKMaintainAccuracyEnabled(@TrackElements(value="enabled") boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getRTKMaintainAccuracyEnabled(CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    private void registerRTKLocationInfoListener() {
    }

    private void registerRTKSystemStateListener() {
    }

    private void registerRTKSystemStateOtherListener() {
    }

    private void registerRTKSystemStateEnableListener() {
    }

    private <R, T extends RTKBaseListener<R>> void notifyListener(List<T> list, R r) {
    }

    private void updateRtkSourceStatus(RTKReferenceStationSource rTKReferenceStationSource) {
    }

    private /* synthetic */ void lambda$registerRTKSystemStateEnableListener$11(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$registerRTKSystemStateEnableListener$10(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$registerRTKSystemStateEnableListener$9(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$registerRTKSystemStateEnableListener$8(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$registerRTKSystemStateOtherListener$7(RTKReferenceStationSource rTKReferenceStationSource, RTKReferenceStationSource rTKReferenceStationSource2) {
    }

    private /* synthetic */ void lambda$registerRTKSystemStateOtherListener$6(RTKError rTKError, RTKError rTKError2) {
    }

    private /* synthetic */ void lambda$registerRTKSystemStateOtherListener$5(RTKSatelliteInfo rTKSatelliteInfo, RTKSatelliteInfo rTKSatelliteInfo2) {
    }

    private /* synthetic */ void lambda$registerRTKLocationInfoListener$4(LocationCoordinate3D locationCoordinate3D, LocationCoordinate3D locationCoordinate3D2) {
    }

    private /* synthetic */ void lambda$registerRTKLocationInfoListener$3(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$registerRTKLocationInfoListener$2(RTKHeading rTKHeading, RTKHeading rTKHeading2) {
    }

    private /* synthetic */ void lambda$registerRTKLocationInfoListener$1(RTKLocation rTKLocation, RTKLocation rTKLocation2) {
    }

    private /* synthetic */ void lambda$getAircraftRTKModuleEnabled$0(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam) {
    }

    /* synthetic */ RTKCenter(1 var1_1) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$200(RTKCenter rTKCenter) {
        return null;
    }

    static {
        RTKCenter.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final RTKCenter INSTANCE = new RTKCenter(null);

        private LazyHolder() {
        }

        static /* synthetic */ RTKCenter access$000() {
            return null;
        }
    }
}

