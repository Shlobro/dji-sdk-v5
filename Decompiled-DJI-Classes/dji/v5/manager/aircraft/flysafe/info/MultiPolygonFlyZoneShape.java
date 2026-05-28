/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.component.flysafe.model.FlyfrbPolygonItem;

public final class MultiPolygonFlyZoneShape
extends Enum<MultiPolygonFlyZoneShape> {
    public static final /* enum */ MultiPolygonFlyZoneShape CYLINDER = new MultiPolygonFlyZoneShape(0);
    public static final /* enum */ MultiPolygonFlyZoneShape POLYGON = new MultiPolygonFlyZoneShape(1);
    public static final /* enum */ MultiPolygonFlyZoneShape UNKNOWN = new MultiPolygonFlyZoneShape(255);
    private final int data;
    private static MultiPolygonFlyZoneShape[] mValues;
    private static final /* synthetic */ MultiPolygonFlyZoneShape[] $VALUES;

    public static MultiPolygonFlyZoneShape[] values() {
        return null;
    }

    public static MultiPolygonFlyZoneShape valueOf(String string2) {
        return null;
    }

    private MultiPolygonFlyZoneShape(int n2) {
    }

    public int value() {
        return 0;
    }

    public static MultiPolygonFlyZoneShape[] getValues() {
        return null;
    }

    public static MultiPolygonFlyZoneShape find(int n) {
        return null;
    }

    public static MultiPolygonFlyZoneShape find(FlyfrbPolygonItem.SubAreaShape subAreaShape) {
        return null;
    }

    private static /* synthetic */ MultiPolygonFlyZoneShape[] $values() {
        return null;
    }

    static {
        $VALUES = MultiPolygonFlyZoneShape.$values();
    }
}

