/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class DownloadProcessInformation {
    private final float progress;
    private final int errorCode;
    private final String downloadingVersion;
    private final NativeObjects.FirmwareDownloadProcessState processState;
    private final NativeObjects.UpgradeComponentProductType productType;

    private DownloadProcessInformation(Builder builder) {
    }

    public float getProgress() {
        return 0.0f;
    }

    public int getErrorCode() {
        return 0;
    }

    public String getDownloadingVersion() {
        return null;
    }

    public NativeObjects.FirmwareDownloadProcessState getProcessState() {
        return null;
    }

    public NativeObjects.UpgradeComponentProductType getProductType() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ DownloadProcessInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private int errorCode;
        private String downloadingVersion;
        private NativeObjects.FirmwareDownloadProcessState processState;
        private NativeObjects.UpgradeComponentProductType productType;

        public Builder progress(float f2) {
            return null;
        }

        public Builder errorCode(int n) {
            return null;
        }

        public Builder downloadingVersion(String string2) {
            return null;
        }

        public Builder processState(NativeObjects.FirmwareDownloadProcessState firmwareDownloadProcessState) {
            return null;
        }

        public Builder productType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public DownloadProcessInformation build() {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.FirmwareDownloadProcessState access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$400(Builder builder) {
            return null;
        }
    }
}

