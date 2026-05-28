/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ShopServiceFwType
extends Enum<ShopServiceFwType>
implements JNIProguardKeepTag {
    public static final /* enum */ ShopServiceFwType SEMI_AUTO_FLY_FW = new ShopServiceFwType(0);
    public static final /* enum */ ShopServiceFwType DISPLAY_FW = new ShopServiceFwType(1);
    public static final /* enum */ ShopServiceFwType NORMAL_FW = new ShopServiceFwType(2);
    public static final /* enum */ ShopServiceFwType UNKNOWN = new ShopServiceFwType(65535);
    private int value;
    private static final ShopServiceFwType[] allValues;
    private static final /* synthetic */ ShopServiceFwType[] $VALUES;

    public static ShopServiceFwType[] values() {
        return null;
    }

    public static ShopServiceFwType valueOf(String string) {
        return null;
    }

    private ShopServiceFwType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ShopServiceFwType find(int n) {
        return null;
    }

    private static /* synthetic */ ShopServiceFwType[] $values() {
        return null;
    }

    static {
        $VALUES = ShopServiceFwType.$values();
        allValues = ShopServiceFwType.values();
    }
}

