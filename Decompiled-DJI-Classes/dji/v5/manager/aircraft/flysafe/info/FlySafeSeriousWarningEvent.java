/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

public final class FlySafeSeriousWarningEvent
extends Enum<FlySafeSeriousWarningEvent> {
    public static final /* enum */ FlySafeSeriousWarningEvent IN_NO_FLY_ZONE = new FlySafeSeriousWarningEvent(0);
    public static final /* enum */ FlySafeSeriousWarningEvent IN_LIMIT_HEIGHT_AREA = new FlySafeSeriousWarningEvent(1);
    public static final /* enum */ FlySafeSeriousWarningEvent IN_AUTHORIZATION_ZONE_WITHOUT_UNLOCKING = new FlySafeSeriousWarningEvent(2);
    public static final /* enum */ FlySafeSeriousWarningEvent IN_UNLOCKED_AUTHORIZATION_ZONE = new FlySafeSeriousWarningEvent(3);
    public static final /* enum */ FlySafeSeriousWarningEvent HAVE_THREE_MIN_WILL_APPLY_TFRS = new FlySafeSeriousWarningEvent(4);
    public static final /* enum */ FlySafeSeriousWarningEvent UNKNOWN = new FlySafeSeriousWarningEvent(255);
    private final int value;
    private static FlySafeSeriousWarningEvent[] sValues;
    private static final /* synthetic */ FlySafeSeriousWarningEvent[] $VALUES;

    public static FlySafeSeriousWarningEvent[] values() {
        return null;
    }

    public static FlySafeSeriousWarningEvent valueOf(String string2) {
        return null;
    }

    private FlySafeSeriousWarningEvent(int n2) {
    }

    public static FlySafeSeriousWarningEvent fromValue(int n) {
        return null;
    }

    private static /* synthetic */ FlySafeSeriousWarningEvent[] $values() {
        return null;
    }

    static {
        $VALUES = FlySafeSeriousWarningEvent.$values();
        sValues = null;
    }
}

