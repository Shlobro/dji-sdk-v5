/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.v5.manager.diagnostic.DJIDeviceStatus;

public interface DJIDeviceStatusChangeListener {
    public void onDeviceStatusUpdate(DJIDeviceStatus var1, DJIDeviceStatus var2);
}

