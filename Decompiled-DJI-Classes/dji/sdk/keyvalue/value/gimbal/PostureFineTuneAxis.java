/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class PostureFineTuneAxis
extends Enum<PostureFineTuneAxis>
implements JNIProguardKeepTag {
    public static final /* enum */ PostureFineTuneAxis ROLL_AXIS = new PostureFineTuneAxis(0);
    public static final /* enum */ PostureFineTuneAxis PITCH_AXIS = new PostureFineTuneAxis(1);
    public static final /* enum */ PostureFineTuneAxis YAW_AXIS = new PostureFineTuneAxis(2);
    public static final /* enum */ PostureFineTuneAxis UNKNOWN = new PostureFineTuneAxis(65535);
    private int value;
    private static final PostureFineTuneAxis[] allValues;
    private static final /* synthetic */ PostureFineTuneAxis[] $VALUES;

    public static PostureFineTuneAxis[] values() {
        return null;
    }

    public static PostureFineTuneAxis valueOf(String string) {
        return null;
    }

    private PostureFineTuneAxis(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PostureFineTuneAxis find(int n) {
        return null;
    }

    private static /* synthetic */ PostureFineTuneAxis[] $values() {
        return null;
    }

    static {
        $VALUES = PostureFineTuneAxis.$values();
        allValues = PostureFineTuneAxis.values();
    }
}

