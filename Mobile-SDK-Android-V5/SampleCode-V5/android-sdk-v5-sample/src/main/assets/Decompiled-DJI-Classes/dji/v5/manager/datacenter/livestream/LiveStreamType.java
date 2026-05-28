/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.livestream;

public final class LiveStreamType
extends Enum<LiveStreamType> {
    public static final /* enum */ LiveStreamType RTMP = new LiveStreamType(0);
    public static final /* enum */ LiveStreamType RTSP = new LiveStreamType(1);
    public static final /* enum */ LiveStreamType GB28181 = new LiveStreamType(2);
    public static final /* enum */ LiveStreamType AGORA = new LiveStreamType(3);
    public static final /* enum */ LiveStreamType UNKNOWN = new LiveStreamType(255);
    private int value;
    private static LiveStreamType[] values;
    private static final /* synthetic */ LiveStreamType[] $VALUES;

    public static LiveStreamType[] values() {
        return null;
    }

    public static LiveStreamType valueOf(String string2) {
        return null;
    }

    private LiveStreamType(int n2) {
    }

    public int getValue() {
        return 0;
    }

    private boolean _equals(int n) {
        return false;
    }

    public static LiveStreamType[] getValues() {
        return null;
    }

    public static LiveStreamType find(int n) {
        return null;
    }

    private static /* synthetic */ LiveStreamType[] $values() {
        return null;
    }

    static {
        $VALUES = LiveStreamType.$values();
    }
}

