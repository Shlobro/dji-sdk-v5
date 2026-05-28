/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.upgrade;

import androidx.annotation.NonNull;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.model.UpgradeDynamicComponentChangeState;

public interface UpgradeManagerDynamicComponentListener {
    public void onUpgradeComponent(@NonNull UpgradeComponent var1, UpgradeDynamicComponentChangeState var2);
}

