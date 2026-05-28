/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.Nullable;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import dji.upgrade.internal.model.UpgradeFirmwareInformationImpl;

public class InternalFirmwareInformation {
    private final UpgradeFirmwareInformationImpl information;
    private final NativeObjects.UpgradeComponentProductType componentProductType;
    private final int componentUuid;
    private final long deviceId;

    private InternalFirmwareInformation(Builder builder) {
    }

    @Nullable
    public UpgradeFirmwareInformationImpl getFirmwareInformation() {
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

    public long getDeviceId() {
        return 0L;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ InternalFirmwareInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private UpgradeFirmwareInformationImpl information;
        private NativeObjects.UpgradeComponentProductType componentProductType;
        private int componentUuid;
        private long deviceId;

        public Builder information(UpgradeFirmwareInformationImpl upgradeFirmwareInformationImpl) {
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

        public InternalFirmwareInformation build() {
            return null;
        }

        static /* synthetic */ UpgradeFirmwareInformationImpl access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$100(Builder builder) {
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

