/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylinePayloadReturnMode
extends Enum<WaylinePayloadReturnMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylinePayloadReturnMode SINGLE_RETURN_FIRST = new WaylinePayloadReturnMode(0);
    public static final /* enum */ WaylinePayloadReturnMode SINGLE_RETURN_STRONGEST = new WaylinePayloadReturnMode(1);
    public static final /* enum */ WaylinePayloadReturnMode DUAL_RETURN = new WaylinePayloadReturnMode(2);
    public static final /* enum */ WaylinePayloadReturnMode TRIPLE_RETURN = new WaylinePayloadReturnMode(3);
    public static final /* enum */ WaylinePayloadReturnMode UNKNOWN = new WaylinePayloadReturnMode(65535);
    private int value;
    private static final WaylinePayloadReturnMode[] allValues;
    private static final /* synthetic */ WaylinePayloadReturnMode[] $VALUES;

    public static WaylinePayloadReturnMode[] values() {
        return null;
    }

    public static WaylinePayloadReturnMode valueOf(String string) {
        return null;
    }

    private WaylinePayloadReturnMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylinePayloadReturnMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylinePayloadReturnMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylinePayloadReturnMode.$values();
        allValues = WaylinePayloadReturnMode.values();
    }
}

