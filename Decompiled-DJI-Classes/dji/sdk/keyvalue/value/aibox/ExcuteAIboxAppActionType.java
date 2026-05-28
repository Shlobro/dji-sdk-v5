/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;

public final class ExcuteAIboxAppActionType
extends Enum<ExcuteAIboxAppActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ ExcuteAIboxAppActionType UNINSTALL = new ExcuteAIboxAppActionType(0);
    public static final /* enum */ ExcuteAIboxAppActionType START = new ExcuteAIboxAppActionType(1);
    public static final /* enum */ ExcuteAIboxAppActionType STOP = new ExcuteAIboxAppActionType(2);
    public static final /* enum */ ExcuteAIboxAppActionType ERASE = new ExcuteAIboxAppActionType(3);
    public static final /* enum */ ExcuteAIboxAppActionType ENABLE_AUTO_LAUNCH = new ExcuteAIboxAppActionType(4);
    public static final /* enum */ ExcuteAIboxAppActionType CLOSE_AUTO_LAUNCH = new ExcuteAIboxAppActionType(5);
    public static final /* enum */ ExcuteAIboxAppActionType UNKNOWN = new ExcuteAIboxAppActionType(255);
    private int value;
    private static final ExcuteAIboxAppActionType[] allValues;
    private static final /* synthetic */ ExcuteAIboxAppActionType[] $VALUES;

    public static ExcuteAIboxAppActionType[] values() {
        return null;
    }

    public static ExcuteAIboxAppActionType valueOf(String string) {
        return null;
    }

    private ExcuteAIboxAppActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ExcuteAIboxAppActionType find(int n) {
        return null;
    }

    private static /* synthetic */ ExcuteAIboxAppActionType[] $values() {
        return null;
    }

    static {
        $VALUES = ExcuteAIboxAppActionType.$values();
        allValues = ExcuteAIboxAppActionType.values();
    }
}

