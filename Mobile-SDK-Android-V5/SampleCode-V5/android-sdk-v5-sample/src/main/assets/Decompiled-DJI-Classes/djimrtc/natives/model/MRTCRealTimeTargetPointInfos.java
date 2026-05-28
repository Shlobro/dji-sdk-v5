/*
 * Decompiled with CFR 0.152.
 */
package djimrtc.natives.model;

import djimrtc.natives.model.RealTimeTargetPoint;
import djimrtc.natives.model.UtcTime;
import java.util.List;

public class MRTCRealTimeTargetPointInfos {
    private final UtcTime utcTime;
    private final String source;
    private final List<RealTimeTargetPoint> targetPoints;

    private MRTCRealTimeTargetPointInfos(Builder builder) {
    }

    public UtcTime getUtcTime() {
        return null;
    }

    public String getSource() {
        return null;
    }

    public List<RealTimeTargetPoint> getTargetPoints() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ MRTCRealTimeTargetPointInfos(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private UtcTime utcTime;
        private String source;
        private List<RealTimeTargetPoint> targetPoints;

        public Builder setUtcTime(UtcTime utcTime) {
            return null;
        }

        public Builder setSource(String string) {
            return null;
        }

        public Builder setTargetPoints(List<RealTimeTargetPoint> list) {
            return null;
        }

        public MRTCRealTimeTargetPointInfos build() {
            return null;
        }

        static /* synthetic */ UtcTime access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ List access$200(Builder builder) {
            return null;
        }
    }
}

