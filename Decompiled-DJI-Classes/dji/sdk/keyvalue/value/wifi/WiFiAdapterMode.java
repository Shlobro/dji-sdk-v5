/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.wifi;

import dji.jni.JNIProguardKeepTag;

public final class WiFiAdapterMode
extends Enum<WiFiAdapterMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WiFiAdapterMode AP = new WiFiAdapterMode(0);
    public static final /* enum */ WiFiAdapterMode STA = new WiFiAdapterMode(1);
    public static final /* enum */ WiFiAdapterMode AD_HOC = new WiFiAdapterMode(2);
    public static final /* enum */ WiFiAdapterMode UNKNOWN = new WiFiAdapterMode(65535);
    private int value;
    private static final WiFiAdapterMode[] allValues;
    private static final /* synthetic */ WiFiAdapterMode[] $VALUES;

    public static WiFiAdapterMode[] values() {
        return null;
    }

    public static WiFiAdapterMode valueOf(String string) {
        return null;
    }

    private WiFiAdapterMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WiFiAdapterMode find(int n) {
        return null;
    }

    private static /* synthetic */ WiFiAdapterMode[] $values() {
        return null;
    }

    static {
        $VALUES = WiFiAdapterMode.$values();
        allValues = WiFiAdapterMode.values();
    }
}

