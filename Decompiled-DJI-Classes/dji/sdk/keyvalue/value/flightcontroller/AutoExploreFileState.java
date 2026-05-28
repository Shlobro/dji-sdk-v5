/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AutoExploreFileState
extends Enum<AutoExploreFileState>
implements JNIProguardKeepTag {
    public static final /* enum */ AutoExploreFileState STANDDOWN = new AutoExploreFileState(0);
    public static final /* enum */ AutoExploreFileState PREPROCESS = new AutoExploreFileState(1);
    public static final /* enum */ AutoExploreFileState SAVING = new AutoExploreFileState(2);
    public static final /* enum */ AutoExploreFileState UPLOADING = new AutoExploreFileState(3);
    public static final /* enum */ AutoExploreFileState UPLOAD_DONE = new AutoExploreFileState(4);
    public static final /* enum */ AutoExploreFileState UNKNOWN = new AutoExploreFileState(65535);
    private int value;
    private static final AutoExploreFileState[] allValues;
    private static final /* synthetic */ AutoExploreFileState[] $VALUES;

    public static AutoExploreFileState[] values() {
        return null;
    }

    public static AutoExploreFileState valueOf(String string) {
        return null;
    }

    private AutoExploreFileState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AutoExploreFileState find(int n) {
        return null;
    }

    private static /* synthetic */ AutoExploreFileState[] $values() {
        return null;
    }

    static {
        $VALUES = AutoExploreFileState.$values();
        allValues = AutoExploreFileState.values();
    }
}

