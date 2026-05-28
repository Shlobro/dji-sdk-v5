/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class ImageSwitchRequestReason
extends Enum<ImageSwitchRequestReason>
implements JNIProguardKeepTag {
    public static final /* enum */ ImageSwitchRequestReason NeedSwitchAndNotInstalled = new ImageSwitchRequestReason(0);
    public static final /* enum */ ImageSwitchRequestReason SwitchPairedFailureNeedUpgrade = new ImageSwitchRequestReason(1);
    private int value;
    private static final ImageSwitchRequestReason[] allValues;
    private static final /* synthetic */ ImageSwitchRequestReason[] $VALUES;

    public static ImageSwitchRequestReason[] values() {
        return null;
    }

    public static ImageSwitchRequestReason valueOf(String string2) {
        return null;
    }

    private ImageSwitchRequestReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static ImageSwitchRequestReason find(int n) {
        return null;
    }

    private static /* synthetic */ ImageSwitchRequestReason[] $values() {
        return null;
    }

    static {
        $VALUES = ImageSwitchRequestReason.$values();
        allValues = ImageSwitchRequestReason.values();
    }
}

