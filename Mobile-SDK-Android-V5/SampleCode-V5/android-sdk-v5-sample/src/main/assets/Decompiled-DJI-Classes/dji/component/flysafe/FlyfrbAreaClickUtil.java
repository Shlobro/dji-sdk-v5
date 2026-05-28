/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe;

import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import dji.component.flysafe.model.FlyForbidDrawParam;
import java.util.List;

public class FlyfrbAreaClickUtil {
    public static boolean isInFlyforbidArea(DJILatLng dJILatLng, FlyForbidDrawParam flyForbidDrawParam) {
        return false;
    }

    private static boolean ptInPolygon(DJILatLng dJILatLng, List<DJILatLng> list) {
        return false;
    }

    public static float getDistance(DJILatLng dJILatLng, DJILatLng dJILatLng2) {
        return 0.0f;
    }
}

