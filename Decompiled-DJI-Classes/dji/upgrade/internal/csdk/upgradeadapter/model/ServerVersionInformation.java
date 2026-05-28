/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class ServerVersionInformation {
    private final String[] versions;
    private final NativeObjects.UpgradeComponentProductType productType;

    private ServerVersionInformation(Builder builder) {
    }

    public String[] getVersions() {
        return null;
    }

    public NativeObjects.UpgradeComponentProductType getProductType() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ ServerVersionInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private String[] versions;
        private NativeObjects.UpgradeComponentProductType productType;

        public Builder versions(String[] stringArray) {
            return null;
        }

        public Builder productType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public ServerVersionInformation build() {
            return null;
        }

        static /* synthetic */ String[] access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$100(Builder builder) {
            return null;
        }
    }
}

