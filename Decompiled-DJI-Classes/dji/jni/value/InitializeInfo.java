/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.value;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.common.LDMConfig;
import dji.sdk.keyvalue.value.product.AppType;

public class InitializeInfo
implements JNIProguardKeepTag {
    private AppType mAppType;
    private String mFlyLimitDatabasePath;
    private String mAreaCodeStoragePath;
    private String mAreaCodeDatabaseFilePath;
    private String mAppVersion;
    private boolean mBridgeServerEnable;
    private boolean mAreaCodeNeedPhoneGPS;
    private String mFlightRecordPath;
    private String mLogPath;
    private String mAppServiceId;
    private String mPhoneType;
    private String mDeviceSystemProduct;
    private String mHMacSH256Key;
    private LDMConfig ldmConfig;
    private boolean mUseDeafultNetwork;
    private String mTimeZone;
    private String mFlightNoEncryptRecordPath;

    public InitializeInfo(AppType appType, String string2, String string3, String string4) {
    }

    public InitializeInfo(AppType appType, String string2, String string3, String string4, String string5) {
    }

    public InitializeInfo(AppType appType) {
    }

    public AppType getmAppType() {
        return null;
    }

    public void setmAppType(AppType appType) {
    }

    public String getmFlyLimitDatabasePath() {
        return null;
    }

    public String getAreaCodeStoragePath() {
        return null;
    }

    public String getAreaCodeDatabaseFilePath() {
        return null;
    }

    public String getmFlightRecordPath() {
        return null;
    }

    public String getmFlightNoEncryptRecordPath() {
        return null;
    }

    public void setmFlyLimitDatabasePath(String string2) {
    }

    public void setAreaCodeStoragePath(String string2) {
    }

    public void setAreaCodeDatabaseFilePath(String string2) {
    }

    public void setmFlightRecordPath(String string2) {
    }

    public void setFlightNoEncryptRecordPath(String string2) {
    }

    public String getmAppVersion() {
        return null;
    }

    public void setmAppVersion(String string2) {
    }

    public boolean isBridgeServerEnable() {
        return false;
    }

    public boolean isAreaCodeNeedPhoneGPS() {
        return false;
    }

    public void setBridgeServerEnable(boolean bl) {
    }

    public void setAreaCodeNeedPhoneGPS(boolean bl) {
    }

    public void setLogPath(String string2) {
    }

    public void setAppServiceId(String string2) {
    }

    public void setPhoneType(String string2) {
    }

    public void setHMacSH256Key(String string2) {
    }

    public void setMDeviceSystemProduct(String string2) {
    }

    public LDMConfig getLdmConfig() {
        return null;
    }

    public void setLdmConfig(LDMConfig lDMConfig) {
    }

    public boolean isUsedDefaultNetwork() {
        return false;
    }

    public void setUseDefaultNetwork(boolean bl) {
    }

    public void setmTimeZone(String string2) {
    }
}

