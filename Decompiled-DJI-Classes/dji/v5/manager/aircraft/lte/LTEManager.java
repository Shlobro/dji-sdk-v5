/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.airlink.WlmDongleInfo;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.lte.BaseLTEManagerDelegate;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfo;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfoListener;
import dji.v5.manager.aircraft.lte.LTEDongleInfoListener;
import dji.v5.manager.aircraft.lte.LTELinkInfo;
import dji.v5.manager.aircraft.lte.LTELinkInfoListener;
import dji.v5.manager.aircraft.lte.LTELinkType;
import dji.v5.manager.aircraft.lte.LTEPrivatizationServerInfo;
import dji.v5.manager.interfaces.ILTEManager;
import java.util.List;

public class LTEManager
implements ILTEManager {
    private ProductType productType;
    private final List<LTEAuthenticationInfoListener> LTEAuthenticationInfoListeners;
    private final List<LTELinkInfoListener> LTELinkInfoListeners;
    private final List<LTEDongleInfoListener> LTEDongleInfoListeners;
    private BaseLTEManagerDelegate delegate;

    public static ILTEManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addLTEAuthenticationInfoListener(@NonNull LTEAuthenticationInfoListener lTEAuthenticationInfoListener) {
    }

    @Override
    public void removeLTEAuthenticationInfoListener(@NonNull LTEAuthenticationInfoListener lTEAuthenticationInfoListener) {
    }

    @Override
    public void clearAllLTEAuthenticationInfoListener() {
    }

    @Override
    public void updateLTEAuthenticationInfo(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getLTEAuthenticationVerificationCode(String string2, String string3, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startLTEAuthentication(String string2, String string3, String string4, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getLTEEnhancedTransmissionType(CommonCallbacks.CompletionCallbackWithParam<LTELinkType> completionCallbackWithParam) {
    }

    @Override
    public void setLTEEnhancedTransmissionType(@NonNull LTELinkType lTELinkType, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addLTELinkInfoListener(@NonNull LTELinkInfoListener lTELinkInfoListener) {
    }

    @Override
    public void removeLTELinkInfoListener(@NonNull LTELinkInfoListener lTELinkInfoListener) {
    }

    @Override
    public void clearAllLTELinkInfoListener() {
    }

    @Override
    public void addLTEDongleInfoListener(@NonNull LTEDongleInfoListener lTEDongleInfoListener) {
    }

    @Override
    public void removeLTEDongleInfoListener(@NonNull LTEDongleInfoListener lTEDongleInfoListener) {
    }

    @Override
    public void clearAllLTEDongleInfoListener() {
    }

    @Override
    public void setLTEAircraftPrivatizationServerInfo(@NonNull LTEPrivatizationServerInfo lTEPrivatizationServerInfo, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setLTERemoteControllerPrivatizationServerInfo(@NonNull LTEPrivatizationServerInfo lTEPrivatizationServerInfo, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void clearLTEAircraftPrivatizationServer(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void clearLTERemoteControllerPrivatizationServer(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private boolean updateDelegate(ProductType productType) {
        return false;
    }

    private void initDelegate() {
    }

    private void notifyLTEAuthenticationInfoListener(LTEAuthenticationInfo lTEAuthenticationInfo) {
    }

    private void notifyLTEAcDongleInfoListener(List<WlmDongleInfo> list) {
    }

    private void notifyLTERcDongleInfoListener(List<WlmDongleInfo> list) {
    }

    private void notifyLTELinkInfoListener(LTELinkInfo lTELinkInfo) {
    }

    private /* synthetic */ void lambda$init$0(ProductType productType, ProductType productType2) {
    }

    static /* synthetic */ BaseLTEManagerDelegate access$100(LTEManager lTEManager) {
        return null;
    }

    static /* synthetic */ void access$200(LTEManager lTEManager, List list) {
    }

    static /* synthetic */ void access$300(LTEManager lTEManager, List list) {
    }

    private static class LazyHolder {
        private static final LTEManager INSTANCE = new LTEManager();

        private LazyHolder() {
        }

        static /* synthetic */ LTEManager access$000() {
            return null;
        }
    }
}

