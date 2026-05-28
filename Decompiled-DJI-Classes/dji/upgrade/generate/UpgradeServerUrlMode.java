/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class UpgradeServerUrlMode
extends Enum<UpgradeServerUrlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ UpgradeServerUrlMode Official = new UpgradeServerUrlMode(0);
    public static final /* enum */ UpgradeServerUrlMode Debug = new UpgradeServerUrlMode(1);
    public static final /* enum */ UpgradeServerUrlMode Unknown = new UpgradeServerUrlMode(255);
    private int value;
    private static final UpgradeServerUrlMode[] allValues;
    private static final /* synthetic */ UpgradeServerUrlMode[] $VALUES;

    public static UpgradeServerUrlMode[] values() {
        return null;
    }

    public static UpgradeServerUrlMode valueOf(String string2) {
        return null;
    }

    private UpgradeServerUrlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static UpgradeServerUrlMode find(int n) {
        return null;
    }

    private static /* synthetic */ UpgradeServerUrlMode[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeServerUrlMode.$values();
        allValues = UpgradeServerUrlMode.values();
    }
}

