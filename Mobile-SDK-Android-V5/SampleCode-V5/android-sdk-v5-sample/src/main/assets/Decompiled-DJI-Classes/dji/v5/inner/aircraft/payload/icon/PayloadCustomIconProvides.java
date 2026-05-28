/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.reactivex.rxjava3.disposables.CompositeDisposable
 *  io.reactivex.rxjava3.disposables.Disposable
 *  io.reactivex.rxjava3.processors.BehaviorProcessor
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.inner.aircraft.payload.icon;

import dji.sdk.keyvalue.value.file.CommonFile;
import dji.sdk.keyvalue.value.payload.IconFileSet;
import dji.sdk.keyvalue.value.payload.WidgetInfoSet;
import dji.sdk.keyvalue.value.payload.WidgetSet;
import dji.v5.common.error.IDJIError;
import dji.v5.common.utils.FetchCompleteCallback;
import dji.v5.common.utils.MediaFetcher;
import dji.v5.inner.aircraft.payload.icon.PayloadCustomItemIcon;
import dji.v5.manager.aircraft.payload.data.bean.IconFilePath;
import dji.v5.manager.aircraft.payload.widget.PayloadWidget;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u000289B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0006\u0010\"\u001a\u00020\u001eJ\u0014\u0010#\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u001e*\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u001c\u0010)\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u0010,\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010-\u001a\u00020.H\u0002J\u0014\u0010/\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010-\u001a\u00020.H\u0002J\u001c\u00100\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0006\u00101\u001a\u000202H\u0002J\u001c\u00103\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0006\u00101\u001a\u000202H\u0002J\u0014\u00104\u001a\u00020\u001e*\u00020\u000e2\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u0004\u0018\u00010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a!\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 \u0015*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00130\u0012\u00a2\u0006\u0002\b\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2={"Ldji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides;", "", "payloadIndex", "", "mainWidgetUpdateListener", "Ldji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides$MainWidgetUpdateListener;", "<init>", "(ILdji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides$MainWidgetUpdateListener;)V", "getPayloadIndex", "()I", "getMainWidgetUpdateListener", "()Ldji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides$MainWidgetUpdateListener;", "payloadCustomIconMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ldji/v5/inner/aircraft/payload/icon/PayloadCustomItemIcon;", "payloadCompositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "payloadWidgetProcessor", "Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "", "Ldji/v5/manager/aircraft/payload/widget/PayloadWidget;", "kotlin.jvm.PlatformType", "Lio/reactivex/rxjava3/annotations/NonNull;", "getPayloadWidgetProcessor", "()Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "mediaFetcher", "Ldji/v5/common/utils/MediaFetcher;", "error", "Ldji/v5/common/error/IDJIError;", "fetchCustomIcon", "", "onPayloadWidgetSetChanged", "widgetSet", "Ldji/sdk/keyvalue/value/payload/WidgetSet;", "destroy", "startDownIconFile", "iconFileSet", "Ldji/sdk/keyvalue/value/payload/IconFileSet;", "addTo", "Lio/reactivex/rxjava3/disposables/Disposable;", "compositeDisposable", "initDownParam", "widgetInfoSet", "Ldji/sdk/keyvalue/value/payload/WidgetInfoSet;", "fetchWidgetIcon", "commonFile", "Ldji/sdk/keyvalue/value/file/CommonFile;", "downloadFile", "downListWidgetSuccess", "byteArray", "", "downOtherWidgetSuccess", "updateIconFilePath", "iconFilePath", "Ldji/v5/manager/aircraft/payload/data/bean/IconFilePath;", "getPullWidgetInfoError", "Companion", "MainWidgetUpdateListener", "aircraft_release"})
@SourceDebugExtension(value={"SMAP\nPayloadCustomIconProvides.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayloadCustomIconProvides.kt\ndji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,361:1\n216#2,2:362\n*S KotlinDebug\n*F\n+ 1 PayloadCustomIconProvides.kt\ndji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides\n*L\n344#1:362,2\n*E\n"})
public final class PayloadCustomIconProvides {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int payloadIndex;
    @Nullable
    private final MainWidgetUpdateListener mainWidgetUpdateListener;
    @NotNull
    private ConcurrentHashMap<Integer, PayloadCustomItemIcon> payloadCustomIconMap;
    @Nullable
    private CompositeDisposable payloadCompositeDisposable;
    @NotNull
    private final BehaviorProcessor<List<PayloadWidget>> payloadWidgetProcessor;
    @NotNull
    private final MediaFetcher mediaFetcher;
    @Nullable
    private IDJIError error;
    @NotNull
    private static final String PSDK_WIDGET_FILE_PRE = "psdk_widget_file_";

