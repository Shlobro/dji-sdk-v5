/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.manager.diagnostic.DJIDeviceStatus;
import dji.v5.manager.diagnostic.DJIDeviceStatusChangeListener;
import dji.v5.manager.interfaces.IDeviceStatusManager;
import java.util.List;

public class DeviceStatusManager
implements IDeviceStatusManager {
    private DJIDeviceStatus lastDeviceStatus;
    private DJIDeviceStatus currentDeviceStatus;
    private boolean isRemoteControllerConnected;
    private boolean isAircraftConnected;
    private final List<DJIDeviceStatusChangeListener> listeners;
    private long csdkListenerId;

    private DeviceStatusManager() {
    }

    public static IDeviceStatusManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public DJIDeviceStatus getCurrentDJIDeviceStatus() {
        return null;
    }

    @Override
    public void addDJIDeviceStatusChangeListener(DJIDeviceStatusChangeListener dJIDeviceStatusChangeListener) {
    }

    @Override
    public void removeDJIDeviceStatusChangeListener(DJIDeviceStatusChangeListener dJIDeviceStatusChangeListener) {
    }

    @Override
    public void clearAllListeners() {
    }

    private void notifyListeners(DJIDeviceStatus dJIDeviceStatus, DJIDeviceStatus dJIDeviceStatus2) {
    }

    private void updateDeviceStatus() {
    }

    private DJIDeviceStatus statusPatch(DJIDeviceStatus dJIDeviceStatus) {
        return null;
    }

    private /* synthetic */ void lambda$init$2(ProductType productType, ProductType productType2) {
    }

    private /* synthetic */ void lambda$init$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$0(int n, int n2, long l2) {
    }

    /* synthetic */ DeviceStatusManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final DeviceStatusManager INSTANCE = new DeviceStatusManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ DeviceStatusManager access$100() {
            return null;
        }
    }
}

