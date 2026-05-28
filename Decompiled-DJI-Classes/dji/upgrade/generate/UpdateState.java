/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class UpdateState
extends Enum<UpdateState>
implements JNIProguardKeepTag {
    public static final /* enum */ UpdateState Updating = new UpdateState(1);
    public static final /* enum */ UpdateState UpdateFailed = new UpdateState(2);
    public static final /* enum */ UpdateState UpdateSuccess = new UpdateState(3);
    private int value;
    private static final UpdateState[] allValues;
    private static final /* synthetic */ UpdateState[] $VALUES;

    public static UpdateState[] values() {
        return null;
    }

    public static UpdateState valueOf(String string2) {
        return null;
    }

    private UpdateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static UpdateState find(int n) {
        return null;
    }

    private static /* synthetic */ UpdateState[] $values() {
        return null;
    }

    static {
        $VALUES = UpdateState.$values();
        allValues = UpdateState.values();
    }
}

