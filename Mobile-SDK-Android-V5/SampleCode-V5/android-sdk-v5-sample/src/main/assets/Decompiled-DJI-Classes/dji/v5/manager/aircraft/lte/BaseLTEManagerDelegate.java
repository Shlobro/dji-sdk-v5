/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  io.reactivex.rxjava3.core.CompletableEmitter
 *  io.reactivex.rxjava3.core.CompletableSource
 *  io.reactivex.rxjava3.disposables.CompositeDisposable
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.airlink.LTEPrivatizationServerMsg;
import dji.sdk.keyvalue.value.airlink.WlmDongleInfo;
import dji.sdk.keyvalue.value.airlink.WlmDongleListInfo;
import dji.sdk.keyvalue.value.airlink.WlmLinkQualityLevelInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.lte.LTEService;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfo;
import dji.v5.manager.aircraft.lte.LTEAuthenticationInfoListener;
import dji.v5.manager.aircraft.lte.LTEDongleInfoListener;
import dji.v5.manager.aircraft.lte.LTELinkInfo;
import dji.v5.manager.aircraft.lte.LTELinkInfoListener;
import dji.v5.manager.aircraft.lte.LTELinkType;
import dji.v5.manager.aircraft.lte.LTEPrivatizationServerInfo;
import dji.v5.manager.interfaces.ILTEManager;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.List;

class BaseLTEManagerDelegate
implements ILTEManager {
    protected LTEAuthenticationInfoListener authenticationInfoListener;
    protected LTELinkInfoListener linkInfoListener;
    protected LTEDongleInfoListener dongleInfoListener;
    protected LTELinkType currentLTELinkType;
    protected LTELinkInfo currentLTELinkInfo;
    protected WlmLinkQualityLevelInfo currentWlmLinkQualityLevelInfo;
    protected WlmDongleListInfo currentAcWlmDongleListInfo;
    protected WlmDongleListInfo currentRcWlmDongleListInfo;
    protected LTEPrivatizationServerInfo currentAcPrivatizationServerInfo;
    protected LTEPrivatizationServerInfo currentRcPrivatizationServerInfo;
    private final CompositeDisposable compositeDisposable;
    protected boolean isConnect;

    BaseLTEManagerDelegate() {
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

    public List<WlmDongleInfo> getAircraftDongleInfos() {
        return null;
    }

    public List<WlmDongleInfo> getRemoteControllerDongleInfos() {
        return null;
    }

    public LTELinkInfo getCurrentLTELinkInfo() {
        return null;
    }

    public LTEAuthenticationInfo getCurrentLTEAuthenticationInfo() {
        return null;
    }

    private void notifyLTEAuthenticationInfoListener() {
    }

    private void notifyLTEAcDongleInfoListener() {
    }

    private void notifyLTERcDongleInfoListener() {
    }

    protected void notifyLTELinkInfoListener() {
    }

    private void updatePrivatizationServerInfo() {
    }

    public void saveLteEnableState(Boolean bl) {
    }

    public Boolean getLastLteEnableState() {
        return null;
    }

    public void saveLTEPrivatizationServerInfo(Boolean bl, LTEPrivatizationServerInfo lTEPrivatizationServerInfo) {
    }

    public String getLTEPrivatizationServerInfo(Boolean bl) {
        return null;
    }

    public void removeLTEPrivatizationServerInfo(Boolean bl) {
    }

    private void recoveryLtePrivateInfo() {
    }

    private void listenerPrivateServerStatus() {
    }

    private void recoveryLteMode() {
    }

    private void recoveryLinkModeToLte() {
    }

    private static /* synthetic */ void lambda$recoveryLinkModeToLte$17(Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$recoveryLinkModeToLte$16(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$recoveryLinkModeToLte$15(Boolean bl) throws Throwable {
    }

    private /* synthetic */ boolean lambda$recoveryLinkModeToLte$14(Boolean bl) throws Throwable {
        return false;
    }

    private static /* synthetic */ Boolean lambda$recoveryLinkModeToLte$13(Boolean bl, Boolean bl2) throws Throwable {
        return null;
    }

    private static /* synthetic */ Boolean lambda$recoveryLinkModeToLte$12(Integer n) throws Throwable {
        return null;
    }

    private static /* synthetic */ void lambda$recoveryLteMode$11(Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$recoveryLteMode$10(Boolean bl) throws Throwable {
    }

    private /* synthetic */ CompletableSource lambda$recoveryLteMode$9(Throwable throwable) throws Throwable {
        return null;
    }

    private /* synthetic */ void lambda$recoveryLteMode$8() throws Throwable {
    }

    private /* synthetic */ void lambda$recoveryLteMode$7(CompletableEmitter completableEmitter) throws Throwable {
    }

    private /* synthetic */ boolean lambda$listenerPrivateServerStatus$6(LTEService.ServerStatus serverStatus, LTEService.ServerStatus serverStatus2) throws Throwable {
        return false;
    }

    private /* synthetic */ void lambda$init$5(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$4(WlmDongleListInfo wlmDongleListInfo, WlmDongleListInfo wlmDongleListInfo2) {
    }

    private /* synthetic */ void lambda$init$3(WlmDongleListInfo wlmDongleListInfo, WlmDongleListInfo wlmDongleListInfo2) {
    }

    private /* synthetic */ void lambda$init$2(WlmLinkQualityLevelInfo wlmLinkQualityLevelInfo, WlmLinkQualityLevelInfo wlmLinkQualityLevelInfo2) {
    }

    private /* synthetic */ void lambda$init$1(LTEPrivatizationServerMsg lTEPrivatizationServerMsg, LTEPrivatizationServerMsg lTEPrivatizationServerMsg2) {
    }

    private /* synthetic */ void lambda$init$0(LTEAuthenticationInfo lTEAuthenticationInfo) {
    }

    static /* synthetic */ void access$000(BaseLTEManagerDelegate baseLTEManagerDelegate) {
    }
}

