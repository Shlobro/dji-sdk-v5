/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  io.reactivex.rxjava3.disposables.CompositeDisposable
 */
package dji.v5.manager.aircraft.perception.radar;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.flightassistant.PerceptionInformation;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.perception.data.ObstacleData;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;
import dji.v5.manager.aircraft.perception.listener.ObstacleDataListener;
import dji.v5.manager.aircraft.perception.radar.RadarInformation;
import dji.v5.manager.aircraft.perception.radar.RadarInformationListener;
import dji.v5.manager.interfaces.IRadarManager;
import dji.v5.utils.common.LogUtils;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class RadarManager
implements IRadarManager {
    public static final String TAG = LogUtils.getTag("RadarManager");
    private List<ObstacleDataListener> mObstacleDataListeners;
    private List<RadarInformationListener> mRadarInformationListeners;
    public ObstacleData mObstacleData;
    public RadarInformation mRadarInformation;
    private final AtomicBoolean mIsInit;
    public CompositeDisposable mDisposable;
    private DJIAnalyticsPerformHelper analyticsPerformHelper;

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
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
    public void addRadarInformationListener(RadarInformationListener radarInformationListener) {
    }

    @Override
    public void removeRadarInformationListener(RadarInformationListener radarInformationListener) {
    }

    @Override
    public void clearAllRadarInformationListener() {
    }

    @Override
    public void setObstacleAvoidanceEnabled(boolean bl, @NonNull PerceptionDirection perceptionDirection, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceEnabled(@NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    private void notifyObstacleData() {
    }

    private void notifyRadarInformation() {
    }

    private void observerObstacleAvoidanceEnabled() {
    }

    private void setObstacleAvoidanceEnabledInner(boolean bl, @NonNull PerceptionDirection perceptionDirection, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private /* synthetic */ void lambda$observerObstacleAvoidanceEnabled$3(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observerObstacleAvoidanceEnabled$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observerObstacleAvoidanceEnabled$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ Boolean lambda$init$0(Boolean bl, PerceptionInformation perceptionInformation) throws Throwable {
        return null;
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$000(RadarManager radarManager) {
        return null;
    }
}

