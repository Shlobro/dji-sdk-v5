/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.aircraft.perception;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.perception.BasePerceptionDelegate;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import dji.v5.manager.aircraft.perception.data.ObstacleData;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;
import dji.v5.manager.aircraft.perception.data.PerceptionInfo;
import dji.v5.manager.aircraft.perception.listener.ObstacleDataListener;
import dji.v5.manager.aircraft.perception.listener.PerceptionInformationListener;
import dji.v5.manager.interfaces.IPerceptionManager;
import dji.v5.manager.interfaces.IRadarManager;
import dji.v5.utils.common.LogUtils;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class PerceptionManager
implements IPerceptionManager {
    public static final String TAG;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private BasePerceptionDelegate delegate;
    private final List<PerceptionInformationListener> perceptionInformationListenerList;
    private PerceptionInfo perceptionInfo;
    private final List<ObstacleDataListener> obstacleDataListeners;
    public ObstacleData obstacleData;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;

    private PerceptionManager() {
    }

    public static IPerceptionManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void setOverallObstacleAvoidanceEnabled(boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getOverallObstacleAvoidanceEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setObstacleAvoidanceType", category="ManagerAnnotation")
    public void setObstacleAvoidanceType(@TrackElements(value="type") ObstacleAvoidanceType obstacleAvoidanceType, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceType(@NonNull CommonCallbacks.CompletionCallbackWithParam<ObstacleAvoidanceType> completionCallbackWithParam) {
    }

    @Override
    public void setObstacleAvoidanceEnabled(boolean bl, @NonNull PerceptionDirection perceptionDirection, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceEnabled(@NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setObstacleAvoidanceWarningDistance", category="ManagerAnnotation")
    public void setObstacleAvoidanceWarningDistance(@TrackElements(value="distance") double d2, @TrackElements(value="direction") @NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceWarningDistance(@NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallbackWithParam<Double> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setObstacleAvoidanceBrakingDistance", category="ManagerAnnotation")
    public void setObstacleAvoidanceBrakingDistance(@TrackElements(value="distance") double d2, @TrackElements(value="direction") @NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceBrakingDistance(@NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallbackWithParam<Double> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setVisionPositioningEnabled", category="ManagerAnnotation")
    public void setVisionPositioningEnabled(@TrackElements(value="isEnabled") boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getVisionPositioningEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setPrecisionLandingEnabled", category="ManagerAnnotation")
    public void setPrecisionLandingEnabled(@TrackElements(value="isEnabled") boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getPrecisionLandingEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    public void addPerceptionInformationListener(@NonNull PerceptionInformationListener perceptionInformationListener) {
    }

    @Override
    public void removePerceptionInformationListener(@NonNull PerceptionInformationListener perceptionInformationListener) {
    }

    @Override
    public void clearAllPerceptionInformationListener() {
    }

    @Override
    public void addObstacleDataListener(ObstacleDataListener obstacleDataListener) {
    }

    @Override
    public void removeObstacleDataListener(ObstacleDataListener obstacleDataListener) {
    }

    @Override
    public void clearAllObstacleDataListener() {
    }

    @Override
    public IRadarManager getRadarManager() {
        return null;
    }

    private void updatePerceptionInfo(PerceptionInfo perceptionInfo) {
    }

    private void updateObstacleData(ObstacleData obstacleData) {
    }

    private boolean updatePerceptionDelegate(ProductType productType) {
        return false;
    }

    private void initDelegate() {
    }

    private /* synthetic */ void lambda$initDelegate$2(ObstacleData obstacleData) {
    }

    private /* synthetic */ void lambda$initDelegate$1(PerceptionInfo perceptionInfo) {
    }

    private /* synthetic */ void lambda$init$0(ProductType productType, ProductType productType2) {
    }

    /* synthetic */ PerceptionManager(1 var1_1) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$200(PerceptionManager perceptionManager) {
        return null;
    }

    static {
        PerceptionManager.ajc$preClinit();
        TAG = LogUtils.getTag("PerceptionManager");
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final PerceptionManager INSTANCE = new PerceptionManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ PerceptionManager access$100() {
            return null;
        }
    }
}

