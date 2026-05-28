/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.inner.analytics.helper;

import android.content.Context;
import dji.sdk.keyvalue.value.remotecontroller.RemoteControllerType;
import dji.v5.inner.analytics.event.DJIAnalyticsEvent;
import java.util.Map;

public class DJIAnalyticsHeaderHelper {
    private static final String TAG = DJIAnalyticsHeaderHelper.class.getSimpleName();
    private static final String REGISTER_DEVICE_ID = "register_device_id".hashCode() + "";
    private static final String APP_PLATFORM = "Android";
    private static final String DEFAULT_STRING_VALUE = "N/A";
    private static final String INSTALL_ID = "install_id";
    private String installId;
    private String deviceId;
    private String displayName;
    private String appKey;
    private String platform;
    private String sdkVersion;
    private String locale;
    private String registeredSessionId;
    private String productId;
    private String remoteControllerId;
    private String remoteControllerName;
    private String androidApiLevel;
    private String deviceModel;
    private String appPackageId;
    private String appVersion;
    private String msdkCategory;
    private boolean isReleaseMode;
    private String fcuuID;

    private DJIAnalyticsHeaderHelper() {
    }

    public static DJIAnalyticsHeaderHelper getInstance() {
        return null;
    }

    public void destroy() {
    }

    public void init() {
    }

    public synchronized DJIAnalyticsEvent createEventWithHeaders(String string, String string2, Map<String, Object> map) {
        return null;
    }

    public void initListener() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void initHeader() {
    }

    private String getInstallId() {
        return null;
    }

    private String getDisplayName() {
        return null;
    }

    private String getSDKVersion() {
        return null;
    }

    private String getProductName() {
        return null;
    }

    private String getRemoteControllerName() {
        return null;
    }

    private String getAndroidApiLevel() {
        return null;
    }

    private String getDeviceModel() {
        return null;
    }

    private String getAppVersion() {
        return null;
    }

    private String getMsdkCategory() {
        return null;
    }

    private String getAppPackageId() {
        return null;
    }

    private String getCameraName() {
        return null;
    }

    private String getProductFirmwareVersion() {
        return null;
    }

    private String getDeviceId() {
        return null;
    }

    private String getDeviceIdOnce() {
        return null;
    }

    public static boolean isReadPhoneInfoPermissionGranted() {
        return false;
    }

    private static boolean hasPermissionInManifest(Context context, String string) {
        return false;
    }

    private String getLocale() {
        return null;
    }

    private /* synthetic */ void lambda$initListener$1(String string, String string2) {
    }

    private /* synthetic */ void lambda$initListener$0(RemoteControllerType remoteControllerType, RemoteControllerType remoteControllerType2) {
    }

    /* synthetic */ DJIAnalyticsHeaderHelper(1 var1_1) {
    }

    private static class Holder {
        public static final DJIAnalyticsHeaderHelper instance = new DJIAnalyticsHeaderHelper(null);

        private Holder() {
        }
    }
}

