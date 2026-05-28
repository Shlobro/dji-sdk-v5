/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class NightSceneModeSuggestion
extends Enum<NightSceneModeSuggestion>
implements JNIProguardKeepTag {
    public static final /* enum */ NightSceneModeSuggestion CANCEL_SUGGESTION = new NightSceneModeSuggestion(0);
    public static final /* enum */ NightSceneModeSuggestion REMOVE_IR_CUT = new NightSceneModeSuggestion(1);
    public static final /* enum */ NightSceneModeSuggestion USE_LASER_FILL_LIGHT = new NightSceneModeSuggestion(2);
    public static final /* enum */ NightSceneModeSuggestion TURN_ON_NIGHT_SCENE_MODE = new NightSceneModeSuggestion(3);
    public static final /* enum */ NightSceneModeSuggestion TURN_OFF_NIGHT_SCENE_MODE = new NightSceneModeSuggestion(4);
    public static final /* enum */ NightSceneModeSuggestion INCREASE_DENOISE_LEVEL = new NightSceneModeSuggestion(5);
    public static final /* enum */ NightSceneModeSuggestion UNKNOWN = new NightSceneModeSuggestion(65535);
    private int value;
    private static final NightSceneModeSuggestion[] allValues;
    private static final /* synthetic */ NightSceneModeSuggestion[] $VALUES;

    public static NightSceneModeSuggestion[] values() {
        return null;
    }

    public static NightSceneModeSuggestion valueOf(String string) {
        return null;
    }

    private NightSceneModeSuggestion(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NightSceneModeSuggestion find(int n) {
        return null;
    }

    private static /* synthetic */ NightSceneModeSuggestion[] $values() {
        return null;
    }

    static {
        $VALUES = NightSceneModeSuggestion.$values();
        allValues = NightSceneModeSuggestion.values();
    }
}

