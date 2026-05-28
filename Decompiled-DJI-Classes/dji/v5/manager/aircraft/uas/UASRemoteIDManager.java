/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.aircraft.uas;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.inner.aircraft.uas.DefaultUASDelegate;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.aircraft.uas.CClassStatus;
import dji.v5.manager.aircraft.uas.CClassStatusListener;
import dji.v5.manager.aircraft.uas.ElectronicIDStatus;
import dji.v5.manager.aircraft.uas.ElectronicIDStatusListener;
import dji.v5.manager.aircraft.uas.OperatorRegistrationNumberStatus;
import dji.v5.manager.aircraft.uas.OperatorRegistrationNumberStatusListener;
import dji.v5.manager.aircraft.uas.RealNameRegistrationStatus;
import dji.v5.manager.aircraft.uas.RealNameRegistrationStatusListener;
import dji.v5.manager.aircraft.uas.UARegistrationNumberStatus;
import dji.v5.manager.aircraft.uas.UARegistrationNumberStatusListener;
import dji.v5.manager.aircraft.uas.UASRemoteIDStatus;
import dji.v5.manager.aircraft.uas.UASRemoteIDStatusListener;
import dji.v5.manager.areacode.AreaCode;
import dji.v5.manager.areacode.AreaCodeData;
import dji.v5.manager.interfaces.IUASRemoteIDManager;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class UASRemoteIDManager
implements IUASRemoteIDManager {
    private IUASRemoteIDManager delegate;
    @Deprecated
    private AreaCode lastSetAreaCode;
    private AreaStrategy areaStrategy;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private AreaCodeData realAreaCodeData;
    private boolean isCEC0Support;
    private boolean isCEC1Support;
    private final List<UARegistrationNumberStatusListener> registrationNumberStatusList;
    private UARegistrationNumberStatus uaRegistrationNumberStatus;
    private final List<ElectronicIDStatusListener> electronicIDStatusListenerList;
    private ElectronicIDStatus electronicIDStatus;
    private final List<OperatorRegistrationNumberStatusListener> operatorRegistrationNumberStatusListeners;
    private OperatorRegistrationNumberStatus operatorRegistrationNumberStatus;
    private final List<CClassStatusListener> cClassStatusListenerStatusListeners;
    private CClassStatus cClassStatus;
    public final List<RealNameRegistrationStatusListener> realNameRegistrationStatusListenerList;
    private RealNameRegistrationStatus realNameRegistrationStatus;
    public List<UASRemoteIDStatusListener> uasRemoteIDStatusListenerList;
    private UASRemoteIDStatus uasRemoteIDStatus;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_16;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_17;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_18;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_19;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_20;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_21;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_22;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_23;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_24;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_25;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_26;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_27;

    public static UASRemoteIDManager getInstance() {
        return null;
    }

    private UASRemoteIDManager() {
    }

    @Override
    public void init() {
    }

    private void setEuCeCertificationRestriction() {
    }

    @Override
    public void destroy() {
    }

    @Override
    @TrackEvent(eventName="setAreaCode", category="ManagerAnnotation")
    public IDJIError setAreaCode(@TrackElements(value="areaCode") AreaCode areaCode) {
        return null;
    }

    @Override
    @TrackEvent(eventName="setUASRemoteIDAreaStrategy", category="ManagerAnnotation")
    public IDJIError setUASRemoteIDAreaStrategy(@TrackElements(value="strategy") AreaStrategy areaStrategy) {
        return null;
    }

    @Override
    @TrackEvent(eventName="setElectronicIDEnabled", category="ManagerAnnotation")
    public void setElectronicIDEnabled(boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="getElectronicIDEnabled", category="ManagerAnnotation")
    public void getElectronicIDEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="addElectronicIDStatusListener", category="ManagerAnnotation")
    public void addElectronicIDStatusListener(ElectronicIDStatusListener electronicIDStatusListener) {
    }

    @Override
    @TrackEvent(eventName="removeElectronicIDStatusListener", category="ManagerAnnotation")
    public void removeElectronicIDStatusListener(ElectronicIDStatusListener electronicIDStatusListener) {
    }

    @Override
    @TrackEvent(eventName="clearAllElectronicIDStatusListener", category="ManagerAnnotation")
    public void clearAllElectronicIDStatusListener() {
    }

    @Override
    @TrackEvent(eventName="setUARegistrationNumber", category="ManagerAnnotation")
    public void setUARegistrationNumber(String string2, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="getUARegistrationNumber", category="ManagerAnnotation")
    public void getUARegistrationNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="addUARegistrationNumberStatusListener", category="ManagerAnnotation")
    public void addUARegistrationNumberStatusListener(UARegistrationNumberStatusListener uARegistrationNumberStatusListener) {
    }

    @Override
    @TrackEvent(eventName="removeUARegistrationNumberStatusListener", category="ManagerAnnotation")
    public void removeUARegistrationNumberStatusListener(UARegistrationNumberStatusListener uARegistrationNumberStatusListener) {
    }

    @Override
    @TrackEvent(eventName="clearAllUARegistrationNumberStatusListener", category="ManagerAnnotation")
    public void clearAllUARegistrationNumberStatusListener() {
    }

    @Override
    @TrackEvent(eventName="getUASRemoteIDStatus", category="ManagerAnnotation")
    public UASRemoteIDStatus getUASRemoteIDStatus() {
        return null;
    }

    @Override
    @TrackEvent(eventName="addUASRemoteIDStatusListener", category="ManagerAnnotation")
    public void addUASRemoteIDStatusListener(UASRemoteIDStatusListener uASRemoteIDStatusListener) {
    }

    @Override
    @TrackEvent(eventName="removeUASRemoteIDStatusListener", category="ManagerAnnotation")
    public void removeUASRemoteIDStatusListener(UASRemoteIDStatusListener uASRemoteIDStatusListener) {
    }

    @Override
    @TrackEvent(eventName="clearUASRemoteIDStatusListener", category="ManagerAnnotation")
    public void clearUASRemoteIDStatusListener() {
    }

    @Override
    @TrackEvent(eventName="setOperatorRegistrationNumber", category="ManagerAnnotation")
    public void setOperatorRegistrationNumber(String string2, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="getOperatorRegistrationNumber", category="ManagerAnnotation")
    public void getOperatorRegistrationNumber(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    @Override
    @TrackEvent(eventName="addOperatorRegistrationNumberStatusListener", category="ManagerAnnotation")
    public void addOperatorRegistrationNumberStatusListener(OperatorRegistrationNumberStatusListener operatorRegistrationNumberStatusListener) {
    }

    @Override
    @TrackEvent(eventName="removeOperatorRegistrationNumberStatusListener", category="ManagerAnnotation")
    public void removeOperatorRegistrationNumberStatusListener(OperatorRegistrationNumberStatusListener operatorRegistrationNumberStatusListener) {
    }

    @Override
    @TrackEvent(eventName="clearAllOperatorRegistrationNumberStatusListener", category="ManagerAnnotation")
    public void clearAllOperatorRegistrationNumberStatusListener() {
    }

    @Override
    @TrackEvent(eventName="addCClassStatusListener", category="ManagerAnnotation")
    public void addCClassStatusListener(CClassStatusListener cClassStatusListener) {
    }

    @Override
    @TrackEvent(eventName="removeCClassStatusListener", category="ManagerAnnotation")
    public void removeCClassStatusListener(CClassStatusListener cClassStatusListener) {
    }

    @Override
    @TrackEvent(eventName="clearAllCClassStatusListener", category="ManagerAnnotation")
    public void clearAllCClassStatusListener() {
    }

    @Override
    @TrackEvent(eventName="addRealNameRegistrationStatusListener", category="ManagerAnnotation")
    public void addRealNameRegistrationStatusListener(RealNameRegistrationStatusListener realNameRegistrationStatusListener) {
    }

    @Override
    @TrackEvent(eventName="removeRealNameRegistrationStatusListener", category="ManagerAnnotation")
    public void removeRealNameRegistrationStatusListener(RealNameRegistrationStatusListener realNameRegistrationStatusListener) {
    }

    @Override
    @TrackEvent(eventName="clearAllRealNameRegistrationStatusListener", category="ManagerAnnotation")
    public void clearAllRealNameRegistrationStatusListener() {
    }

    @Override
    @TrackEvent(eventName="updateRealNameRegistrationStateFromUOM", category="ManagerAnnotation")
    public void updateRealNameRegistrationStateFromUOM(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setRealNameTag(String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getRealNameTag(CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    private void updateElectronicIDStatus() {
    }

    private void updateUARegistrationNumberStatus() {
    }

    private void updateRemoteIDStatus() {
    }

    private void updateOperatorRegistrationNumberStatus() {
    }

    private void updateCClassStatus() {
    }

    private void updateRealNameRegistrationStatus() {
    }

    private void initDelegate() {
    }

    private IUASRemoteIDManager updateDelegate(AreaCode areaCode) {
        return null;
    }

    private IUASRemoteIDManager updateDelegate(AreaStrategy areaStrategy) {
        return null;
    }

    private boolean isNotAllowSetChina(AreaCode areaCode, AreaCode areaCode2) {
        return false;
    }

    private /* synthetic */ void lambda$initDelegate$8(CClassStatus cClassStatus) {
    }

    private /* synthetic */ void lambda$initDelegate$7(OperatorRegistrationNumberStatus operatorRegistrationNumberStatus) {
    }

    private /* synthetic */ void lambda$initDelegate$6(ElectronicIDStatus electronicIDStatus) {
    }

    private /* synthetic */ void lambda$initDelegate$5(UARegistrationNumberStatus uARegistrationNumberStatus) {
    }

    private /* synthetic */ void lambda$initDelegate$4(UASRemoteIDStatus uASRemoteIDStatus) {
    }

    private /* synthetic */ void lambda$initDelegate$3(RealNameRegistrationStatus realNameRegistrationStatus) {
    }

    private /* synthetic */ void lambda$init$2(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$1(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$init$0(AreaCodeData areaCodeData, AreaCodeData areaCodeData2) {
    }

    /* synthetic */ UASRemoteIDManager(1 var1_1) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$200(UASRemoteIDManager uASRemoteIDManager) {
        return null;
    }

    static {
        UASRemoteIDManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class UASRemoteIDManagerHolder {
        private static final UASRemoteIDManager INSTANCE = new UASRemoteIDManager(null);

        private UASRemoteIDManagerHolder() {
        }

        static /* synthetic */ UASRemoteIDManager access$000() {
            return null;
        }
    }

    private static class DefaultUASDelegateImpl
    extends DefaultUASDelegate {
        public DefaultUASDelegateImpl(boolean bl, AreaStrategy areaStrategy) {
        }

        @Override
        public void furtherUpdateRemoteIDStatus() {
        }
    }
}

