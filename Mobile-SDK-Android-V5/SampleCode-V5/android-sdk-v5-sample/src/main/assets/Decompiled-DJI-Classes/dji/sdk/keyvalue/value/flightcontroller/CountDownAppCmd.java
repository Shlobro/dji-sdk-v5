/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CountDownAppCmd
extends Enum<CountDownAppCmd>
implements JNIProguardKeepTag {
    public static final /* enum */ CountDownAppCmd CANCEL = new CountDownAppCmd(0);
    public static final /* enum */ CountDownAppCmd TAKE_ACTION = new CountDownAppCmd(1);
    public static final /* enum */ CountDownAppCmd CHECK_COVER_UNINSTALLED = new CountDownAppCmd(2);
    public static final /* enum */ CountDownAppCmd CHECK_COVER_INSTALLED = new CountDownAppCmd(3);
    public static final /* enum */ CountDownAppCmd UNKNOWN = new CountDownAppCmd(65535);
    private int value;
    private static final CountDownAppCmd[] allValues;
    private static final /* synthetic */ CountDownAppCmd[] $VALUES;

    public static CountDownAppCmd[] values() {
        return null;
    }

    public static CountDownAppCmd valueOf(String string) {
        return null;
    }

    private CountDownAppCmd(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CountDownAppCmd find(int n) {
        return null;
    }

    private static /* synthetic */ CountDownAppCmd[] $values() {
        return null;
    }

    static {
        $VALUES = CountDownAppCmd.$values();
        allValues = CountDownAppCmd.values();
    }
}

