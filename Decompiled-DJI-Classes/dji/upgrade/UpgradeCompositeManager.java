/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.upgrade;

import dji.upgrade.UpgradeError;
import dji.upgrade.UpgradeInformation;
import dji.upgrade.UpgradePathInfo;
import dji.upgrade.UpgradeProgressInformation;
import dji.upgrade.UpgradeTotalProcessInformation;
import dji.upgrade.generate.Component;
import dji.upgrade.generate.DecompressProgressInformation;
import dji.upgrade.generate.TotalUpgradeProgressInformation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0007J*\u0010\b\u001a\u00020\u00042 \u0010\u0005\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0007J9\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J;\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J9\u0010\u0019\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u0006H\u0007JO\u0010\u001a\u001a\u00020\u00042\"\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e`\u001f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00a8\u0006 "}, d2={"Ldji/upgrade/UpgradeCompositeManager;", "", "()V", "setDepressProgressObserver", "", "observer", "Lkotlin/Function1;", "Ldji/upgrade/generate/DecompressProgressInformation;", "setUpgradeProgressObserver", "Lkotlin/Function2;", "", "Ldji/upgrade/UpgradeProgressInformation;", "Ldji/upgrade/UpgradeTotalProcessInformation;", "startImageSwitch", "components", "Ldji/upgrade/UpgradeInformation;", "callback", "Ldji/upgrade/UpgradeError;", "Lkotlin/ParameterName;", "name", "error", "startSelfUpgrade", "info", "isDownUpgrade", "", "startUpgrade", "startUpgradeFirmwareByArchivePath", "componentPaths", "Ljava/util/HashMap;", "Ldji/upgrade/generate/Component;", "Ldji/upgrade/UpgradePathInfo;", "Lkotlin/collections/HashMap;", "djisdk_release"})
@SourceDebugExtension(value={"SMAP\nUpgradeCompositeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeCompositeManager.kt\ndji/upgrade/UpgradeCompositeManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1497#2:192\n1568#2,3:193\n*S KotlinDebug\n*F\n+ 1 UpgradeCompositeManager.kt\ndji/upgrade/UpgradeCompositeManager\n*L\n141#1:192\n141#1:193,3\n*E\n"})
public final class UpgradeCompositeManager {
    @NotNull
    public static final UpgradeCompositeManager INSTANCE = new UpgradeCompositeManager();

    private UpgradeCompositeManager() {
    }

    @JvmStatic
    public static final void startUpgrade(@NotNull List<UpgradeInformation> list, @NotNull Function1<? super UpgradeError, Unit> function1) {
    }

    @JvmStatic
    public static final void startSelfUpgrade(@NotNull UpgradeInformation upgradeInformation, boolean bl, @NotNull Function1<? super UpgradeError, Unit> function1) {
    }

    @JvmStatic
    public static final void startImageSwitch(@NotNull List<UpgradeInformation> list, @NotNull Function1<? super UpgradeError, Unit> function1) {
    }

    @JvmStatic
    public static final void setUpgradeProgressObserver(@Nullable Function2<? super List<UpgradeProgressInformation>, ? super UpgradeTotalProcessInformation, Unit> function2) {
    }

    @JvmStatic
    public static final void setDepressProgressObserver(@Nullable Function1<? super DecompressProgressInformation, Unit> function1) {
    }

    @JvmStatic
    public static final void startUpgradeFirmwareByArchivePath(@NotNull HashMap<Component, UpgradePathInfo> hashMap, @NotNull Function1<? super UpgradeError, Unit> function1) {
    }

    private static final void startUpgrade$lambda$0(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void startSelfUpgrade$lambda$1(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void startImageSwitch$lambda$2(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void setUpgradeProgressObserver$lambda$4(Function2 function2, ArrayList arrayList, TotalUpgradeProgressInformation totalUpgradeProgressInformation) {
    }

    private static final void setDepressProgressObserver$lambda$5(Function1 function1, DecompressProgressInformation decompressProgressInformation) {
    }

    private static final void startUpgradeFirmwareByArchivePath$lambda$6(Function1 function1, UpgradeError upgradeError) {
    }
}

