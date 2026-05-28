/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.stream;

@Deprecated
public final class PhysicalDevicePosition
extends Enum<PhysicalDevicePosition> {
    public static final /* enum */ PhysicalDevicePosition PORTSIDE = new PhysicalDevicePosition(0);
    public static final /* enum */ PhysicalDevicePosition STARBOARD = new PhysicalDevicePosition(1);
    public static final /* enum */ PhysicalDevicePosition UPSIDE = new PhysicalDevicePosition(2);
    public static final /* enum */ PhysicalDevicePosition NOSE = new PhysicalDevicePosition(3);
    public static final /* enum */ PhysicalDevicePosition DEFAULT = new PhysicalDevicePosition(65534);
    public static final /* enum */ PhysicalDevicePosition UNKNOWN = new PhysicalDevicePosition(65535);
    private final int value;
    private static PhysicalDevicePosition[] sValues;
    private static final /* synthetic */ PhysicalDevicePosition[] $VALUES;

    public static PhysicalDevicePosition[] values() {
        return null;
    }

    public static PhysicalDevicePosition valueOf(String string2) {
        return null;
    }

    private PhysicalDevicePosition(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean compareValue(int n) {
        return false;
    }

    public static PhysicalDevicePosition[] getValues() {
        return null;
    }

    public static PhysicalDevicePosition find(int n) {
        return null;
    }

    private static /* synthetic */ PhysicalDevicePosition[] $values() {
        return null;
    }

    static {
        $VALUES = PhysicalDevicePosition.$values();
    }
}

