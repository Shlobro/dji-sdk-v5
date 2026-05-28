/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.v5.manager.diagnostic.WarningLevel;

public interface IDJIDeviceStatus {
    public String statusCode();

    public String description();

    public WarningLevel warningLevel();
}

