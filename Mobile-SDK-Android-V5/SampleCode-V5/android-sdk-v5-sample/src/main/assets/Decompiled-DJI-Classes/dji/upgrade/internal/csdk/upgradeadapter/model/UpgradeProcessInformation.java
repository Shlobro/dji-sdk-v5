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

public class UpgradeProcessInformation {
    private final int curPart;
    private final int totalParts;
    private final float subProgress;
    private final float totalProgress;
    private final int errorCode;
    private final String upgradingVersion;
    private final NativeObjects.UpgradeProcessState processState;
    private final NativeObjects.UpgradeComponentProductType upgradeComponentProductType;
    private final int upgradeComponentUuid;
    private final long deviceId;
    private final int subModule;
    private final NativeObjects.UpgradeProcessStartType startType;
    private final ImageType imageType;

    private UpgradeProcessInformation(Builder builder) {
    }

    public int getCurPart() {
        return 0;
    }

    public int getTotalParts() {
        return 0;
    }

    public float getSubProgress() {
        return 0.0f;
    }

    public float getTotalProgress() {
        return 0.0f;
    }

    public int getErrorCode() {
        return 0;
    }

    @Nullable
    public String getUpgradingVersion() {
        return null;
    }

    @Nullable
    public NativeObjects.UpgradeProcessState getProcessState() {
        return null;
    }

    @Nullable
    public NativeObjects.UpgradeComponentProductType getUpgradeComponentProductType() {
        return null;
    }

    public int getSubModule() {
        return 0;
    }

    public int getUpgradeComponentUuid() {
        return 0;
    }

    public long getDeviceId() {
        return 0L;
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

    /* synthetic */ UpgradeProcessInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int curPart;
        private int totalParts;
        private float subProgress;
        private float totalProgress;
        private int errorCode;
        private String upgradingVersion;
        private NativeObjects.UpgradeProcessState processState;
        private NativeObjects.UpgradeComponentProductType upgradeComponentProductType;
        private int upgradeComponentUuid;
        private long deviceId;
        private int subModule;
        private NativeObjects.UpgradeProcessStartType startType;
        private ImageType imageType;

        public Builder curPart(int n) {
            return null;
        }

        public Builder totalParts(int n) {
            return null;
        }

        public Builder subProgress(float f2) {
            return null;
        }

        public Builder subModule(int n) {
            return null;
        }

        public Builder totalProgress(float f2) {
            return null;
        }

        public Builder errorCode(int n) {
            return null;
        }

        public Builder upgradingVersion(String string2) {
            return null;
        }

        public Builder processState(NativeObjects.UpgradeProcessState upgradeProcessState) {
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

        public Builder startType(NativeObjects.UpgradeProcessStartType upgradeProcessStartType) {
            return null;
        }

        public Builder imageType(ImageType imageType) {
            return null;
        }

        public UpgradeProcessInformation build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$300(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ int access$400(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeProcessState access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$700(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$800(Builder builder) {
            return 0;
        }

        static /* synthetic */ long access$900(Builder builder) {
            return 0L;
        }

        static /* synthetic */ int access$1000(Builder builder) {
            return 0;
        }

        static /* synthetic */ NativeObjects.UpgradeProcessStartType access$1100(Builder builder) {
            return null;
        }

        static /* synthetic */ ImageType access$1200(Builder builder) {
            return null;
        }
    }
}

