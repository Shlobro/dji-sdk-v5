/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.upgrade.UpgradeError;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class UpgradeCheckInformation {
    private final String serverVersion;
    private final String deviceVersion;
    private final NativeObjects.ComponentVersionCheckState checkState;
    private final NativeObjects.ComponentVersionFetchState fetchState;
    private final ProductType productModel;
    private NativeObjects.UpgradeComponentProductType componentProductType;
    private final int componentUuid;
    private final UpgradeError error;

    private UpgradeCheckInformation(Builder builder) {
    }

    @Nullable
    public String getServerVersion() {
        return null;
    }

    @Nullable
    public String getDeviceVersion() {
        return null;
    }

    @NonNull
    public NativeObjects.ComponentVersionCheckState getCheckState() {
        return null;
    }

    @NonNull
    public NativeObjects.ComponentVersionFetchState getFetchState() {
        return null;
    }

    @Nullable
    public ProductType getProductModel() {
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
    public UpgradeError getError() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ UpgradeCheckInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private String serverVersion;
        private String deviceVersion;
        private NativeObjects.ComponentVersionCheckState checkState;
        private NativeObjects.ComponentVersionFetchState fetchState;
        private ProductType productModel;
        private NativeObjects.UpgradeComponentProductType componentProductType;
        private int componentUuid;
        private UpgradeError error;

        public Builder serverVersion(String string2) {
            return null;
        }

        public Builder deviceVersion(String string2) {
            return null;
        }

        public Builder checkState(NativeObjects.ComponentVersionCheckState componentVersionCheckState) {
            return null;
        }

        public Builder fetchState(NativeObjects.ComponentVersionFetchState componentVersionFetchState) {
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

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public UpgradeCheckInformation build() {
            return null;
        }

        static /* synthetic */ String access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.ComponentVersionCheckState access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.ComponentVersionFetchState access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ ProductType access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$600(Builder builder) {
            return 0;
        }

        static /* synthetic */ UpgradeError access$700(Builder builder) {
            return null;
        }
    }
}