    public PayloadCustomIconProvides(int n, @Nullable MainWidgetUpdateListener mainWidgetUpdateListener) {
    }

    public final int getPayloadIndex() {
        return 0;
    }

    @Nullable
    public final MainWidgetUpdateListener getMainWidgetUpdateListener() {
        return null;
    }

    @NotNull
    public final BehaviorProcessor<List<PayloadWidget>> getPayloadWidgetProcessor() {
        return null;
    }

    public final void fetchCustomIcon() {
    }

    private final void onPayloadWidgetSetChanged(WidgetSet widgetSet) {
    }

    public final void destroy() {
    }

    private final void startDownIconFile(PayloadCustomItemIcon payloadCustomItemIcon, IconFileSet iconFileSet) {
    }

    private final void addTo(Disposable disposable, CompositeDisposable compositeDisposable) {
    }

    private final void initDownParam(PayloadCustomItemIcon payloadCustomItemIcon, WidgetInfoSet widgetInfoSet, IconFileSet iconFileSet) {
    }

    private final void fetchWidgetIcon(PayloadCustomItemIcon payloadCustomItemIcon, CommonFile commonFile) {
    }

    private final void downloadFile(PayloadCustomItemIcon payloadCustomItemIcon, CommonFile commonFile) {
    }

    private final void downListWidgetSuccess(PayloadCustomItemIcon payloadCustomItemIcon, CommonFile commonFile, byte[] byArray) {
    }

    private final void downOtherWidgetSuccess(PayloadCustomItemIcon payloadCustomItemIcon, CommonFile commonFile, byte[] byArray) {
    }

    private final void updateIconFilePath(PayloadCustomItemIcon payloadCustomItemIcon, IconFilePath iconFilePath) {
    }

    @Nullable
    public final IDJIError getPullWidgetInfoError() {
        return null;
    }

    private static final void startDownIconFile$lambda$2(PayloadCustomIconProvides payloadCustomIconProvides, PayloadCustomItemIcon payloadCustomItemIcon, IconFileSet iconFileSet, WidgetInfoSet widgetInfoSet) {
    }

    private static final void downloadFile$lambda$3(PayloadCustomIconProvides payloadCustomIconProvides, CommonFile commonFile, PayloadCustomItemIcon payloadCustomItemIcon, FetchCompleteCallback fetchCompleteCallback) {
    }

    public static final /* synthetic */ void access$onPayloadWidgetSetChanged(PayloadCustomIconProvides payloadCustomIconProvides, WidgetSet widgetSet) {
    }

    public static final /* synthetic */ void access$setError$p(PayloadCustomIconProvides payloadCustomIconProvides, IDJIError iDJIError) {
    }

    public static final /* synthetic */ void access$downListWidgetSuccess(PayloadCustomIconProvides payloadCustomIconProvides, PayloadCustomItemIcon payloadCustomItemIcon, CommonFile commonFile, byte[] byArray) {
    }

    public static final /* synthetic */ void access$downOtherWidgetSuccess(PayloadCustomIconProvides payloadCustomIconProvides, PayloadCustomItemIcon payloadCustomItemIcon, CommonFile commonFile, byte[] byArray) {
    }

    public static final /* synthetic */ void access$updateIconFilePath(PayloadCustomIconProvides payloadCustomIconProvides, PayloadCustomItemIcon payloadCustomItemIcon, IconFilePath iconFilePath) {
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2={"Ldji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides$Companion;", "", "<init>", "()V", "PSDK_WIDGET_FILE_PRE", "", "aircraft_release"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0007\u00c0\u0006\u0001"}, d2={"Ldji/v5/inner/aircraft/payload/icon/PayloadCustomIconProvides$MainWidgetUpdateListener;", "", "onUpdateMainWidget", "", "payloadList", "", "Ldji/v5/manager/aircraft/payload/widget/PayloadWidget;", "aircraft_release"})
    public static interface MainWidgetUpdateListener {
        public void onUpdateMainWidget(@NotNull List<? extends PayloadWidget> var1);
    }
}

