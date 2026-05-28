/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcChannelFeature
extends Enum<RcChannelFeature>
implements JNIProguardKeepTag {
    public static final /* enum */ RcChannelFeature NONE = new RcChannelFeature(0);
    public static final /* enum */ RcChannelFeature FEATURE_A = new RcChannelFeature(1);
    public static final /* enum */ RcChannelFeature FEATURE_E = new RcChannelFeature(2);
    public static final /* enum */ RcChannelFeature FEATURE_T = new RcChannelFeature(3);
    public static final /* enum */ RcChannelFeature FEATURE_R = new RcChannelFeature(4);
    public static final /* enum */ RcChannelFeature UNKNOWN = new RcChannelFeature(65535);
    private int value;
    private static final RcChannelFeature[] allValues;
    private static final /* synthetic */ RcChannelFeature[] $VALUES;

    public static RcChannelFeature[] values() {
        return null;
    }

    public static RcChannelFeature valueOf(String string) {
        return null;
    }

    private RcChannelFeature(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcChannelFeature find(int n) {
        return null;
    }

    private static /* synthetic */ RcChannelFeature[] $values() {
        return null;
    }

    static {
        $VALUES = RcChannelFeature.$values();
        allValues = RcChannelFeature.values();
    }
}

