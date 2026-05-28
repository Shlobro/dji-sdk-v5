/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.unlock.model;

import androidx.annotation.Keep;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import dji.component.flysafe.unlock.model.WhiteListLicense;
import dji.csdk.flysafe.v3.License;
import java.util.List;

@Keep
public class PentagonUnlockAreaLicense
extends WhiteListLicense {
    private List<DJILatLng> points;

    public List<DJILatLng> getPoints() {
        return null;
    }

    public void setPoints(List<DJILatLng> list) {
    }

    public PentagonUnlockAreaLicense(License license) {
    }

    public int getLimitedHeight() {
        return 0;
    }

    public PentagonUnlockAreaLicense() {
    }
}

