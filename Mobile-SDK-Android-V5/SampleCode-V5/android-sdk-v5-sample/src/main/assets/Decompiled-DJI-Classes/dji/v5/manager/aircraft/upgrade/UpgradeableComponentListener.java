/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.upgrade;

import androidx.annotation.NonNull;
import dji.v5.manager.aircraft.upgrade.UpgradeableComponent;

public interface UpgradeableComponentListener {
    public void onComponentUpdated(@NonNull UpgradeableComponent var1);
}

