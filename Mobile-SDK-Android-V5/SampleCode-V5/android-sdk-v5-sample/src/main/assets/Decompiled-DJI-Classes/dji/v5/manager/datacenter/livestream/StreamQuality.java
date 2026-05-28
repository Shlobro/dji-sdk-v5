/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.livestream;

public final class StreamQuality
extends Enum<StreamQuality> {
    public static final /* enum */ StreamQuality SD = new StreamQuality(1);
    public static final /* enum */ StreamQuality HD = new StreamQuality(2);
    public static final /* enum */ StreamQuality FULL_HD = new StreamQuality(3);
    public static final /* enum */ StreamQuality ORIGINAL = new StreamQuality(100);
    public static final /* enum */ StreamQuality UNKNOWN = new StreamQuality(255);
    private int value;
    private static StreamQuality[] values;
    private static final /* synthetic */ StreamQuality[] $VALUES;

    public static StreamQuality[] values() {
        return null;
    }

    public static StreamQuality valueOf(String string2) {
        return null;
    }

    private StreamQuality(int n2) {
    }

    private boolean _equals(int n) {
        return false;
    }

    public static StreamQuality[] getValues() {
        return null;
    }

    public static StreamQuality find(int n) {
        return null;
    }

    private static /* synthetic */ StreamQuality[] $values() {
        return null;
    }

    static {
        $VALUES = StreamQuality.$values();
    }
}

