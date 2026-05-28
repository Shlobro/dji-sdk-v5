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

public final class CEApproachMode
extends Enum<CEApproachMode>
implements WireEnum {
    public static final /* enum */ CEApproachMode Inner = new CEApproachMode(0);
    public static final /* enum */ CEApproachMode HorizontalApproach = new CEApproachMode(1);
    public static final /* enum */ CEApproachMode HorizontalDownApproach = new CEApproachMode(2);
    public static final /* enum */ CEApproachMode DownApproach = new CEApproachMode(3);
    public static final /* enum */ CEApproachMode UpApproach = new CEApproachMode(4);
    public static final /* enum */ CEApproachMode HorizontalUpApproach = new CEApproachMode(5);
    public static final /* enum */ CEApproachMode Collision = new CEApproachMode(6);
    public static final /* enum */ CEApproachMode UNKNOWN = new CEApproachMode(7);
    public static final ProtoAdapter<CEApproachMode> ADAPTER;
    private final int value;
    private static final /* synthetic */ CEApproachMode[] $VALUES;

    public static CEApproachMode[] values() {
        return null;
    }

    public static CEApproachMode valueOf(String string) {
        return null;
    }

    private CEApproachMode(int n2) {
    }

    public static CEApproachMode fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CEApproachMode[] $values() {
        return null;
    }

    static {
        $VALUES = CEApproachMode.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CEApproachMode.class);
    }
}

