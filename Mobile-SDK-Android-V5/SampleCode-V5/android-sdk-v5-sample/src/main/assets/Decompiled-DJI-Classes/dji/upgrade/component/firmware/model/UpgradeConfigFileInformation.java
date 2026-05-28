/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.component.firmware.model.UpgradeConfigFileSubModuleInformation;
import dji.upgrade.generate.ImageType;
import java.util.ArrayList;
import java.util.HashMap;

public interface UpgradeConfigFileInformation {
    public String getDeviceId();

    public String getFirmwareVersion();

    public int getAntiRollback();

    public int getEnforce();

    public String getEnforceTime();

    public String getFrom();

    public String getExpire();

    public ImageType getImageType();

    public int getSdrEnforce();

    public int getReleaseCnt();

    public HashMap<String, Integer> getEnforceExt();

    public ArrayList<UpgradeConfigFileSubModuleInformation> getSubModulesInformation();
}

