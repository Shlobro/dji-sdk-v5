/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareDownloadProgress;
import dji.upgrade.component.firmware.model.FirmwareDownloadingProcessState;

public class FirmwareDownloadProgressImpl
implements FirmwareDownloadProgress {
    private final float progress;
    private final String version;
    private final FirmwareDownloadingProcessState processState;
    private final UpgradeError error;

    private FirmwareDownloadProgressImpl(Builder builder) {
    }

    @Override
    public float getProgress() {
        return 0.0f;
    }

    @Override
    public FirmwareDownloadingProcessState getState() {
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

    /* synthetic */ FirmwareDownloadProgressImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private String version;
        private FirmwareDownloadingProcessState processState;
        private UpgradeError error;

        public Builder progress(float f2) {
            return null;
        }

        public Builder version(String string2) {
            return null;
        }

        public Builder processState(FirmwareDownloadingProcessState firmwareDownloadingProcessState) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public FirmwareDownloadProgressImpl build() {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ FirmwareDownloadingProcessState access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ UpgradeError access$300(Builder builder) {
            return null;
        }
    }
}

