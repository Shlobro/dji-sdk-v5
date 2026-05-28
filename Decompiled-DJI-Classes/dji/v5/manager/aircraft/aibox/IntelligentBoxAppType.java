/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.aircraft.aibox;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.aibox.AIBoxAppType;

@Keep
public final class IntelligentBoxAppType
extends Enum<IntelligentBoxAppType> {
    public static final /* enum */ IntelligentBoxAppType FIRST_PARTY_APP = new IntelligentBoxAppType(AIBoxAppType.ONE.value());
    public static final /* enum */ IntelligentBoxAppType THIRD_PARTY_APP = new IntelligentBoxAppType(AIBoxAppType.THREE.value());
    public static final /* enum */ IntelligentBoxAppType UNKNOWN = new IntelligentBoxAppType(65535);
    private int value;
    private static final IntelligentBoxAppType[] allValues;
    private static final /* synthetic */ IntelligentBoxAppType[] $VALUES;

    public static IntelligentBoxAppType[] values() {
        return null;
    }

    public static IntelligentBoxAppType valueOf(String string2) {
        return null;
    }

    private IntelligentBoxAppType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IntelligentBoxAppType find(int n) {
        return null;
    }

    private static /* synthetic */ IntelligentBoxAppType[] $values() {
        return null;
    }

    static {
        $VALUES = IntelligentBoxAppType.$values();
        allValues = IntelligentBoxAppType.values();
    }
}

