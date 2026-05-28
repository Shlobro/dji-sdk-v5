/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.aircraft.virtualstick;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.sdk.keyvalue.value.flightcontroller.FlightControlAuthority;
import dji.sdk.keyvalue.value.flightcontroller.FlightControlAuthorityChangeReason;
import dji.sdk.keyvalue.value.flightcontroller.VirtualStickFlightControlParam;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.virtualstick.IStick;
import dji.v5.manager.aircraft.virtualstick.Stick;
import dji.v5.manager.aircraft.virtualstick.VirtualStickState;
import dji.v5.manager.aircraft.virtualstick.VirtualStickStateListener;
import dji.v5.manager.interfaces.IVirtualStickManager;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class VirtualStickManager
implements IVirtualStickManager {
    private static final int SEND_STICK_DATA_MSG = 1;
    private static final long SEND_STICK_DATA_INTERVAL = 200L;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private HandlerThread handlerThread;
    private Handler stickHandler;
    private final List<VirtualStickStateListener> virtualStickStateListeners;
    private VirtualStickState currentVirtualStickState;
    private boolean isAircraftConnected;
    private boolean isAdvancedModeEnabled;
    private FlightControlAuthority currentFCAuthority;
    private double currentSpeedLevel;
    private final Stick leftStick;
    private final Stick rightStick;
    private final VirtualStickFlightControlParam stickControlParam;
    private final VirtualStickFlightControlParam advancedControlParam;
    private final DJIKey.ActionKey<VirtualStickFlightControlParam, EmptyMsg> sendVirtualStickDataKey;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;

    public static IVirtualStickManager getInstance() {
        return null;
    }

    private VirtualStickManager() {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void enableVirtualStick(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="disableVirtualStick", category="ManagerAnnotation")
    public void disableVirtualStick(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setVirtualStickStateListener(VirtualStickStateListener virtualStickStateListener) {
    }

    @Override
    public void removeVirtualStickStateListener(VirtualStickStateListener virtualStickStateListener) {
    }

    @Override
    public void clearAllVirtualStickStateListener() {
    }

    @Override
    public IStick getLeftStick() {
        return null;
    }

    @Override
    public IStick getRightStick() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setSpeedLevel", category="ManagerAnnotation")
    public void setSpeedLevel(@TrackElements(value="speedLevel") double d2) {
    }

    @Override
    public double getSpeedLevel() {
        return 0.0;
    }

    @Override
    @TrackEvent(eventName="setVirtualStickAdvancedModeEnabled", category="ManagerAnnotation")
    public void setVirtualStickAdvancedModeEnabled(@TrackElements(value="isEnable") boolean bl) {
    }

    @Override
    public void sendVirtualStickAdvancedParam(@NonNull VirtualStickFlightControlParam virtualStickFlightControlParam) {
    }

    private void updateVirtualStickFlightControlParamForStickMode() {
    }

    private void trySendVirtualStickFlightControlData(VirtualStickState virtualStickState) {
    }

    private void notifyVirtualStickStateListener(boolean bl, FlightControlAuthority flightControlAuthority, boolean bl2) {
    }

    private void notifyVirtualStickStateListener(FlightControlAuthorityChangeReason flightControlAuthorityChangeReason) {
    }

    private void executeSendVirtualStickFlightControlData(@NonNull VirtualStickFlightControlParam virtualStickFlightControlParam) {
    }

    private /* synthetic */ void lambda$init$3(FlightControlAuthorityChangeReason flightControlAuthorityChangeReason, FlightControlAuthorityChangeReason flightControlAuthorityChangeReason2) {
    }

    private /* synthetic */ void lambda$init$2(FlightControlAuthority flightControlAuthority, FlightControlAuthority flightControlAuthority2) {
    }

    private /* synthetic */ void lambda$init$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$0(Boolean bl, Boolean bl2) {
    }

    /* synthetic */ VirtualStickManager(1 var1_1) {
    }

    static /* synthetic */ VirtualStickState access$200(VirtualStickManager virtualStickManager) {
        return null;
    }

    static /* synthetic */ void access$300(VirtualStickManager virtualStickManager, VirtualStickState virtualStickState) {
    }

    static /* synthetic */ FlightControlAuthority access$400(VirtualStickManager virtualStickManager) {
        return null;
    }

    static /* synthetic */ boolean access$500(VirtualStickManager virtualStickManager) {
        return false;
    }

    static /* synthetic */ void access$600(VirtualStickManager virtualStickManager, boolean bl, FlightControlAuthority flightControlAuthority, boolean bl2) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$700(VirtualStickManager virtualStickManager) {
        return null;
    }

    static {
        VirtualStickManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final VirtualStickManager INSTANCE = new VirtualStickManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ VirtualStickManager access$000() {
            return null;
        }
    }
}

