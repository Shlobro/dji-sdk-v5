/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  dji.v5.core.R$string
 */
package dji.v5.manager.diagnostic;

import android.os.Handler;
import dji.sdk.keyvalue.value.diagnostic.HMSDiagnostic;
import dji.sdk.keyvalue.value.flightassistant.LandingProtectionState;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.core.R;
import dji.v5.inner.diagnostic.fly.DiagnosticRepository;
import dji.v5.manager.diagnostic.DJIDeviceHealthInfo;
import dji.v5.manager.diagnostic.DJIDeviceHealthInfoChangeListener;
import dji.v5.manager.diagnostic.MSDKDeviceHealthInfo;
import dji.v5.manager.diagnostic.WarningLevel;
import dji.v5.manager.interfaces.IDeviceHealthManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class DeviceHealthManager
implements IDeviceHealthManager {
    public static final Long NOT_SAFE_LANDING_CODE = 522190848L;
    private static final MSDKDeviceHealthInfo NOT_SAFE_LANDING_DIAGNOSTIC = new MSDKDeviceHealthInfo(NOT_SAFE_LANDING_CODE.toString(), WarningLevel.WARNING, R.string.fpv_basic_flight_not_suitable_landing_dialogue_content);
    private final List<MSDKDeviceHealthInfo> MSDKDJIDeviceHealthInfos;
    private final Handler handler;
    private static final int MSDK_DIAGNOSTIC_HOLDING_TIME = 10000;
    private final List<DJIDeviceHealthInfoChangeListener> listeners;
    private final List<DJIDeviceHealthInfo> healthInfos;
    private Set<Long> lastCSDKCodes;
    private final DiagnosticRepository flyAppDiagnosticRepository;
    private ProductType productType;
    private long csdkHmsListenerId;
    private static final ArrayList<String> BLACK_LIST = new ArrayList();
    private static final ArrayList<String> WHITE_LIST = new ArrayList<String>(Collections.singletonList("0x164A1005"));

    private DeviceHealthManager() {
    }

    public static IDeviceHealthManager getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addDJIDeviceHealthInfoChangeListener(DJIDeviceHealthInfoChangeListener dJIDeviceHealthInfoChangeListener) {
    }

    @Override
    public void removeDJIDeviceHealthInfoChangeListener(DJIDeviceHealthInfoChangeListener dJIDeviceHealthInfoChangeListener) {
    }

    @Override
    public List<DJIDeviceHealthInfo> getCurrentDJIDeviceHealthInfos() {
        return null;
    }

    @Override
    public void clearAllListeners() {
    }

    private void notifyListeners(List<DJIDeviceHealthInfo> list) {
    }

    private synchronized void updateHealthInfos(List<HMSDiagnostic> list, boolean bl) {
    }

    private boolean hmsNeeded(long l2) {
        return false;
    }

    private /* synthetic */ void lambda$init$6(LandingProtectionState landingProtectionState, LandingProtectionState landingProtectionState2) {
    }

    private /* synthetic */ void lambda$init$5() {
    }

    private /* synthetic */ void lambda$init$4(ProductType productType, ProductType productType2) {
    }

    private /* synthetic */ void lambda$init$3(int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$init$2(Boolean bl, Boolean bl2) {
    }

    private static /* synthetic */ void lambda$init$1(boolean bl) {
    }

    private /* synthetic */ void lambda$init$0() {
    }

    /* synthetic */ DeviceHealthManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final DeviceHealthManager INSTANCE = new DeviceHealthManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ DeviceHealthManager access$100() {
            return null;
        }
    }
}

