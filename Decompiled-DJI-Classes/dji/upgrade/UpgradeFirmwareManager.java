/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.functions.Function5
 *  kotlin.jvm.functions.Function6
 *  org.jetbrains.annotations.NotNull
 */
package dji.upgrade;

import dji.upgrade.DownloadInformation;
import dji.upgrade.DownloadProgressInformation;
import dji.upgrade.FirmwareInformation;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareDownloadingProcessState;
import dji.upgrade.component.firmware.model.UpgradeConfigFileInformation;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;
import dji.upgrade.generate.ComponentInformation;
import dji.upgrade.generate.DownloadState;
import dji.upgrade.generate.FirmwareState;
import dji.upgrade.generate.ImageType;
import dji.upgrade.generate.UpgradeVersionCommonParam;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u007f\u0010\u0003\u001a\u00020\u00042u\u0010\u0005\u001aq\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J2\u0010\u0012\u001a\u00020\u00132(\u0010\u0014\u001a$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0015H\u0007J\u0096\u0001\u0010\u0019\u001a\u00020\u00132\u008b\u0001\u0010\u0014\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u001b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 \u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u001aH\u0007J\u007f\u0010\u0019\u001a\u00020\u00132u\u0010\u0014\u001aq\u0012\u0013\u0012\u00110\u001b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u0006H\u0007Je\u0010\"\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2K\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110&\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040%H\u0007Jm\u0010\"\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020$2K\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110&\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040%H\u0007Ju\u0010\"\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020$2\u0006\u0010)\u001a\u00020*2K\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110&\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040%H\u0007JC\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\r2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040,H\u0007J;\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\r2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040,H\u0007JC\u0010-\u001a\u00020\u00042\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020/0\u0016j\b\u0012\u0004\u0012\u00020/`\u00182!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040,H\u0007JX\u00100\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2F\u0010\u0005\u001aB\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012#\u0012!\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u0018\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00040\u0015H\u0007Jj\u00102\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00103\u001a\u0002042\u0006\u0010)\u001a\u00020*28\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u000105\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00040\u0015H\u0007JZ\u00102\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00103\u001a\u00020428\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u000105\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00040\u0015H\u0007Jh\u00107\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u00103\u001a\u0002042F\u0010\u0005\u001aB\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012#\u0012!\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u0018\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00040\u0015H\u0007Jp\u00107\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u00103\u001a\u0002042\u0006\u0010)\u001a\u00020*2F\u0010\u0005\u001aB\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012#\u0012!\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u0018\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00040\u0015H\u0007J`\u00107\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u00103\u001a\u0002042F\u0010\u0005\u001aB\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012#\u0012!\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u0018\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00040\u0015H\u0007JC\u00108\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\r2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u001104\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u00040,H\u0007J;\u00108\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\r2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u001104\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u00040,H\u0007J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\u0013H\u0007J\u0010\u0010<\u001a\u0002042\u0006\u0010;\u001a\u00020\u0013H\u0007J3\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00132!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040,H\u0007J+\u0010?\u001a\u00020\u00042!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040,H\u0007\u00a8\u0006@"}, d2={"Ldji/upgrade/UpgradeFirmwareManager;", "", "()V", "SetFirmwareUpgradeStateCallback", "", "callback", "Lkotlin/Function5;", "Ldji/upgrade/generate/ComponentInformation;", "Lkotlin/ParameterName;", "name", "component", "Ldji/upgrade/generate/FirmwareState;", "state", "", "upgradeVersion", "releaseNote", "Ldji/upgrade/UpgradeError;", "error", "addDownloadMultiObserver", "", "observer", "Lkotlin/Function2;", "Ljava/util/ArrayList;", "Ldji/upgrade/DownloadProgressInformation;", "Lkotlin/collections/ArrayList;", "addDownloadObserver", "Lkotlin/Function6;", "Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;", "", "progress", "Ldji/upgrade/component/firmware/model/FirmwareDownloadingProcessState;", "version", "", "downloadSpeed", "checkFirmwareUpgradeState", "configFileInfo", "Ldji/upgrade/component/firmware/model/UpgradeConfigFileInformation;", "Lkotlin/Function3;", "Ldji/upgrade/component/firmware/model/UpgradeFirmwareState;", "imageType", "Ldji/upgrade/generate/ImageType;", "commonData", "Ldji/upgrade/generate/UpgradeVersionCommonParam;", "download", "Lkotlin/Function1;", "downloadMulti", "components", "Ldji/upgrade/DownloadInformation;", "fetchAppVersionList", "versions", "fetchFirmwareInformation", "cache", "", "Ldji/upgrade/FirmwareInformation;", "info", "fetchServerList", "isFirmwareDownload", "downloaded", "removeDownloadMultiObserver", "id", "removeDownloadObserver", "stopDownload", "taskId", "stopDownloadMulti", "djisdk_release"})
public final class UpgradeFirmwareManager {
    @NotNull
    public static final UpgradeFirmwareManager INSTANCE = new UpgradeFirmwareManager();

