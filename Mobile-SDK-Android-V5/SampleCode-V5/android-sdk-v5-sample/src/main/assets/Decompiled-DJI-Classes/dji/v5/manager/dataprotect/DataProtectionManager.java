/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.dataprotect;

import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.manager.dataprotect.ProtectedData;
import dji.v5.manager.interfaces.IDataProtectionManager;
import java.util.List;
import java.util.Set;
import org.aspectj.lang.JoinPoint;

public class DataProtectionManager
implements IDataProtectionManager {
    private final String tag;
    private final Set<ProtectedData> currentData;
    private boolean isProductImprovementAgreed;
    private static final String IS_PRODUCT_IMPROVEMENT_AGREED = "IS_PRODUCT_IMPROVEMENT_AGREED";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;

    private DataProtectionManager() {
    }

    public static IDataProtectionManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public boolean authorizeAccessToProtectedData(List<ProtectedData> list) {
        return false;
    }

    @Override
    public boolean deAuthorizeAccessToProtectedData(List<ProtectedData> list) {
        return false;
    }

    @Override
    public boolean deAuthorizeAccessToAllProtectedData() {
        return false;
    }

    @Override
    public boolean isAccessibleToProtectedData(ProtectedData protectedData) {
        return false;
    }

    @Override
    public void agreeToProductImprovement(boolean bl) {
    }

    @Override
    public boolean isAgreeToProductImprovement() {
        return false;
    }

    @Override
    public String getMSDKLogPath() {
        return null;
    }

    @Override
    @TrackEvent(eventName="clearMSDKLog", category="ManagerAnnotation")
    public boolean clearMSDKLog() {
        return false;
    }

    @Override
    @TrackEvent(eventName="enableMSDKLog", category="ManagerAnnotation")
    public void enableMSDKLog(@TrackElements(value="enable") boolean bl) {
    }

    @Override
    public boolean isMSDKLogEnabled() {
        return false;
    }

    private void updateIsAgreeToProductImprovement(boolean bl) {
    }

    /* synthetic */ DataProtectionManager(1 var1_1) {
    }

    static /* synthetic */ String access$200(DataProtectionManager dataProtectionManager) {
        return null;
    }

    static /* synthetic */ void access$300(DataProtectionManager dataProtectionManager, boolean bl) {
    }

    static {
        DataProtectionManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final IDataProtectionManager INSTANCE = new DataProtectionManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ IDataProtectionManager access$100() {
            return null;
        }
    }
}

