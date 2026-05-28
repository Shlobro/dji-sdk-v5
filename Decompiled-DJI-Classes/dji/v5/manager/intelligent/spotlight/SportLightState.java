/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent.spotlight;

import androidx.annotation.Keep;

@Keep
public final class SportLightState
extends Enum<SportLightState> {
    public static final /* enum */ SportLightState STAND_BY = new SportLightState(0);
    public static final /* enum */ SportLightState WAIT_TO_SELECT = new SportLightState(1);
    public static final /* enum */ SportLightState WAIT_TO_CONFIRM = new SportLightState(2);
    public static final /* enum */ SportLightState SPOTLIGHT = new SportLightState(3);
    public static final /* enum */ SportLightState UNKNOWN = new SportLightState(65535);
    private int value;
    private static final SportLightState[] allValues;
    private static final /* synthetic */ SportLightState[] $VALUES;

    public static SportLightState[] values() {
        return null;
    }

    public static SportLightState valueOf(String string2) {
        return null;
    }

    private SportLightState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SportLightState find(int n) {
        return null;
    }

    private static /* synthetic */ SportLightState[] $values() {
        return null;
    }

    static {
        $VALUES = SportLightState.$values();
        allValues = SportLightState.values();
    }
}

