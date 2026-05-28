/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class RedundancyModule
extends Enum<RedundancyModule>
implements JNIProguardKeepTag {
    public static final /* enum */ RedundancyModule ACCELERATOR = new RedundancyModule(1);
    public static final /* enum */ RedundancyModule MAGNETIC = new RedundancyModule(2);
    public static final /* enum */ RedundancyModule BAROMETER = new RedundancyModule(3);
    public static final /* enum */ RedundancyModule GPS = new RedundancyModule(4);
    public static final /* enum */ RedundancyModule NAVIGAITON = new RedundancyModule(5);
    public static final /* enum */ RedundancyModule UNKNOWN = new RedundancyModule(65535);
    private int value;
    private static final RedundancyModule[] allValues;
    private static final /* synthetic */ RedundancyModule[] $VALUES;

    public static RedundancyModule[] values() {
        return null;
    }

    public static RedundancyModule valueOf(String string) {
        return null;
    }

    private RedundancyModule(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RedundancyModule find(int n) {
        return null;
    }

    private static /* synthetic */ RedundancyModule[] $values() {
        return null;
    }

    static {
        $VALUES = RedundancyModule.$values();
        allValues = RedundancyModule.values();
    }
}

