/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package dji.upgrade.internal.csdk;

import android.content.Context;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.product.AppType;
import dji.upgrade.generate.UpgradeServerUrlMode;
import dji.upgrade.internal.csdk.upgradeadapter.UpgradeAdapterManager;

public class CSDKManager {
    private Context mContext;
    private UpgradeAdapterManager upgradeAdapterManager;
    private static final String UPGRADE_DEBUG_SWITCH = "UPGRADE_DEBUG_SWITCH";
    public static UpgradeServerUrlMode serverUrlMode;

    public static CSDKManager getInstance() {
        return null;
    }

    private CSDKManager() {
    }

    public void init(@NonNull Context context, AppType appType) {
    }

    public void destroy() {
    }

    @NonNull
    public UpgradeAdapterManager getUpgradeAdapterManager() {
        return null;
    }

    public static void setIsInternalUpgradeMode(boolean bl) {
    }

    public static void setIsStoreSdCard(boolean bl) {
    }

    public static void setCountryCode(String string2) {
    }

    public static void addUpgradeDebugMode(int n) {
    }

    public static UpgradeServerUrlMode getServerUrlMode() {
        return null;
    }

    public static void setServerUrlMode(UpgradeServerUrlMode upgradeServerUrlMode) {
    }

    public static String getFirmwareUpgradingSubModuleDescription(int n) {
        return null;
    }

    public static void LOGD(String string2, String string3) {
    }

    public static void LOGE(String string2, String string3) {
    }

    /* synthetic */ CSDKManager(1 var1_1) {
    }

    static {
        try {
            System.loadLibrary("DJIUpgradeJNI");
        }
        catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        serverUrlMode = UpgradeServerUrlMode.Official;
    }

    private static class SingletonHolder {
        private static final CSDKManager instance = new CSDKManager(null);

        private SingletonHolder() {
        }

        static /* synthetic */ CSDKManager access$000() {
            return null;
        }
    }
}

