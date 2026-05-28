/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

public interface UpgradeFirmwareInformation {
    public String getVersion();

    public String getReleaseNote();

    public String getReleaseTime();

    public long getFileSize();

    public String getVersionType();
}

