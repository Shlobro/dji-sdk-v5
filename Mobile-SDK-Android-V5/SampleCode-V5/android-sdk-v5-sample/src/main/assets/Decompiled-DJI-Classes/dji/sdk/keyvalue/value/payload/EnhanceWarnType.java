/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class EnhanceWarnType
extends Enum<EnhanceWarnType>
implements JNIProguardKeepTag {
    public static final /* enum */ EnhanceWarnType PROMPT_TYPE_NONE = new EnhanceWarnType(0);
    public static final /* enum */ EnhanceWarnType PROMPT_TYPE_SHAKE_MOTOR = new EnhanceWarnType(1);
    public static final /* enum */ EnhanceWarnType PROMPT_TYPE_PLAY_SOUND = new EnhanceWarnType(2);
    public static final /* enum */ EnhanceWarnType PROMPT_TYPE_SHAKE_AND_PLAY = new EnhanceWarnType(3);
    public static final /* enum */ EnhanceWarnType UNKNOWN = new EnhanceWarnType(65535);
    private int value;
    private static final EnhanceWarnType[] allValues;
    private static final /* synthetic */ EnhanceWarnType[] $VALUES;

    public static EnhanceWarnType[] values() {
        return null;
    }

    public static EnhanceWarnType valueOf(String string) {
        return null;
    }

    private EnhanceWarnType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EnhanceWarnType find(int n) {
        return null;
    }

    private static /* synthetic */ EnhanceWarnType[] $values() {
        return null;
    }

    static {
        $VALUES = EnhanceWarnType.$values();
        allValues = EnhanceWarnType.values();
    }
}

