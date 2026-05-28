/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylinePayloadMeteringMode
extends Enum<WaylinePayloadMeteringMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylinePayloadMeteringMode AVERAGE = new WaylinePayloadMeteringMode(0);
    public static final /* enum */ WaylinePayloadMeteringMode SPOT = new WaylinePayloadMeteringMode(1);
    public static final /* enum */ WaylinePayloadMeteringMode UNKNOWN = new WaylinePayloadMeteringMode(65535);
    private int value;
    private static final WaylinePayloadMeteringMode[] allValues;
    private static final /* synthetic */ WaylinePayloadMeteringMode[] $VALUES;

    public static WaylinePayloadMeteringMode[] values() {
        return null;
    }

    public static WaylinePayloadMeteringMode valueOf(String string) {
        return null;
    }

    private WaylinePayloadMeteringMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylinePayloadMeteringMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylinePayloadMeteringMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylinePayloadMeteringMode.$values();
        allValues = WaylinePayloadMeteringMode.values();
    }
}

