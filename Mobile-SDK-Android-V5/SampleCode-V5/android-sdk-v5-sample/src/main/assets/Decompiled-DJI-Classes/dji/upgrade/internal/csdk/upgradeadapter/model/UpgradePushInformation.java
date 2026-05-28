/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.Nullable;
import dji.upgrade.generate.ImageType;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class UpgradePushInformation {
    private final float progress;
    private final NativeObjects.UpgradeProcessState processState;
    private final NativeObjects.UpgradeStatePushComponentType upgradePushComponentType;
    private final int componentUuid;
    private final long deviceId;
    private final int subModule;
    private final NativeObjects.UpgradeProcessStartType startType;
    private final ImageType imageType;
    private final int errorCode;
    private final String upgradingVersion;

    private UpgradePushInformation(Builder builder) {
    }

    public float getProgress() {
        return 0.0f;
    }

    @Nullable
    public NativeObjects.UpgradeProcessState getProcessState() {
        return null;
    }

    @Nullable
    public NativeObjects.UpgradeStatePushComponentType getUpgradePushComponentType() {
        return null;
    }

    public int getComponentUuid() {
        return 0;
    }

    public long getDeviceId() {
        return 0L;
    }

    public int getSubModule() {
        return 0;
    }

    public int getErrorCode() {
        return 0;
    }

    @Nullable
    public String getUpgradingVersion() {
        return null;
    }

    @Nullable
    public NativeObjects.UpgradeProcessStartType getStartType() {
        return null;
    }

    @Nullable
    public ImageType getImageType() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ UpgradePushInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private NativeObjects.UpgradeProcessState processState;
        private NativeObjects.UpgradeStatePushComponentType componentType;
        private int componentUuid;
        private long deviceId;
        private int subModule;
        private NativeObjects.UpgradeProcessStartType startType;
        private ImageType imageType;
        private int errorCode;
        private String upgradingVersion;

        public Builder progress(float f2) {
            return null;
        }

        public Builder subModule(int n) {
            return null;
        }

        public Builder processState(NativeObjects.UpgradeProcessState upgradeProcessState) {
            return null;
        }

        public Builder upgradePushComponentType(NativeObjects.UpgradeStatePushComponentType upgradeStatePushComponentType) {
            return null;
        }

        public Builder componentUuid(int n) {
            return null;
        }

        public Builder deviceId(long l2) {
            return null;
        }

        public Builder startType(NativeObjects.UpgradeProcessStartType upgradeProcessStartType) {
            return null;
        }

        public Builder imageType(ImageType imageType) {
            return null;
        }

        public Builder setErrorCode(int n) {
            return null;
        }

        public Builder upgradingVersion(String string2) {
            return null;
        }

        public UpgradePushInformation build() {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ NativeObjects.UpgradeProcessState access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeStatePushComponentType access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$300(Builder builder) {
            return 0;
        }

        static /* synthetic */ long access$400(Builder builder) {
            return 0L;
        }

        static /* synthetic */ int access$500(Builder builder) {
            return 0;
        }

        static /* synthetic */ NativeObjects.UpgradeProcessStartType access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$700(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$800(Builder builder) {
            return null;
        }

        static /* synthetic */ ImageType access$900(Builder builder) {
            return null;
        }
    }
}

