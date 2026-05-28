/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class LinkMode
extends Enum<LinkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ LinkMode NORMAL = new LinkMode(0);
    public static final /* enum */ LinkMode UPLOAD = new LinkMode(1);
    public static final /* enum */ LinkMode CHANGING = new LinkMode(2);
    public static final /* enum */ LinkMode ABNORMAL = new LinkMode(3);
    public static final /* enum */ LinkMode UNKNOWN = new LinkMode(65535);
    private int value;
    private static final LinkMode[] allValues;
    private static final /* synthetic */ LinkMode[] $VALUES;

    public static LinkMode[] values() {
        return null;
    }

    public static LinkMode valueOf(String string) {
        return null;
    }

    private LinkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LinkMode find(int n) {
        return null;
    }

    private static /* synthetic */ LinkMode[] $values() {
        return null;
    }

    static {
        $VALUES = LinkMode.$values();
        allValues = LinkMode.values();
    }
}

