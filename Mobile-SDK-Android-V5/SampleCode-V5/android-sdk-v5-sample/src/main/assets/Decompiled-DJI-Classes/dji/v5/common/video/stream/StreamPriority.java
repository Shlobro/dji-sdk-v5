/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.stream;

@Deprecated
public final class StreamPriority
extends Enum<StreamPriority> {
    public static final /* enum */ StreamPriority HIGH = new StreamPriority(0);
    public static final /* enum */ StreamPriority MEDIUM = new StreamPriority(1);
    public static final /* enum */ StreamPriority LOW = new StreamPriority(2);
    public static final /* enum */ StreamPriority UNKNOWN = new StreamPriority(65535);
    private final int value;
    private static StreamPriority[] sValues;
    private static final /* synthetic */ StreamPriority[] $VALUES;

    public static StreamPriority[] values() {
        return null;
    }

    public static StreamPriority valueOf(String string2) {
        return null;
    }

    private StreamPriority(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean compareValue(int n) {
        return false;
    }

    public static StreamPriority[] getValues() {
        return null;
    }

    public static StreamPriority find(int n) {
        return null;
    }

    private static /* synthetic */ StreamPriority[] $values() {
        return null;
    }

    static {
        $VALUES = StreamPriority.$values();
    }
}

