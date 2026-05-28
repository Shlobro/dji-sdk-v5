/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MultipleTrackDetectedType
extends Enum<MultipleTrackDetectedType>
implements JNIProguardKeepTag {
    public static final /* enum */ MultipleTrackDetectedType UNIDENTIFIED = new MultipleTrackDetectedType(0);
    public static final /* enum */ MultipleTrackDetectedType PERSON = new MultipleTrackDetectedType(1);
    public static final /* enum */ MultipleTrackDetectedType CAR = new MultipleTrackDetectedType(2);
    public static final /* enum */ MultipleTrackDetectedType VAN = new MultipleTrackDetectedType(3);
    public static final /* enum */ MultipleTrackDetectedType BIKE = new MultipleTrackDetectedType(4);
    public static final /* enum */ MultipleTrackDetectedType ANIMAL = new MultipleTrackDetectedType(5);
    public static final /* enum */ MultipleTrackDetectedType BOAT = new MultipleTrackDetectedType(6);
    public static final /* enum */ MultipleTrackDetectedType FACE = new MultipleTrackDetectedType(7);
    public static final /* enum */ MultipleTrackDetectedType UNKNOWN = new MultipleTrackDetectedType(255);
    private int value;
    private static final MultipleTrackDetectedType[] allValues;
    private static final /* synthetic */ MultipleTrackDetectedType[] $VALUES;

    public static MultipleTrackDetectedType[] values() {
        return null;
    }

    public static MultipleTrackDetectedType valueOf(String string) {
        return null;
    }

    private MultipleTrackDetectedType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MultipleTrackDetectedType find(int n) {
        return null;
    }

    private static /* synthetic */ MultipleTrackDetectedType[] $values() {
        return null;
    }

    static {
        $VALUES = MultipleTrackDetectedType.$values();
        allValues = MultipleTrackDetectedType.values();
    }
}

