/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class PostureFineTuneResult
extends Enum<PostureFineTuneResult>
implements JNIProguardKeepTag {
    public static final /* enum */ PostureFineTuneResult SUCCESSFUL = new PostureFineTuneResult(0);
    public static final /* enum */ PostureFineTuneResult POSITIVE_LIMIT_FAILED = new PostureFineTuneResult(1);
    public static final /* enum */ PostureFineTuneResult NEGATIVE_LIMIT_FAILED = new PostureFineTuneResult(2);
    public static final /* enum */ PostureFineTuneResult UNKNOWN = new PostureFineTuneResult(65535);
    private int value;
    private static final PostureFineTuneResult[] allValues;
    private static final /* synthetic */ PostureFineTuneResult[] $VALUES;

    public static PostureFineTuneResult[] values() {
        return null;
    }

    public static PostureFineTuneResult valueOf(String string) {
        return null;
    }

    private PostureFineTuneResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PostureFineTuneResult find(int n) {
        return null;
    }

    private static /* synthetic */ PostureFineTuneResult[] $values() {
        return null;
    }

    static {
        $VALUES = PostureFineTuneResult.$values();
        allValues = PostureFineTuneResult.values();
    }
}

