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
import java.util.List;

@Keep
public class GeoUnlockLicense
extends WhiteListLicense {
    private List<Integer> areaIds;

    public void setAreaIds(List<Integer> list) {
    }

    public List<Integer> getAreaIds() {
        return null;
    }

    public GeoUnlockLicense(License license) {
    }

    public GeoUnlockLicense() {
    }

    public boolean containsByAreaIds(List<Integer> list) {
        return false;
    }

    public String getAreaIdsStr() {
        return null;
    }

    public boolean containsAreaId(int n) {
        return false;
    }
}

