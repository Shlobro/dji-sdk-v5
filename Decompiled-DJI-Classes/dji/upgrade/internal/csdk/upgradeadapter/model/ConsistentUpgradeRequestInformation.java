/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.Nullable;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class ConsistentUpgradeRequestInformation {
    private final NativeObjects.UpgradeStatePushComponentType upgradePushComponentType;
    private final NativeObjects.ConsistentUpgradeRequestType consistentUpgradeRequestType;
    private final int componentUuid;
    private final long deviceId;

    private ConsistentUpgradeRequestInformation(Builder builder) {
    }

    @Nullable
    public NativeObjects.UpgradeStatePushComponentType getUpgradePushComponentType() {
        return null;
    }

    @Nullable
    public NativeObjects.ConsistentUpgradeRequestType getConsistentUpgradeRequestType() {
        return null;
    }

    @Nullable
    public int getComponentUuid() {
        return 0;
    }

    public long getDeviceId() {
        return 0L;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ ConsistentUpgradeRequestInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private NativeObjects.UpgradeStatePushComponentType componentType;
        private NativeObjects.ConsistentUpgradeRequestType requestType;
        private int componentUuid;
        private long deviceId;

        public Builder upgradePushComponentType(NativeObjects.UpgradeStatePushComponentType upgradeStatePushComponentType) {
            return null;
        }

        public Builder consistentUpgradeRequestType(NativeObjects.ConsistentUpgradeRequestType consistentUpgradeRequestType) {
            return null;
        }

        public Builder componentUuid(int n) {
            return null;
        }

        public Builder deviceId(long l2) {
            return null;
        }

        public ConsistentUpgradeRequestInformation build() {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeStatePushComponentType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.ConsistentUpgradeRequestType access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }

        static /* synthetic */ long access$300(Builder builder) {
            return 0L;
        }
    }
}

