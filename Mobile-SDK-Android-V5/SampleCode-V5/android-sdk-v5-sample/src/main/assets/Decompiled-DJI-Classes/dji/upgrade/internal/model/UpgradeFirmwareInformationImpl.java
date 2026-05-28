/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.model;

import androidx.annotation.Nullable;
import dji.upgrade.component.firmware.model.UpgradeFirmwareInformation;

public class UpgradeFirmwareInformationImpl
implements UpgradeFirmwareInformation {
    private final String releaseNote;
    private final String version;
    private final String releaseTime;
    private final long fileSize;
    private final boolean isDownloaded;
    private final String versionType;

    private UpgradeFirmwareInformationImpl(Builder builder) {
    }

    @Override
    @Nullable
    public String getVersion() {
        return null;
    }

    @Override
    @Nullable
    public String getReleaseNote() {
        return null;
    }

    @Override
    @Nullable
    public String getReleaseTime() {
        return null;
    }

    @Override
    public long getFileSize() {
        return 0L;
    }

    @Override
    public String getVersionType() {
        return null;
    }

    public boolean isDownloaded() {
        return false;
    }

    /* synthetic */ UpgradeFirmwareInformationImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private String releaseNote;
        private String version;
        private String releaseTime;
        private long fileSize;
        private boolean isDownloaded;
        private String versionType;

        public Builder releaseNote(String string2) {
            return null;
        }

        public Builder version(String string2) {
            return null;
        }

        public Builder releaseTime(String string2) {
            return null;
        }

        public Builder fileSize(long l2) {
            return null;
        }

        public Builder isDownloaded(boolean bl) {
            return null;
        }

        public Builder versionType(String string2) {
            return null;
        }

        public UpgradeFirmwareInformationImpl build() {
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

        static /* synthetic */ long access$300(Builder builder) {
            return 0L;
        }

        static /* synthetic */ boolean access$400(Builder builder) {
            return false;
        }

        static /* synthetic */ String access$500(Builder builder) {
            return null;
        }
    }
}

