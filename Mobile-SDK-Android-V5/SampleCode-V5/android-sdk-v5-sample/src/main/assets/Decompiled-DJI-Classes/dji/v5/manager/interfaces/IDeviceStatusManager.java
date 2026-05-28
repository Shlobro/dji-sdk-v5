/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.manager.diagnostic.DJIDeviceStatus;
import dji.v5.manager.diagnostic.DJIDeviceStatusChangeListener;

public interface IDeviceStatusManager {
    public void init();

    public void destroy();

    public DJIDeviceStatus getCurrentDJIDeviceStatus();

    public void addDJIDeviceStatusChangeListener(DJIDeviceStatusChangeListener var1);

    public void removeDJIDeviceStatusChangeListener(DJIDeviceStatusChangeListener var1);

    public void clearAllListeners();
}

