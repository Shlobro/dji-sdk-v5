/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe;

public final class FlySafeDatabaseState
extends Enum<FlySafeDatabaseState> {
    public static final /* enum */ FlySafeDatabaseState NEED_TO_SYNC = new FlySafeDatabaseState(0);
    public static final /* enum */ FlySafeDatabaseState NEED_TO_IMPORT = new FlySafeDatabaseState(1);
    public static final /* enum */ FlySafeDatabaseState UP_TO_DATE = new FlySafeDatabaseState(2);
    public static final /* enum */ FlySafeDatabaseState UNKNOWN = new FlySafeDatabaseState(255);
    private int data;
    private static FlySafeDatabaseState[] mValues;
    private static final /* synthetic */ FlySafeDatabaseState[] $VALUES;

    public static FlySafeDatabaseState[] values() {
        return null;
    }

    public static FlySafeDatabaseState valueOf(String string2) {
        return null;
    }

    private FlySafeDatabaseState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static FlySafeDatabaseState[] getValues() {
        return null;
    }

    public static FlySafeDatabaseState find(int n) {
        return null;
    }

    private static /* synthetic */ FlySafeDatabaseState[] $values() {
        return null;
    }

    static {
        $VALUES = FlySafeDatabaseState.$values();
    }
}

