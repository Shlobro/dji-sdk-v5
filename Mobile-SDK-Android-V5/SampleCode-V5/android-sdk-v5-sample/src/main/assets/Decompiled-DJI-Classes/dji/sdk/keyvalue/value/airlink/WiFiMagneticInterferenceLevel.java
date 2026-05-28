/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WiFiMagneticInterferenceLevel
extends Enum<WiFiMagneticInterferenceLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ WiFiMagneticInterferenceLevel LOW = new WiFiMagneticInterferenceLevel(0);
    public static final /* enum */ WiFiMagneticInterferenceLevel MEDIUM = new WiFiMagneticInterferenceLevel(1);
    public static final /* enum */ WiFiMagneticInterferenceLevel HIGH = new WiFiMagneticInterferenceLevel(2);
    public static final /* enum */ WiFiMagneticInterferenceLevel HIGH_PLUS = new WiFiMagneticInterferenceLevel(3);
    public static final /* enum */ WiFiMagneticInterferenceLevel UNKNOWN = new WiFiMagneticInterferenceLevel(255);
    private int value;
    private static final WiFiMagneticInterferenceLevel[] allValues;
    private static final /* synthetic */ WiFiMagneticInterferenceLevel[] $VALUES;

    public static WiFiMagneticInterferenceLevel[] values() {
        return null;
    }

    public static WiFiMagneticInterferenceLevel valueOf(String string) {
        return null;
    }

    private WiFiMagneticInterferenceLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WiFiMagneticInterferenceLevel find(int n) {
        return null;
    }

    private static /* synthetic */ WiFiMagneticInterferenceLevel[] $values() {
        return null;
    }

    static {
        $VALUES = WiFiMagneticInterferenceLevel.$values();
        allValues = WiFiMagneticInterferenceLevel.values();
    }
}

