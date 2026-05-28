/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.stream;

@Deprecated
public final class PhysicalDeviceCategory
extends Enum<PhysicalDeviceCategory> {
    public static final /* enum */ PhysicalDeviceCategory CAMERA = new PhysicalDeviceCategory(0);
    public static final /* enum */ PhysicalDeviceCategory RADAR = new PhysicalDeviceCategory(1);
    public static final /* enum */ PhysicalDeviceCategory PAYLOAD = new PhysicalDeviceCategory(2);
    public static final /* enum */ PhysicalDeviceCategory UNKNOWN = new PhysicalDeviceCategory(65535);
    private final int value;
    private static PhysicalDeviceCategory[] sValues;
    private static final /* synthetic */ PhysicalDeviceCategory[] $VALUES;

    public static PhysicalDeviceCategory[] values() {
        return null;
    }

    public static PhysicalDeviceCategory valueOf(String string2) {
        return null;
    }

    private PhysicalDeviceCategory(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean compareValue(int n) {
        return false;
    }

    public static PhysicalDeviceCategory[] getValues() {
        return null;
    }

    public static PhysicalDeviceCategory find(int n) {
        return null;
    }

    private static /* synthetic */ PhysicalDeviceCategory[] $values() {
        return null;
    }

    static {
        $VALUES = PhysicalDeviceCategory.$values();
    }
}

