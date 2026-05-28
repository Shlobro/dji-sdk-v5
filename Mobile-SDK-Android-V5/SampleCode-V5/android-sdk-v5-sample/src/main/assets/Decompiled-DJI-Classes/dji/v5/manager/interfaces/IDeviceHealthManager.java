/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.manager.diagnostic.DJIDeviceHealthInfo;
import dji.v5.manager.diagnostic.DJIDeviceHealthInfoChangeListener;
import java.util.List;

public interface IDeviceHealthManager {
    public void init();

    public void destroy();

    public void addDJIDeviceHealthInfoChangeListener(DJIDeviceHealthInfoChangeListener var1);

    public void removeDJIDeviceHealthInfoChangeListener(DJIDeviceHealthInfoChangeListener var1);

    public List<DJIDeviceHealthInfo> getCurrentDJIDeviceHealthInfos();

    public void clearAllListeners();
}

