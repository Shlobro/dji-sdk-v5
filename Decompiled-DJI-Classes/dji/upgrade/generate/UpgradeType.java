/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class UpgradeType
extends Enum<UpgradeType>
implements JNIProguardKeepTag {
    public static final /* enum */ UpgradeType Normal = new UpgradeType(0);
    public static final /* enum */ UpgradeType Recover = new UpgradeType(1);
    public static final /* enum */ UpgradeType Consistent = new UpgradeType(2);
    public static final /* enum */ UpgradeType ImageSwitch = new UpgradeType(3);
    private int value;
    private static final UpgradeType[] allValues;
    private static final /* synthetic */ UpgradeType[] $VALUES;

    public static UpgradeType[] values() {
        return null;
    }

    public static UpgradeType valueOf(String string2) {
        return null;
    }

    private UpgradeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static UpgradeType find(int n) {
        return null;
    }

    private static /* synthetic */ UpgradeType[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeType.$values();
        allValues = UpgradeType.values();
    }
}

