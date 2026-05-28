/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MicrophoneAccessoryAccessCategory
extends Enum<MicrophoneAccessoryAccessCategory>
implements JNIProguardKeepTag {
    public static final /* enum */ MicrophoneAccessoryAccessCategory BUILT_IN = new MicrophoneAccessoryAccessCategory(0);
    public static final /* enum */ MicrophoneAccessoryAccessCategory WIRELESS_BY_WIFI = new MicrophoneAccessoryAccessCategory(1);
    public static final /* enum */ MicrophoneAccessoryAccessCategory WIRED = new MicrophoneAccessoryAccessCategory(2);
    public static final /* enum */ MicrophoneAccessoryAccessCategory WIRELESS_AND_WIRED = new MicrophoneAccessoryAccessCategory(3);
    public static final /* enum */ MicrophoneAccessoryAccessCategory UNKNOWN = new MicrophoneAccessoryAccessCategory(65535);
    private int value;
    private static final MicrophoneAccessoryAccessCategory[] allValues;
    private static final /* synthetic */ MicrophoneAccessoryAccessCategory[] $VALUES;

    public static MicrophoneAccessoryAccessCategory[] values() {
        return null;
    }

    public static MicrophoneAccessoryAccessCategory valueOf(String string) {
        return null;
    }

    private MicrophoneAccessoryAccessCategory(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MicrophoneAccessoryAccessCategory find(int n) {
        return null;
    }

    private static /* synthetic */ MicrophoneAccessoryAccessCategory[] $values() {
        return null;
    }

    static {
        $VALUES = MicrophoneAccessoryAccessCategory.$values();
        allValues = MicrophoneAccessoryAccessCategory.values();
    }
}

