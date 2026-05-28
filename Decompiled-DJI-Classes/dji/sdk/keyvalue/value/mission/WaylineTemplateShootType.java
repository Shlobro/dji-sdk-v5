/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineTemplateShootType
extends Enum<WaylineTemplateShootType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineTemplateShootType TIME = new WaylineTemplateShootType(0);
    public static final /* enum */ WaylineTemplateShootType DISTANCE = new WaylineTemplateShootType(1);
    public static final /* enum */ WaylineTemplateShootType UNKNOWN = new WaylineTemplateShootType(65535);
    private int value;
    private static final WaylineTemplateShootType[] allValues;
    private static final /* synthetic */ WaylineTemplateShootType[] $VALUES;

    public static WaylineTemplateShootType[] values() {
        return null;
    }

    public static WaylineTemplateShootType valueOf(String string) {
        return null;
    }

    private WaylineTemplateShootType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineTemplateShootType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineTemplateShootType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineTemplateShootType.$values();
        allValues = WaylineTemplateShootType.values();
    }
}

