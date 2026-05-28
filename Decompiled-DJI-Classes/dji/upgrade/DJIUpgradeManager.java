/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade;

import dji.media.callback.ICallback;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.upgrade.UpgradeComponentTypeMsg;
import dji.sdk.keyvalue.value.upgrade.UpgradeStageMsg;
import dji.upgrade.UpgradeIntCallback;
import dji.upgrade.UpgradeQueryModuleVersionCallback;
import dji.upgrade.UpgradeSetVersionCallback;
import dji.upgrade.UpgradeStatusCallback;
import dji.upgrade.UpgradeVersionCallback;

public class DJIUpgradeManager {
    private static volatile DJIUpgradeManager instance;
    private static final String LOG_TAG = "[Upgrade-android]";

    private DJIUpgradeManager() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIUpgradeManager getInstance() {
        return null;
    }

    private Runnable getStatusRunnable(UpgradeStatusCallback upgradeStatusCallback, int n, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        return null;
    }

    public void setUpgradeObserver(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, UpgradeStatusCallback upgradeStatusCallback, ICallback iCallback) {
    }

    public void cancelUpgradeObserver(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, ICallback iCallback) {
    }

    public void setUpgradeHotPluginObserver(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, UpgradeStatusCallback upgradeStatusCallback, ICallback iCallback) {
    }

    public void cancelUpgradeHotPluginObserver(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, ICallback iCallback) {
    }

    public void startUpgrade(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, String string2, ICallback iCallback) {
    }

    public void getDeviceVersionInfo(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, UpgradeVersionCallback upgradeVersionCallback) {
    }

    public void setDeviceVersionInfo(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, byte[] byArray, UpgradeSetVersionCallback upgradeSetVersionCallback) {
    }

    public void getDeviceInfo(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, UpgradeVersionCallback upgradeVersionCallback) {
    }

    public void getChargRemainingInPersent(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, UpgradeIntCallback upgradeIntCallback) {
    }

    public void firmwareMd5Verify(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, byte[] byArray, ICallback iCallback) {
    }

    public void setBlockNum(int n, UpgradeComponentTypeMsg upgradeComponentTypeMsg, int n2, ICallback iCallback) {
    }

    public void queryModuleFirmwareVersion(int n, int n2, int n3, UpgradeQueryModuleVersionCallback upgradeQueryModuleVersionCallback) {
    }

    private DJIValue parseDJIValueData(byte[] byArray, UpgradeStageMsg upgradeStageMsg) {
        return null;
    }

    private void processCommonResult(int n, byte[] byArray, ICallback iCallback) {
    }

    static /* synthetic */ DJIValue access$000(DJIUpgradeManager dJIUpgradeManager, byte[] byArray, UpgradeStageMsg upgradeStageMsg) {
        return null;
    }

    static /* synthetic */ Runnable access$100(DJIUpgradeManager dJIUpgradeManager, UpgradeStatusCallback upgradeStatusCallback, int n, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        return null;
    }

    static /* synthetic */ void access$200(DJIUpgradeManager dJIUpgradeManager, int n, byte[] byArray, ICallback iCallback) {
    }
}

