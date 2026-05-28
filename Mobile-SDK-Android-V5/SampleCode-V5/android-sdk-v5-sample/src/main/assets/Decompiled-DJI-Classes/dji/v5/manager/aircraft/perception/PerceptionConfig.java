/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.perception;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.manager.aircraft.perception.ObstacleAvoidanceConfig;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PerceptionConfig {
    private static Map<ProductType, Map<ObstacleAvoidanceType, List<ObstacleAvoidanceConfig>>> supportObstacleConfigMap = new HashMap<ProductType, Map<ObstacleAvoidanceType, List<ObstacleAvoidanceConfig>>>();

    public static Map<ObstacleAvoidanceType, List<ObstacleAvoidanceConfig>> getSupportObstacleConfig(@NonNull ProductType productType) {
        return null;
    }

    private static void initWM265Config() {
    }

    private static void initV3Config() {
    }

    private static void initOtherConfig() {
    }

    private PerceptionConfig() {
    }

    static {
        PerceptionConfig.initWM265Config();
        PerceptionConfig.initV3Config();
        PerceptionConfig.initOtherConfig();
    }
}

