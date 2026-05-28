/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.aircraft.perception;

import dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import java.util.List;

public class PerceptionUtil {
    public static final int HORIZONTAL_TOTAL_ANGLE = 360;

    public static int getAngularInterval(List<Integer> list) {
        return 0;
    }

    private PerceptionUtil() {
    }

    public static ObstacleAvoidanceType getObstacleAvoidanceType(ObstacleActionType obstacleActionType) {
        return null;
    }

    public static ObstacleActionType getObstacleActionType(ObstacleAvoidanceType obstacleAvoidanceType) {
        return null;
    }
}

