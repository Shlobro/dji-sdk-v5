/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.sdk.keyvalue.value.diagnostic.DiagnosticLevel;

public final class WarningLevel
extends Enum<WarningLevel> {
    public static final /* enum */ WarningLevel NORMAL = new WarningLevel(0);
    public static final /* enum */ WarningLevel NOTICE = new WarningLevel(1);
    public static final /* enum */ WarningLevel CAUTION = new WarningLevel(2);
    public static final /* enum */ WarningLevel WARNING = new WarningLevel(3);
    public static final /* enum */ WarningLevel SERIOUS_WARNING = new WarningLevel(4);
    public static final /* enum */ WarningLevel UNKNOWN = new WarningLevel(65535);
    private final int level;
    private static final WarningLevel[] values;
    private static final /* synthetic */ WarningLevel[] $VALUES;

    public static WarningLevel[] values() {
        return null;
    }

    public static WarningLevel valueOf(String string2) {
        return null;
    }

    private WarningLevel(int n2) {
    }

    public boolean isEquals(int n) {
        return false;
    }

    public static WarningLevel find(int n) {
        return null;
    }

    public static WarningLevel find(DiagnosticLevel diagnosticLevel) {
        return null;
    }

    private static /* synthetic */ WarningLevel[] $values() {
        return null;
    }

    static {
        $VALUES = WarningLevel.$values();
        values = WarningLevel.values();
    }
}

