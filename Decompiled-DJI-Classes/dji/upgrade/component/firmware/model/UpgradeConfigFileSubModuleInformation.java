/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

public interface UpgradeConfigFileSubModuleInformation {
    public String getModuleID();

    public String getModuleVersion();

    public String getModuleType();

    public String getGroup();

    public String getName();

    public String getMD5();

    public long getSize();
}

