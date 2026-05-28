/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.component.flysafe.model.JNIWarnModelWrappers;

public final class FlySafeTipEvent
extends Enum<FlySafeTipEvent> {
    public static final /* enum */ FlySafeTipEvent TAKE_OFF_IN_HEIGHT_LIMIT_ZONE_WITHOUT_GPS = new FlySafeTipEvent(0);
    public static final /* enum */ FlySafeTipEvent TAKE_OFF_IN_HEIGHT_LIMIT_ZONE = new FlySafeTipEvent(1);
    public static final /* enum */ FlySafeTipEvent TAKE_OFF_IN_WARNING_AREA = new FlySafeTipEvent(2);
    public static final /* enum */ FlySafeTipEvent TOUCH_NO_FLY_ZONE = new FlySafeTipEvent(3);
    public static final /* enum */ FlySafeTipEvent TOUCH_AUTHORIZATION_ZONE = new FlySafeTipEvent(4);
    public static final /* enum */ FlySafeTipEvent REACH_MAXIMUM_FLIGHT_HEIGHT = new FlySafeTipEvent(5);
    public static final /* enum */ FlySafeTipEvent RTH_AFFECTED_AT_BOUNDARY_OF_GEO_ZONE = new FlySafeTipEvent(6);
    public static final /* enum */ FlySafeTipEvent AT_BOUNDARY_OF_CUSTOM_UNLOCK_ZONE = new FlySafeTipEvent(8);
    public static final /* enum */ FlySafeTipEvent ENTER_LIMIT_HEIGHT_AREA = new FlySafeTipEvent(9);
    public static final /* enum */ FlySafeTipEvent COLLISION_WITH_LIMIT_HEIGHT_AREA_SOON_IN_WHITE_LIST_VALID_AREA = new FlySafeTipEvent(10);
    public static final /* enum */ FlySafeTipEvent UNKNOWN = new FlySafeTipEvent(255);
    private final int value;
    private static FlySafeTipEvent[] sValues;
    private static final /* synthetic */ FlySafeTipEvent[] $VALUES;

    public static FlySafeTipEvent[] values() {
        return null;
    }

    public static FlySafeTipEvent valueOf(String string2) {
        return null;
    }

    private FlySafeTipEvent(int n2) {
    }

    public static FlySafeTipEvent find(int n) {
        return null;
    }

    public static FlySafeTipEvent find(JNIWarnModelWrappers.ShowTipsWrapper.NormalTipsType normalTipsType) {
        return null;
    }

    private static /* synthetic */ FlySafeTipEvent[] $values() {
        return null;
    }

    static {
        $VALUES = FlySafeTipEvent.$values();
        sValues = null;
    }
}

