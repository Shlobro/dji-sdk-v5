/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class UpgradeStateCheckInformation {
    private final UpgradeFirmwareState state;
    private final ProductType productModel;
    private NativeObjects.UpgradeComponentProductType componentProductType;
    private final int componentUuid;
    private final long deviceId;
    private final UpgradeError error;

    private UpgradeStateCheckInformation(Builder builder) {
    }

    @Nullable
    public ProductType getProductModel() {
        return null;
    }

    @Nullable
    public UpgradeFirmwareState getState() {
        return null;
    }

    @Nullable
    public NativeObjects.UpgradeComponentProductType getComponentProductType() {
        return null;
    }

    @Nullable
    public int getComponentUuid() {
        return 0;
    }

    @Nullable
    public long getDeviceId() {
        return 0L;
    }

    @Nullable
    public UpgradeError getError() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ UpgradeStateCheckInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private UpgradeFirmwareState state;
        private ProductType productModel;
        private NativeObjects.UpgradeComponentProductType componentProductType;
        private int componentUuid;
        private long deviceId;
        private UpgradeError error;

        public Builder state(UpgradeFirmwareState upgradeFirmwareState) {
            return null;
        }

        public Builder productModel(ProductType productType) {
            return null;
        }

        public Builder componentProductType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public Builder componentUuid(int n) {
            return null;
        }

        public Builder deviceId(long l2) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public UpgradeStateCheckInformation build() {
            return null;
        }

        static /* synthetic */ UpgradeFirmwareState access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ ProductType access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$300(Builder builder) {
            return 0;
        }

        static /* synthetic */ long access$400(Builder builder) {
            return 0L;
        }

        static /* synthetic */ UpgradeError access$500(Builder builder) {
            return null;
        }
    }
}

