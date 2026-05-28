/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mobilenetwork;

import dji.jni.JNIProguardKeepTag;

public final class ZTENetworkMode
extends Enum<ZTENetworkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ZTENetworkMode NO_SERVICE = new ZTENetworkMode(0);
    public static final /* enum */ ZTENetworkMode LIMIT_SERVICE = new ZTENetworkMode(1);
    public static final /* enum */ ZTENetworkMode GSM = new ZTENetworkMode(2);
    public static final /* enum */ ZTENetworkMode GRPS = new ZTENetworkMode(3);
    public static final /* enum */ ZTENetworkMode EDGE = new ZTENetworkMode(4);
    public static final /* enum */ ZTENetworkMode UMTS = new ZTENetworkMode(5);
    public static final /* enum */ ZTENetworkMode HSDPA = new ZTENetworkMode(6);
    public static final /* enum */ ZTENetworkMode HSUPA = new ZTENetworkMode(7);
    public static final /* enum */ ZTENetworkMode HSUPA_PLUS = new ZTENetworkMode(8);
    public static final /* enum */ ZTENetworkMode HSPA_PLUS = new ZTENetworkMode(9);
    public static final /* enum */ ZTENetworkMode DC = new ZTENetworkMode(10);
    public static final /* enum */ ZTENetworkMode DC_HSPA = new ZTENetworkMode(11);
    public static final /* enum */ ZTENetworkMode DC_HSPA_PLUS = new ZTENetworkMode(12);
    public static final /* enum */ ZTENetworkMode LTE = new ZTENetworkMode(13);
    public static final /* enum */ ZTENetworkMode ILLEGAL_SERVICE = new ZTENetworkMode(14);
    public static final /* enum */ ZTENetworkMode UNKNOWN = new ZTENetworkMode(65535);
    private int value;
    private static final ZTENetworkMode[] allValues;
    private static final /* synthetic */ ZTENetworkMode[] $VALUES;

    public static ZTENetworkMode[] values() {
        return null;
    }

    public static ZTENetworkMode valueOf(String string) {
        return null;
    }

    private ZTENetworkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ZTENetworkMode find(int n) {
        return null;
    }

    private static /* synthetic */ ZTENetworkMode[] $values() {
        return null;
    }

    static {
        $VALUES = ZTENetworkMode.$values();
        allValues = ZTENetworkMode.values();
    }
}

