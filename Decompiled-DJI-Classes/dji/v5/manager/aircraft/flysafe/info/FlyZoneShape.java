/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.component.flysafe.model.FlyForbidElement;

public final class FlyZoneShape
extends Enum<FlyZoneShape> {
    public static final /* enum */ FlyZoneShape CIRCLE = new FlyZoneShape(0);
    public static final /* enum */ FlyZoneShape MULTI_POLYGON = new FlyZoneShape(12);
    public static final /* enum */ FlyZoneShape UNKNOWN = new FlyZoneShape(255);
    private final int data;
    private static FlyZoneShape[] mValues;
    private static final /* synthetic */ FlyZoneShape[] $VALUES;

    public static FlyZoneShape[] values() {
        return null;
    }

    public static FlyZoneShape valueOf(String string2) {
        return null;
    }

    private FlyZoneShape(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static FlyZoneShape[] getValues() {
        return null;
    }

    public static FlyZoneShape find(int n) {
        return null;
    }

    public static FlyZoneShape find(FlyForbidElement.AreaShape areaShape) {
        return null;
    }

    private static /* synthetic */ FlyZoneShape[] $values() {
        return null;
    }

    static {
        $VALUES = FlyZoneShape.$values();
    }
}

