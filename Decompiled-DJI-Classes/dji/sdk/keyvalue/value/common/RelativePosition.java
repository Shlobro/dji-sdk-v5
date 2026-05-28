/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class RelativePosition
extends Enum<RelativePosition>
implements JNIProguardKeepTag {
    public static final /* enum */ RelativePosition POSITION_END = new RelativePosition(0);
    public static final /* enum */ RelativePosition UNKNOWN = new RelativePosition(65535);
    private int value;
    private static final RelativePosition[] allValues;
    private static final /* synthetic */ RelativePosition[] $VALUES;

    public static RelativePosition[] values() {
        return null;
    }

    public static RelativePosition valueOf(String string) {
        return null;
    }

    private RelativePosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelativePosition find(int n) {
        return null;
    }

    private static /* synthetic */ RelativePosition[] $values() {
        return null;
    }

    static {
        $VALUES = RelativePosition.$values();
        allValues = RelativePosition.values();
    }
}

