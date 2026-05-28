/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

public final class GoHomeState
extends Enum<GoHomeState> {
    public static final /* enum */ GoHomeState IDLE = new GoHomeState(0);
    public static final /* enum */ GoHomeState RETURNING_TO_HOME = new GoHomeState(1);
    public static final /* enum */ GoHomeState LANDING = new GoHomeState(2);
    public static final /* enum */ GoHomeState COMPLETED = new GoHomeState(3);
    public static final /* enum */ GoHomeState UNKNOWN = new GoHomeState(255);
    private int value;
    private static GoHomeState[] values;
    private static final /* synthetic */ GoHomeState[] $VALUES;

    public static GoHomeState[] values() {
        return null;
    }

    public static GoHomeState valueOf(String string) {
        return null;
    }

    private GoHomeState(int n2) {
    }

    private boolean _equals(int n) {
        return false;
    }

    public int value() {
        return 0;
    }

    public static GoHomeState[] getValues() {
        return null;
    }

    public static GoHomeState find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomeState[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomeState.$values();
    }
}

