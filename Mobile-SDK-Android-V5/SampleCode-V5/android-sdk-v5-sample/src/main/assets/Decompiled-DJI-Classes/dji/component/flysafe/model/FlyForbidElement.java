/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.model;

import androidx.annotation.Keep;
import com.dji.flysafe.midware.data.forbid.DJISetFlyForbidAreaModel;
import dji.component.flysafe.model.FlyfrbPolygonItem;
import dji.component.flysafe.model.IFlyfrbAreaTable;
import dji.component.flysafe.model.IFlyfrbBaseDb;
import dji.csdk.flysafe.CEApproachMode;
import java.util.List;

@Keep
public class FlyForbidElement
implements IFlyfrbBaseDb,
IFlyfrbAreaTable {
    public int id;
    public int area_id;
    public int type;
    public int shape;
    public double lat;
    public double lng;
    public int radius;
    public int warning;
    public int level;
    public int disable;
    public long updated_at;
    public long begin_at;
    public long end_at;
    public String name;
    public int country;
    public String city;
    public String points;
    public long limit_height;
    public boolean is_unlock;
    public long index;
    public double lower_limit;
    public String lower_vertical_reference;
    public double upper_limit;
    public String upper_vertical_reference;
    public double horizontal_limit;
    public CEApproachMode mode;
    public List<String> ce_day;
    public List<String> ce_starttime;
    public List<String> ce_endime;
    public boolean is_permanent;
    public String ce_all_starttime;
    public String ce_all_endtime;
    public String ce_uom_dimensions;

    public FlyForbidElement copyOf() {
        return null;
    }

    public DJISetFlyForbidAreaModel copyToSentModel() {
        return null;
    }

    @Override
    public void handleNullField() {
    }

    public int getSearchRadius() {
        return 0;
    }

    public List<FlyfrbPolygonItem> getFlyfrbPolygonItems() {
        return null;
    }

    @Override
    public double getLat() {
        return 0.0;
    }

    @Override
    public double getLng() {
        return 0.0;
    }

    public static final class AreaShape
    extends Enum<AreaShape> {
        public static final /* enum */ AreaShape CIRCLE = new AreaShape(0);
        public static final /* enum */ AreaShape SINGLE_POLYGON = new AreaShape(1);
        public static final /* enum */ AreaShape MULTI_POLYGON = new AreaShape(12);
        public static final /* enum */ AreaShape OTHER = new AreaShape(100);
        private int data;
        private static final /* synthetic */ AreaShape[] $VALUES;

        public static AreaShape[] values() {
            return null;
        }

        public static AreaShape valueOf(String string) {
            return null;
        }

        private AreaShape(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static AreaShape find(int n) {
            return null;
        }

        private static /* synthetic */ AreaShape[] $values() {
            return null;
        }

        static {
            $VALUES = AreaShape.$values();
        }
    }
}

