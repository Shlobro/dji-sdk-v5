/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.inner.cloud;

import android.content.Context;
import com.dji.mobileinfra.cloudcontrol.Callback;
import com.dji.mobileinfra.cloudcontrol.CloudControlConfiguration;
import dji.v5.utils.inner.ConstantsUtils;
import java.util.Arrays;
import java.util.List;

public class MSDKCloudControl {
    public static final String NAMESPACE_LTE = "control_lte";
    public static final String LTE_AREA_CONFIG_WHITELIST = "area_config_whitelist";
    private static final String LTE_PRIVATIZATION_AREA_CONFIG_BLACKLIST = "area_config_privatization";
    private static final String KEY_LTE_CLOUD_CONFIG_CACHE = "lte_cloud_control_config";
    private static final String KEY_LTE_PRIVATE_CLOUD_CONFIG_CACHE = "lte_private_cloud_control_config";
    private static final String NAMESPACE_CONTROL = "control";
    private static final String OID_PUSH_DISABLE = "oid_push_disable";
    private static final String DEFAULT_OID_PUSH_DISABLE = "0";
    private static final String KEY_OID_PUSH_DISABLE_CACHE = "msdk_oid_push_disable";
    private static final String CLOUD_APP_ID = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.CLOUD_APP_ID);
    private static final String CLOUD_SECRET_KEY = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.CLOUD_SECRET_KEY);
    private static final String CLOUD_SECRET_ID = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.CLOUD_SECRET_ID);
    private final List<OnCloudControlListener> listeners;
    private static final List<String> ALL_NAMESPACE = Arrays.asList("control_lte", "control");
    private static final MSDKCloudControl INSTANCE = new MSDKCloudControl();
    private volatile boolean mHasInit;

    public static MSDKCloudControl getInstance() {
        return null;
    }

    public synchronized void init(Context context) {
    }

    public synchronized void destroy() {
    }

    public void refreshCloudControl() {
    }

    public void updateCloudControl(List<String> list, Callback callback) {
    }

    private void cacheLteConfig(CloudControlConfiguration cloudControlConfiguration) {
    }

    public void cacheLteCloudConfig(String string) {
    }

    public void cacheLtePrivateCloudConfig(String string) {
    }

    public String getLteCloudConfig() {
        return null;
    }

    public String getLtePrivateCloudConfig() {
        return null;
    }

    public void addListener(OnCloudControlListener onCloudControlListener) {
    }

    public void removeListener(OnCloudControlListener onCloudControlListener) {
    }

    public void notifyListener(CloudControlConfiguration cloudControlConfiguration) {
    }

    private void cacheOidPushDisable(CloudControlConfiguration cloudControlConfiguration) {
    }

    public String getOidPushDisable() {
        return null;
    }

    private void applyOidUploadEnable(String string) {
    }

    private /* synthetic */ void lambda$init$0(Boolean bl, Boolean bl2) {
    }

    static /* synthetic */ void access$000(MSDKCloudControl mSDKCloudControl, CloudControlConfiguration cloudControlConfiguration) {
    }

    static /* synthetic */ void access$100(MSDKCloudControl mSDKCloudControl, CloudControlConfiguration cloudControlConfiguration) {
    }

    public static interface OnCloudControlListener {
        public void onCompleted(CloudControlConfiguration var1);
    }
}

