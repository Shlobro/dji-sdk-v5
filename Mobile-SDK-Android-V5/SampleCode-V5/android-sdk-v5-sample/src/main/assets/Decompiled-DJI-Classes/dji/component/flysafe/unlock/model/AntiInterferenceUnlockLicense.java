/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.unlock.model;

import androidx.annotation.Keep;
import dji.component.flysafe.unlock.model.WhiteListLicense;
import dji.csdk.flysafe.v3.License;

@Keep
public class AntiInterferenceUnlockLicense
extends WhiteListLicense {
    private int level;

    public AntiInterferenceUnlockLicense() {
    }

    public AntiInterferenceUnlockLicense(License license) {
    }

    public int GetLevel() {
        return 0;
    }
}

