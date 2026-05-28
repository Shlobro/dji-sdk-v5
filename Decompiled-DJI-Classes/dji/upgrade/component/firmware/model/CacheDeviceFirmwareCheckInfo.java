/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.upgrade.component.firmware.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.sdk.keyvalue.value.remotecontroller.RemoteControllerType;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;

public interface CacheDeviceFirmwareCheckInfo {
    @NonNull
    public UpgradeFirmwareState getState();

    @Nullable
    public UpgradeError getError();

    @Nullable
    public ProductType getProductModel();

    @Nullable
    public RemoteControllerType getRcType();

    @Nullable
    public String getServerVersion();

    @Nullable
    public String getDeviceVersion();
}

