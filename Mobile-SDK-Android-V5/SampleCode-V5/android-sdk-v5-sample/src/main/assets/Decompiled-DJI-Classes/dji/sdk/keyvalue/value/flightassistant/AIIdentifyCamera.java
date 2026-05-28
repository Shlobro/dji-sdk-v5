/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class AIIdentifyCamera
extends Enum<AIIdentifyCamera>
implements JNIProguardKeepTag {
    public static final /* enum */ AIIdentifyCamera ZOOM = new AIIdentifyCamera(0);
    public static final /* enum */ AIIdentifyCamera WIDE = new AIIdentifyCamera(1);
    public static final /* enum */ AIIdentifyCamera UNKNOWN = new AIIdentifyCamera(65535);
    private int value;
    private static final AIIdentifyCamera[] allValues;
    private static final /* synthetic */ AIIdentifyCamera[] $VALUES;

    public static AIIdentifyCamera[] values() {
        return null;
    }

    public static AIIdentifyCamera valueOf(String string) {
        return null;
    }

    private AIIdentifyCamera(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIIdentifyCamera find(int n) {
        return null;
    }

    private static /* synthetic */ AIIdentifyCamera[] $values() {
        return null;
    }

    static {
        $VALUES = AIIdentifyCamera.$values();
        allValues = AIIdentifyCamera.values();
    }
}

