/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;

public final class AudioStorageLocation
extends Enum<AudioStorageLocation>
implements JNIProguardKeepTag {
    public static final /* enum */ AudioStorageLocation TMEPORARY = new AudioStorageLocation(1);
    public static final /* enum */ AudioStorageLocation PERMANENT = new AudioStorageLocation(2);
    public static final /* enum */ AudioStorageLocation UNKNOWN = new AudioStorageLocation(65535);
    private int value;
    private static final AudioStorageLocation[] allValues;
    private static final /* synthetic */ AudioStorageLocation[] $VALUES;

    public static AudioStorageLocation[] values() {
        return null;
    }

    public static AudioStorageLocation valueOf(String string) {
        return null;
    }

    private AudioStorageLocation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AudioStorageLocation find(int n) {
        return null;
    }

    private static /* synthetic */ AudioStorageLocation[] $values() {
        return null;
    }

    static {
        $VALUES = AudioStorageLocation.$values();
        allValues = AudioStorageLocation.values();
    }
}

