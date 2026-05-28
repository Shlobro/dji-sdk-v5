/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;

public final class SpeakerPlayModeType
extends Enum<SpeakerPlayModeType>
implements JNIProguardKeepTag {
    public static final /* enum */ SpeakerPlayModeType SINGLE_ONCE = new SpeakerPlayModeType(0);
    public static final /* enum */ SpeakerPlayModeType SINGLE_LOOP = new SpeakerPlayModeType(1);
    public static final /* enum */ SpeakerPlayModeType LIST_PLAY = new SpeakerPlayModeType(2);
    public static final /* enum */ SpeakerPlayModeType LIST_LOOP = new SpeakerPlayModeType(3);
    public static final /* enum */ SpeakerPlayModeType UNKNOWN = new SpeakerPlayModeType(65535);
    private int value;
    private static final SpeakerPlayModeType[] allValues;
    private static final /* synthetic */ SpeakerPlayModeType[] $VALUES;

    public static SpeakerPlayModeType[] values() {
        return null;
    }

    public static SpeakerPlayModeType valueOf(String string) {
        return null;
    }

    private SpeakerPlayModeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SpeakerPlayModeType find(int n) {
        return null;
    }

    private static /* synthetic */ SpeakerPlayModeType[] $values() {
        return null;
    }

    static {
        $VALUES = SpeakerPlayModeType.$values();
        allValues = SpeakerPlayModeType.values();
    }
}

