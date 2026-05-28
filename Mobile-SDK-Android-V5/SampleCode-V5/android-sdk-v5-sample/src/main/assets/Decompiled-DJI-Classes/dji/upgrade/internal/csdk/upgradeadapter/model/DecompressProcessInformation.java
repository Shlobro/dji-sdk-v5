/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class DecompressProcessInformation {
    private final float progress;
    private final int errorCode;
    private final NativeObjects.FirmwareDecompressProcessState processState;
    private final NativeObjects.UpgradeComponentProductType productType;

    private DecompressProcessInformation(Builder builder) {
    }

    public float getProgress() {
        return 0.0f;
    }

    public int getErrorCode() {
        return 0;
    }

    public NativeObjects.FirmwareDecompressProcessState getProcessState() {
        return null;
    }

    public NativeObjects.UpgradeComponentProductType getProductType() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ DecompressProcessInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private int errorCode;
        private NativeObjects.FirmwareDecompressProcessState processState;
        private NativeObjects.UpgradeComponentProductType productType;

        public Builder progress(float f2) {
            return null;
        }

        public Builder errorCode(int n) {
            return null;
        }

        public Builder processState(NativeObjects.FirmwareDecompressProcessState firmwareDecompressProcessState) {
            return null;
        }

        public Builder productType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public DecompressProcessInformation build() {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ NativeObjects.FirmwareDecompressProcessState access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$300(Builder builder) {
            return null;
        }
    }
}

