/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.model;

import androidx.annotation.Keep;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Table;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Transient;
import dji.component.flysafe.model.FlyForbidElement;
import dji.component.flysafe.model.FlyfrbPolygonItem;
import dji.component.flysafe.model.IPreciseStaticDbTable;
import java.util.List;

@Table(name="airmap_geofence_infos")
@Keep
public class FlyfrbPolygonMainElement
extends FlyForbidElement
implements IPreciseStaticDbTable {
    public int search_radius;
    public boolean tower;
    public String phone;
    public byte[] polygon_shape;
    @Transient
    protected List<FlyfrbPolygonItem> mFlyfrbPolygonItems;

    @Override
    public List<FlyfrbPolygonItem> getFlyfrbPolygonItems() {
        return null;
    }

    private void convertItems() {
    }

    @Override
    public int getSearchRadius() {
        return 0;
    }
}

