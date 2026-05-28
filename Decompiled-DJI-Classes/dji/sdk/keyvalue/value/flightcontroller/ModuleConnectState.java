/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ModuleConnectState
extends Enum<ModuleConnectState>
implements JNIProguardKeepTag {
    public static final /* enum */ ModuleConnectState DISCONNECTED = new ModuleConnectState(0);
    public static final /* enum */ ModuleConnectState CONNECTED = new ModuleConnectState(1);
    public static final /* enum */ ModuleConnectState UNKNOWN = new ModuleConnectState(65535);
    private int value;
    private static final ModuleConnectState[] allValues;
    private static final /* synthetic */ ModuleConnectState[] $VALUES;

    public static ModuleConnectState[] values() {
        return null;
    }

    public static ModuleConnectState valueOf(String string) {
        return null;
    }

    private ModuleConnectState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ModuleConnectState find(int n) {
        return null;
    }

    private static /* synthetic */ ModuleConnectState[] $values() {
        return null;
    }

    static {
        $VALUES = ModuleConnectState.$values();
        allValues = ModuleConnectState.values();
    }
}

