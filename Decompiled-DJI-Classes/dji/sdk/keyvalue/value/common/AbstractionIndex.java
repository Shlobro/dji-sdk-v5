/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class AbstractionIndex
extends Enum<AbstractionIndex>
implements JNIProguardKeepTag {
    public static final /* enum */ AbstractionIndex ABSTRACTION_DEFAULT_INDEX = new AbstractionIndex(0);
    public static final /* enum */ AbstractionIndex ABSTRACTION_MAX_VALUE_INDEX = new AbstractionIndex(65534);
    public static final /* enum */ AbstractionIndex UNKNOWN = new AbstractionIndex(65535);
    private int value;
    private static final AbstractionIndex[] allValues;
    private static final /* synthetic */ AbstractionIndex[] $VALUES;

    public static AbstractionIndex[] values() {
        return null;
    }

    public static AbstractionIndex valueOf(String string) {
        return null;
    }

    private AbstractionIndex(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AbstractionIndex find(int n) {
        return null;
    }

    private static /* synthetic */ AbstractionIndex[] $values() {
        return null;
    }

    static {
        $VALUES = AbstractionIndex.$values();
        allValues = AbstractionIndex.values();
    }
}

