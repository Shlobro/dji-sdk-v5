/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.v5.manager.diagnostic.DJIDeviceHealthInfo;
import java.util.List;

public interface DJIDeviceHealthInfoChangeListener {
    public void onDeviceHealthInfoUpdate(List<DJIDeviceHealthInfo> var1);
}

