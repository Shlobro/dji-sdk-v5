/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class MaintainInfoType
extends Enum<MaintainInfoType>
implements JNIProguardKeepTag {
    public static final /* enum */ MaintainInfoType ROUTINE = new MaintainInfoType(1);
    public static final /* enum */ MaintainInfoType DEEP = new MaintainInfoType(2);
    public static final /* enum */ MaintainInfoType NORMAL = new MaintainInfoType(3);
    public static final /* enum */ MaintainInfoType UNKNOWN = new MaintainInfoType(65535);
    private int value;
    private static final MaintainInfoType[] allValues;
    private static final /* synthetic */ MaintainInfoType[] $VALUES;

    public static MaintainInfoType[] values() {
        return null;
    }

    public static MaintainInfoType valueOf(String string) {
        return null;
    }

    private MaintainInfoType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MaintainInfoType find(int n) {
        return null;
    }

    private static /* synthetic */ MaintainInfoType[] $values() {
        return null;
    }

    static {
        $VALUES = MaintainInfoType.$values();
        allValues = MaintainInfoType.values();
    }
}

