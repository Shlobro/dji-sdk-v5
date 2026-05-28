/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.v5.manager.diagnostic.WarningLevel;

public interface IDJIDeviceHealthInfo {
    public String informationCode();

    public int componentId();

    public int sensorIndex();

    public String description();

    public String title();

    public WarningLevel warningLevel();
}

