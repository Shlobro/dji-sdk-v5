/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.v5.common.KeepProguard;
import dji.v5.manager.aircraft.flysafe.info.FlySafeLicenseType;
import dji.v5.manager.aircraft.flysafe.info.RidUnlockType;
import java.util.List;

public class FlyZoneLicenseInfo
implements KeepProguard {
    private final FlySafeLicenseType licenseType;
    private final long startTimeStamp;
    private final long endTimeStamp;
    private final int licenseId;
    private final boolean enabled;
    private final boolean isValid;
    private final String description;
    private final String sn;
    private final float cylinderLatitude;
    private final float cylinderLongitude;
    private final float cylinderRadius;
    private final int cylinderHeight;
    private final int countryId;
    private final List<Integer> flyZoneIDs;
    private final int limitedHeight;
    private final List<LocationCoordinate2D> polygonPoints;
    private final RidUnlockType ridUnlockType;

    private FlyZoneLicenseInfo(Builder builder) {
    }

    public FlySafeLicenseType getLicenseType() {
        return null;
    }

    public String getSN() {
        return null;
    }

    public long getStartTimeStamp() {
        return 0L;
    }

    public long getEndTimeStamp() {
        return 0L;
    }

    public int getLicenseId() {
        return 0;
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean isValid() {
        return false;
    }

    public String getDescription() {
        return null;
    }

    public List<Integer> getFlyZoneIDs() {
        return null;
    }

    public float getCylinderLatitude() {
        return 0.0f;
    }

    public float getCylinderLongitude() {
        return 0.0f;
    }

    public float getCylinderRadius() {
        return 0.0f;
    }

    public int getCylinderHeight() {
        return 0;
    }

    public List<LocationCoordinate2D> getPolygonPoints() {
        return null;
    }

    public int getLimitedHeight() {
        return 0;
    }

    public int getCountryId() {
        return 0;
    }

    public RidUnlockType getRidUnlockType() {
        return null;
    }

    public static boolean isTimeValid(long l2, long l3) {
        return false;
    }

    /* synthetic */ FlyZoneLicenseInfo(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private FlySafeLicenseType licenseType;
        private long startTimeStamp;
        private long endTimeStamp;
        private int licenseId;
        private boolean enabled;
        private boolean isValid;
        private String description;
        private String sn;
        private float cylinderLatitude;
        private float cylinderLongitude;
        private float cylinderRadius;
        private int cylinderHeight;
        private int countryId;
        private List<Integer> flyZoneIDs;
        private int limitedHeight;
        private List<LocationCoordinate2D> polygonPoints;
        private RidUnlockType ridUnlockType;

        private Builder() {
        }

        public static Builder newBuilder() {
            return null;
        }

        public Builder licenseType(FlySafeLicenseType flySafeLicenseType) {
            return null;
        }

        public Builder startTimeStamp(long l2) {
            return null;
        }

        public Builder endTimeStamp(long l2) {
            return null;
        }

        public Builder licenseId(int n) {
            return null;
        }

        public Builder enabled(boolean bl) {
            return null;
        }

        public Builder isValid(boolean bl) {
            return null;
        }

        public Builder description(String string2) {
            return null;
        }

        public Builder sn(String string2) {
            return null;
        }

        public Builder cylinderLatitude(float f2) {
            return null;
        }

        public Builder cylinderLongitude(float f2) {
            return null;
        }

        public Builder cylinderRadius(float f2) {
            return null;
        }

        public Builder cylinderHeight(int n) {
            return null;
        }

        public Builder countryId(int n) {
            return null;
        }

        public Builder flyZoneIDs(List<Integer> list) {
            return null;
        }

        public Builder limitedHeight(int n) {
            return null;
        }

        public Builder polygonPoints(List<LocationCoordinate2D> list) {
            return null;
        }

        public Builder ridUnlockType(RidUnlockType ridUnlockType) {
            return null;
        }

        public FlyZoneLicenseInfo build() {
            return null;
        }

        static /* synthetic */ FlySafeLicenseType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ long access$100(Builder builder) {
            return 0L;
        }

        static /* synthetic */ long access$200(Builder builder) {
            return 0L;
        }

        static /* synthetic */ int access$300(Builder builder) {
            return 0;
        }

        static /* synthetic */ boolean access$400(Builder builder) {
            return false;
        }

        static /* synthetic */ boolean access$500(Builder builder) {
            return false;
        }

        static /* synthetic */ String access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$700(Builder builder) {
            return null;
        }

        static /* synthetic */ float access$800(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$900(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$1000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ int access$1100(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$1200(Builder builder) {
            return 0;
        }

        static /* synthetic */ List access$1300(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$1400(Builder builder) {
            return 0;
        }

        static /* synthetic */ List access$1500(Builder builder) {
            return null;
        }

        static /* synthetic */ RidUnlockType access$1600(Builder builder) {
            return null;
        }
    }
}

