/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.ldm;

import android.content.Context;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.LDMConfig;
import dji.sdk.keyvalue.value.common.NetworkRequestSrc;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.common.ldm.LDMExemptModule;
import dji.v5.common.ldm.LDMModule;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.SDKManager;
import dji.v5.manager.interfaces.ILDMManager;
import dji.v5.manager.ldm.LdmLicense;
import dji.v5.manager.ldm.LdmLicenseResponse;
import dji.v5.utils.BuildConfig;
import dji.v5.utils.inner.ConstantsUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.aspectj.lang.JoinPoint;

public class LDMManager
implements ILDMManager {
    private static final String TAG;
    private static final String IS_LICENSE_LOADED_CACHE_KEY = "ldm_supported_cache_key";
    private static final String LDM_ENCRYPTION_LICENSE = "ldm_license";
    private static final String LDM_TIMESTAMP = "ldm_timestamp";
    private final String GET_LDM_LICENSE_URL;
    private static String mLdmServerAesKey;
    private static String mLdmSignatureKey;
    private String areaCode;
    private String appPackageName;
    private String appKey;
    public static final String LDM_PLUS_LICENSE_FOLDER = "LDM/";
    public static final String LDM_PLUS_LICENSE_ROOT_PATH = "LDM/license_";
    public static final String LDM_PLUS_LICENSE_FILE_EXTENSION = ".txt";
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private final Map<LDMExemptModule, Boolean> moduleStateMap;
    private boolean isLDMLicenseLoaded;
    private final AtomicBoolean isLDM;
    private LDMConfig CSDKLDMConfig;
    private static final boolean LDM_IVT_RUNNING;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;

    private LDMManager() {
    }

    @Override
    public final boolean isLDMLicenseLoaded() {
        return false;
    }

    public static ILDMManager getInstance() {
        return null;
    }

    private String getSpEncryptLicense() {
        return null;
    }

    private IDJIError getLocalLicenseError() {
        return null;
    }

    public final void getLicence(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private String getAreaCode() {
        return null;
    }

    @Override
    public final void enableLDM(Context context, CommonCallbacks.CompletionCallback completionCallback, LDMExemptModule ... lDMExemptModuleArray) {
    }

    @Override
    @TrackEvent(eventName="loadLocalLDMLicenseContent", category="ManagerAnnotation")
    public IDJIError loadLocalLDMLicenseContent(String string2) {
        return null;
    }

    @Override
    public String getLocalLDMLicensePath(Context context) {
        return null;
    }

    private String loadLocalLDMLicense(Context context) {
        return null;
    }

    private boolean hasLocalLDMLicense(Context context) {
        return false;
    }

    @Override
    @TrackEvent(eventName="disableLDM", category="ManagerAnnotation")
    public final void disableLDM(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public final boolean isLDMEnabled() {
        return false;
    }

    @Deprecated
    public final IDJIError setModuleNetworkServiceEnabled(LDMModule ... lDMModuleArray) {
        return null;
    }

    private void addExemptModules(LDMExemptModule ... lDMExemptModuleArray) {
    }

    @Override
    public final boolean isNetworkServiceEnabledForModule(@NonNull LDMExemptModule lDMExemptModule) {
        return false;
    }

    private void initLDMModuleNetworkServiceEnabled() {
    }

    private void errorHandler(CommonCallbacks.CompletionCallback completionCallback, IDJIError iDJIError) {
    }

    private void successHandle(CommonCallbacks.CompletionCallback completionCallback, LdmLicenseResponse ldmLicenseResponse) {
    }

    private void updateLicenseTimestamp() {
    }

    public final void updateLicenseDataToSp(String string2) {
    }

    private boolean isAppIdentity(LdmLicense ldmLicense) {
        return false;
    }

    private String getPackageName() {
        return null;
    }

    private String getAppKey() {
        return null;
    }

    private void setCSDKLDMConfig(LDMExemptModule ... lDMExemptModuleArray) {
    }

    private void removeCSDKLDMConfig() {
    }

    private void releaseNetWorkCall() {
    }

    private NetworkRequestSrc getRequestSrcFromModule(@NonNull LDMExemptModule lDMExemptModule) {
        return null;
    }

    /* synthetic */ LDMManager(1 var1_1) {
    }

    static /* synthetic */ void access$200(LDMManager lDMManager, CommonCallbacks.CompletionCallback completionCallback, IDJIError iDJIError) {
    }

    static /* synthetic */ void access$300(LDMManager lDMManager, CommonCallbacks.CompletionCallback completionCallback, LdmLicenseResponse ldmLicenseResponse) {
    }

    static /* synthetic */ AtomicBoolean access$400(LDMManager lDMManager) {
        return null;
    }

    static /* synthetic */ void access$500(LDMManager lDMManager) {
    }

    static /* synthetic */ void access$600(LDMManager lDMManager, LDMExemptModule[] lDMExemptModuleArray) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$700(LDMManager lDMManager) {
        return null;
    }

    static {
        LDMManager.ajc$preClinit();
        TAG = LDMManager.class.getSimpleName();
        mLdmServerAesKey = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.LDM_SERVER_AES);
        mLdmSignatureKey = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.LDM_SIGNATURE);
        LDM_IVT_RUNNING = ((SDKManager)SDKManager.getInstance()).isIVTEnabled() && BuildConfig.IS_DEBUG_BUILD != false;
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final LDMManager INSTANCE = new LDMManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ LDMManager access$100() {
            return null;
        }
    }
}

