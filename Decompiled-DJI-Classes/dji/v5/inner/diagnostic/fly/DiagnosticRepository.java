/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  io.reactivex.Single
 *  io.reactivex.SingleEmitter
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.inner.diagnostic.fly;

import android.annotation.SuppressLint;
import android.content.Context;
import dji.sdk.keyvalue.value.diagnostic.HMSDiagnostic;
import dji.v5.inner.diagnostic.fly.CodeConfig;
import dji.v5.manager.diagnostic.DJIDeviceHealthInfo;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eH\u0002J(\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J4\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u0019H\u0002R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2={"Ldji/v5/inner/diagnostic/fly/DiagnosticRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "hmsToDiagnosticMap", "", "", "", "", "flyDiagnosticConfigMap", "Ldji/v5/inner/diagnostic/fly/CodeConfig;", "hmsToDiagnostic", "Lkotlin/Function1;", "parseHmsToDiagnostic", "Lio/reactivex/Single;", "transHexKey", "stringMap", "getMapperJsonInputStream", "Ljava/io/InputStream;", "createFlyAppDeviceHealthInfo", "", "Ldji/v5/manager/diagnostic/DJIDeviceHealthInfo;", "hmsDiagnostics", "Ldji/sdk/keyvalue/value/diagnostic/HMSDiagnostic;", "getFlyAppDeviceHealthInfo", "hms", "aircraft_release"})
@SuppressLint(value={"CheckResult"})
@SourceDebugExtension(value={"SMAP\nDiagnosticRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticRepository.kt\ndji/v5/inner/diagnostic/fly/DiagnosticRepository\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n477#2:95\n423#2:96\n1246#3,4:97\n1863#3,2:101\n1863#3,2:103\n1#4:105\n*S KotlinDebug\n*F\n+ 1 DiagnosticRepository.kt\ndji/v5/inner/diagnostic/fly/DiagnosticRepository\n*L\n50#1:95\n50#1:96\n50#1:97,4\n59#1:101,2\n71#1:103,2\n*E\n"})
public final class DiagnosticRepository {
    @Nullable
    private Map<String, ? extends Set<Integer>> hmsToDiagnosticMap;
    @NotNull
    private final Map<Integer, CodeConfig> flyDiagnosticConfigMap;

    public DiagnosticRepository(@NotNull Context context) {
    }

    private final Function1<String, Set<Integer>> hmsToDiagnostic() {
        return null;
    }

    private final Single<Map<String, Set<Integer>>> parseHmsToDiagnostic(Context context) {
        return null;
    }

    private final Map<String, Set<Integer>> transHexKey(Map<String, ? extends Set<Integer>> map) {
        return null;
    }

    private final InputStream getMapperJsonInputStream(Context context) {
        return null;
    }

    @NotNull
    public final List<DJIDeviceHealthInfo> createFlyAppDeviceHealthInfo(@NotNull List<? extends HMSDiagnostic> list) {
        return null;
    }

    private final DJIDeviceHealthInfo getFlyAppDeviceHealthInfo(HMSDiagnostic hMSDiagnostic) {
        return null;
    }

    private static final Unit _init_$lambda$0(DiagnosticRepository diagnosticRepository, Map map) {
        return null;
    }

    private static final void _init_$lambda$1(Function1 function1, Object object) {
    }

    private static final Set hmsToDiagnostic$lambda$3(DiagnosticRepository diagnosticRepository, String string2) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void parseHmsToDiagnostic$lambda$5(DiagnosticRepository diagnosticRepository, Context context, SingleEmitter singleEmitter) {
    }

    private static final Map parseHmsToDiagnostic$lambda$6(DiagnosticRepository diagnosticRepository, Map map) {
        return null;
    }

    private static final Map parseHmsToDiagnostic$lambda$7(Function1 function1, Object object) {
        return null;
    }

    private static final Map parseHmsToDiagnostic$lambda$8(Throwable throwable) {
        return null;
    }
}

