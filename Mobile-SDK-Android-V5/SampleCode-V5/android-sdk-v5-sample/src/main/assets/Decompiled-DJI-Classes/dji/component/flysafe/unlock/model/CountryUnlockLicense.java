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
public class CountryUnlockLicense
extends WhiteListLicense {
    private int countryId;

    public int getCountryId() {
        return 0;
    }

    public void setCountryId(int n) {
    }

    public CountryUnlockLicense(License license) {
    }

    public CountryUnlockLicense() {
    }
}

