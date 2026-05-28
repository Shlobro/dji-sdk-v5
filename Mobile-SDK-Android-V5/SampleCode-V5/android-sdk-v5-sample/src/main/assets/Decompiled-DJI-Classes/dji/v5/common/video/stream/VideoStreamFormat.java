/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.stream;

public final class VideoStreamFormat
extends Enum<VideoStreamFormat> {
    public static final /* enum */ VideoStreamFormat DEFAULT = new VideoStreamFormat(0);
    public static final /* enum */ VideoStreamFormat H264 = new VideoStreamFormat(1);
    public static final /* enum */ VideoStreamFormat H265 = new VideoStreamFormat(2);
    public static final /* enum */ VideoStreamFormat RAW = new VideoStreamFormat(3);
    public static final /* enum */ VideoStreamFormat UNKNOWN = new VideoStreamFormat(65535);
    private final int value;
    private static VideoStreamFormat[] sValues;
    private static final /* synthetic */ VideoStreamFormat[] $VALUES;

    public static VideoStreamFormat[] values() {
        return null;
    }

    public static VideoStreamFormat valueOf(String string2) {
        return null;
    }

    private VideoStreamFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean compareValue(int n) {
        return false;
    }

    public static VideoStreamFormat[] getValues() {
        return null;
    }

    public static VideoStreamFormat find(int n) {
        return null;
    }

    private static /* synthetic */ VideoStreamFormat[] $values() {
        return null;
    }

    static {
        $VALUES = VideoStreamFormat.$values();
    }
}

