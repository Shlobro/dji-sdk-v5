/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.CallSuper
 *  androidx.annotation.NonNull
 *  io.reactivex.rxjava3.disposables.CompositeDisposable
 */
package dji.v5.inner.aircraft.perception;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.utils.ProductUtil;
import dji.sdk.keyvalue.value.flightassistant.OmnidirectionalObstacleAvoidanceStatus;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import dji.v5.manager.aircraft.perception.data.ObstacleData;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;
import dji.v5.manager.aircraft.perception.data.PerceptionInfo;
import dji.v5.manager.aircraft.perception.listener.ObstacleDataListener;
import dji.v5.manager.aircraft.perception.listener.PerceptionInformationListener;
import dji.v5.manager.aircraft.perception.radar.RadarInformation;
import dji.v5.manager.interfaces.IPerceptionManager;
import dji.v5.manager.interfaces.IRadarManager;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BasePerceptionDelegate
implements IPerceptionManager {
    private final IRadarManager radarManager;
    private final AtomicBoolean mIsInit;
    public CompositeDisposable mDisposable;
    private final List<PerceptionInformationListener> perceptionInformationListenerList;
    protected PerceptionInfo mPerceptionInfo;
    protected RadarInformation mRadarInformation;
    protected ProductType mProductType;
    protected List<ObstacleDataListener> mObstacleDataListeners;
    protected ObstacleData mObstacleData;

    @Override
    public void init() {
    }

    protected void updateOverallObstacleAvoidanceEnable() {
    }

    @CallSuper
    protected void observerPerceptionMapInformation() {
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
    public void setObstacleAvoidanceType(ObstacleAvoidanceType obstacleAvoidanceType, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
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
    public void setObstacleAvoidanceWarningDistance(double d2, @NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceWarningDistance(@NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallbackWithParam<Double> completionCallbackWithParam) {
    }

    @Override
    public void setObstacleAvoidanceBrakingDistance(double d2, @NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceBrakingDistance(@NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallbackWithParam<Double> completionCallbackWithParam) {
    }

    @Override
    public void setVisionPositioningEnabled(boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getVisionPositioningEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    public void setPrecisionLandingEnabled(boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
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

    protected void observeOtherListener() {
    }

    public ProductUtil.MachineType getMachineType() {
        return null;
    }

    @Override
    public IRadarManager getRadarManager() {
        return null;
    }

    protected void notifyObstacleData() {
    }

    public void updatePerceptionInfo(PerceptionInfo perceptionInfo) {
    }

    private void observerObstacleAvoidanceEnabled() {
    }

    private void observerAvoidanceDistance() {
    }

    private void observerRadarWarningDistance() {
    }

    private void obServerPerceptionEnable() {
    }

    protected void setAllObstacleEnableStatus(boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    protected void setObstacleAvoidanceEnabledForDirection(boolean bl, @NonNull PerceptionDirection perceptionDirection, CommonCallbacks.CompletionCallback completionCallback) {
    }

    protected DJIKey<Boolean> getUpwardsAvoidanceEnableKey() {
        return null;
    }

    protected DJIKey<Boolean> getHorizontalAvoidanceEnableKey() {
        return null;
    }

    private static /* synthetic */ void lambda$setAllObstacleEnableStatus$17(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$setAllObstacleEnableStatus$16(boolean bl, CommonCallbacks.CompletionCallback completionCallback) throws Throwable {
    }

    private static /* synthetic */ void lambda$setAllObstacleEnableStatus$15(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$setAllObstacleEnableStatus$14(boolean bl, CommonCallbacks.CompletionCallback completionCallback) throws Throwable {
    }

    private /* synthetic */ void lambda$obServerPerceptionEnable$13(ProductType productType, ProductType productType2) {
    }

    private /* synthetic */ void lambda$obServerPerceptionEnable$12(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$obServerPerceptionEnable$11(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observerRadarWarningDistance$10(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$observerRadarWarningDistance$9(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$observerRadarWarningDistance$8(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$observerAvoidanceDistance$7(Integer n, Integer n2) {
    }

    private /* synthetic */ void lambda$observerAvoidanceDistance$6(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$observerAvoidanceDistance$5(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$observerObstacleAvoidanceEnabled$4(RadarInformation radarInformation) {
    }

    private /* synthetic */ void lambda$observerObstacleAvoidanceEnabled$3(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observerObstacleAvoidanceEnabled$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observerObstacleAvoidanceEnabled$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$0(OmnidirectionalObstacleAvoidanceStatus omnidirectionalObstacleAvoidanceStatus) throws Throwable {
    }
}

