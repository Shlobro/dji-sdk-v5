/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  androidx.annotation.NonNull
 */
package dji.v5.utils.inner;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import dji.v5.common.KeepProguard;
import dji.v5.common.register.PackageProductCategory;
import dji.v5.utils.BuildConfig;
import dji.v5.utils.common.LogUtils;

public class SDKConfig {
    private static final String TAG = LogUtils.getTag(SDKConfig.class.getSimpleName());
    private static final String SDK_VERSION = "5.18.0";
    private static final String SDK_EXTENSION_VERSION = "";
    private static final boolean IS_DEBUG_BUILD = BuildConfig.IS_DEBUG_BUILD;
    private static final String BUILD_VERSION = "2293";
    private static final int CORE_RELEASE_VERSION = 474;
    private static final int CORE_DEBUG_VERSION = 648;
    private static final boolean IS_CORE_RELEASE = BuildConfig.IS_CORE_RELEASE;
    private static final boolean IS_US_VERSION = BuildConfig.IS_US_VERSION;
    private String appKeySetByApi;
    private final CoreInfo coreInfo;
    private static final SDKConfig mInstance = new SDKConfig();

    private SDKConfig() {
    }

    public static SDKConfig getInstance() {
        return null;
    }

    public String getRegistrationSDKVersion() {
        return null;
    }

    public String getBuildVersion() {
        return null;
    }

    public CoreInfo getCoreInfo() {
        return null;
    }

    public boolean isDebug() {
        return false;
    }

    public boolean isUSVersion() {
        return false;
    }

    public int getRCRole() {
        return 0;
    }

    public PackageProductCategory getPackageProductCategory() {
        return null;
    }

    public String getAppKey() {
        return null;
    }

    public void setAppKey(String string2) {
    }

    public String getDeviceId() {
        return null;
    }

    @SuppressLint(value={"HardwareIds"})
    private String createDeviceId() {
        return null;
    }

    public static class CoreInfo
    implements KeepProguard {
        private final boolean isRelease;
        private final String version;
        private final boolean isUSVersion;

        private CoreInfo(boolean bl, int n, boolean bl2) {
        }

        @NonNull
        public String toString() {
            return null;
        }

        /* synthetic */ CoreInfo(boolean bl, int n, boolean bl2, 1 var4_4) {
        }
    }
}

