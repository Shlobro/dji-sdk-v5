/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.dpad;

public final class DpadProductType
extends Enum<DpadProductType> {
    public static final /* enum */ DpadProductType NONE = new DpadProductType(0, "Unknown");
    public static final /* enum */ DpadProductType POMATO = new DpadProductType(101, "GL300E");
    public static final /* enum */ DpadProductType POMATO_SDR = new DpadProductType(102, "GL300K");
    public static final /* enum */ DpadProductType CRYSTAL_SKY_A = new DpadProductType(201, "ZS600A");
    public static final /* enum */ DpadProductType CRYSTAL_SKY_B = new DpadProductType(202, "ZS600B");
    public static final /* enum */ DpadProductType MG1S = new DpadProductType(301, "AG405");
    public static final /* enum */ DpadProductType POMATO_RTK = new DpadProductType(302, "ag410");
    public static final /* enum */ DpadProductType RM500 = new DpadProductType(401, "rm500");
    public static final /* enum */ DpadProductType M300 = new DpadProductType(402, "pm430");
    public static final /* enum */ DpadProductType RM700 = new DpadProductType(403, "rm700");
    public static final /* enum */ DpadProductType RM510 = new DpadProductType(404, "rm510");
    public static final /* enum */ DpadProductType M301 = new DpadProductType(405, "pm431");
    private int mTag;
    private String mName;
    private static DpadProductType[] mValues;
    private static final /* synthetic */ DpadProductType[] $VALUES;

    public static DpadProductType[] values() {
        return null;
    }

    public static DpadProductType valueOf(String string2) {
        return null;
    }

    private DpadProductType(int n2, String string3) {
    }

    private boolean _equals(String string2) {
        return false;
    }

    public String getName() {
        return null;
    }

    public int getTag() {
        return 0;
    }

    public static DpadProductType[] getValues() {
        return null;
    }

    public static DpadProductType find(String string2) {
        return null;
    }

    public String toString() {
        return null;
    }

    public static boolean isValidType(DpadProductType dpadProductType) {
        return false;
    }

    private static /* synthetic */ DpadProductType[] $values() {
        return null;
    }

    static {
        $VALUES = DpadProductType.$values();
    }
}

