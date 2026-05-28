/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Pair
 *  androidx.annotation.Keep
 *  dji.v5.core.R$string
 *  io.reactivex.rxjava3.core.Flowable
 *  io.reactivex.rxjava3.disposables.Disposable
 *  io.reactivex.rxjava3.processors.BehaviorProcessor
 */
package dji.v5.inner.aircraft.lte;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.Keep;
import com.dji.mobileinfra.cloudcontrol.CloudControlConfiguration;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.airlink.LTEPrivatizationServerMsg;
import dji.sdk.keyvalue.value.airlink.LTEType;
import dji.sdk.keyvalue.value.airlink.WlmAgentFreqInfo;
import dji.sdk.keyvalue.value.airlink.WlmDongleListInfo;
import dji.sdk.keyvalue.value.airlink.WlmDongleSubscribeInfoMsg;
import dji.sdk.keyvalue.value.airlink.WlmNewDongleInfoMsg;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.sdk.keyvalue.value.remotecontroller.RcAppWorkStageMsg;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.core.R;
import dji.v5.inner.cloud.MSDKCloudControl;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfo;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfoListener;
import dji.v5.manager.aircraft.lte.LTELinkType;
import dji.v5.manager.areacode.AreaCode;
import dji.v5.manager.areacode.AreaCodeChangeListener;
import dji.v5.manager.areacode.AreaCodeData;
import dji.v5.network.IDJINetworkStatusListener;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LTEService {
    public static final String KEY_LTE_AIRCRAFT_PRIVATE_SERVER_INFO = "KEY_LTE_AIRCRAFT_PRIVATIZATION_SERVER_INFO";
    public static final String KEY_LTE_RC_PRIVATE_SERVER_INFO = "KEY_LTE_REMOTE_CONTROLLER_PRIVATIZATION_SERVER_INFO";
    public static final String KEY_LTE_LAST_TIME_ENABLE_STATE = "KEY_LTE_LAST_TIME_ENABLE_STATE";
    private final FeatureDesc featureDesc;
    private final PrivateFeatureDesc privateFeatureDesc;
    public static final String GET_VERIFY_CODE_URL = "/ds-path-rn/api/real-name/sms/send";
    public static final String BIND_URL = "/ds-path-rn/api/lte/bind";
    public static final String QUERY_BIND_STATE_URL = "/ds-path-rn/api/lte/info";
    public static final String SERVER_SUCCESS_MSG = "success";
    public static final int SERVER_SUCCESS_CODE = 0;
    public static final int PRODUCT_NOT_SUPPORT = 1001;
    public static final int AREA_NOT_SUPPORT = 1002;
    public static final String DONGLE_SUBSCRIBE_SERVICE_OVERDUE_HMS = "0x1F0B0032";
    private LTELinkType currentLTELinkType;
    private LTEPrivatizationServerMsg currentAcPrivatizationServerInfo;
    private LTEPrivatizationServerMsg currentRcPrivatizationServerInfo;
    private LTEAuthenticationInfo currentLTEAuthenticationInfo;
    private LTEAuthenticationInfoListener lteAuthenticationInfoListener;
    private LTEPrivatizationServerMsgListener LTEPrivatizationServerMsgListener;
    private static final List<String> LTE_BLOCK_COUNTRY_LIST = new ArrayList<String>();
    private static final List<String> LTE_NEED_BIND_COUNTRY_LIST = new ArrayList<String>(Collections.singletonList(AreaCode.CHINA.value()));
    private static final List<String> LTE_PRIVATE_BLOCK_COUNTRY_LIST = new ArrayList<String>();
    private Disposable acFetchExpiredDateDisposable;
    private Disposable rcFetchExpiredDateDisposable;
    private Disposable droneConnectDisposable;
    private Disposable networkInfoDisposable;
    private String broadcastPhone;
    private BehaviorProcessor<Boolean> currentDroneIsNeedBindObservable;
    private BehaviorProcessor<Boolean> currentDroneIsNeedBindObservableForPrivate;
    private BehaviorProcessor<ServerStatus> privateServerStatus;
    private BehaviorProcessor<Boolean> networkObservable;
    private BehaviorProcessor<FeatureDesc> cloudControlParamsObservable;
    private BehaviorProcessor<PrivateFeatureDesc> privateCloudControlParamsObservable;
    private BehaviorProcessor<String> areaCodeObservable;
    private BehaviorProcessor<Boolean> serverAllowShowLteFeatureObservable;
    private final MSDKCloudControl.OnCloudControlListener onCloudControlListener;
    private final IDJINetworkStatusListener networkStatusListener;
    private final AreaCodeChangeListener areaCodeChangeListener;

    private void setBindStateToDefault(String string2) {
    }

    public static LTEService getInstance() {
        return null;
    }

    public void init() {
    }

    public ServerStatus checkServer(LTEPrivatizationServerMsg lTEPrivatizationServerMsg, LTEPrivatizationServerMsg lTEPrivatizationServerMsg2) {
        return null;
    }

    private boolean serverEquals(LTEPrivatizationServerMsg lTEPrivatizationServerMsg, LTEPrivatizationServerMsg lTEPrivatizationServerMsg2) {
        return false;
    }

    private void handleDroneConnectedEvent() {
    }

    public void destroy() {
    }

    public void updateCurrentLTELinkType(LTELinkType lTELinkType) {
    }

    public LTEPrivatizationServerMsg getCurrentAcPrivatizationServerInfo() {
        return null;
    }

    public LTEPrivatizationServerMsg getCurrentRcPrivatizationServerInfo() {
        return null;
    }

    public void setLTEPrivatizationServerMsgListener(LTEPrivatizationServerMsgListener lTEPrivatizationServerMsgListener) {
    }

    public void onLTEPrivatizationServerMsgUpdate() {
    }

    public void setLteAuthenticationInfoListener(LTEAuthenticationInfoListener lTEAuthenticationInfoListener) {
    }

    public LTEAuthenticationInfo getCurrentLTEAuthenticationInfo() {
        return null;
    }

    public void onLTEAuthenticationInfoUpdate() {
    }

    public void updateLTEAuthenticationInfo(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void getLTEAuthenticationInfo(int n, String string2, String string3, String string4, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void getLteSendPhoneVerifyCode(String string2, String string3, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void startLTEAuthentication(String string2, String string3, String string4, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void getLteBind(String string2, String string3, String string4, String string5, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void updateLteCloudInterrelated() {
    }

    private void setServerAllowSdrLostOverTimeBlockTakeOff() {
    }

    private String getAreaCode() {
        return null;
    }

    private boolean isHasSetPrivateServerInfo() {
        return false;
    }

    private void setServerAllowSdrLostThenTakeOffIn3Min() {
    }

    private Map<String, String> getCommonHeaderParams() {
        return null;
    }

    public String userAgent() {
        return null;
    }

    private Pair<String, String> getSignature(String string2) {
        return null;
    }

    public LTEAuthenticationCheckResult canEnableLTE() {
        return null;
    }

    private boolean isPrivatizationServerOn() {
        return false;
    }

    private boolean isNeedAuthentication() {
        return false;
    }

    public boolean isSupportLTEPrivate() {
        return false;
    }

    private boolean isServerParamNeedAuthentication() {
        return false;
    }

    public IDJIError needAuthentication(String string2) {
        return null;
    }

    public boolean isCloudParamNeedAuthentication(String string2) {
        return false;
    }

    public IDJIError isSupportLTE(String string2) {
        return null;
    }

    public boolean hasInsertDongle(WlmDongleListInfo wlmDongleListInfo) {
        return false;
    }

    public boolean dongleHasInsertedSimCard(WlmDongleListInfo wlmDongleListInfo) {
        return false;
    }

    public boolean dongleHasInsertedESimCard(WlmNewDongleInfoMsg wlmNewDongleInfoMsg) {
        return false;
    }

    public boolean dongleNeedForceUpgrade(WlmDongleListInfo wlmDongleListInfo) {
        return false;
    }

    public boolean isLteLinkInitComplete() {
        return false;
    }

    public boolean isInSlowMotion() {
        return false;
    }

    public void setIpAddress() {
    }

    public void setCfgFilePath(Context context) {
    }

    public void setPhoneUniqueId() {
    }

    public void setNetWorkType(Context context) {
    }

    private void subscribeWifiInfo() {
    }

    public Flowable<Integer> canEnableLteObserver() {
        return null;
    }

    public Flowable<Boolean> getLteFeatureVisibilityObr() {
        return null;
    }

    private boolean isLteFeatureVisible() {
        return false;
    }

    private Boolean supportChannelB() {
        return null;
    }

    public boolean isChannelB() {
        return false;
    }

    public boolean isRcPlus() {
        return false;
    }

    private Boolean supportLteFeature() {
        return null;
    }

    private Flowable<Boolean> getAcLteIsNeedBindFlowable() {
        return null;
    }

    public Flowable<ServerStatus> getPrivateServerStatusFlowable() {
        return null;
    }

    private Flowable<Boolean> getNetworkObservableFlowable() {
        return null;
    }

    private Flowable<Boolean> getServerAllowShowLteFeatureFlowable() {
        return null;
    }

    private boolean isServerAllowShowLteFeature() {
        return false;
    }

    private void subscribeAppNetworkInfo() {
    }

    private void sendNetInfo(LTEType lTEType) {
    }

    private void unSubscribeInfo() {
    }

    private boolean isInTracking() {
        return false;
    }

    private boolean isDongleVasExpired() {
        return false;
    }

    private void refreshDongleVasExpiredDate() {
    }

    private LTEAuthenticationInfo parseLTEAuthenticationInfo(BindStateQueryModel bindStateQueryModel) {
        return null;
    }

    public void broadcastPhoneNumber() {
    }

    public void saveLteEnableState(Boolean bl) {
    }

    public Boolean getLastLteEnableState() {
        return null;
    }

    public void saveLTEPrivatizationServerInfo(Boolean bl, LTEPrivatizationServerMsg lTEPrivatizationServerMsg) {
    }

    public String getLTEPrivatizationServerInfo(Boolean bl) {
        return null;
    }

    public void removeLTEPrivatizationServerInfo(Boolean bl) {
    }

    private static /* synthetic */ void lambda$refreshDongleVasExpiredDate$25(Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$refreshDongleVasExpiredDate$24(WlmDongleSubscribeInfoMsg wlmDongleSubscribeInfoMsg) throws Throwable {
    }

    private static /* synthetic */ void lambda$refreshDongleVasExpiredDate$23(Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$refreshDongleVasExpiredDate$22(WlmDongleSubscribeInfoMsg wlmDongleSubscribeInfoMsg) throws Throwable {
    }

    private /* synthetic */ void lambda$subscribeAppNetworkInfo$21(Long l2) throws Throwable {
    }

    private static /* synthetic */ Boolean lambda$getServerAllowShowLteFeatureFlowable$20(Boolean bl, FeatureDesc featureDesc, String string2) throws Throwable {
        return null;
    }

    private static /* synthetic */ Boolean lambda$getServerAllowShowLteFeatureFlowable$19(PrivateFeatureDesc privateFeatureDesc, String string2) throws Throwable {
        return null;
    }

    private /* synthetic */ Boolean lambda$getLteFeatureVisibilityObr$18(Object object) throws Throwable {
        return null;
    }

    private /* synthetic */ Integer lambda$canEnableLteObserver$17(Object object) throws Throwable {
        return null;
    }

    private /* synthetic */ void lambda$subscribeWifiInfo$16(WlmAgentFreqInfo wlmAgentFreqInfo, DJIKey.ActionKey actionKey, RcAppWorkStageMsg rcAppWorkStageMsg, DJIKey dJIKey, Long l2) throws Throwable {
    }

    private static /* synthetic */ void lambda$setServerAllowSdrLostThenTakeOffIn3Min$15(boolean bl, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$setServerAllowSdrLostThenTakeOffIn3Min$14(boolean bl) throws Throwable {
    }

    private static /* synthetic */ void lambda$setServerAllowSdrLostOverTimeBlockTakeOff$13(boolean bl, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$setServerAllowSdrLostOverTimeBlockTakeOff$12(boolean bl) throws Throwable {
    }

    private static /* synthetic */ void lambda$startLTEAuthentication$11(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$startLTEAuthentication$10(String string2, String string3, String string4, CommonCallbacks.CompletionCallback completionCallback, String string5) throws Throwable {
    }

    private static /* synthetic */ void lambda$updateLTEAuthenticationInfo$9(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$updateLTEAuthenticationInfo$8(CommonCallbacks.CompletionCallback completionCallback, AuthenticationInfo authenticationInfo) throws Throwable {
    }

    private static /* synthetic */ AuthenticationInfo lambda$updateLTEAuthenticationInfo$7(String string2, String string3, ProductType productType) throws Throwable {
        return null;
    }

    private /* synthetic */ boolean lambda$init$6(ServerStatus serverStatus, ServerStatus serverStatus2) throws Throwable {
        return false;
    }

    private /* synthetic */ void lambda$init$5(ServerStatus serverStatus) throws Throwable {
    }

    private /* synthetic */ ServerStatus lambda$init$4(LTEPrivatizationServerMsg lTEPrivatizationServerMsg, LTEPrivatizationServerMsg lTEPrivatizationServerMsg2) throws Throwable {
        return null;
    }

    private /* synthetic */ void lambda$init$3(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$new$2(AreaCodeData areaCodeData, AreaCodeData areaCodeData2) {
    }

    private /* synthetic */ void lambda$new$1(boolean bl) {
    }

    private /* synthetic */ void lambda$new$0(CloudControlConfiguration cloudControlConfiguration) {
    }

    static /* synthetic */ BehaviorProcessor access$300(LTEService lTEService) {
        return null;
    }

    static /* synthetic */ LTEAuthenticationInfo access$402(LTEService lTEService, LTEAuthenticationInfo lTEAuthenticationInfo) {
        return null;
    }

    static /* synthetic */ LTEAuthenticationInfo access$500(LTEService lTEService, BindStateQueryModel bindStateQueryModel) {
        return null;
    }

    static /* synthetic */ LTEAuthenticationInfo access$400(LTEService lTEService) {
        return null;
    }

    static /* synthetic */ BehaviorProcessor access$600(LTEService lTEService) {
        return null;
    }

    static /* synthetic */ List access$700() {
        return null;
    }

    static /* synthetic */ List access$800() {
        return null;
    }

    static /* synthetic */ List access$900() {
        return null;
    }

    @Keep
    private static final class BindStateQueryModel {
        public Data data;
        public String msg;
        public Integer status;

        private BindStateQueryModel() {
        }
    }

    @Keep
    private static class FeatureDesc {
        private List<String> notSupportArea;
        private List<String> forbidTakeOffLteOnly;
        private List<String> forbidGoAroundLteOnly;
        private final List<String> bindArea;

        private FeatureDesc() {
        }

        public void reset() {
        }

        private void update(List<String> list, List<String> list2, List<String> list3) {
        }

        public boolean supportLte(String string2) {
            return false;
        }

        public boolean needBind(String string2) {
            return false;
        }

        public boolean canTakeOffWithoutSdr(String string2) {
            return false;
        }

        public boolean canGoAroundWithoutSdr(String string2) {
            return false;
        }

        public void update(SupportInfo supportInfo) {
        }

        /* synthetic */ FeatureDesc(1 var1_1) {
        }
    }

    @Keep
    private static class PrivateFeatureDesc {
        private List<String> blockArea;
        private List<String> allowTakeOffLteOnly;
        private List<String> allowGoAroundLteOnly;

        private PrivateFeatureDesc() {
        }

        public void reset() {
        }

        private void update(List<String> list, List<String> list2, List<String> list3) {
        }

        public boolean supportLtePrivate(String string2) {
            return false;
        }

        public boolean needBind(String string2) {
            return false;
        }

        public boolean canTakeOffLTEOnly(String string2) {
            return false;
        }

        public boolean canGoAroundLteOnly(String string2) {
            return false;
        }

        public void update(PrivateSupportInfo privateSupportInfo) {
        }

        /* synthetic */ PrivateFeatureDesc(1 var1_1) {
        }
    }

    public static interface LTEPrivatizationServerMsgListener {
        public void onLTEPrivatizationServerMsgUpdated(LTEPrivatizationServerMsg var1, LTEPrivatizationServerMsg var2);
    }

    public static final class ServerStatus
    extends Enum<ServerStatus> {
        public static final /* enum */ ServerStatus EMPTY = new ServerStatus();
        public static final /* enum */ ServerStatus DIFFERENT = new ServerStatus();
        public static final /* enum */ ServerStatus SAME = new ServerStatus();
        private static final /* synthetic */ ServerStatus[] $VALUES;

        public static ServerStatus[] values() {
            return null;
        }

        public static ServerStatus valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ ServerStatus[] $values() {
            return null;
        }

        static {
            $VALUES = ServerStatus.$values();
        }
    }

    private static class LazyHolder {
        private static final LTEService INSTANCE = new LTEService();

        private LazyHolder() {
        }

        static /* synthetic */ LTEService access$200() {
            return null;
        }
    }

    @Keep
    private static class SupportInfo {
        List<String> lte_feature_support_country_code;
        List<String> lte_feature_not_support_country_code;
        List<String> sdr_lost_block_motor_before_takeoff_country_code;
        List<String> sdr_lost_block_motor_land_over_3min_country_code;

        private SupportInfo() {
        }
    }

    @Keep
    private static class PrivateSupportInfo {
        List<String> lte_feature_block_country_code;
        List<String> lte_only_allow_takeoff_country_code;
        List<String> lte_only_allow_go_around_within_3_minu_country_code;

        private PrivateSupportInfo() {
        }
    }

    @Keep
    public static final class LTEAuthenticationCheckResult
    extends Enum<LTEAuthenticationCheckResult> {
        public static final /* enum */ LTEAuthenticationCheckResult NONE = new LTEAuthenticationCheckResult(-1);
        public static final /* enum */ LTEAuthenticationCheckResult LTE_CAN_ENABLE = new LTEAuthenticationCheckResult(0);
        public static final /* enum */ LTEAuthenticationCheckResult AIRCRAFT_FW_VERSION_NOT_SUPPORT_LTE = new LTEAuthenticationCheckResult(1, R.string.fpv_tip_0x1F0B002A);
        public static final /* enum */ LTEAuthenticationCheckResult AIRCRAFT_NO_DONGLE = new LTEAuthenticationCheckResult(2);
        public static final /* enum */ LTEAuthenticationCheckResult AIRCRAFT_DONGLE_NO_SIM_CARD = new LTEAuthenticationCheckResult(3, R.string.fpv_topbar_transmission_lte_aircraft_no_sim_card_tip);
        public static final /* enum */ LTEAuthenticationCheckResult AIRCRAFT_DONGLE_NEED_FORCE_UPGRADE = new LTEAuthenticationCheckResult(4, R.string.fpv_tip_0x1F0B0020);
        public static final /* enum */ LTEAuthenticationCheckResult APP_NETWORK_UNAVAILABLE = new LTEAuthenticationCheckResult(5, R.string.fpv_topbar_transmission_lte_ground_lte_off);
        public static final /* enum */ LTEAuthenticationCheckResult DJI_RC_NETWORK_UNAVAILABLE = new LTEAuthenticationCheckResult(6, R.string.fpv_topbar_transmission_lte_ground_lte_off);
        public static final /* enum */ LTEAuthenticationCheckResult LDM_OPENED = new LTEAuthenticationCheckResult(7, R.string.ldm_setting_item_ldm_title);
        public static final /* enum */ LTEAuthenticationCheckResult LTE_LINK_NOT_INIT_COMPLETE = new LTEAuthenticationCheckResult(8, R.string.fpv_topbar_transmission_lte_connect_now_tip);
        public static final /* enum */ LTEAuthenticationCheckResult LTE_NEED_AUTHENTICATION = new LTEAuthenticationCheckResult(9);
        public static final /* enum */ LTEAuthenticationCheckResult TRACKING_BLOCK_ENABLE = new LTEAuthenticationCheckResult(10);
        public static final /* enum */ LTEAuthenticationCheckResult SLOW_MOTION_CAN_NOT_ENABLE = new LTEAuthenticationCheckResult(11);
        public static final /* enum */ LTEAuthenticationCheckResult UPGRADING_CAN_NOT_ENABLE = new LTEAuthenticationCheckResult(12);
        public static final /* enum */ LTEAuthenticationCheckResult SDR_WEAK = new LTEAuthenticationCheckResult(13);
        public static final /* enum */ LTEAuthenticationCheckResult SDR_LOST = new LTEAuthenticationCheckResult(14);
        public static final /* enum */ LTEAuthenticationCheckResult DJI_RC_NO_DONGLE = new LTEAuthenticationCheckResult(15, R.string.fpv_topbar_transmission_lte_ground_no_celluar);
        public static final /* enum */ LTEAuthenticationCheckResult DJI_RC_DONGLE_NO_SIM_CARD = new LTEAuthenticationCheckResult(16, R.string.fpv_topbar_transmission_lte_ground_no_sim_card_tip);
        public static final /* enum */ LTEAuthenticationCheckResult DJI_RC_DONGLE_NEED_FORCE_UPGRADE = new LTEAuthenticationCheckResult(17, R.string.firmware_upgrade_need_update_rc_4g);
        public static final /* enum */ LTEAuthenticationCheckResult RC_FW_VERSION_NOT_SUPPORT_LTE = new LTEAuthenticationCheckResult(18, R.string.fpv_tip_0x1F0B002B);
        public static final /* enum */ LTEAuthenticationCheckResult LTE_SERVICE_OVER_DUE = new LTEAuthenticationCheckResult(19);
        public static final /* enum */ LTEAuthenticationCheckResult LTE_SERVER_EXCEPTION = new LTEAuthenticationCheckResult(20, R.string.fpv_topbar_transmission_lte_certification_service_error_toast);
        public static final /* enum */ LTEAuthenticationCheckResult LTE_NOT_SUPPORTED_IN_CURRENT_AREA = new LTEAuthenticationCheckResult(100);
        public static final /* enum */ LTEAuthenticationCheckResult DONGLE_VAS_EXPIRED = new LTEAuthenticationCheckResult(1000, R.string.fpv_topbar_transmission_lte_not_support);
        private final int code;
        private final int resId;
        private String msg;
        private static LTEAuthenticationCheckResult[] values;
        private static final /* synthetic */ LTEAuthenticationCheckResult[] $VALUES;

        public static LTEAuthenticationCheckResult[] values() {
            return null;
        }

        public static LTEAuthenticationCheckResult valueOf(String string2) {
            return null;
        }

        private LTEAuthenticationCheckResult(int n2, int n3) {
        }

        private LTEAuthenticationCheckResult(int n2) {
        }

        public int value() {
            return 0;
        }

        public int resId() {
            return 0;
        }

        public String msg() {
            return null;
        }

        public LTEAuthenticationCheckResult msg(String string2) {
            return null;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static LTEAuthenticationCheckResult[] getValues() {
            return null;
        }

        public static LTEAuthenticationCheckResult find(int n) {
            return null;
        }

        private static /* synthetic */ LTEAuthenticationCheckResult[] $values() {
            return null;
        }

        static /* synthetic */ int access$1000(LTEAuthenticationCheckResult lTEAuthenticationCheckResult) {
            return 0;
        }

        static {
            $VALUES = LTEAuthenticationCheckResult.$values();
        }
    }

    @Keep
    private static final class Data {
        public BindInfo bind_info;
        public Boolean is_allowed_to_use_lte;
        public Boolean is_need_bind;

        private Data() {
        }
    }

    @Keep
    public static final class BindInfo {
        public String country_code;
        public String phone;
        public String masked_phone;
        public Integer last_bind_time;
        public Integer bind_expiration_time;
        public Integer bind_remain_time;
        public Integer bind_duration_time;
    }

    @Keep
    private static class AuthenticationInfo {
        int productTypeValue;
        String fcFwVersion;
        String fcSn;
        String areaCode;

        public AuthenticationInfo(ProductType productType, String string2, String string3, String string4) {
        }
    }

    @Keep
    public static final class LTEAuthenticationResult
    extends Enum<LTEAuthenticationResult> {
        public static final /* enum */ LTEAuthenticationResult SUCCESS = new LTEAuthenticationResult(0);
        public static final /* enum */ LTEAuthenticationResult PARSE = new LTEAuthenticationResult(-1);
        public static final /* enum */ LTEAuthenticationResult NETWORK_FAILURE = new LTEAuthenticationResult(-2);
        public static final /* enum */ LTEAuthenticationResult UNKNOWN = new LTEAuthenticationResult(-3);
        public static final /* enum */ LTEAuthenticationResult SN_NULL = new LTEAuthenticationResult(-4);
        public static final /* enum */ LTEAuthenticationResult NORMAL = new LTEAuthenticationResult(1);
        public static final /* enum */ LTEAuthenticationResult PARAMETER = new LTEAuthenticationResult(2);
        public static final /* enum */ LTEAuthenticationResult UAS_NOT_FOUND = new LTEAuthenticationResult(700);
        public static final /* enum */ LTEAuthenticationResult IP_NOT_IN_AREA = new LTEAuthenticationResult(702);
        public static final /* enum */ LTEAuthenticationResult UAS_SERVER_DOWN = new LTEAuthenticationResult(704);
        public static final /* enum */ LTEAuthenticationResult SN_NOT_FOUND = new LTEAuthenticationResult(705);
        public static final /* enum */ LTEAuthenticationResult DONT_NEED = new LTEAuthenticationResult(706);
        public static final /* enum */ LTEAuthenticationResult SEND_SMS_FAILURE = new LTEAuthenticationResult(801);
        public static final /* enum */ LTEAuthenticationResult SMS_CHECK_FAILURE = new LTEAuthenticationResult(802);
        public static final /* enum */ LTEAuthenticationResult PHONE_NUMBER_NULL = new LTEAuthenticationResult(901);
        public static final /* enum */ LTEAuthenticationResult PRODUCT_NOT_SUPPORT = new LTEAuthenticationResult(1001);
        public static final /* enum */ LTEAuthenticationResult AREA_NOT_SUPPORT = new LTEAuthenticationResult(1002);
        private final int code;
        private static LTEAuthenticationResult[] values;
        private static final /* synthetic */ LTEAuthenticationResult[] $VALUES;

        public static LTEAuthenticationResult[] values() {
            return null;
        }

        public static LTEAuthenticationResult valueOf(String string2) {
            return null;
        }

        private LTEAuthenticationResult(int n2) {
        }

        public boolean success() {
            return false;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static LTEAuthenticationResult[] getValues() {
            return null;
        }

        public static LTEAuthenticationResult find(int n) {
            return null;
        }

        private static /* synthetic */ LTEAuthenticationResult[] $values() {
            return null;
        }

        static {
            $VALUES = LTEAuthenticationResult.$values();
        }
    }

    @Keep
    public static final class SimpleResponseModel {
        public String msg;
        public Integer status;
    }
}

