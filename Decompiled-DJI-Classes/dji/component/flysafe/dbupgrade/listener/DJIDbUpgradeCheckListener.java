/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.model.FlysafeDataUpgradeModelWrapper;
import java.util.List;

public interface DJIDbUpgradeCheckListener {
    public void offlineDbNotice(boolean var1);

    public void toConnectMC();

    public void toUpgrade(List<FlysafeDataUpgradeModelWrapper.TypeDataUpgrade> var1, List<FlysafeDataUpgradeModelWrapper.TypeDataUpgrade> var2, String var3, int var4, boolean var5);
}

