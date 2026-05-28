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

public final class LicenseUnlockVersion
extends Enum<LicenseUnlockVersion>
implements WireEnum {
    public static final /* enum */ LicenseUnlockVersion Version2 = new LicenseUnlockVersion(0);
    public static final /* enum */ LicenseUnlockVersion Version3 = new LicenseUnlockVersion(1);
    public static final /* enum */ LicenseUnlockVersion Version4 = new LicenseUnlockVersion(2);
    public static final /* enum */ LicenseUnlockVersion VersionUnknown = new LicenseUnlockVersion(255);
    public static final ProtoAdapter<LicenseUnlockVersion> ADAPTER;
    private final int value;
    private static final /* synthetic */ LicenseUnlockVersion[] $VALUES;

    public static LicenseUnlockVersion[] values() {
        return null;
    }

    public static LicenseUnlockVersion valueOf(String string) {
        return null;
    }

    private LicenseUnlockVersion(int n2) {
    }

    public static LicenseUnlockVersion fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ LicenseUnlockVersion[] $values() {
        return null;
    }

    static {
        $VALUES = LicenseUnlockVersion.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(LicenseUnlockVersion.class);
    }
}

