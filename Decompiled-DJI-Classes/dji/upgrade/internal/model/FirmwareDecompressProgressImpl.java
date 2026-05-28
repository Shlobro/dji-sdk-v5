/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareDecompressProgress;
import dji.upgrade.component.firmware.model.FirmwareDecompressingProcessState;

public class FirmwareDecompressProgressImpl
implements FirmwareDecompressProgress {
    private final float progress;
    private final FirmwareDecompressingProcessState processState;
    private final UpgradeError error;

    private FirmwareDecompressProgressImpl(Builder builder) {
    }

    @Override
    public float getProgress() {
        return 0.0f;
    }

    @Override
    public FirmwareDecompressingProcessState getState() {
        return null;
    }

    @Override
    public UpgradeError getError() {
        return null;
    }

    /* synthetic */ FirmwareDecompressProgressImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private FirmwareDecompressingProcessState processState;
        private UpgradeError error;

        public Builder progress(float f2) {
            return null;
        }

        public Builder processState(FirmwareDecompressingProcessState firmwareDecompressingProcessState) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public FirmwareDecompressProgressImpl build() {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ FirmwareDecompressingProcessState access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ UpgradeError access$200(Builder builder) {
            return null;
        }
    }
}

