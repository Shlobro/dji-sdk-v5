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
import dji.upgrade.component.firmware.model.FirmwareDownloadingProcessState;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010'\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2={"Ldji/upgrade/DownloadProgressInformation;", "", "componentType", "Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;", "progress", "", "state", "Ldji/upgrade/component/firmware/model/FirmwareDownloadingProcessState;", "version", "", "downloadSpeed", "", "error", "Ldji/upgrade/UpgradeError;", "(Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;FLdji/upgrade/component/firmware/model/FirmwareDownloadingProcessState;Ljava/lang/String;JLdji/upgrade/UpgradeError;)V", "getComponentType", "()Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;", "getDownloadSpeed", "()J", "getError", "()Ldji/upgrade/UpgradeError;", "getProgress", "()F", "getState", "()Ldji/upgrade/component/firmware/model/FirmwareDownloadingProcessState;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "djisdk_release"})
public final class DownloadProgressInformation {
    @NotNull
    private final NativeObjects.UpgradeComponentProductType componentType;
    private final float progress;
    @NotNull
    private final FirmwareDownloadingProcessState state;
    @NotNull
    private final String version;
    private final long downloadSpeed;
    @NotNull
    private final UpgradeError error;

    public DownloadProgressInformation(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, float f2, @NotNull FirmwareDownloadingProcessState firmwareDownloadingProcessState, @NotNull String string2, long l2, @NotNull UpgradeError upgradeError) {
    }

    @NotNull
    public final NativeObjects.UpgradeComponentProductType getComponentType() {
        return null;
    }

    public final float getProgress() {
        return 0.0f;
    }

    @NotNull
    public final FirmwareDownloadingProcessState getState() {
        return null;
    }

    @NotNull
    public final String getVersion() {
        return null;
    }

    public final long getDownloadSpeed() {
        return 0L;
    }

    @NotNull
    public final UpgradeError getError() {
        return null;
    }

    @NotNull
    public final NativeObjects.UpgradeComponentProductType component1() {
        return null;
    }

    public final float component2() {
        return 0.0f;
    }

    @NotNull
    public final FirmwareDownloadingProcessState component3() {
        return null;
    }

    @NotNull
    public final String component4() {
        return null;
    }

    public final long component5() {
        return 0L;
    }

    @NotNull
    public final UpgradeError component6() {
        return null;
    }

    @NotNull
    public final DownloadProgressInformation copy(@NotNull NativeObjects.UpgradeComponentProductType upgradeComponentProductType, float f2, @NotNull FirmwareDownloadingProcessState firmwareDownloadingProcessState, @NotNull String string2, long l2, @NotNull UpgradeError upgradeError) {
        return null;
    }

    public static /* synthetic */ DownloadProgressInformation copy$default(DownloadProgressInformation downloadProgressInformation, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, float f2, FirmwareDownloadingProcessState firmwareDownloadingProcessState, String string2, long l2, UpgradeError upgradeError, int n, Object object) {
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

