/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Message
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.devicebinding;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.flightcontroller.AircraftBindingStateMsg;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.devicebinding.DeviceBindingState;
import dji.v5.manager.aircraft.devicebinding.DeviceBindingStateListener;
import dji.v5.manager.interfaces.IDeviceBindingManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeviceBindingManager
implements IDeviceBindingManager {
    private DeviceBindingState currentBindingState;
    private final String tag;
    private final List<DeviceBindingStateListener> bindingStateListeners;
    private HandlerThread handlerThread;
    private Handler handler;
    private boolean isConnected;
    private static final int SEND_UUID_INTERVAL = 1000;
    private static final int MSG_SEND_UUID_TO_AIRCRAFT = 1;
    private static final int MSG_GET_DEVICE_BINDING_STATE = 2;
    private final AtomicBoolean isInit;

    public static IDeviceBindingManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public DeviceBindingState getDeviceBindingStateSync() {
        return null;
    }

    @Override
    public void getDeviceBindingStateAsync(CommonCallbacks.CompletionCallbackWithParam<DeviceBindingState> completionCallbackWithParam) {
    }

    @Override
    public void addDeviceBindingStateListener(@NonNull DeviceBindingStateListener deviceBindingStateListener) {
    }

    @Override
    public void removeDeviceBindingStateListener(@NonNull DeviceBindingStateListener deviceBindingStateListener) {
    }

    @Override
    public void clearAllListeners() {
    }

    private void notifyBindingStateListener(DeviceBindingState deviceBindingState, DeviceBindingState deviceBindingState2) {
    }

    private DeviceBindingState getBindingState(AircraftBindingStateMsg aircraftBindingStateMsg) {
        return null;
    }

    private void sendUUIDToAircraft() {
    }

    private String generateUID() {
        return null;
    }

    private Message obtainMessage(int n) {
        return null;
    }

    private /* synthetic */ void lambda$init$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ boolean lambda$init$0(Message message) {
        return false;
    }

    static /* synthetic */ String access$100(DeviceBindingManager deviceBindingManager) {
        return null;
    }

    static /* synthetic */ DeviceBindingState access$200(DeviceBindingManager deviceBindingManager, AircraftBindingStateMsg aircraftBindingStateMsg) {
        return null;
    }

    static /* synthetic */ DeviceBindingState access$300(DeviceBindingManager deviceBindingManager) {
        return null;
    }

    static /* synthetic */ void access$400(DeviceBindingManager deviceBindingManager, DeviceBindingState deviceBindingState, DeviceBindingState deviceBindingState2) {
    }

    static /* synthetic */ DeviceBindingState access$302(DeviceBindingManager deviceBindingManager, DeviceBindingState deviceBindingState) {
        return null;
    }

    static /* synthetic */ void access$500(DeviceBindingManager deviceBindingManager) {
    }

    static /* synthetic */ Message access$600(DeviceBindingManager deviceBindingManager, int n) {
        return null;
    }

    static /* synthetic */ Handler access$700(DeviceBindingManager deviceBindingManager) {
        return null;
    }

    static /* synthetic */ boolean access$800(DeviceBindingManager deviceBindingManager) {
        return false;
    }

    private static class LazyHolder {
        private static final DeviceBindingManager INSTANCE = new DeviceBindingManager();

        private LazyHolder() {
        }

        static /* synthetic */ DeviceBindingManager access$000() {
            return null;
        }
    }
}