    private UpgradeFirmwareManager() {
    }

    @JvmStatic
    public static final int addDownloadObserver(@NotNull Function5<? super NativeObjects.UpgradeComponentProductType, ? super Float, ? super FirmwareDownloadingProcessState, ? super String, ? super UpgradeError, Unit> function5) {
        return 0;
    }

    @JvmStatic
    public static final int addDownloadObserver(@NotNull Function6<? super NativeObjects.UpgradeComponentProductType, ? super Float, ? super FirmwareDownloadingProcessState, ? super String, ? super Long, ? super UpgradeError, Unit> function6) {
        return 0;
    }

    @JvmStatic
    public static final boolean removeDownloadObserver(int n) {
        return false;
    }

    @JvmStatic
    public static final int addDownloadMultiObserver(@NotNull Function2<? super ArrayList<DownloadProgressInformation>, ? super DownloadProgressInformation, Unit> function2) {
        return 0;
    }

    @JvmStatic
    public static final boolean removeDownloadMultiObserver(int n) {
        return false;
    }

    @JvmStatic
    public static final int download(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull String string2, @NotNull Function1<? super UpgradeError, Unit> function1) {
        return 0;
    }

    @JvmStatic
    public static final int download(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull ImageType imageType, @NotNull String string2, @NotNull Function1<? super UpgradeError, Unit> function1) {
        return 0;
    }

    @JvmStatic
    public static final void stopDownload(int n, @NotNull Function1<? super UpgradeError, Unit> function1) {
    }

    @JvmStatic
    public static final void downloadMulti(@NotNull ArrayList<DownloadInformation> arrayList, @NotNull Function1<? super UpgradeError, Unit> function1) {
    }

    @JvmStatic
    public static final void stopDownloadMulti(@NotNull Function1<? super UpgradeError, Unit> function1) {
    }

    @JvmStatic
    public static final void fetchFirmwareInformation(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull String string2, boolean bl, @NotNull Function2<? super UpgradeError, ? super FirmwareInformation, Unit> function2) {
    }

    @JvmStatic
    public static final void fetchFirmwareInformation(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull ImageType imageType, @NotNull String string2, boolean bl, @NotNull UpgradeVersionCommonParam upgradeVersionCommonParam, @NotNull Function2<? super UpgradeError, ? super FirmwareInformation, Unit> function2) {
    }

    @JvmStatic
    public static final void fetchServerList(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, boolean bl, @NotNull Function2<? super UpgradeError, ? super ArrayList<String>, Unit> function2) {
    }

    @JvmStatic
    public static final void fetchServerList(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull ImageType imageType, boolean bl, @NotNull Function2<? super UpgradeError, ? super ArrayList<String>, Unit> function2) {
    }

    @JvmStatic
    public static final void fetchServerList(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull ImageType imageType, boolean bl, @NotNull UpgradeVersionCommonParam upgradeVersionCommonParam, @NotNull Function2<? super UpgradeError, ? super ArrayList<String>, Unit> function2) {
    }

    @JvmStatic
    public static final void isFirmwareDownload(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull String string2, @NotNull Function1<? super Boolean, Unit> function1) {
    }

