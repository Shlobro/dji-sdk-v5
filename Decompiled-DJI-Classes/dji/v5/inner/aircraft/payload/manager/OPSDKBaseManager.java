/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  io.reactivex.rxjava3.disposables.CompositeDisposable
 */
package dji.v5.inner.aircraft.payload.manager;

import android.annotation.SuppressLint;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.payload.FloatingWindowWidget;
import dji.sdk.keyvalue.value.payload.PayloadProductPhaseType;
import dji.sdk.keyvalue.value.payload.PayloadType;
import dji.sdk.keyvalue.value.payload.SpeakerWidget;
import dji.sdk.keyvalue.value.payload.TextInputParam;
import dji.sdk.keyvalue.value.payload.Widget;
import dji.sdk.keyvalue.value.payload.WidgetSet;
import dji.sdk.keyvalue.value.payload.WidgetValue;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.inner.aircraft.payload.icon.PayloadCustomIconProvides;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.payload.data.PayloadBasicInfo;
import dji.v5.manager.aircraft.payload.data.PayloadWidgetInfo;
import dji.v5.manager.aircraft.payload.data.bean.SubItems;
import dji.v5.manager.aircraft.payload.listener.PayloadBasicInfoListener;
import dji.v5.manager.aircraft.payload.listener.PayloadDataListener;
import dji.v5.manager.aircraft.payload.listener.PayloadWidgetInfoListener;
import dji.v5.manager.aircraft.payload.widget.PayloadWidget;
import dji.v5.manager.interfaces.IPayloadManager;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class OPSDKBaseManager
implements IPayloadManager {
    private final AtomicBoolean mIsInit;
    private CompositeDisposable payloadStatusDisposable;
    private PayloadCustomIconProvides payloadCustomIconProvides;
    private final dji.v5.manager.aircraft.payload.widget.FloatingWindowWidget floatingWindowWidget;
    private final List<PayloadBasicInfoListener> payloadBasicInfoListenerList;
    private final List<PayloadWidgetInfoListener> payloadWidgetInfoListenerList;
    private final List<PayloadDataListener> payloadDataListenerList;
    protected PayloadBasicInfo payloadBasicInfo;
    private final PayloadWidgetInfo payloadWidgetInfo;
    private int componentIndex;
    private WeakReference<CommonCallbacks.CompletionCallback> pullWidgetCallBackWeakReference;
    private final Handler handler;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private byte[] payloadData;

    public OPSDKBaseManager(int n) {
    }

    @Override
    public void init() {
    }

    protected void observeOnOtherInfo(int n, CompositeDisposable compositeDisposable) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addPayloadBasicInfoListener(@NonNull PayloadBasicInfoListener payloadBasicInfoListener) {
    }

    @Override
    public void removePayloadBasicInfoListener(@NonNull PayloadBasicInfoListener payloadBasicInfoListener) {
    }

    @Override
    public void clearAllPayloadBasicInfoListener() {
    }

    @Override
    public void addPayloadWidgetInfoListener(@NonNull PayloadWidgetInfoListener payloadWidgetInfoListener) {
    }

    @Override
    public void removePayloadWidgetInfoListener(@NonNull PayloadWidgetInfoListener payloadWidgetInfoListener) {
    }

    @Override
    public void clearAllPayloadWidgetInfoListener() {
    }

    @Override
    public void addPayloadDataListener(@NonNull PayloadDataListener payloadDataListener) {
    }

    @Override
    public void removePayloadDataListener(@NonNull PayloadDataListener payloadDataListener) {
    }

    @Override
    public void clearAllPayloadDataListener() {
    }

    @Override
    public void pullWidgetInfoFromPayload(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @SuppressLint(value={"CheckResult"})
    public void setWidgetValue(@NonNull WidgetValue widgetValue, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @SuppressLint(value={"CheckResult"})
    public void sendDataToPayload(byte[] byArray, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    protected void notifyPayloadBasicInfo() {
    }

    private void notifyPayloadWidgetInfo() {
    }

    private void notifyPayloadData() {
    }

    private void initPSDKDevice(int n) {
    }

    private void observeOnDataFromOPSDK(int n, CompositeDisposable compositeDisposable) {
    }

    private void observeOnMainInterfaceWidgetList(List<? extends PayloadWidget> list) {
    }

    private void observeOnConfigInterfaceWidgetList(int n, CompositeDisposable compositeDisposable) {
    }

    private void observeOnTextInputBoxWidget(int n, CompositeDisposable compositeDisposable) {
    }

    private void observeOnFloatingWindowWidget(int n, CompositeDisposable compositeDisposable) {
    }

    private void observeOnSpeakWidget(int n, CompositeDisposable compositeDisposable) {
    }

    private void observerOnPayLoadBasicInfo(int n, CompositeDisposable compositeDisposable) {
    }

    private List<PayloadWidget> configWidgetSetToPayloadWidget(WidgetSet widgetSet) {
        return null;
    }

    private List<SubItems> getSubItemList(Widget widget) {
        return null;
    }

    private void pullWidgetSuccess(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void pullWidgetFail(CommonCallbacks.CompletionCallback completionCallback, IDJIError iDJIError) {
    }

    private void resetPayloadWidgetInfo() {
    }

    private void updateComponentIndex() {
    }

    private void observePayloadInfo() {
    }

    private /* synthetic */ void lambda$observerOnPayLoadBasicInfo$22(String string2) throws Throwable {
    }

    private /* synthetic */ void lambda$observerOnPayLoadBasicInfo$21(int n, String string2) throws Throwable {
    }

    private /* synthetic */ void lambda$observerOnPayLoadBasicInfo$20(int n, PayloadProductPhaseType payloadProductPhaseType) throws Throwable {
    }

    private /* synthetic */ void lambda$observerOnPayLoadBasicInfo$19(int n, String string2) throws Throwable {
    }

    private /* synthetic */ void lambda$observerOnPayLoadBasicInfo$18(int n, PayloadType payloadType) throws Throwable {
    }

    private /* synthetic */ void lambda$observerOnPayLoadBasicInfo$17(int n, Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$observerOnPayLoadBasicInfo$16(int n) {
    }

    private static /* synthetic */ Boolean lambda$observerOnPayLoadBasicInfo$15(Boolean bl, Boolean bl2) throws Throwable {
        return null;
    }

    private /* synthetic */ void lambda$observeOnSpeakWidget$14(SpeakerWidget speakerWidget) throws Throwable {
    }

    private /* synthetic */ void lambda$observeOnFloatingWindowWidget$13(String string2) throws Throwable {
    }

    private /* synthetic */ void lambda$observeOnFloatingWindowWidget$12(FloatingWindowWidget floatingWindowWidget) throws Throwable {
    }

    private /* synthetic */ void lambda$observeOnTextInputBoxWidget$11(TextInputParam textInputParam) throws Throwable {
    }

    private /* synthetic */ void lambda$observeOnConfigInterfaceWidgetList$10(WidgetSet widgetSet) throws Throwable {
    }

    private /* synthetic */ void lambda$observeOnDataFromOPSDK$9(byte[] byArray) throws Throwable {
    }

    private static /* synthetic */ void lambda$initPSDKDevice$8(int n, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$initPSDKDevice$7(int n) throws Throwable {
    }

    private static /* synthetic */ void lambda$sendDataToPayload$6(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$sendDataToPayload$5(CommonCallbacks.CompletionCallback completionCallback) throws Throwable {
    }

    private static /* synthetic */ void lambda$setWidgetValue$4(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$setWidgetValue$3(CommonCallbacks.CompletionCallback completionCallback) throws Throwable {
    }

    private /* synthetic */ void lambda$pullWidgetInfoFromPayload$2(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private /* synthetic */ void lambda$pullWidgetInfoFromPayload$1(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private /* synthetic */ void lambda$init$0(ProductType productType, ProductType productType2) {
    }
}

