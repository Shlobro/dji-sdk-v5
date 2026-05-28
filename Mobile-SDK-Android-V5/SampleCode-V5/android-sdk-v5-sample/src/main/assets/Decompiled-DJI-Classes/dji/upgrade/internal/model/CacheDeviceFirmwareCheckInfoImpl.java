/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.sdk.keyvalue.value.remotecontroller.RemoteControllerType;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.CacheDeviceFirmwareCheckInfo;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;

public class CacheDeviceFirmwareCheckInfoImpl
implements CacheDeviceFirmwareCheckInfo {
    private final UpgradeFirmwareState state;
    private final ProductType productModel;
    private final RemoteControllerType rcDisplayName;
    private String serverVersion;
    private String deviceVersion;
    private final UpgradeError error;

    private CacheDeviceFirmwareCheckInfoImpl(Builder builder) {
    }

    @Override
    @NonNull
    public UpgradeFirmwareState getState() {
        return null;
    }

    @Override
    @Nullable
    public UpgradeError getError() {
        return null;
    }

    @Override
    @Nullable
    public ProductType getProductModel() {
        return null;
    }

    @Override
    @Nullable
    public RemoteControllerType getRcType() {
        return null;
    }

    @Override
    @Nullable
    public String getServerVersion() {
        return null;
    }

    @Override
    @Nullable
    public String getDeviceVersion() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ CacheDeviceFirmwareCheckInfoImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private UpgradeFirmwareState state;
        private ProductType productModel;
        private RemoteControllerType rcDisplayName;
        private String serverVersion;
        private String deviceVersion;
        private UpgradeError error;

        public Builder upgradeFirmwareState(UpgradeFirmwareState upgradeFirmwareState) {
            return null;
        }

        public Builder productModel(ProductType productType) {
            return null;
        }

        public Builder rcDisplayName(RemoteControllerType remoteControllerType) {
            return null;
        }

        public Builder serverVersion(String string2) {
            return null;
        }

        public Builder deviceVersion(String string2) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public CacheDeviceFirmwareCheckInfoImpl build() {
            return null;
        }

        static /* synthetic */ UpgradeFirmwareState access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ ProductType access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ RemoteControllerType access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ UpgradeError access$500(Builder builder) {
            return null;
        }
    }
}

