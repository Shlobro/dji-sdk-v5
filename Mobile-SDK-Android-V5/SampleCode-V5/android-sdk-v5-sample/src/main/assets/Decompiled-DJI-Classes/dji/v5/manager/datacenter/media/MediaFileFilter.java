/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.media;

public final class MediaFileFilter
extends Enum<MediaFileFilter> {
    public static final /* enum */ MediaFileFilter VIDEO = new MediaFileFilter(0);
    public static final /* enum */ MediaFileFilter PHOTO = new MediaFileFilter(1);
    public static final /* enum */ MediaFileFilter ALL = new MediaFileFilter(2);
    public static final /* enum */ MediaFileFilter NONE = new MediaFileFilter(255);
    int value;
    private static MediaFileFilter[] mValues;
    private static final /* synthetic */ MediaFileFilter[] $VALUES;

    public static MediaFileFilter[] values() {
        return null;
    }

    public static MediaFileFilter valueOf(String string2) {
        return null;
    }

    private MediaFileFilter(int n2) {
    }

    public int value() {
        return 0;
    }

    public static MediaFileFilter[] getValues() {
        return null;
    }

    private static /* synthetic */ MediaFileFilter[] $values() {
        return null;
    }

    static {
        $VALUES = MediaFileFilter.$values();
    }
}

