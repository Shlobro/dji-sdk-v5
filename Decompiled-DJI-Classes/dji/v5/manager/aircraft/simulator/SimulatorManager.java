/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.aircraft.simulator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.flightcontroller.SimulatorInitializationSettings;
import dji.sdk.keyvalue.value.flightcontroller.SimulatorState;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.simulator.InitializationSettings;
import dji.v5.manager.aircraft.simulator.SimulatorStatusListener;
import dji.v5.manager.aircraft.simulator.SimulatorWindInfo;
import dji.v5.manager.interfaces.ISimulatorManager;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class SimulatorManager
implements ISimulatorManager {
    private final String tag;
    SimulatorInitializationSettings mSimulatorInitializationSettings;
    private final List<SimulatorStatusListener> simulatorStatusListeners;
    private DJIAnalyticsPerformHelper analyticsPerformHelper;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;

    public static SimulatorManager getInstance() {
        return null;
    }

    private SimulatorManager() {
    }

    private void init() {
    }

    @Override
    public boolean isSimulatorEnabled() {
        return false;
    }

    @Override
    public void enableSimulator(@NonNull InitializationSettings initializationSettings, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="disableSimulator", category="ManagerAnnotation")
    public void disableSimulator(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addSimulatorStateListener(@NonNull SimulatorStatusListener simulatorStatusListener) {
    }

    @Override
    public void removeSimulatorStateListener(@NonNull SimulatorStatusListener simulatorStatusListener) {
    }

    @Override
    public void clearAllSimulatorStateListener() {
    }

    @Override
    @TrackEvent(eventName="setFlyZoneLimitationEnabled", category="ManagerAnnotation")
    public void setFlyZoneLimitationEnabled(@TrackElements(value="enabled") boolean bl, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getFlyZoneLimitationEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="setWindSpeed", category="ManagerAnnotation")
    public void setWindSpeed(@TrackElements(value="simulatorWindInfo") SimulatorWindInfo simulatorWindInfo) {
    }

    public void destroy() {
    }

    private void updateSimulatorInitializationData(InitializationSettings initializationSettings) {
    }

    private void notifySimulatorStateListener(SimulatorState simulatorState) {
    }

    private void notifyCurrentState() {
    }

    private /* synthetic */ void lambda$notifyCurrentState$1(SimulatorState simulatorState, SimulatorState simulatorState2) {
    }

    private /* synthetic */ void lambda$enableSimulator$0(SimulatorState simulatorState, SimulatorState simulatorState2) {
    }

    /* synthetic */ SimulatorManager(1 var1_1) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$200(SimulatorManager simulatorManager) {
        return null;
    }

    static {
        SimulatorManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final SimulatorManager INSTANCE = new SimulatorManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ SimulatorManager access$000() {
            return null;
        }
    }
}

