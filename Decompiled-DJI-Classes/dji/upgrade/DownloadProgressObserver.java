/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.Nullable
 */
package dji.upgrade;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareDownloadingProcessState;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a8\u0006\f"}, d2={"Ldji/upgrade/DownloadProgressObserver;", "", "OnProgress", "", "component", "Ldji/upgrade/internal/csdk/upgradeadapter/model/NativeObjects$UpgradeComponentProductType;", "progress", "", "state", "Ldji/upgrade/component/firmware/model/FirmwareDownloadingProcessState;", "error", "Ldji/upgrade/UpgradeError;", "djisdk_release"})
public interface DownloadProgressObserver {
    public void OnProgress(@Nullable NativeObjects.UpgradeComponentProductType var1, float var2, @Nullable FirmwareDownloadingProcessState var3, @Nullable UpgradeError var4);
}

