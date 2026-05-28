/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class OfflineMapStatusInDronePosition
extends Enum<OfflineMapStatusInDronePosition>
implements JNIProguardKeepTag {
    public static final /* enum */ OfflineMapStatusInDronePosition INIT = new OfflineMapStatusInDronePosition(0);
    public static final /* enum */ OfflineMapStatusInDronePosition COV_HORIZ = new OfflineMapStatusInDronePosition(1);
    public static final /* enum */ OfflineMapStatusInDronePosition NO_MAP = new OfflineMapStatusInDronePosition(2);
    public static final /* enum */ OfflineMapStatusInDronePosition COV_HAE = new OfflineMapStatusInDronePosition(3);
    public static final /* enum */ OfflineMapStatusInDronePosition BASEMAP = new OfflineMapStatusInDronePosition(4);
    public static final /* enum */ OfflineMapStatusInDronePosition HD_MAP = new OfflineMapStatusInDronePosition(5);
    public static final /* enum */ OfflineMapStatusInDronePosition UNKNOWN = new OfflineMapStatusInDronePosition(65535);
    private int value;
    private static final OfflineMapStatusInDronePosition[] allValues;
    private static final /* synthetic */ OfflineMapStatusInDronePosition[] $VALUES;

    public static OfflineMapStatusInDronePosition[] values() {
        return null;
    }

    public static OfflineMapStatusInDronePosition valueOf(String string) {
        return null;
    }

    private OfflineMapStatusInDronePosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static OfflineMapStatusInDronePosition find(int n) {
        return null;
    }

    private static /* synthetic */ OfflineMapStatusInDronePosition[] $values() {
        return null;
    }

    static {
        $VALUES = OfflineMapStatusInDronePosition.$values();
        allValues = OfflineMapStatusInDronePosition.values();
    }
}

