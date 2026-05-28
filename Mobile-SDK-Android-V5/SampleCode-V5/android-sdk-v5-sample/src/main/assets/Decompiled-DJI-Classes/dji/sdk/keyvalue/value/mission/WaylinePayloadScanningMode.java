/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylinePayloadScanningMode
extends Enum<WaylinePayloadScanningMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylinePayloadScanningMode REPETITIVE = new WaylinePayloadScanningMode(0);
    public static final /* enum */ WaylinePayloadScanningMode NON_REPETITIVE = new WaylinePayloadScanningMode(1);
    public static final /* enum */ WaylinePayloadScanningMode UNKNOWN = new WaylinePayloadScanningMode(65535);
    private int value;
    private static final WaylinePayloadScanningMode[] allValues;
    private static final /* synthetic */ WaylinePayloadScanningMode[] $VALUES;

    public static WaylinePayloadScanningMode[] values() {
        return null;
    }

    public static WaylinePayloadScanningMode valueOf(String string) {
        return null;
    }

    private WaylinePayloadScanningMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylinePayloadScanningMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylinePayloadScanningMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylinePayloadScanningMode.$values();
        allValues = WaylinePayloadScanningMode.values();
    }
}

