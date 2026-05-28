/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal;

import dji.upgrade.generate.UpgradeServerUrlMode;

public class UpgradeManagerConfig {
    public static boolean sIsInnerVersion;
    public static final boolean DEBUG_SDK_LOG = false;
    public static final boolean DEBUG = true;
    public static final String DIR_UPGRADE_FILE_DEBUG = "DJI/UpgradeDebug";
    public static final String UP_CONFIG_FILE = "upCfgFiles";
    public static final String DIR_UPGRADE_LOG_FILE = "UpgradeLogSDK";
    public static final String DIR_FLY_SAFE_DATA = "DJI/Flysafe";
    public static final String FIRM_UP_LOG_PREFIX = "firmUpgrade-";
    public static final String FIRM_UP_LOG_CSDK_TAG = "CSDK";
    public static final String FIRM_UP_LOG_MSDK_TAG = "UpgradeCore-Android";
    public static final int NOT_STOP_DATALINK_REVERSE_WHEN_TRANSFER_FAILED = 1;

    public static void setIsInnerVersion(boolean bl) {
    }

    public static void setIsInternalUpgradeMode(boolean bl) {
    }

    public static void setCountryCode(String string2) {
    }

    public static boolean addUpgradeDebugMode(int n) {
        return false;
    }

    public static void setServerUrlMode(UpgradeServerUrlMode upgradeServerUrlMode) {
    }

    public static UpgradeServerUrlMode getServerUrlMode() {
        return null;
    }

    public static void setIsStoreSdCard(boolean bl) {
    }
}

