/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RelayOccupySupported
extends Enum<RelayOccupySupported>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayOccupySupported DEFAULT = new RelayOccupySupported(0);
    public static final /* enum */ RelayOccupySupported ALLOW = new RelayOccupySupported(1);
    public static final /* enum */ RelayOccupySupported DISALLOW = new RelayOccupySupported(2);
    public static final /* enum */ RelayOccupySupported UNKNOWN = new RelayOccupySupported(65535);
    private int value;
    private static final RelayOccupySupported[] allValues;
    private static final /* synthetic */ RelayOccupySupported[] $VALUES;

    public static RelayOccupySupported[] values() {
        return null;
    }

    public static RelayOccupySupported valueOf(String string) {
        return null;
    }

    private RelayOccupySupported(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayOccupySupported find(int n) {
        return null;
    }

    private static /* synthetic */ RelayOccupySupported[] $values() {
        return null;
    }

    static {
        $VALUES = RelayOccupySupported.$values();
        allValues = RelayOccupySupported.values();
    }
}

