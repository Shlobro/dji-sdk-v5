/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.uas;

public final class RemoteIdWorkingState
extends Enum<RemoteIdWorkingState> {
    public static final /* enum */ RemoteIdWorkingState IDLE = new RemoteIdWorkingState(0);
    public static final /* enum */ RemoteIdWorkingState WORKING = new RemoteIdWorkingState(1);
    public static final /* enum */ RemoteIdWorkingState OPERATOR_LOCATION_LOST_ERROR = new RemoteIdWorkingState(2);
    public static final /* enum */ RemoteIdWorkingState FIRMWARE_ERROR = new RemoteIdWorkingState(3);
    public static final /* enum */ RemoteIdWorkingState NO_BROADCAST = new RemoteIdWorkingState(4);
    public static final /* enum */ RemoteIdWorkingState NOT_SUPPORTED = new RemoteIdWorkingState(5);
    public static final /* enum */ RemoteIdWorkingState UNKNOWN_ERROR = new RemoteIdWorkingState(65535);
    private int value;
    private static final RemoteIdWorkingState[] allValues;
    private static final /* synthetic */ RemoteIdWorkingState[] $VALUES;

    public static RemoteIdWorkingState[] values() {
        return null;
    }

    public static RemoteIdWorkingState valueOf(String string2) {
        return null;
    }

    private RemoteIdWorkingState(int n2) {
    }

    public boolean compareValue(int n) {
        return false;
    }

    public int value() {
        return 0;
    }

    public static RemoteIdWorkingState find(int n) {
        return null;
    }

    private static /* synthetic */ RemoteIdWorkingState[] $values() {
        return null;
    }

    static {
        $VALUES = RemoteIdWorkingState.$values();
        allValues = RemoteIdWorkingState.values();
    }
}

