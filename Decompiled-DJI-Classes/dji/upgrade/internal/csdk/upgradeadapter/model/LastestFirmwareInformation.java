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

public class LastestFirmwareInformation {
    private final UpgradeFirmwareInformationImpl information;
    private NativeObjects.UpgradeComponentProductType componentProductType;

    private LastestFirmwareInformation(Builder builder) {
    }

    @Nullable
    public UpgradeFirmwareInformationImpl getFirmwareInformation() {
        return null;
    }

    @Nullable
    public NativeObjects.UpgradeComponentProductType getComponentProductType() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ LastestFirmwareInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private UpgradeFirmwareInformationImpl information;
        private NativeObjects.UpgradeComponentProductType componentProductType;

        public Builder information(UpgradeFirmwareInformationImpl upgradeFirmwareInformationImpl) {
            return null;
        }

        public Builder componentProductType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public LastestFirmwareInformation build() {
            return null;
        }

        static /* synthetic */ UpgradeFirmwareInformationImpl access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$100(Builder builder) {
            return null;
        }
    }
}

