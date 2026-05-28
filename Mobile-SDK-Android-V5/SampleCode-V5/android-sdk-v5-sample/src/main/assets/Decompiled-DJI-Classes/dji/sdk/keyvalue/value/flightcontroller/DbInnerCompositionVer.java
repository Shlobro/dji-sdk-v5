/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DbInnerCompositionVer
extends Enum<DbInnerCompositionVer>
implements JNIProguardKeepTag {
    public static final /* enum */ DbInnerCompositionVer FLYSAFE_NO_GLASS = new DbInnerCompositionVer(1);
    public static final /* enum */ DbInnerCompositionVer FLYSAFE_WITH_GLASS = new DbInnerCompositionVer(2);
    public static final /* enum */ DbInnerCompositionVer FLYSAFE_WITH_FOREIGN_AIRPORT_500M_LIMIT_AREA = new DbInnerCompositionVer(3);
    public static final /* enum */ DbInnerCompositionVer FLYSAFE_WITH_SCENIC_DEMONSTRATION_AREA = new DbInnerCompositionVer(4);
    public static final /* enum */ DbInnerCompositionVer UNKNOWN = new DbInnerCompositionVer(255);
    private int value;
    private static final DbInnerCompositionVer[] allValues;
    private static final /* synthetic */ DbInnerCompositionVer[] $VALUES;

    public static DbInnerCompositionVer[] values() {
        return null;
    }

    public static DbInnerCompositionVer valueOf(String string) {
        return null;
    }

    private DbInnerCompositionVer(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DbInnerCompositionVer find(int n) {
        return null;
    }

    private static /* synthetic */ DbInnerCompositionVer[] $values() {
        return null;
    }

    static {
        $VALUES = DbInnerCompositionVer.$values();
        allValues = DbInnerCompositionVer.values();
    }
}

