/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.unlock.model;

import androidx.annotation.Keep;
import dji.component.flysafe.unlock.model.FlyfrbLicenseV3Info;
import dji.component.flysafe.unlock.model.LicenseType;
import dji.csdk.flysafe.v3.License;
import dji.csdk.flysafe.v3.LicenseModel;

@Keep
public class WhiteListLicense {
    protected int startTimeStamp;
    protected int endTimeStamp;
    protected int level;
    protected int index;
    protected int mLicenseId;
    protected boolean enabled;
    protected boolean isValid;
    protected boolean isInValidDateByApp;
    protected byte[] liscenseAllBytes;
    protected String description;
    protected LicenseType licenseType;
    protected int mHeightLimit;
    protected boolean isUserOnly;

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object object) {
        return false;
    }

    public boolean getUserOnly() {
        return false;
    }

    public int getLevel() {
        return 0;
    }

    public void setLevel(int n) {
    }

    public String getDescription() {
        return null;
    }

    public void setDescription(String string) {
    }

    public long getStartTime() {
        return 0L;
    }

    public void setStartTime(int n) {
    }

    public long getEndTime() {
        return 0L;
    }

    public void setEndTime(int n) {
    }

    public LicenseType getLicenseType() {
        return null;
    }

    public void setLicenseType(LicenseType licenseType) {
    }

    public byte[] getLiscenseAllBytes() {
        return null;
    }

    public void setLiscenseAllBytes(byte[] byArray) {
    }

    public int getIndex() {
        return 0;
    }

    public void setIndex(int n) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean bl) {
    }

    public boolean isValid() {
        return false;
    }

    public void setValid(boolean bl) {
    }

    public int getLicenseId() {
        return 0;
    }

    public void setLicenseId(int n) {
    }

    public int getHeightLimit() {
        return 0;
    }

    public WhiteListLicense(License license) {
    }

    public static WhiteListLicense parseFromProtoBufLicenseModel(LicenseModel licenseModel) {
        return null;
    }

    public WhiteListLicense(FlyfrbLicenseV3Info flyfrbLicenseV3Info) {
    }

    private WhiteListLicense(Builder builder) {
    }

    public static WhiteListLicense parseFromProtoBufData(License license) {
        return null;
    }

    public WhiteListLicense() {
    }

    /* synthetic */ WhiteListLicense(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int startTimeStamp;
        private int endTimeStamp;
        private int level;
        private int index;
        private int mLicenseId;
        private boolean enabled;
        private boolean isValid;
        private byte[] liscenseAllBytes;
        private String description;
        private LicenseType licenseType;

        public Builder startTimeStamp(int n) {
            return null;
        }

        public Builder endTimeStamp(int n) {
            return null;
        }

        public Builder level(int n) {
            return null;
        }

        public Builder index(int n) {
            return null;
        }

        public Builder licenseId(int n) {
            return null;
        }

        public Builder isEnabled(boolean bl) {
            return null;
        }

        public Builder isValid(boolean bl) {
            return null;
        }

        public Builder licenseAllBytes(byte[] byArray) {
            return null;
        }

        public Builder description(String string) {
            return null;
        }

        public Builder licenseType(LicenseType licenseType) {
            return null;
        }

        public WhiteListLicense build() {
            return null;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$300(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$400(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$500(Builder builder) {
            return 0;
        }

        static /* synthetic */ boolean access$600(Builder builder) {
            return false;
        }

        static /* synthetic */ boolean access$700(Builder builder) {
            return false;
        }

        static /* synthetic */ byte[] access$800(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$900(Builder builder) {
            return null;
        }

        static /* synthetic */ LicenseType access$1000(Builder builder) {
            return null;
        }
    }
}

