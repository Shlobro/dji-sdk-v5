/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.systeminfo;

import dji.sdk.common.CallBack;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.product.AppType;
import dji.sdk.systeminfo.UserAccountLoginInfo;

public class DJISystemInfoManager {
    private static volatile DJISystemInfoManager mInstance = null;
    private static AppType appType;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJISystemInfoManager getInstance() {
        return null;
    }

    private DJISystemInfoManager() {
    }

    public LocationCoordinate2D getAppLocation() {
        return null;
    }

    public void setAppLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public void updateUserLoginInfo(UserAccountLoginInfo userAccountLoginInfo, CallBack<Boolean> callBack) {
    }

    public void clearUserLoginInfo() {
    }

    public AppType getAppType() {
        return null;
    }

    public void setAppType(AppType appType) {
    }

    private static /* synthetic */ void lambda$clearUserLoginInfo$2(boolean bl) {
    }

    private static /* synthetic */ void lambda$updateUserLoginInfo$1(CallBack callBack, boolean bl) {
    }

    private static /* synthetic */ void lambda$updateUserLoginInfo$0(CallBack callBack, boolean bl) {
    }
}

