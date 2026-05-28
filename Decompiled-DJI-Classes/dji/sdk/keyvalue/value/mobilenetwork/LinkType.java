/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mobilenetwork;

import dji.jni.JNIProguardKeepTag;

public final class LinkType
extends Enum<LinkType>
implements JNIProguardKeepTag {
    public static final /* enum */ LinkType FORCED_USE_OF_SDR = new LinkType(0);
    public static final /* enum */ LinkType FORCED_USE_OF_MOBILE_NETWORK = new LinkType(1);
    public static final /* enum */ LinkType AUTO_SWITCH_LINK = new LinkType(2);
    public static final /* enum */ LinkType UNKNOWN = new LinkType(255);
    private int value;
    private static final LinkType[] allValues;
    private static final /* synthetic */ LinkType[] $VALUES;

    public static LinkType[] values() {
        return null;
    }

    public static LinkType valueOf(String string) {
        return null;
    }

    private LinkType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LinkType find(int n) {
        return null;
    }

    private static /* synthetic */ LinkType[] $values() {
        return null;
    }

    static {
        $VALUES = LinkType.$values();
        allValues = LinkType.values();
    }
}

