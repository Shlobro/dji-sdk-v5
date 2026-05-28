/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class ScanMode
extends Enum<ScanMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ScanMode NON_REPEAT = new ScanMode(0);
    public static final /* enum */ ScanMode REPEAT = new ScanMode(1);
    public static final /* enum */ ScanMode REPEAT_PRO = new ScanMode(2);
    public static final /* enum */ ScanMode UNKNOWN = new ScanMode(65535);
    private int value;
    private static final ScanMode[] allValues;
    private static final /* synthetic */ ScanMode[] $VALUES;

    public static ScanMode[] values() {
        return null;
    }

    public static ScanMode valueOf(String string) {
        return null;
    }

    private ScanMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ScanMode find(int n) {
        return null;
    }

    private static /* synthetic */ ScanMode[] $values() {
        return null;
    }

    static {
        $VALUES = ScanMode.$values();
        allValues = ScanMode.values();
    }
}

