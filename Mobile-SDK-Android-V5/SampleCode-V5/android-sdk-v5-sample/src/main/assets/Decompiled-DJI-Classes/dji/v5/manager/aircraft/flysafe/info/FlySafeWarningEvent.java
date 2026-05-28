/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.component.flysafe.model.JNIWarnModelWrappers;

public final class FlySafeWarningEvent
extends Enum<FlySafeWarningEvent> {
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_FAILED_IN_NO_FLY_ZONE = new FlySafeWarningEvent(0);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_FAILED_IN_NO_FLY_ZONE_WITHOUT_GPS = new FlySafeWarningEvent(1);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_FAILED_WITHOUT_CUSTOM_UNLOCKING = new FlySafeWarningEvent(2);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_FAILED_IN_AUTHORIZED_AREA_WITHOUT_GPS_AND_UNLOCKING = new FlySafeWarningEvent(3);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_FAILED_IN_AUTHORIZED_ZONE_WITHOUT_UNLOCKING = new FlySafeWarningEvent(4);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_FAILED_IN_AUTHORIZED_ZONE = new FlySafeWarningEvent(5);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_IN_ENHANCED_WARNING_ZONE = new FlySafeWarningEvent(6);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_NEAR_NO_FLY_ZONE = new FlySafeWarningEvent(7);
    public static final /* enum */ FlySafeWarningEvent LIMITED_RESTRICTIONS_NEARBY = new FlySafeWarningEvent(8);
    public static final /* enum */ FlySafeWarningEvent AUTHORIZED_ZONE_WITHOUT_UNLOCKING_NEARBY = new FlySafeWarningEvent(9);
    public static final /* enum */ FlySafeWarningEvent AUTHORIZED_ZONE_AND_RESTRICTIONS_NEARBY = new FlySafeWarningEvent(10);
    public static final /* enum */ FlySafeWarningEvent RESTRICTIONS_IN_LIMITED_FLY_ZONE_NEARBY = new FlySafeWarningEvent(11);
    public static final /* enum */ FlySafeWarningEvent IN_AUTHORIZATION_ZONE = new FlySafeWarningEvent(12);
    public static final /* enum */ FlySafeWarningEvent TAKE_OFF_FAILED_UNDER_LIMIT_AREA_WITH_GPS_ONCE = new FlySafeWarningEvent(13);
    public static final /* enum */ FlySafeWarningEvent HAVE_ONE_HOUR_WILL_APPLY_TFRS = new FlySafeWarningEvent(14);
    public static final /* enum */ FlySafeWarningEvent UNKNOWN = new FlySafeWarningEvent(255);
    private int mValue;
    private static FlySafeWarningEvent[] sValues;
    private static final /* synthetic */ FlySafeWarningEvent[] $VALUES;

    public static FlySafeWarningEvent[] values() {
        return null;
    }

    public static FlySafeWarningEvent valueOf(String string2) {
        return null;
    }

    private FlySafeWarningEvent(int n2) {
    }

    public static FlySafeWarningEvent find(int n) {
        return null;
    }

    public static FlySafeWarningEvent find(JNIWarnModelWrappers.NewFlyFrbUIAction newFlyFrbUIAction) {
        return null;
    }

    private static /* synthetic */ FlySafeWarningEvent[] $values() {
        return null;
    }

    static {
        $VALUES = FlySafeWarningEvent.$values();
        sValues = null;
    }
}

