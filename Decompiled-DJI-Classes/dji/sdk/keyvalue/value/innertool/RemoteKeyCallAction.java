/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;

public final class RemoteKeyCallAction
extends Enum<RemoteKeyCallAction>
implements JNIProguardKeepTag {
    public static final /* enum */ RemoteKeyCallAction SYNC_GET = new RemoteKeyCallAction(0);
    public static final /* enum */ RemoteKeyCallAction GET = new RemoteKeyCallAction(1);
    public static final /* enum */ RemoteKeyCallAction SET = new RemoteKeyCallAction(2);
    public static final /* enum */ RemoteKeyCallAction ACTION = new RemoteKeyCallAction(3);
    public static final /* enum */ RemoteKeyCallAction LISTEN = new RemoteKeyCallAction(4);
    public static final /* enum */ RemoteKeyCallAction CANCEL_LISTEN = new RemoteKeyCallAction(5);
    public static final /* enum */ RemoteKeyCallAction UNKNOWN = new RemoteKeyCallAction(65535);
    private int value;
    private static final RemoteKeyCallAction[] allValues;
    private static final /* synthetic */ RemoteKeyCallAction[] $VALUES;

    public static RemoteKeyCallAction[] values() {
        return null;
    }

    public static RemoteKeyCallAction valueOf(String string) {
        return null;
    }

    private RemoteKeyCallAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RemoteKeyCallAction find(int n) {
        return null;
    }

    private static /* synthetic */ RemoteKeyCallAction[] $values() {
        return null;
    }

    static {
        $VALUES = RemoteKeyCallAction.$values();
        allValues = RemoteKeyCallAction.values();
    }
}

