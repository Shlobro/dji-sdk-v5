/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylinePayloadFocusMode
extends Enum<WaylinePayloadFocusMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylinePayloadFocusMode FIRST_POINT = new WaylinePayloadFocusMode(0);
    public static final /* enum */ WaylinePayloadFocusMode CUSTOM = new WaylinePayloadFocusMode(1);
    public static final /* enum */ WaylinePayloadFocusMode UNKNOWN = new WaylinePayloadFocusMode(65535);
    private int value;
    private static final WaylinePayloadFocusMode[] allValues;
    private static final /* synthetic */ WaylinePayloadFocusMode[] $VALUES;

    public static WaylinePayloadFocusMode[] values() {
        return null;
    }

    public static WaylinePayloadFocusMode valueOf(String string) {
        return null;
    }

    private WaylinePayloadFocusMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylinePayloadFocusMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylinePayloadFocusMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylinePayloadFocusMode.$values();
        allValues = WaylinePayloadFocusMode.values();
    }
}