    @JvmStatic
    public static final void isFirmwareDownload(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull ImageType imageType, @NotNull String string2, @NotNull Function1<? super Boolean, Unit> function1) {
    }

    @JvmStatic
    public static final void fetchAppVersionList(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull Function2<? super UpgradeError, ? super ArrayList<String>, Unit> function2) {
    }

    @JvmStatic
    public static final void checkFirmwareUpgradeState(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull UpgradeConfigFileInformation upgradeConfigFileInformation, @NotNull Function3<? super UpgradeError, ? super UpgradeFirmwareState, ? super String, Unit> function3) {
    }

    @JvmStatic
    public static final void checkFirmwareUpgradeState(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull ImageType imageType, @NotNull UpgradeConfigFileInformation upgradeConfigFileInformation, @NotNull Function3<? super UpgradeError, ? super UpgradeFirmwareState, ? super String, Unit> function3) {
    }

    @JvmStatic
    public static final void checkFirmwareUpgradeState(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, @NotNull ImageType imageType, @NotNull UpgradeConfigFileInformation upgradeConfigFileInformation, @NotNull UpgradeVersionCommonParam upgradeVersionCommonParam, @NotNull Function3<? super UpgradeError, ? super UpgradeFirmwareState, ? super String, Unit> function3) {
    }

    @JvmStatic
    public static final void SetFirmwareUpgradeStateCallback(@NotNull Function5<? super ComponentInformation, ? super FirmwareState, ? super String, ? super String, ? super UpgradeError, Unit> function5) {
    }

    private static final void addDownloadObserver$lambda$0(Function5 function5, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, float f2, DownloadState downloadState, String string2, long l2, UpgradeError upgradeError) {
    }

    private static final void addDownloadObserver$lambda$1(Function6 function6, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, float f2, DownloadState downloadState, String string2, long l2, UpgradeError upgradeError) {
    }

    private static final void addDownloadMultiObserver$lambda$2(Function2 function2, ArrayList arrayList, dji.upgrade.generate.DownloadProgressInformation downloadProgressInformation) {
    }

    private static final void download$lambda$3(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void download$lambda$4(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void stopDownload$lambda$5(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void downloadMulti$lambda$6(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void stopDownloadMulti$lambda$7(Function1 function1, UpgradeError upgradeError) {
    }

    private static final void fetchFirmwareInformation$lambda$8(Function2 function2, UpgradeError upgradeError, dji.upgrade.generate.FirmwareInformation firmwareInformation) {
    }

    private static final void fetchFirmwareInformation$lambda$9(Function2 function2, UpgradeError upgradeError, dji.upgrade.generate.FirmwareInformation firmwareInformation) {
    }

    private static final void fetchServerList$lambda$10(Function2 function2, UpgradeError upgradeError, ArrayList arrayList) {
    }

    private static final void fetchServerList$lambda$11(Function2 function2, UpgradeError upgradeError, ArrayList arrayList) {
    }

    private static final void fetchServerList$lambda$12(Function2 function2, UpgradeError upgradeError, ArrayList arrayList) {
    }

    private static final void isFirmwareDownload$lambda$13(Function1 function1, boolean bl) {
    }

    private static final void isFirmwareDownload$lambda$14(Function1 function1, boolean bl) {
    }

    private static final void fetchAppVersionList$lambda$15(Function2 function2, UpgradeError upgradeError, ArrayList arrayList) {
    }

    private static final void checkFirmwareUpgradeState$lambda$16(Function3 function3, UpgradeError upgradeError, FirmwareState firmwareState, String string2) {
    }

    private static final void checkFirmwareUpgradeState$lambda$17(Function3 function3, UpgradeError upgradeError, FirmwareState firmwareState, String string2) {
    }

    private static final void checkFirmwareUpgradeState$lambda$18(Function3 function3, UpgradeError upgradeError, FirmwareState firmwareState, String string2) {
    }

    private static final void SetFirmwareUpgradeStateCallback$lambda$19(Function5 function5, ComponentInformation componentInformation, FirmwareState firmwareState, String string2, String string3, UpgradeError upgradeError) {
    }
}

