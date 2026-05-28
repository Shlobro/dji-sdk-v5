/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.WireEnum
 */
package dji.csdk.flysafe;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public final class EventNotificationType
extends Enum<EventNotificationType>
implements WireEnum {
    public static final /* enum */ EventNotificationType ShowWarning = new EventNotificationType(0);
    public static final /* enum */ EventNotificationType ShowTips = new EventNotificationType(1);
    public static final /* enum */ EventNotificationType ShowCDLWarning = new EventNotificationType(2);
    public static final /* enum */ EventNotificationType ShowRTHTips = new EventNotificationType(3);
    public static final /* enum */ EventNotificationType ShowAreas = new EventNotificationType(4);
    public static final /* enum */ EventNotificationType ShowSpecialUnlockArea = new EventNotificationType(5);
    public static final /* enum */ EventNotificationType UpdateLicenseUnlockVersion = new EventNotificationType(6);
    public static final /* enum */ EventNotificationType ChinaAirportWarningArea = new EventNotificationType(7);
    public static final /* enum */ EventNotificationType GuideRecord = new EventNotificationType(8);
    public static final /* enum */ EventNotificationType FlySafeLimitInfoRecord = new EventNotificationType(9);
    public static final /* enum */ EventNotificationType V1WhiteListInfoUpdated = new EventNotificationType(10);
    public static final /* enum */ EventNotificationType AircraftLoadingDatabaseProgress = new EventNotificationType(11);
    public static final /* enum */ EventNotificationType ShowNFZType = new EventNotificationType(12);
    public static final /* enum */ EventNotificationType ShowUtmissAreasType = new EventNotificationType(13);
    public static final ProtoAdapter<EventNotificationType> ADAPTER;
    private final int value;
    private static final /* synthetic */ EventNotificationType[] $VALUES;

    public static EventNotificationType[] values() {
        return null;
    }

    public static EventNotificationType valueOf(String string) {
        return null;
    }

    private EventNotificationType(int n2) {
    }

    public static EventNotificationType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ EventNotificationType[] $values() {
        return null;
    }

    static {
        $VALUES = EventNotificationType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(EventNotificationType.class);
    }
}

