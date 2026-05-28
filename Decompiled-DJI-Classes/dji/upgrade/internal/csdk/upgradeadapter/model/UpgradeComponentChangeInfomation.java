/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class UpgradeComponentChangeInfomation {
    private final NativeObjects.UpgradeComponentProductType productType;
    private final NativeObjects.UpgradeComponentChangeState changeState;
    private final int uuid;
    private final long deviceId;
    private final String dongleId;

    private UpgradeComponentChangeInfomation(Builder builder) {
    }

    public NativeObjects.UpgradeComponentProductType getProductType() {
        return null;
    }

    public NativeObjects.UpgradeComponentChangeState getChangeState() {
        return null;
    }

    public int getUuid() {
        return 0;
    }

    public long getDeviceId() {
        return 0L;
    }

    public String getDongleId() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ UpgradeComponentChangeInfomation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private NativeObjects.UpgradeComponentProductType productType;
        private NativeObjects.UpgradeComponentChangeState changeState;
        private int uuid;
        private long deviceId;
        private String dongleId;

        public Builder productType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public Builder changeState(NativeObjects.UpgradeComponentChangeState upgradeComponentChangeState) {
            return null;
        }

        public Builder uuid(int n) {
            return null;
        }

        public Builder dongleId(String string2) {
            return null;
        }

        public Builder deviceId(long l2) {
            return null;
        }

        public UpgradeComponentChangeInfomation build() {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentChangeState access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ long access$400(Builder builder) {
            return 0L;
        }
    }
}

