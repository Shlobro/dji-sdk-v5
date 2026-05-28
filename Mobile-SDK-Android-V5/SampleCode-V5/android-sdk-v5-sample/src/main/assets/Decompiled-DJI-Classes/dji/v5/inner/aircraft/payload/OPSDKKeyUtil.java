/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.reactivex.rxjava3.core.Completable
 *  io.reactivex.rxjava3.core.Flowable
 *  io.reactivex.rxjava3.core.Single
 *  kotlin.Metadata
 *  kotlin.Unit
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.inner.aircraft.payload;

import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.sdk.keyvalue.value.file.CommonFile;
import dji.sdk.keyvalue.value.payload.AppLanguage;
import dji.sdk.keyvalue.value.payload.FloatingWindowWidget;
import dji.sdk.keyvalue.value.payload.IconFileRsp;
import dji.sdk.keyvalue.value.payload.PayloadProductPhaseType;
import dji.sdk.keyvalue.value.payload.PayloadType;
import dji.sdk.keyvalue.value.payload.SpeakerWidget;
import dji.sdk.keyvalue.value.payload.TextInputParam;
import dji.sdk.keyvalue.value.payload.WidgetInfoSet;
import dji.sdk.keyvalue.value.payload.WidgetSet;
import dji.sdk.keyvalue.value.payload.WidgetValue;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\bJ&\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010&\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\bJ\u0016\u0010&\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020\bJ\u0016\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u00100\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\bJ\u001a\u00100\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)J\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001a2\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010:\u001a\u00020\u0013J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\bH\u0002J\b\u0010=\u001a\u00020>H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2={"Ldji/v5/inner/aircraft/payload/OPSDKKeyUtil;", "", "<init>", "()V", "TAG", "", "INPUT_PARAMS_ERROR", "PSDK_INDEX_1", "", "PSDK_INDEX_2", "PSDK_INDEX_3", "OSDK_INDEX", "PSDK_USB_C_TYPE_INDEX", "PSDK_USB_C_TYPE_EXT_INDEX", "widgetInfoSetGet", "Lio/reactivex/rxjava3/core/Single;", "Ldji/sdk/keyvalue/value/payload/WidgetInfoSet;", "keyIndex", "fetchIconFileAction", "", "commonFile", "Ldji/sdk/keyvalue/value/file/CommonFile;", "callbacks", "Ldji/v5/common/callback/CommonCallbacks$CompletionCallbackWithParam;", "Ldji/sdk/keyvalue/value/payload/IconFileRsp;", "observeOnMainInterfaceWidget", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/sdk/keyvalue/value/payload/WidgetSet;", "observeOnProductType", "Ldji/sdk/keyvalue/value/payload/PayloadType;", "observeOnConnection", "", "observeOnIsReady", "observeOnProductPhase", "Ldji/sdk/keyvalue/value/payload/PayloadProductPhaseType;", "observerOnFirmwareVersion", "observerOnSerialNumber", "observeOnProductName", "setAppSystemInfo", "Lio/reactivex/rxjava3/core/Completable;", "callback", "Ldji/v5/common/callback/CommonCallbacks$CompletionCallback;", "setWidgetValue", "widgetValue", "Ldji/sdk/keyvalue/value/payload/WidgetValue;", "sendDataToPayloadAction", "byteArray", "", "fetchWidgetFileAction", "observeOnTextInputParam", "Ldji/sdk/keyvalue/value/payload/TextInputParam;", "observeOnDataFloatHintMsg", "observeOnSpeakerWidget", "Ldji/sdk/keyvalue/value/payload/SpeakerWidget;", "observeDataFormOPSDK", "observeOnConfigInterfaceWidget", "observeOnFloatingWindowWidget", "Ldji/sdk/keyvalue/value/payload/FloatingWindowWidget;", "destroy", "isOpsdkIndexValid", "index", "getAppLanguage", "Ldji/sdk/keyvalue/value/payload/AppLanguage;", "aircraft_release"})
public final class OPSDKKeyUtil {
    @NotNull
    public static final OPSDKKeyUtil INSTANCE = new OPSDKKeyUtil();
    @NotNull
    private static final String TAG = "OPSDKKeyUtil";
    @NotNull
    private static final String INPUT_PARAMS_ERROR = "input params error";
    private static final int PSDK_INDEX_1 = 0;
    private static final int PSDK_INDEX_2 = 1;
    private static final int PSDK_INDEX_3 = 2;
    private static final int OSDK_INDEX = 3;
    private static final int PSDK_USB_C_TYPE_INDEX = 4;
    private static final int PSDK_USB_C_TYPE_EXT_INDEX = 5;

    private OPSDKKeyUtil() {
    }

    @NotNull
    public final Single<WidgetInfoSet> widgetInfoSetGet(int n) {
        return null;
    }

    public final void fetchIconFileAction(@Nullable CommonFile commonFile, int n, @NotNull CommonCallbacks.CompletionCallbackWithParam<IconFileRsp> completionCallbackWithParam) {
    }

    @NotNull
    public final Flowable<WidgetSet> observeOnMainInterfaceWidget(int n) {
        return null;
    }

    @NotNull
    public final Flowable<PayloadType> observeOnProductType(int n) {
        return null;
    }

    @NotNull
    public final Flowable<Boolean> observeOnConnection(int n) {
        return null;
    }

    @NotNull
    public final Flowable<Boolean> observeOnIsReady(int n) {
        return null;
    }

    @NotNull
    public final Flowable<PayloadProductPhaseType> observeOnProductPhase(int n) {
        return null;
    }

    @NotNull
    public final Flowable<String> observerOnFirmwareVersion(int n) {
        return null;
    }

    @NotNull
    public final Flowable<String> observerOnSerialNumber(int n) {
        return null;
    }

    @NotNull
    public final Flowable<String> observeOnProductName(int n) {
        return null;
    }

    @NotNull
    public final Completable setAppSystemInfo(int n) {
        return null;
    }

    public final void setAppSystemInfo(int n, @NotNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @NotNull
    public final Completable setWidgetValue(@NotNull WidgetValue widgetValue, int n) {
        return null;
    }

    @NotNull
    public final Completable sendDataToPayloadAction(@NotNull byte[] byArray, int n) {
        return null;
    }

    @NotNull
    public final Completable fetchWidgetFileAction(int n) {
        return null;
    }

    public final void fetchWidgetFileAction(int n, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    public static /* synthetic */ void fetchWidgetFileAction$default(OPSDKKeyUtil oPSDKKeyUtil, int n, CommonCallbacks.CompletionCallback completionCallback, int n2, Object object) {
    }

    @NotNull
    public final Flowable<TextInputParam> observeOnTextInputParam(int n) {
        return null;
    }

    @NotNull
    public final Flowable<String> observeOnDataFloatHintMsg(int n) {
        return null;
    }

    @NotNull
    public final Flowable<SpeakerWidget> observeOnSpeakerWidget(int n) {
        return null;
    }

    @NotNull
    public final Flowable<byte[]> observeDataFormOPSDK(int n) {
        return null;
    }

    @NotNull
    public final Flowable<WidgetSet> observeOnConfigInterfaceWidget(int n) {
        return null;
    }

    @NotNull
    public final Flowable<FloatingWindowWidget> observeOnFloatingWindowWidget(int n) {
        return null;
    }

    public final void destroy() {
    }

    private final boolean isOpsdkIndexValid(int n) {
        return false;
    }

    private final AppLanguage getAppLanguage() {
        return null;
    }

    private static final Unit fetchIconFileAction$lambda$0(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, IconFileRsp iconFileRsp) {
        return null;
    }

    private static final Unit fetchIconFileAction$lambda$1(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, IDJIError iDJIError) {
        return null;
    }

    private static final Unit fetchIconFileAction$lambda$2(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, IconFileRsp iconFileRsp) {
        return null;
    }

    private static final Unit fetchIconFileAction$lambda$3(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, IDJIError iDJIError) {
        return null;
    }

    private static final Unit setAppSystemInfo$lambda$4(CommonCallbacks.CompletionCallback completionCallback) {
        return null;
    }

    private static final Unit setAppSystemInfo$lambda$5(CommonCallbacks.CompletionCallback completionCallback, IDJIError iDJIError) {
        return null;
    }

    private static final Unit setAppSystemInfo$lambda$6(CommonCallbacks.CompletionCallback completionCallback) {
        return null;
    }

    private static final Unit setAppSystemInfo$lambda$7(CommonCallbacks.CompletionCallback completionCallback, IDJIError iDJIError) {
        return null;
    }

    private static final Unit fetchWidgetFileAction$lambda$8(EmptyMsg emptyMsg) {
        return null;
    }

    private static final Unit fetchWidgetFileAction$lambda$9(IDJIError iDJIError) {
        return null;
    }

    private static final Unit fetchWidgetFileAction$lambda$10(EmptyMsg emptyMsg) {
        return null;
    }

    private static final Unit fetchWidgetFileAction$lambda$11(IDJIError iDJIError) {
        return null;
    }
}

