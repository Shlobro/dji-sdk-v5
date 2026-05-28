/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  io.reactivex.rxjava3.subjects.BehaviorSubject
 *  io.reactivex.rxjava3.subjects.PublishSubject
 */
package dji.v5.inner.aircraft.perception;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.utils.ProductUtil;
import dji.sdk.keyvalue.value.flightassistant.OmnidirectionalObstacleAvoidanceStatus;
import dji.sdk.keyvalue.value.flightassistant.PerceptionPushOmnidirectionalRadarStatus;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.perception.BasePerceptionDelegate;
import dji.v5.manager.aircraft.perception.ObstacleAvoidanceConfig;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;

public class IndustryPerceptionDelegate
extends BasePerceptionDelegate {
    private static final int DEFAULT_PERCEPTION_BLIND_AREA_COUNT = 4;
    private static final int DEFAULT_PERCEPTION_AREA_COUNT = 4;
    public static final int M30_PERCEPTION_BLIND_AREA_ANGLE = 26;
    public static final int M300_PERCEPTION_BLIND_AREA_ANGLE = 16;
    @NonNull
    private final PublishSubject<List<Integer>> mPerceptionPublisher;
    @NonNull
    private final BehaviorSubject<List<Integer>> mToFPublisher;
    private boolean mSupportVerticalTof;
    private int mUpPerceptionDistance;
    private int mUpTofDistance;
    private int mDownPerceptionDistance;
    private int mDownTofDistance;
    @NonNull
    private final boolean[] mVisionPerceptionEnableState;

    @Override
    public void setOverallObstacleAvoidanceEnabled(boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
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
    public void getObstacleAvoidanceEnabled(@NonNull PerceptionDirection perceptionDirection, @NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    public void setObstacleAvoidanceEnabled(boolean bl, @NonNull PerceptionDirection perceptionDirection, CommonCallbacks.CompletionCallback completionCallback) {
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
    protected void updateOverallObstacleAvoidanceEnable() {
    }

    @Override
    protected void observerPerceptionMapInformation() {
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

    private int getUpVisionDistance() {
        return 0;
    }

    private int getDownVisionDistance() {
        return 0;
    }

    protected boolean getOverallEnabled() {
        return false;
    }

    private List<Integer> handlePerceptionData(List<Integer> list, List<Integer> list2) {
        return null;
    }

    @Override
    public ProductUtil.MachineType getMachineType() {
        return null;
    }

    private int getPerceptionBlindAreaAngle() {
        return 0;
    }

    public void setDefaultObstacleAvoidanceEnabledForDirection(List<ObstacleAvoidanceConfig> list) {
    }

    private boolean isSupportByPass(ProductType productType) {
        return false;
    }

    private List<ObstacleAvoidanceType> getSupportObstacleAvoidanceType(ProductType productType) {
        return null;
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$6(PerceptionPushOmnidirectionalRadarStatus perceptionPushOmnidirectionalRadarStatus) throws Throwable {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$5(PerceptionPushOmnidirectionalRadarStatus perceptionPushOmnidirectionalRadarStatus) throws Throwable {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$4(List list) throws Throwable {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$3(PerceptionPushOmnidirectionalRadarStatus perceptionPushOmnidirectionalRadarStatus) throws Throwable {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$2(PerceptionPushOmnidirectionalRadarStatus perceptionPushOmnidirectionalRadarStatus) throws Throwable {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$1(OmnidirectionalObstacleAvoidanceStatus omnidirectionalObstacleAvoidanceStatus) throws Throwable {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$0(Boolean bl) throws Throwable {
    }
}

