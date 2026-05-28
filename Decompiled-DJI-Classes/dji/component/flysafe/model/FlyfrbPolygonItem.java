/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.model;

import androidx.annotation.Keep;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import dji.csdk.flysafe.LimitAreaShape;
import java.util.List;

@Keep
public class FlyfrbPolygonItem {
    public SubAreaShape type;
    public int length;
    public int sub_area_id;
    public int height;
    public int radius;
    public int point_num;
    public List<DJILatLng> mConvertedPoints;

    public List<DJILatLng> getConvertedPoints() {
        return null;
    }

    @Keep
    public static final class SubAreaShape
    extends Enum<SubAreaShape> {
        public static final /* enum */ SubAreaShape SUB_POLYGON = new SubAreaShape(0);
        public static final /* enum */ SubAreaShape CIRCLE = new SubAreaShape(1);
        public static final /* enum */ SubAreaShape OTHER = new SubAreaShape(100);
        private int data;
        private static final /* synthetic */ SubAreaShape[] $VALUES;

        public static SubAreaShape[] values() {
            return null;
        }

        public static SubAreaShape valueOf(String string) {
            return null;
        }

        private SubAreaShape(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static SubAreaShape find(int n) {
            return null;
        }

        public static SubAreaShape findByProtobufType(LimitAreaShape limitAreaShape) {
            return null;
        }

        private static /* synthetic */ SubAreaShape[] $values() {
            return null;
        }

        static {
            $VALUES = SubAreaShape.$values();
        }
    }
}

