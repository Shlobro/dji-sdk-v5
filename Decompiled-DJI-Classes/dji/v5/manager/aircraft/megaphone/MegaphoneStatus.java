/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.megaphone;

public final class MegaphoneStatus
extends Enum<MegaphoneStatus> {
    public static final /* enum */ MegaphoneStatus IDLE = new MegaphoneStatus(0);
    public static final /* enum */ MegaphoneStatus IN_TRANSMISSION = new MegaphoneStatus(1);
    public static final /* enum */ MegaphoneStatus PLAYING = new MegaphoneStatus(2);
    public static final /* enum */ MegaphoneStatus IN_EXCEPTION = new MegaphoneStatus(3);
    public static final /* enum */ MegaphoneStatus TTS_IN_CONVERSION = new MegaphoneStatus(4);
    public static final /* enum */ MegaphoneStatus UNKNOWN = new MegaphoneStatus(65535);
    private final int value;
    private static MegaphoneStatus[] mValues;
    private static final /* synthetic */ MegaphoneStatus[] $VALUES;

    public static MegaphoneStatus[] values() {
        return null;
    }

    public static MegaphoneStatus valueOf(String string2) {
        return null;
    }

    private MegaphoneStatus(int n2) {
    }

    private boolean _equals(int n) {
        return false;
    }

    public static MegaphoneStatus[] getValues() {
        return null;
    }

    public static MegaphoneStatus find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneStatus[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneStatus.$values();
    }
}

