/*
 * Decompiled with CFR 0.152.
 */
package dji.areacode;

import dji.jni.JNIProguardKeepTag;

public final class AreaCodeStrategy
extends Enum<AreaCodeStrategy>
implements JNIProguardKeepTag {
    public static final /* enum */ AreaCodeStrategy DATA_CHANGE = new AreaCodeStrategy(0);
    public static final /* enum */ AreaCodeStrategy DRONE_GPS = new AreaCodeStrategy(1);
    public static final /* enum */ AreaCodeStrategy PHONE_GPS = new AreaCodeStrategy(2);
    public static final /* enum */ AreaCodeStrategy MCC = new AreaCodeStrategy(3);
    public static final /* enum */ AreaCodeStrategy IP = new AreaCodeStrategy(4);
    public static final /* enum */ AreaCodeStrategy NEAR_CITY = new AreaCodeStrategy(5);
    public static final /* enum */ AreaCodeStrategy CACHE = new AreaCodeStrategy(6);
    public static final /* enum */ AreaCodeStrategy UNKNOWN = new AreaCodeStrategy(255);
    private int value;
    private static final /* synthetic */ AreaCodeStrategy[] $VALUES;

    public static AreaCodeStrategy[] values() {
        return null;
    }

    public static AreaCodeStrategy valueOf(String string2) {
        return null;
    }

    private AreaCodeStrategy(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    private static /* synthetic */ AreaCodeStrategy[] $values() {
        return null;
    }

    static {
        $VALUES = AreaCodeStrategy.$values();
    }
}

