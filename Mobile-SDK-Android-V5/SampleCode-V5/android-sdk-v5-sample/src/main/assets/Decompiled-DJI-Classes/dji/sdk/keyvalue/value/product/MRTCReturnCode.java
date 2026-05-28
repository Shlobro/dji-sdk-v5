/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class MRTCReturnCode
extends Enum<MRTCReturnCode>
implements JNIProguardKeepTag {
    public static final /* enum */ MRTCReturnCode MRTC_SUCCESS = new MRTCReturnCode(0);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_REPEATED = new MRTCReturnCode(-6017);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_MISMATCH = new MRTCReturnCode(-6016);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_PASSWORD = new MRTCReturnCode(-6015);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NETWORK_UNREACHABLE = new MRTCReturnCode(-6014);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NOT_PLAYED = new MRTCReturnCode(-6013);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NOT_CONNECTED = new MRTCReturnCode(-6012);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NOT_SUPPORT = new MRTCReturnCode(-6011);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_CMD_NOT_FOUND = new MRTCReturnCode(-6010);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_OVERFLOW = new MRTCReturnCode(-6009);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NOT_READY = new MRTCReturnCode(-6008);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NOT_FOUND = new MRTCReturnCode(-6007);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_FILE = new MRTCReturnCode(-6006);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NULL_PARAM = new MRTCReturnCode(-6005);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_NOMEM = new MRTCReturnCode(-6004);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_PARAM = new MRTCReturnCode(-6003);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_TIMEOUT = new MRTCReturnCode(-6002);
    public static final /* enum */ MRTCReturnCode MRTC_ERR_UNKNOWN = new MRTCReturnCode(-6001);
    public static final /* enum */ MRTCReturnCode UNKNOWN = new MRTCReturnCode(65535);
    private int value;
    private static final MRTCReturnCode[] allValues;
    private static final /* synthetic */ MRTCReturnCode[] $VALUES;

    public static MRTCReturnCode[] values() {
        return null;
    }

    public static MRTCReturnCode valueOf(String string) {
        return null;
    }

    private MRTCReturnCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MRTCReturnCode find(int n) {
        return null;
    }

    private static /* synthetic */ MRTCReturnCode[] $values() {
        return null;
    }

    static {
        $VALUES = MRTCReturnCode.$values();
        allValues = MRTCReturnCode.values();
    }
}

