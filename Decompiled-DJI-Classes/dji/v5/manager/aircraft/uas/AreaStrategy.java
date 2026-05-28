/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.uas;

import dji.v5.manager.areacode.AreaCode;

public final class AreaStrategy
extends Enum<AreaStrategy> {
    public static final /* enum */ AreaStrategy US_STRATEGY = new AreaStrategy(AreaCode.UNITED_STATES_OF_AMERICA.value());
    public static final /* enum */ AreaStrategy JAPAN_STRATEGY = new AreaStrategy(AreaCode.JAPAN.value());
    public static final /* enum */ AreaStrategy FRANCE_STRATEGY = new AreaStrategy(AreaCode.FRANCE.value());
    public static final /* enum */ AreaStrategy CHINA_STRATEGY = new AreaStrategy(AreaCode.CHINA.value());
    public static final /* enum */ AreaStrategy EUROPEAN_STRATEGY = new AreaStrategy("EU");
    public static final /* enum */ AreaStrategy SINGAPORE_STRATEGY = new AreaStrategy("SG");
    public static final /* enum */ AreaStrategy UNITED_ARAB_EMIRATES_STRATEGY = new AreaStrategy("AE");
    public static final /* enum */ AreaStrategy GEORGIA_STRATEGY = new AreaStrategy("GE");
    public static final /* enum */ AreaStrategy UNKNOWN = new AreaStrategy("unknown");
    private String code;
    private static final AreaStrategy[] allValues;
    private static final /* synthetic */ AreaStrategy[] $VALUES;

    public static AreaStrategy[] values() {
        return null;
    }

    public static AreaStrategy valueOf(String string2) {
        return null;
    }

    public String getCode() {
        return null;
    }

    private AreaStrategy(String string3) {
    }

    private boolean compareValue(String string2) {
        return false;
    }

    public String value() {
        return null;
    }

    public static AreaStrategy find(String string2) {
        return null;
    }

    private static /* synthetic */ AreaStrategy[] $values() {
        return null;
    }

    static {
        $VALUES = AreaStrategy.$values();
        allValues = AreaStrategy.values();
    }
}

