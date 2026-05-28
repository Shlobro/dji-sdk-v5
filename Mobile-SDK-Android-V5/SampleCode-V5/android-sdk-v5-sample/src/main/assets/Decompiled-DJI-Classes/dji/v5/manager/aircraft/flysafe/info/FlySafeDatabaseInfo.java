/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseComponent;
import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseUpgradeMode;

public class FlySafeDatabaseInfo {
    private FlySafeDatabaseUpgradeMode flySafeDatabaseUpgradeMode;
    private FlySafeDatabaseComponent component;
    private long timeStamp;
    private long databaseSize;
    private String databaseName;

    public FlySafeDatabaseInfo(Builder builder) {
    }

    public FlySafeDatabaseUpgradeMode getFlySafeDatabaseUpgradeMode() {
        return null;
    }

    public long getDatabaseTimeStamp() {
        return 0L;
    }

    public long getDatabaseSize() {
        return 0L;
    }

    public String getDatabaseName() {
        return null;
    }

    public FlySafeDatabaseComponent getComponent() {
        return null;
    }

    public static final class Builder {
        private FlySafeDatabaseUpgradeMode flySafeDatabaseUpgradeMode;
        private FlySafeDatabaseComponent component;
        private long timeStamp;
        private long databaseSize;
        private String databaseName;

        private Builder() {
        }

        public static Builder newBuilder() {
            return null;
        }

        public Builder flySafeDatabaseUpgradeMode(FlySafeDatabaseUpgradeMode flySafeDatabaseUpgradeMode) {
            return null;
        }

        public Builder component(FlySafeDatabaseComponent flySafeDatabaseComponent) {
            return null;
        }

        public Builder timeStamp(long l2) {
            return null;
        }

        public Builder databaseSize(long l2) {
            return null;
        }

        public Builder databaseName(String string2) {
            return null;
        }

        public FlySafeDatabaseInfo build() {
            return null;
        }

        static /* synthetic */ FlySafeDatabaseUpgradeMode access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ FlySafeDatabaseComponent access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ long access$200(Builder builder) {
            return 0L;
        }

        static /* synthetic */ long access$300(Builder builder) {
            return 0L;
        }

        static /* synthetic */ String access$400(Builder builder) {
            return null;
        }
    }
}

