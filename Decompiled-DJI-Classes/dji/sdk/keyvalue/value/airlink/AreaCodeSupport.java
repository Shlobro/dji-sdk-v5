/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class AreaCodeSupport
extends Enum<AreaCodeSupport>
implements JNIProguardKeepTag {
    public static final /* enum */ AreaCodeSupport SUPPORTED = new AreaCodeSupport(0);
    public static final /* enum */ AreaCodeSupport NOT_SUPPORT_FEATURE = new AreaCodeSupport(1);
    public static final /* enum */ AreaCodeSupport INVALID_PARAM = new AreaCodeSupport(2);
    public static final /* enum */ AreaCodeSupport UNKNOWN = new AreaCodeSupport(255);
    private int value;
    private static final AreaCodeSupport[] allValues;
    private static final /* synthetic */ AreaCodeSupport[] $VALUES;

    public static AreaCodeSupport[] values() {
        return null;
    }

    public static AreaCodeSupport valueOf(String string) {
        return null;
    }

    private AreaCodeSupport(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AreaCodeSupport find(int n) {
        return null;
    }

    private static /* synthetic */ AreaCodeSupport[] $values() {
        return null;
    }

    static {
        $VALUES = AreaCodeSupport.$values();
        allValues = AreaCodeSupport.values();
    }
}

