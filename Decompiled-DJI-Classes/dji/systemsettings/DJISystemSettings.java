/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.systemsettings;

import android.content.Context;
import dji.systemsettings.callback.SystemSettingsBoolCallback;

public class DJISystemSettings {
    private static volatile DJISystemSettings instance;
    private static final String GLOBAL_SYSTEM_SETTING_HDMI_ENABLED_NAME = "dji_hdmi_enabled";
    private static final String GLOBAL_SYSTEM_SETTING_HDMI_ENABLED = "1";
    private static Context CONTEXT_INSTANCE;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJISystemSettings getInstance() {
        return null;
    }

    private static synchronized Context getContext() {
        return null;
    }

    public void getHDMISystemSettingEnabled(SystemSettingsBoolCallback systemSettingsBoolCallback) {
    }
}

