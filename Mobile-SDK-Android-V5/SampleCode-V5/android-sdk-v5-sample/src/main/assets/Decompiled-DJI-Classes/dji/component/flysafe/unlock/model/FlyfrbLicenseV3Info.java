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
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Id;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Table;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Transient;
import dji.component.flysafe.model.IFlyfrbBaseDb;
import dji.component.flysafe.model.IFlyfrbInfoDbTable;
import java.util.List;

@Table(name="flyfrb_unlock_license_v3_detail")
@Keep
public class FlyfrbLicenseV3Info
implements IFlyfrbBaseDb,
IFlyfrbInfoDbTable {
    @Id
    public int table_id;
    public int id;
    public String description;
    public long start_at;
    public long end_at;
    public int type;
    @Transient
    public List<Integer> area_ids;
    public String save_area_ids;
    public int radius;
    public float lat;
    public float lng;
    public String country;
    public int country_number;
    public int height;
    public String points;
    public int level;
    public int rid_level;
    public int anti_level;
    @Transient
    public List<DJILatLng> mFormatPolygonPoints;
    public String sn;
    public long user_id;
    public int group_id;
    public boolean isUserOnly;
    @Transient
    public static final String DB_WHERE_USER_ID_FORMAT = "user_id=%d";
    @Transient
    public static final String DB_WHERE_GROUP_ID_FORMAT = "group_id=%d";

    public void handlePreSaveDb() {
    }

    @Nullable
    public List<Integer> getAreaIds() {
        return null;
    }

    public String getAreaIdsStr() {
        return null;
    }

    public boolean containsGeoAreaIds(List<Integer> list) {
        return false;
    }

    @Override
    public void handleNullField() {
    }
}

