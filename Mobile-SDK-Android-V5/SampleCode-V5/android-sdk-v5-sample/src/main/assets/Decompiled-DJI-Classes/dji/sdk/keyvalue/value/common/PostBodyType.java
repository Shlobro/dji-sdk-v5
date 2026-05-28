/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class PostBodyType
extends Enum<PostBodyType>
implements JNIProguardKeepTag {
    public static final /* enum */ PostBodyType POST_JSON_DATA = new PostBodyType(0);
    public static final /* enum */ PostBodyType POST_FORM_DATA = new PostBodyType(1);
    public static final /* enum */ PostBodyType POST_URL_ENCODE = new PostBodyType(2);
    public static final /* enum */ PostBodyType POST_TEXT_XML = new PostBodyType(3);
    public static final /* enum */ PostBodyType POST_JSON_DATA_BASE64 = new PostBodyType(4);
    public static final /* enum */ PostBodyType POST_STREAM_DATA = new PostBodyType(5);
    public static final /* enum */ PostBodyType UNKNOWN = new PostBodyType(65535);
    private int value;
    private static final PostBodyType[] allValues;
    private static final /* synthetic */ PostBodyType[] $VALUES;

    public static PostBodyType[] values() {
        return null;
    }

    public static PostBodyType valueOf(String string) {
        return null;
    }

    private PostBodyType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PostBodyType find(int n) {
        return null;
    }

    private static /* synthetic */ PostBodyType[] $values() {
        return null;
    }

    static {
        $VALUES = PostBodyType.$values();
        allValues = PostBodyType.values();
    }
}

