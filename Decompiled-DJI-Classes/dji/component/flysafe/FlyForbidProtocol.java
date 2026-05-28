/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe;

import androidx.annotation.Keep;

@Keep
public class FlyForbidProtocol {
    public static final String KEY_SHOW_LIMIT_CIRCLE_WHEN_SPECIAL_UNLOCK = "key_show_limit_circle_when_special_unlock";
    public static final String PLATFORM_NAME_FOR_JNI = "android";
    public static final String PREFIX_KEY_VERSION = "kv";
    public static final String FORMAT_KEY_VERSION = "kv%d";
    public static final double COORD_ENLARGE_FACTOR = 1000000.0;
    public static final int RADIUS_AREA_UPLOAD_TO_FLYC = 10000;
    public static double SEARCH_RADIUS = 50000.0;
    public static final double GO_SEARCH_RADIUS_CONNECTED = 10000.0;
    public static final double UPDATE_TFR_DIST = 5000.0;
    public static final double UPDATE_CACHE_DIST = 10000.0;
    public static final double DATABASE_UPDATE_DIST = 50000.0;
    public static final double UNLOCK_RADIUS = 2000.0;
    public static final double STRONG_WARNING_CHECK_RADIUS = 5000.0;
    public static final long CHECK_DATA_UPDATE_INTERVAL = 300000L;
    public static final long UNLIMIT_AREA_EXPIRED_TIME = 86400L;
    public static final int SUPPORT_UNLOCK_FLYC_PROTOCOL_VERSION = 9;
    public static final int COUNTRY_CODE_CHINA = 156;
    public static final int AIRPORT_WARNING_MAXHEIGHT = 120;

    @Keep
    public static final class DJIWarningAreaState
    extends Enum<DJIWarningAreaState> {
        public static final /* enum */ DJIWarningAreaState None = new DJIWarningAreaState(0);
        public static final /* enum */ DJIWarningAreaState NearLimit = new DJIWarningAreaState(1);
        public static final /* enum */ DJIWarningAreaState InnerLimit = new DJIWarningAreaState(4);
        private int data;
        private static final /* synthetic */ DJIWarningAreaState[] $VALUES;

        public static DJIWarningAreaState[] values() {
            return null;
        }

        public static DJIWarningAreaState valueOf(String string) {
            return null;
        }

        private DJIWarningAreaState(int n2) {
        }

        public int value() {
            return 0;
        }

        private static /* synthetic */ DJIWarningAreaState[] $values() {
            return null;
        }

        static {
            $VALUES = DJIWarningAreaState.$values();
        }
    }

    @Keep
    public static final class LevelType
    extends Enum<LevelType> {
        public static final /* enum */ LevelType WARNING = new LevelType(0);
        public static final /* enum */ LevelType CAN_UNLIMIT = new LevelType(1);
        public static final /* enum */ LevelType CAN_NOT_UNLIMIT = new LevelType(2, 4);
        public static final /* enum */ LevelType STRONG_WARNING = new LevelType(3);
        public static final /* enum */ LevelType UTMISS_REGULATION = new LevelType(7);
        public static final /* enum */ LevelType UTMISS_LAW_ALLOW = new LevelType(8);
        private int data;
        private int mSubType;
        private static volatile LevelType[] sValues;
        private static final /* synthetic */ LevelType[] $VALUES;

        public static LevelType[] values() {
            return null;
        }

        public static LevelType valueOf(String string) {
            return null;
        }

        private LevelType(int n2) {
        }

        private LevelType(int n2, int n3) {
        }

        public int value() {
            return 0;
        }

        public int getSubType() {
            return 0;
        }

        public static LevelType ofValue(int n) {
            return null;
        }

        private static /* synthetic */ LevelType[] $values() {
            return null;
        }

        static {
            $VALUES = LevelType.$values();
            sValues = null;
        }
    }

    public static final class ShowLimitCircleSUEvent
    extends Enum<ShowLimitCircleSUEvent> {
        public static final /* enum */ ShowLimitCircleSUEvent TURE = new ShowLimitCircleSUEvent();
        private static final /* synthetic */ ShowLimitCircleSUEvent[] $VALUES;

        public static ShowLimitCircleSUEvent[] values() {
            return null;
        }

        public static ShowLimitCircleSUEvent valueOf(String string) {
            return null;
        }

        private static /* synthetic */ ShowLimitCircleSUEvent[] $values() {
            return null;
        }

        static {
            $VALUES = ShowLimitCircleSUEvent.$values();
        }
    }
}

