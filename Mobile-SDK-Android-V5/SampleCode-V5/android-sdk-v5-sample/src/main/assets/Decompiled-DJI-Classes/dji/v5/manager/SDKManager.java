/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.jni.value.InitializeInfo;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.v5.common.register.PackageProductCategory;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.interfaces.ISDKManager;
import dji.v5.manager.interfaces.SDKManagerCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import org.aspectj.lang.JoinPoint;

public class SDKManager
implements ISDKManager {
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private final AtomicBoolean isNetworkInit;
    private InitializeInfo initializeInfo;
    private SDKManagerCallback sdkManagerCallback;
    private boolean runningIVT;
    private final AtomicBoolean isMSDKInitEd;
    private final AtomicBoolean isDevicesInitEd;
    private final AtomicBoolean isRegistered;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;

    private SDKManager() {
    }

    public void enableIVT(boolean bl) {
    }

    public boolean isIVTEnabled() {
        return false;
    }

    public static ISDKManager getInstance() {
        return null;
    }

    @Override
    @TrackEvent(eventName="InitSessionSuccess", category="Session")
    public void init(Context context, @NonNull SDKManagerCallback sDKManagerCallback) {
    }

    private void initLDMFolder(Context context) {
    }

    @Override
    public void registerApp() {
    }

    @Override
    public boolean isRegistered() {
        return false;
    }

    private void doRegisterApp() {
    }

    private void initDevices() {
    }

    private void destroyDevices() {
    }

    @Override
    @TrackEvent(eventName="destroy", category="ManagerAnnotation")
    public void destroy() {
    }

    @Override
    public String getSDKVersion() {
        return null;
    }

    @Override
    @TrackEvent(eventName="enableBridgeModeWithBridgeAppIP", category="ManagerAnnotation")
    public void enableBridgeModeWithBridgeAppIP(@TrackElements(value="bridgeAppIP") String string2) {
    }

    @Override
    public PackageProductCategory getProductCategory() {
        return null;
    }

    private void initCSDK() {
    }

    private void initCSDKLocationService() {
    }

    private void initCSDKDebugUrlEnable() {
    }

    private InitializeInfo getCSDKInitInfo() {
        return null;
    }

    private void initCSDKProductUsbInfo() {
    }

    private void initMSDKDevices() {
    }

    private void destroyMSDKDevices() {
    }

    private boolean isUSRc() {
        return false;
    }

    @Keep
    public void initDJINetworkManager(Context context) {
    }

    private static /* synthetic */ LocationCoordinate3D lambda$initCSDKLocationService$2() {
        return null;
    }

    private static /* synthetic */ void lambda$initCSDK$1(boolean bl) {
    }

    private /* synthetic */ void lambda$init$0(SDKManagerCallback sDKManagerCallback, Context context) {
    }

    /* synthetic */ SDKManager(1 var1_1) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$200(SDKManager sDKManager) {
        return null;
    }

    static /* synthetic */ void access$300(SDKManager sDKManager) {
    }

    static /* synthetic */ AtomicBoolean access$400(SDKManager sDKManager) {
        return null;
    }

    static /* synthetic */ SDKManagerCallback access$500(SDKManager sDKManager) {
        return null;
    }

    static {
        SDKManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final SDKManager INSTANCE = new SDKManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ SDKManager access$100() {
            return null;
        }
    }
}

