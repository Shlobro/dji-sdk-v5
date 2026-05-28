/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class NavigationFunctionException
extends Enum<NavigationFunctionException>
implements JNIProguardKeepTag {
    public static final /* enum */ NavigationFunctionException NONE = new NavigationFunctionException(0);
    public static final /* enum */ NavigationFunctionException DISTANCE_LIMIT = new NavigationFunctionException(1);
    public static final /* enum */ NavigationFunctionException HEIGHT_LIMIT = new NavigationFunctionException(2);
    public static final /* enum */ NavigationFunctionException IN_NFZ = new NavigationFunctionException(3);
    public static final /* enum */ NavigationFunctionException FUSION_INVALID = new NavigationFunctionException(4);
    public static final /* enum */ NavigationFunctionException FPS_RESTRICT = new NavigationFunctionException(5);
    public static final /* enum */ NavigationFunctionException IMG_UNDEREXPOSURE = new NavigationFunctionException(6);
    public static final /* enum */ NavigationFunctionException IMG_OVEREXPOSURE = new NavigationFunctionException(7);
    public static final /* enum */ NavigationFunctionException UNKNOWN = new NavigationFunctionException(255);
    private int value;
    private static final NavigationFunctionException[] allValues;
    private static final /* synthetic */ NavigationFunctionException[] $VALUES;

    public static NavigationFunctionException[] values() {
        return null;
    }

    public static NavigationFunctionException valueOf(String string) {
        return null;
    }

    private NavigationFunctionException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NavigationFunctionException find(int n) {
        return null;
    }

    private static /* synthetic */ NavigationFunctionException[] $values() {
        return null;
    }

    static {
        $VALUES = NavigationFunctionException.$values();
        allValues = NavigationFunctionException.values();
    }
}

