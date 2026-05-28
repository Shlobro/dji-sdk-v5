/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.unlock.model;

import androidx.annotation.Keep;
import dji.component.flysafe.unlock.model.AntiInterferenceUnlockLicense;
import dji.component.flysafe.unlock.model.CircleUnlockAreaLicense;
import dji.component.flysafe.unlock.model.CountryUnlockLicense;
import dji.component.flysafe.unlock.model.GeoUnlockLicense;
import dji.component.flysafe.unlock.model.HeightUnlockLicense;
import dji.component.flysafe.unlock.model.PentagonUnlockAreaLicense;
import dji.component.flysafe.unlock.model.PowerUnlockLicense;
import dji.component.flysafe.unlock.model.RIDUnlockLicense;
import dji.component.flysafe.unlock.model.WhiteListLicense;
import dji.csdk.flysafe.v3.LicenseData;

@Keep
public final class LicenseType
extends Enum<LicenseType> {
    public static final /* enum */ LicenseType GEO_UNLOCK = new LicenseType(0, GeoUnlockLicense.class);
    public static final /* enum */ LicenseType CIRCLE_UNLOCK_AREA = new LicenseType(1, CircleUnlockAreaLicense.class);
    public static final /* enum */ LicenseType COUNTRY_UNLOCK = new LicenseType(2, CountryUnlockLicense.class);
    public static final /* enum */ LicenseType PARAMETER_CONFIGURATION = new LicenseType(3, HeightUnlockLicense.class);
    public static final /* enum */ LicenseType PENTAGON_UNLOCK_AREA = new LicenseType(4, PentagonUnlockAreaLicense.class);
    public static final /* enum */ LicenseType POWER_UNLOCK = new LicenseType(5, PowerUnlockLicense.class);
    public static final /* enum */ LicenseType RID_UNLOCK = new LicenseType(6, RIDUnlockLicense.class);
    public static final /* enum */ LicenseType ANTI_INTERFERENCE = new LicenseType(7, AntiInterferenceUnlockLicense.class);
    public static final /* enum */ LicenseType UNKNOWN = new LicenseType(255);
    private int value;
    private Class<? extends WhiteListLicense> mMatchClass;
    private static final /* synthetic */ LicenseType[] $VALUES;

    public static LicenseType[] values() {
        return null;
    }

    public static LicenseType valueOf(String string) {
        return null;
    }

    private LicenseType(int n2) {
    }

    private LicenseType(int n2, Class<? extends WhiteListLicense> clazz) {
    }

    public Class<? extends WhiteListLicense> getMatchClass() {
        return null;
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static LicenseType find(int n) {
        return null;
    }

    public static LicenseType find(LicenseData licenseData) {
        return null;
    }

    private static /* synthetic */ LicenseType[] $values() {
        return null;
    }

    static {
        $VALUES = LicenseType.$values();
    }
}

