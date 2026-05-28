/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareSubModuleUpgradeInformation;
import dji.upgrade.component.firmware.model.FirmwareUpgradingProcessState;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class FirmwareSubModuleUpgradeInformationImpl
implements FirmwareSubModuleUpgradeInformation {
    private final float progress;
    private final String version;
    private final FirmwareUpgradingProcessState processState;
    private final UpgradeError error;
    private final int moduleId;
    private final int hostType;
    private final int hostIndex;
    private final String moduleType;
    private final NativeObjects.UpgradeComponentProductType upgradeComponentProductType;
    private final int upgradeComponentUuid;
    private final long deviceId;

    private FirmwareSubModuleUpgradeInformationImpl(Builder builder) {
    }

    @Override
    public float getProgress() {
        return 0.0f;
    }

    @Override
    public FirmwareUpgradingProcessState getState() {
        return null;
    }

    @Override
    public UpgradeError getError() {
        return null;
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public int getModuleId() {
        return 0;
    }

    @Override
    public int getHostType() {
        return 0;
    }

    @Override
    public int getHostIndex() {
        return 0;
    }

    @Override
    public String getModuleType() {
        return null;
    }

    public NativeObjects.UpgradeComponentProductType getUpgradeComponentProductType() {
        return null;
    }

    public int getUpgradeComponentUuid() {
        return 0;
    }

    public long getDeviceId() {
        return 0L;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ FirmwareSubModuleUpgradeInformationImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private String version;
        private FirmwareUpgradingProcessState processState;
        private UpgradeError error;
        private int moduleId;
        private int hostType;
        private int hostIndex;
        private String moduleType;
        private NativeObjects.UpgradeComponentProductType upgradeComponentProductType;
        private int upgradeComponentUuid;
        private long deviceId;

        public Builder progress(float f2) {
            return null;
        }

        public Builder version(String string2) {
            return null;
        }

        public Builder processState(FirmwareUpgradingProcessState firmwareUpgradingProcessState) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public Builder moduleId(int n) {
            return null;
        }

        public Builder hostType(int n) {
            return null;
        }

        public Builder hostIndex(int n) {
            return null;
        }

        public Builder moduleType(String string2) {
            return null;
        }

        public Builder upgradeComponentProductType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public Builder upgradeComponentUuid(int n) {
            return null;
        }

        public Builder deviceId(long l2) {
            return null;
        }

        public FirmwareSubModuleUpgradeInformationImpl build() {
            return null;
        }

        public Builder ParseJsonString(String string2) {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ FirmwareUpgradingProcessState access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ UpgradeError access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$400(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$500(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$600(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$700(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$800(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$900(Builder builder) {
            return 0;
        }

        static /* synthetic */ long access$1000(Builder builder) {
            return 0L;
        }
    }
}

