/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ExposureSensitivityMode
extends Enum<ExposureSensitivityMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ExposureSensitivityMode ISO = new ExposureSensitivityMode(0);
    public static final /* enum */ ExposureSensitivityMode EI = new ExposureSensitivityMode(1);
    public static final /* enum */ ExposureSensitivityMode UNKNOWN = new ExposureSensitivityMode(65535);
    private int value;
    private static final ExposureSensitivityMode[] allValues;
    private static final /* synthetic */ ExposureSensitivityMode[] $VALUES;

    public static ExposureSensitivityMode[] values() {
        return null;
    }

    public static ExposureSensitivityMode valueOf(String string) {
        return null;
    }

    private ExposureSensitivityMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ExposureSensitivityMode find(int n) {
        return null;
    }

    private static /* synthetic */ ExposureSensitivityMode[] $values() {
        return null;
    }

    static {
        $VALUES = ExposureSensitivityMode.$values();
        allValues = ExposureSensitivityMode.values();
    }
}

