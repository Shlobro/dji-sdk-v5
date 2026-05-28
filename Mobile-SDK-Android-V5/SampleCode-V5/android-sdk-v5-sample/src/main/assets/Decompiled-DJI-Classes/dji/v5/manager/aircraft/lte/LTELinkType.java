/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.Keep;

@Keep
public final class LTELinkType
extends Enum<LTELinkType> {
    public static final /* enum */ LTELinkType OCU_SYNC = new LTELinkType(1);
    public static final /* enum */ LTELinkType OCU_SYNC_LTE = new LTELinkType(3);
    public static final /* enum */ LTELinkType UNKNOWN = new LTELinkType(65535);
    private final int value;
    private static LTELinkType[] mValues;
    private static final /* synthetic */ LTELinkType[] $VALUES;

    public static LTELinkType[] values() {
        return null;
    }

    public static LTELinkType valueOf(String string2) {
        return null;
    }

    private LTELinkType(int n2) {
    }

    private boolean _equals(int n) {
        return false;
    }

    public static LTELinkType[] getValues() {
        return null;
    }

    public static LTELinkType find(int n) {
        return null;
    }

    private static /* synthetic */ LTELinkType[] $values() {
        return null;
    }

    static {
        $VALUES = LTELinkType.$values();
    }
}

