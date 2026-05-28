/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  org.aspectj.lang.JoinPoint$StaticPart
 *  org.jetbrains.annotations.NotNull
 */
package dji.v5.manager.aircraft.upgrade;

import androidx.annotation.NonNull;
import dji.upgrade.UpgradeError;
import dji.upgrade.UpgradeManagerDynamicComponentListener;
import dji.upgrade.UpgradePathInfo;
import dji.upgrade.UpgradeTotalProcessInformation;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.UpgradeFirmwareListener;
import dji.upgrade.component.firmware.model.FirmwareUpgradingProcessState;
import dji.upgrade.component.firmware.model.UpgradeDynamicComponentChangeState;
import dji.upgrade.generate.Component;
import dji.upgrade.generate.DecompressProgressInformation;
import dji.upgrade.generate.DecompressState;
import dji.upgrade.internal.UpgradeManagerImpl;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.manager.aircraft.upgrade.UpgradeInfo;
import dji.v5.manager.aircraft.upgrade.UpgradeInfoListener;
import dji.v5.manager.aircraft.upgrade.UpgradeProgressState;
import dji.v5.manager.aircraft.upgrade.UpgradeableComponent;
import dji.v5.manager.aircraft.upgrade.UpgradeableComponentListener;
import dji.v5.manager.aircraft.upgrade.model.ComponentType;
import dji.v5.manager.interfaces.IUpgradeManager;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

public class UpgradeManager
implements IUpgradeManager {
    private UpgradeManagerImpl internalUpgradeManager;
    private CopyOnWriteArrayList<UpgradeableComponentListener> listeners;
    private final Long SPACE_LIMIT;
    private List<UpgradeInfoListener> offlineUpgradeListeners;
    public final HashMap<Component, String> componentPaths;
    private ConcurrentHashMap<UpgradeComponent, UpgradeableComponent> upgradeComponentMap;
    private final Function1<DecompressProgressInformation, Unit> depressProgressObserver;
    private final UpgradeFirmwareListener mUpgradeFirmwareListener;
    private UpgradeManagerDynamicComponentListener dynamicComponentListener;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;

    public static UpgradeManager getInstance() {
        return null;
    }

    private UpgradeManager() {
    }

    public void init() {
    }

    private void updateDownLoadStage(FirmwareUpgradingProcessState firmwareUpgradingProcessState) {
    }

    @Override
    public void addUpgradeableComponentListener(@NonNull UpgradeableComponentListener upgradeableComponentListener) {
    }

    @Override
    public void removeUpgradeableComponentListener(@NonNull UpgradeableComponentListener upgradeableComponentListener) {
    }

    @Override
    public void removeAllUpgradeableComponentListener() {
    }

    @Override
    @NonNull
    public List<UpgradeableComponent> getUpgradeableComponents() {
        return null;
    }

    @Override
    public void checkUpgradeableComponents(CommonCallbacks.CompletionCallbackWithParam<ComponentType> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="startOfflineUpgrade", category="ManagerAnnotation")
    public void startOfflineUpgrade(ComponentType componentType, String string2, @NotNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addUpgradeInfoListener(@NonNull UpgradeInfoListener upgradeInfoListener) {
    }

    @Override
    public void removeAllUpgradeInfoListener() {
    }

    @Override
    public void removeUpgradeInfoListener(@NonNull UpgradeInfoListener upgradeInfoListener) {
    }

    private HashMap<Component, UpgradePathInfo> makeOfflineUpgradeParam(ComponentType componentType, String string2) {
        return null;
    }

    private void notifyOfflineUpgrade(UpgradeInfo upgradeInfo) {
    }

    private String reNameFileName(String string2, ComponentType componentType) {
        return null;
    }

    private UpgradeProgressState transUpgradeState(FirmwareUpgradingProcessState firmwareUpgradingProcessState) {
        return null;
    }

    private boolean isRcProController() {
        return false;
    }

    public void destroy() {
    }

    private static /* synthetic */ Unit lambda$startOfflineUpgrade$5(CommonCallbacks.CompletionCallback completionCallback, UpgradeError upgradeError) {
        return null;
    }

    private /* synthetic */ void lambda$new$4(UpgradeComponent upgradeComponent, UpgradeDynamicComponentChangeState upgradeDynamicComponentChangeState) {
    }

    private /* synthetic */ Unit lambda$new$3(DecompressProgressInformation decompressProgressInformation) {
        return null;
    }

    private /* synthetic */ void lambda$new$2(DecompressState decompressState) {
    }

    private /* synthetic */ Unit lambda$init$1(List list, UpgradeTotalProcessInformation upgradeTotalProcessInformation) {
        return null;
    }

    private /* synthetic */ void lambda$init$0(UpgradeInfo upgradeInfo) {
    }

    /* synthetic */ UpgradeManager(1 var1_1) {
    }

    static /* synthetic */ UpgradeProgressState access$200(UpgradeManager upgradeManager, FirmwareUpgradingProcessState firmwareUpgradingProcessState) {
        return null;
    }

    static /* synthetic */ void access$300(UpgradeManager upgradeManager, UpgradeInfo upgradeInfo) {
    }

    static {
        UpgradeManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final UpgradeManager INSTANCE = new UpgradeManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ UpgradeManager access$100() {
            return null;
        }
    }
}

