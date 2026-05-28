/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class ProfessionalRCEventType
extends Enum<ProfessionalRCEventType>
implements JNIProguardKeepTag {
    public static final /* enum */ ProfessionalRCEventType CLICK_SINGLE = new ProfessionalRCEventType(0);
    public static final /* enum */ ProfessionalRCEventType CLICK_DOWN = new ProfessionalRCEventType(1);
    public static final /* enum */ ProfessionalRCEventType CLICK_UP = new ProfessionalRCEventType(2);
    public static final /* enum */ ProfessionalRCEventType LONG_CLICK = new ProfessionalRCEventType(3);
    public static final /* enum */ ProfessionalRCEventType ROTATE = new ProfessionalRCEventType(4);
    public static final /* enum */ ProfessionalRCEventType UNKNOWN = new ProfessionalRCEventType(65535);
    private int value;
    private static final ProfessionalRCEventType[] allValues;
    private static final /* synthetic */ ProfessionalRCEventType[] $VALUES;

    public static ProfessionalRCEventType[] values() {
        return null;
    }

    public static ProfessionalRCEventType valueOf(String string) {
        return null;
    }

    private ProfessionalRCEventType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ProfessionalRCEventType find(int n) {
        return null;
    }

    private static /* synthetic */ ProfessionalRCEventType[] $values() {
        return null;
    }

    static {
        $VALUES = ProfessionalRCEventType.$values();
        allValues = ProfessionalRCEventType.values();
    }
}

