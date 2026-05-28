/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.perception;

import dji.v5.manager.aircraft.perception.data.PerceptionDirection;

public class ObstacleAvoidanceConfig {
    private PerceptionDirection perceptionDirection;
    private boolean isSupportModify;
    private boolean defaultEnable;

    private ObstacleAvoidanceConfig(Build build) {
    }

    public String toString() {
        return null;
    }

    public boolean isDefaultEnable() {
        return false;
    }

    public PerceptionDirection getPerceptionDirection() {
        return null;
    }

    public boolean isSupportModify() {
        return false;
    }

    /* synthetic */ ObstacleAvoidanceConfig(Build build, 1 var2_2) {
    }

    public static class Build {
        private PerceptionDirection perceptionDirection;
        private boolean isSupportModify;
        private boolean defaultEnable;

        public Build setDefaultEnable(boolean bl) {
            return null;
        }

        public Build setPerceptionDirection(PerceptionDirection perceptionDirection) {
            return null;
        }

        public Build setSupportModify(boolean bl) {
            return null;
        }

        public ObstacleAvoidanceConfig build() {
            return null;
        }

        static /* synthetic */ PerceptionDirection access$000(Build build) {
            return null;
        }

        static /* synthetic */ boolean access$100(Build build) {
            return false;
        }

        static /* synthetic */ boolean access$200(Build build) {
            return false;
        }
    }
}

