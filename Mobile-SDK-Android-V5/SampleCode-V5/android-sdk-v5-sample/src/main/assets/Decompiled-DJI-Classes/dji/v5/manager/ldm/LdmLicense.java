/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package dji.v5.manager.ldm;

import com.google.gson.annotations.SerializedName;
import dji.v5.common.KeepProguard;

public class LdmLicense
implements KeepProguard {
    @SerializedName(value="app_key")
    private String appKey;
    @SerializedName(value="app_identifier")
    private String appIdentifier;
    private int type;
    private String country;
    @SerializedName(value="begin_at")
    private long beginAt;
    @SerializedName(value="end_at")
    private long endAt;

    public String getAppKey() {
        return null;
    }

    public void setAppKey(String string2) {
    }

    public String getAppIdentifier() {
        return null;
    }

    public void setAppIdentifier(String string2) {
    }

    public int getType() {
        return 0;
    }

    public void setType(int n) {
    }

    public String getCountry() {
        return null;
    }

    public void setCountry(String string2) {
    }

    public long getBeginAt() {
        return 0L;
    }

    public void setBeginAt(long l2) {
    }

    public long getEndAt() {
        return 0L;
    }

    public void setEndAt(long l2) {
    }

    public static String getDecodeLicense(String string2, String string3) {
        return null;
    }

    public static LdmLicense getLdmLicense(String string2) {
        return null;
    }
}

