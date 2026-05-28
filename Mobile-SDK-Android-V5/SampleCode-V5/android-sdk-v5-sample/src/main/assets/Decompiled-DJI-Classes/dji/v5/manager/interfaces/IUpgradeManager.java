/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.upgrade.UpgradeInfoListener;
import dji.v5.manager.aircraft.upgrade.UpgradeableComponent;
import dji.v5.manager.aircraft.upgrade.UpgradeableComponentListener;
import dji.v5.manager.aircraft.upgrade.model.ComponentType;
import java.util.List;

public interface IUpgradeManager {
    public void addUpgradeableComponentListener(@NonNull UpgradeableComponentListener var1);

    public void removeUpgradeableComponentListener(@NonNull UpgradeableComponentListener var1);

    public void removeAllUpgradeableComponentListener();

    public List<UpgradeableComponent> getUpgradeableComponents();

    public void checkUpgradeableComponents(CommonCallbacks.CompletionCallbackWithParam<ComponentType> var1);

    public void startOfflineUpgrade(ComponentType var1, String var2, CommonCallbacks.CompletionCallback var3);

    public void addUpgradeInfoListener(UpgradeInfoListener var1);

    public void removeUpgradeInfoListener(UpgradeInfoListener var1);

    public void removeAllUpgradeInfoListener();
}

