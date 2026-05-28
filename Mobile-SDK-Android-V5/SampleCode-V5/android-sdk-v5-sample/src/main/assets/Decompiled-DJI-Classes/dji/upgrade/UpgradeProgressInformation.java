/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.upgrade;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareUpgradeProcessStartType;
import dji.upgrade.component.firmware.model.FirmwareUpgradingProcessState;
import dji.upgrade.generate.ImageType;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\t\u0010,\u001a\u00020\u0010H\u00c6\u0003J\t\u0010-\u001a\u00020\u0012H\u00c6\u0003Jc\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J\t\u00103\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u00064"}, d2={"Ldji/upgrade/UpgradeProgressInformation;", "", "component", "Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;", "componentUuid", "", "deviceId", "imageType", "Ldji/upgrade/generate/ImageType;", "progress", "", "state", "Ldji/upgrade/component/firmware/model/FirmwareUpgradingProcessState;", "type", "Ldji/upgrade/component/firmware/model/FirmwareUpgradeProcessStartType;", "version", "", "error", "Ldji/upgrade/UpgradeError;", "(Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;IILdji/upgrade/generate/ImageType;FLdji/upgrade/component/firmware/model/FirmwareUpgradingProcessState;Ldji/upgrade/component/firmware/model/FirmwareUpgradeProcessStartType;Ljava/lang/String;Ldji/upgrade/UpgradeError;)V", "getComponent", "()Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;", "getComponentUuid", "()I", "getDeviceId", "getError", "()Ldji/upgrade/UpgradeError;", "getImageType", "()Ldji/upgrade/generate/ImageType;", "getProgress", "()F", "getState", "()Ldji/upgrade/component/firmware/model/FirmwareUpgradingProcessState;", "getType", "()Ldji/upgrade/component/firmware/model/FirmwareUpgradeProcessStartType;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "djisdk_release"})
public final class UpgradeProgressInformation {
    @NotNull
    private final NativeObjects.UpgradeComponentProductType component;
    private final int componentUuid;
    private final int deviceId;
    @NotNull
    private final ImageType imageType;
    private final float progress;
    @NotNull
    private final FirmwareUpgradingProcessState state;
    @NotNull
    private final FirmwareUpgradeProcessStartType type;
    @NotNull
    private final String version;
    @NotNull
    private final UpgradeError error;

    public UpgradeProgressInformation(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, int n2, @NotNull ImageType imageType, float f2, @NotNull FirmwareUpgradingProcessState firmwareUpgradingProcessState, @NotNull FirmwareUpgradeProcessStartType firmwareUpgradeProcessStartType, @NotNull String string2, @NotNull UpgradeError upgradeError) {
    }

    @NotNull
    public final NativeObjects.UpgradeComponentProductType getComponent() {
        return null;
    }

    public final int getComponentUuid() {
        return 0;
    }

    public final int getDeviceId() {
        return 0;
    }

    @NotNull
    public final ImageType getImageType() {
        return null;
    }

    public final float getProgress() {
        return 0.0f;
    }

    @NotNull
    public final FirmwareUpgradingProcessState getState() {
        return null;
    }

    @NotNull
    public final FirmwareUpgradeProcessStartType getType() {
        return null;
    }

    @NotNull
    public final String getVersion() {
        return null;
    }

    @NotNull
    public final UpgradeError getError() {
        return null;
    }

    @NotNull
    public final NativeObjects.UpgradeComponentProductType component1() {
        return null;
    }

    public final int component2() {
        return 0;
    }

    public final int component3() {
        return 0;
    }

    @NotNull
    public final ImageType component4() {
        return null;
    }

    public final float component5() {
        return 0.0f;
    }

    @NotNull
    public final FirmwareUpgradingProcessState component6() {
        return null;
    }

    @NotNull
    public final FirmwareUpgradeProcessStartType component7() {
        return null;
    }

    @NotNull
    public final String component8() {
        return null;
    }

    @NotNull
    public final UpgradeError component9() {
        return null;
    }

    @NotNull
    public final UpgradeProgressInformation copy(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, int n2, @NotNull ImageType imageType, float f2, @NotNull FirmwareUpgradingProcessState firmwareUpgradingProcessState, @NotNull FirmwareUpgradeProcessStartType firmwareUpgradeProcessStartType, @NotNull String string2, @NotNull UpgradeError upgradeError) {
        return null;
    }

    public static /* synthetic */ UpgradeProgressInformation copy$default(UpgradeProgressInformation upgradeProgressInformation, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, int n2, ImageType imageType, float f2, FirmwareUpgradingProcessState firmwareUpgradingProcessState, FirmwareUpgradeProcessStartType firmwareUpgradeProcessStartType, String string2, UpgradeError upgradeError, int n3, Object object) {
        return null;
    }

    @NotNull
    public String toString() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }
}

