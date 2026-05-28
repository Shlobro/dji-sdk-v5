/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class CableInspectionDir
extends Enum<CableInspectionDir>
implements JNIProguardKeepTag {
    public static final /* enum */ CableInspectionDir LEFT_TO_RIGHT = new CableInspectionDir(0);
    public static final /* enum */ CableInspectionDir RIGHT_TO_LEFT = new CableInspectionDir(1);
    public static final /* enum */ CableInspectionDir UNKNOWN = new CableInspectionDir(65535);
    private int value;
    private static final CableInspectionDir[] allValues;
    private static final /* synthetic */ CableInspectionDir[] $VALUES;

    public static CableInspectionDir[] values() {
        return null;
    }

    public static CableInspectionDir valueOf(String string) {
        return null;
    }

    private CableInspectionDir(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CableInspectionDir find(int n) {
        return null;
    }

    private static /* synthetic */ CableInspectionDir[] $values() {
        return null;
    }

    static {
        $VALUES = CableInspectionDir.$values();
        allValues = CableInspectionDir.values();
    }
}

