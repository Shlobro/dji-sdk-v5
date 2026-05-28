/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TimelapsePrompt
extends Enum<TimelapsePrompt>
implements JNIProguardKeepTag {
    public static final /* enum */ TimelapsePrompt NO_PROMPT = new TimelapsePrompt(0);
    public static final /* enum */ TimelapsePrompt GENERATION_BEGIN = new TimelapsePrompt(1);
    public static final /* enum */ TimelapsePrompt GENERATION_FINISH = new TimelapsePrompt(2);
    public static final /* enum */ TimelapsePrompt PLUSSEC_SUCCESS = new TimelapsePrompt(3);
    public static final /* enum */ TimelapsePrompt UNKNOWN = new TimelapsePrompt(255);
    private int value;
    private static final TimelapsePrompt[] allValues;
    private static final /* synthetic */ TimelapsePrompt[] $VALUES;

    public static TimelapsePrompt[] values() {
        return null;
    }

    public static TimelapsePrompt valueOf(String string) {
        return null;
    }

    private TimelapsePrompt(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimelapsePrompt find(int n) {
        return null;
    }

    private static /* synthetic */ TimelapsePrompt[] $values() {
        return null;
    }

    static {
        $VALUES = TimelapsePrompt.$values();
        allValues = TimelapsePrompt.values();
    }
}

