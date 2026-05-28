/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.WireEnum
 */
package dji.csdk.flysafe;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public final class CDLWarningEventType
extends Enum<CDLWarningEventType>
implements WireEnum {
    public static final /* enum */ CDLWarningEventType InLimitArea = new CDLWarningEventType(0);
    public static final /* enum */ CDLWarningEventType InLimitHeightArea = new CDLWarningEventType(1);
    public static final /* enum */ CDLWarningEventType InAuthAreaWithoutLicense = new CDLWarningEventType(2);
    public static final /* enum */ CDLWarningEventType InAuthAreaWithLicense = new CDLWarningEventType(3);
    public static final /* enum */ CDLWarningEventType HaveThreeMinWillApplyTFRs = new CDLWarningEventType(4);
    public static final ProtoAdapter<CDLWarningEventType> ADAPTER;
    private final int value;
    private static final /* synthetic */ CDLWarningEventType[] $VALUES;

    public static CDLWarningEventType[] values() {
        return null;
    }

    public static CDLWarningEventType valueOf(String string) {
        return null;
    }

    private CDLWarningEventType(int n2) {
    }

    public static CDLWarningEventType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CDLWarningEventType[] $values() {
        return null;
    }

    static {
        $VALUES = CDLWarningEventType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CDLWarningEventType.class);
    }
}

