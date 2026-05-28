/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.decoder;

@Deprecated
public final class DecoderState
extends Enum<DecoderState> {
    public static final /* enum */ DecoderState INITIALIZED = new DecoderState(0);
    public static final /* enum */ DecoderState VIDEO_FRAME_INPUT = new DecoderState(1);
    public static final /* enum */ DecoderState DECODING = new DecoderState(2);
    public static final /* enum */ DecoderState PAUSED = new DecoderState(3);
    public static final /* enum */ DecoderState UNKNOWN = new DecoderState(65535);
    private final int value;
    private static DecoderState[] sValues;
    private static final /* synthetic */ DecoderState[] $VALUES;

    public static DecoderState[] values() {
        return null;
    }

    public static DecoderState valueOf(String string2) {
        return null;
    }

    private DecoderState(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean compareValue(int n) {
        return false;
    }

    public static DecoderState[] getValues() {
        return null;
    }

    public static DecoderState find(int n) {
        return null;
    }

    private static /* synthetic */ DecoderState[] $values() {
        return null;
    }

    static {
        $VALUES = DecoderState.$values();
    }
}

