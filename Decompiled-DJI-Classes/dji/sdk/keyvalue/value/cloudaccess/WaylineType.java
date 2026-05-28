/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class WaylineType
extends Enum<WaylineType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineType NORMAL = new WaylineType(0);
    public static final /* enum */ WaylineType PRECISE_PHOTO = new WaylineType(1);
    public static final /* enum */ WaylineType RECTANGLE = new WaylineType(2);
    public static final /* enum */ WaylineType MEGAPHONE = new WaylineType(3);
    public static final /* enum */ WaylineType AIALARM = new WaylineType(4);
    public static final /* enum */ WaylineType UNKNOWN = new WaylineType(65535);
    private int value;
    private static final WaylineType[] allValues;
    private static final /* synthetic */ WaylineType[] $VALUES;

    public static WaylineType[] values() {
        return null;
    }

    public static WaylineType valueOf(String string) {
        return null;
    }

    private WaylineType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineType.$values();
        allValues = WaylineType.values();
    }
}

