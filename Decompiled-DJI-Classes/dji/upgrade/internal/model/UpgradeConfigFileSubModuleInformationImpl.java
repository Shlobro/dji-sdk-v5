/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.upgrade.internal.model;

import dji.upgrade.component.firmware.model.UpgradeConfigFileSubModuleInformation;
import org.json.JSONObject;

public class UpgradeConfigFileSubModuleInformationImpl
implements UpgradeConfigFileSubModuleInformation {
    private final String moduleID;
    private final String moduleVersion;
    private final String moduleType;
    private final String group;
    private final String name;
    private final String md5;
    private final long size;

    private UpgradeConfigFileSubModuleInformationImpl(Builder builder) {
    }

    @Override
    public String getModuleID() {
        return null;
    }

    @Override
    public String getModuleVersion() {
        return null;
    }

    @Override
    public String getModuleType() {
        return null;
    }

    @Override
    public String getGroup() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getMD5() {
        return null;
    }

    @Override
    public long getSize() {
        return 0L;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ UpgradeConfigFileSubModuleInformationImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private String moduleID;
        private String moduleVersion;
        private String moduleType;
        private String group;
        private String name;
        private String md5;
        private long size;

        public Builder moduleID(String string2) {
            return null;
        }

        public Builder moduleVersoin(String string2) {
            return null;
        }

        public Builder moduleType(String string2) {
            return null;
        }

        public Builder group(String string2) {
            return null;
        }

        public Builder name(String string2) {
            return null;
        }

        public Builder md5(String string2) {
            return null;
        }

        public Builder size(long l2) {
            return null;
        }

        public UpgradeConfigFileSubModuleInformationImpl build() {
            return null;
        }

        public Builder ParseJsonString(String string2) {
            return null;
        }

        public Builder ParseJsonString(JSONObject jSONObject) {
            return null;
        }

        static /* synthetic */ String access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ long access$600(Builder builder) {
            return 0L;
        }
    }
}

