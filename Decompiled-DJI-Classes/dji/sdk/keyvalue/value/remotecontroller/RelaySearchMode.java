/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RelaySearchMode
extends Enum<RelaySearchMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RelaySearchMode AUTO = new RelaySearchMode(0);
    public static final /* enum */ RelaySearchMode FORCE = new RelaySearchMode(1);
    public static final /* enum */ RelaySearchMode DISABLE = new RelaySearchMode(2);
    public static final /* enum */ RelaySearchMode UNKNOWN = new RelaySearchMode(65535);
    private int value;
    private static final RelaySearchMode[] allValues;
    private static final /* synthetic */ RelaySearchMode[] $VALUES;

    public static RelaySearchMode[] values() {
        return null;
    }

    public static RelaySearchMode valueOf(String string) {
        return null;
    }

    private RelaySearchMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelaySearchMode find(int n) {
        return null;
    }

    private static /* synthetic */ RelaySearchMode[] $values() {
        return null;
    }

    static {
        $VALUES = RelaySearchMode.$values();
        allValues = RelaySearchMode.values();
    }
}

