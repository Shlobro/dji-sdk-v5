/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.upgrade;

import androidx.annotation.NonNull;
import dji.upgrade.UpgradeManagerDynamicComponentListener;
import dji.upgrade.component.database.DatabaseUpgradeComponent;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.UpgradeExternalComponents;
import java.util.ArrayList;

public interface UpgradeManager {
    public DatabaseUpgradeComponent getDatabaseUpgradeComponent();

    public ArrayList<UpgradeComponent> getDynamicUpgradeComponents();

    public UpgradeExternalComponents getExternalComponents();

    public void removeAllCacheFilesForFirmware();

    public long getAllCacheFileSizeForFirmware();

    public void addUpgradeComponentListener(@NonNull UpgradeManagerDynamicComponentListener var1);

    public void removeUpgradeComponentListener(@NonNull UpgradeManagerDynamicComponentListener var1);

    public void removeAllUpgradeComponentListener();
}

