/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class ManageSourceAction
extends Enum<ManageSourceAction>
implements JNIProguardKeepTag {
    public static final /* enum */ ManageSourceAction OPEN = new ManageSourceAction(0);
    public static final /* enum */ ManageSourceAction CLOSE = new ManageSourceAction(1);
    public static final /* enum */ ManageSourceAction UNKNOWN = new ManageSourceAction(65535);
    private int value;
    private static final ManageSourceAction[] allValues;
    private static final /* synthetic */ ManageSourceAction[] $VALUES;

    public static ManageSourceAction[] values() {
        return null;
    }

    public static ManageSourceAction valueOf(String string) {
        return null;
    }

    private ManageSourceAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ManageSourceAction find(int n) {
        return null;
    }

    private static /* synthetic */ ManageSourceAction[] $values() {
        return null;
    }

    static {
        $VALUES = ManageSourceAction.$values();
        allValues = ManageSourceAction.values();
    }
}

