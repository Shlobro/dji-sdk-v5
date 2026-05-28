/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.Nullable
 */
package dji.component.flysafe.unlock.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Id;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Table;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Transient;
import dji.component.flysafe.model.IFlyfrbBaseDb;
import dji.component.flysafe.model.IFlyfrbInfoDbTable;
import dji.component.flysafe.unlock.model.FlyfrbLicenseV3Info;
import java.util.List;

@Table(name="flyfrb_usr_sn_unlock_v3_license_group")
@Keep
public class FlyfrbLicenseV3GroupData
implements IFlyfrbBaseDb,
IFlyfrbInfoDbTable {
    @Transient
    public static final String DB_WHERE_USER_ID_FORMAT = "user_id=%d";
    @Transient
    public static final String DB_WHERE_ID_FORMAT = "id=%d";
    @Transient
    public static final String JSON_KEY_LICENSE_V3 = "onboard_license_v3";
    @Id
    public int table_id;
    public int id;
    public long user_id;
    public String sn;
    public long updated_at;
    public int unlock_licenses_count;
    public String onboard_license_v2;
    public transient String onboard_license_v3;
    @Transient
    public List<FlyfrbLicenseV3Info> unlock_licenses;

    @Nullable
    public static List<FlyfrbLicenseV3GroupData> parseGroupFromJson(String string) {
        return null;
    }

    public List<FlyfrbLicenseV3Info> getUnlockLicenses() {
        return null;
    }

    @Nullable
    public static FlyfrbLicenseV3GroupData parseFromJson(String string) {
        return null;
    }

    public void injectData2LicenseInfos() {
    }

    @Nullable
    public String getLicenseDataByVersion() {
        return null;
    }

    public boolean isInvalid() {
        return false;
    }

    @Override
    public void handleNullField() {
    }
}

