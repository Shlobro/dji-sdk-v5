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
public class PowerUnlockLicense
extends WhiteListLicense {
    private int limitedLevel;

    public PowerUnlockLicense() {
    }

    public PowerUnlockLicense(License license) {
    }

    public int GetLimitLevel() {
        return 0;
    }
}

