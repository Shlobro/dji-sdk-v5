/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.network;

public final class MediaType
extends Enum<MediaType> {
    public static final /* enum */ MediaType MULTI_MIXED = new MediaType("multipart/mixed");
    public static final /* enum */ MediaType MULTI_FORM = new MediaType("multipart/form-data");
    public static final /* enum */ MediaType JSON = new MediaType("application/json; charset=utf-8");
    public static final /* enum */ MediaType NONE = new MediaType("null");
    private final String value;
    private static final /* synthetic */ MediaType[] $VALUES;

    public static MediaType[] values() {
        return null;
    }

    public static MediaType valueOf(String string2) {
        return null;
    }

    private MediaType(String string3) {
    }

    public String value() {
        return null;
    }

    public boolean isMuLti() {
        return false;
    }

    private static /* synthetic */ MediaType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaType.$values();
    }
}

