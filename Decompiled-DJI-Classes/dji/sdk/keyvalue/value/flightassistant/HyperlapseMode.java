/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class HyperlapseMode
extends Enum<HyperlapseMode>
implements JNIProguardKeepTag {
    public static final /* enum */ HyperlapseMode NONE = new HyperlapseMode(0);
    public static final /* enum */ HyperlapseMode FREE = new HyperlapseMode(1);
    public static final /* enum */ HyperlapseMode TRACE = new HyperlapseMode(2);
    public static final /* enum */ HyperlapseMode CIRCLE = new HyperlapseMode(3);
    public static final /* enum */ HyperlapseMode DIRECTION = new HyperlapseMode(4);
    public static final /* enum */ HyperlapseMode UNKNOWN = new HyperlapseMode(255);
    private int value;
    private static final HyperlapseMode[] allValues;
    private static final /* synthetic */ HyperlapseMode[] $VALUES;

    public static HyperlapseMode[] values() {
        return null;
    }

    public static HyperlapseMode valueOf(String string) {
        return null;
    }

    private HyperlapseMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HyperlapseMode find(int n) {
        return null;
    }

    private static /* synthetic */ HyperlapseMode[] $values() {
        return null;
    }

    static {
        $VALUES = HyperlapseMode.$values();
        allValues = HyperlapseMode.values();
    }
}

