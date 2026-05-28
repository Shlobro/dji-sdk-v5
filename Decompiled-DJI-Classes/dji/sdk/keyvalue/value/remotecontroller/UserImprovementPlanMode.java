/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class UserImprovementPlanMode
extends Enum<UserImprovementPlanMode>
implements JNIProguardKeepTag {
    public static final /* enum */ UserImprovementPlanMode IDEL = new UserImprovementPlanMode(0);
    public static final /* enum */ UserImprovementPlanMode NO_UPLOAD = new UserImprovementPlanMode(1);
    public static final /* enum */ UserImprovementPlanMode UPLOAD = new UserImprovementPlanMode(2);
    public static final /* enum */ UserImprovementPlanMode SUPER_USER = new UserImprovementPlanMode(3);
    public static final /* enum */ UserImprovementPlanMode UNKNOWN = new UserImprovementPlanMode(65535);
    private int value;
    private static final UserImprovementPlanMode[] allValues;
    private static final /* synthetic */ UserImprovementPlanMode[] $VALUES;

    public static UserImprovementPlanMode[] values() {
        return null;
    }

    public static UserImprovementPlanMode valueOf(String string) {
        return null;
    }

    private UserImprovementPlanMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UserImprovementPlanMode find(int n) {
        return null;
    }

    private static /* synthetic */ UserImprovementPlanMode[] $values() {
        return null;
    }

    static {
        $VALUES = UserImprovementPlanMode.$values();
        allValues = UserImprovementPlanMode.values();
    }
}

