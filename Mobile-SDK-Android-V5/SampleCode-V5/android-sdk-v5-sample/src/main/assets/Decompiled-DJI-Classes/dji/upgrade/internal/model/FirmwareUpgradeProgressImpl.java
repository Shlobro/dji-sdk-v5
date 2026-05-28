/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareUpgradeProcessStartType;
import dji.upgrade.component.firmware.model.FirmwareUpgradeProgress;
import dji.upgrade.component.firmware.model.FirmwareUpgradingProcessState;
import dji.upgrade.generate.ImageType;

public class FirmwareUpgradeProgressImpl
implements FirmwareUpgradeProgress {
    private final float progress;
    private final String version;
    private final FirmwareUpgradingProcessState processState;
    private final UpgradeError error;
    private final int subType;
    private final FirmwareUpgradeProcessStartType startType;
    private final ImageType imageType;

    private FirmwareUpgradeProgressImpl(Builder builder) {
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

    public int getSubType() {
        return 0;
    }

    @Override
    public FirmwareUpgradeProcessStartType getStartType() {
        return null;
    }

    @Override
    public ImageType getImageType() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ FirmwareUpgradeProgressImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private String version;
        private FirmwareUpgradingProcessState processState;
        private UpgradeError error;
        private int subType;
        private FirmwareUpgradeProcessStartType startType;
        private ImageType imageType;

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

        public Builder subType(int n) {
            return null;
        }

        public Builder startType(FirmwareUpgradeProcessStartType firmwareUpgradeProcessStartType) {
            return null;
        }

        public Builder imageType(ImageType imageType) {
            return null;
        }

        public FirmwareUpgradeProgressImpl build() {
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

        static /* synthetic */ FirmwareUpgradeProcessStartType access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ ImageType access$600(Builder builder) {
            return null;
        }
    }
}

