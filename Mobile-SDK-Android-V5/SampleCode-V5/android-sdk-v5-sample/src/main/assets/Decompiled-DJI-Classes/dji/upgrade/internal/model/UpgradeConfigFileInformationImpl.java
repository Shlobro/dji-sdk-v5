/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.component.firmware.model.UpgradeConfigFileInformation;
import dji.upgrade.component.firmware.model.UpgradeConfigFileSubModuleInformation;
import dji.upgrade.generate.ImageType;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import dji.upgrade.internal.model.UpgradeConfigFileSubModuleInformationImpl;
import java.util.ArrayList;
import java.util.HashMap;

public class UpgradeConfigFileInformationImpl
implements UpgradeConfigFileInformation {
    private final String deviceID;
    private final String firmwareVersion;
    private final int antiRollback;
    private final int enforce;
    private final String enforceTime;
    private final String from;
    private final String expire;
    private final ImageType imageType;
    private final int sdrEnforce;
    private final int releaseCnt;
    private final HashMap<String, Integer> enforceExt;
    private final ArrayList<UpgradeConfigFileSubModuleInformationImpl> subModuleInformations;
    private final NativeObjects.UpgradeComponentProductType upgradeComponentProductType;
    private final int upgradeComponentUuid;

    private UpgradeConfigFileInformationImpl(Builder builder) {
    }

    @Override
    public String getDeviceId() {
        return null;
    }

    @Override
    public String getFirmwareVersion() {
        return null;
    }

    @Override
    public int getAntiRollback() {
        return 0;
    }

    @Override
    public int getEnforce() {
        return 0;
    }

    @Override
    public String getEnforceTime() {
        return null;
    }

    @Override
    public String getFrom() {
        return null;
    }

    public NativeObjects.UpgradeComponentProductType getUpgradeComponentProductType() {
        return null;
    }

    public int getUpgradeComponentUuid() {
        return 0;
    }

    @Override
    public String getExpire() {
        return null;
    }

    @Override
    public ImageType getImageType() {
        return null;
    }

    @Override
    public int getSdrEnforce() {
        return 0;
    }

    @Override
    public int getReleaseCnt() {
        return 0;
    }

    @Override
    public HashMap<String, Integer> getEnforceExt() {
        return null;
    }

    @Override
    public ArrayList<UpgradeConfigFileSubModuleInformation> getSubModulesInformation() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ UpgradeConfigFileInformationImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private String deviceID;
        private String firmwareVersion;
        private int antiRollback;
        private int enforce;
        private String enforceTime;
        private String from;
        private String expire;
        private ImageType imageType;
        private int sdrEnforce;
        private int releaseCnt;
        private HashMap<String, Integer> enforceExt;
        private ArrayList<UpgradeConfigFileSubModuleInformationImpl> subModuleInformations;
        private NativeObjects.UpgradeComponentProductType upgradeComponentProductType;
        private int upgradeComponentUuid;

        public Builder deviceID(String string2) {
            return null;
        }

        public Builder firmwareVersion(String string2) {
            return null;
        }

        public Builder antiRollback(int n) {
            return null;
        }

        public Builder enforce(int n) {
            return null;
        }

        public Builder enforceTime(String string2) {
            return null;
        }

        public Builder from(String string2) {
            return null;
        }

        public Builder expire(String string2) {
            return null;
        }

        public Builder imageType(ImageType imageType) {
            return null;
        }

        public Builder sdrEnforce(int n) {
            return null;
        }

        public Builder releaseCnt(int n) {
            return null;
        }

        public Builder upgradeComponentProductType(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
            return null;
        }

        public Builder upgradeComponentUuid(int n) {
            return null;
        }

        public Builder enforceExt(HashMap<String, Integer> hashMap) {
            return null;
        }

        public Builder subModuleInformations(ArrayList<UpgradeConfigFileSubModuleInformationImpl> arrayList) {
            return null;
        }

        public Builder ParseJsonString(String string2) {
            return null;
        }

        public UpgradeConfigFileInformationImpl build() {
            return null;
        }

        static /* synthetic */ String access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$300(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ ImageType access$700(Builder builder) {
            return null;
        }

        static /* synthetic */ NativeObjects.UpgradeComponentProductType access$800(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$900(Builder builder) {
            return 0;
        }

        static /* synthetic */ HashMap access$1000(Builder builder) {
            return null;
        }

        static /* synthetic */ ArrayList access$1100(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$1200(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$1300(Builder builder) {
            return 0;
        }
    }
}

