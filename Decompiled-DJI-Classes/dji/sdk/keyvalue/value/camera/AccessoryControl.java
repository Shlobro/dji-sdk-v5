/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class AccessoryControl
extends Enum<AccessoryControl>
implements JNIProguardKeepTag {
    public static final /* enum */ AccessoryControl CLOSE_ACCESSORY = new AccessoryControl(0);
    public static final /* enum */ AccessoryControl OPEN_ACCESSORY = new AccessoryControl(1);
    public static final /* enum */ AccessoryControl UNKNOWN = new AccessoryControl(65535);
    private int value;
    private static final AccessoryControl[] allValues;
    private static final /* synthetic */ AccessoryControl[] $VALUES;

    public static AccessoryControl[] values() {
        return null;
    }

    public static AccessoryControl valueOf(String string) {
        return null;
    }

    private AccessoryControl(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AccessoryControl find(int n) {
        return null;
    }

    private static /* synthetic */ AccessoryControl[] $values() {
        return null;
    }

    static {
        $VALUES = AccessoryControl.$values();
        allValues = AccessoryControl.values();
    }
}

