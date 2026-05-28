/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AIModelOverview
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    String model_uuid;
    String signed_id;
    Boolean expired;
    Boolean is_valid;
    Long signed_utc;
    Long expired_utc;
    Long signed_version;
    String signed_name;

    public AIModelOverview() {
    }

    public AIModelOverview(Integer n, String string, String string2, Boolean bl, Boolean bl2, Long l2, Long l3, Long l4, String string3) {
    }

    public static AIModelOverview fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public String getModel_uuid() {
        return null;
    }

    public void setModel_uuid(String string) {
    }

    public String getSigned_id() {
        return null;
    }

    public void setSigned_id(String string) {
    }

    public Boolean getExpired() {
        return null;
    }

    public void setExpired(Boolean bl) {
    }

    public Boolean getIs_valid() {
        return null;
    }

    public void setIs_valid(Boolean bl) {
    }

    public Long getSigned_utc() {
        return null;
    }

    public void setSigned_utc(Long l2) {
    }

    public Long getExpired_utc() {
        return null;
    }

    public void setExpired_utc(Long l2) {
    }

    public Long getSigned_version() {
        return null;
    }

    public void setSigned_version(Long l2) {
    }

    public String getSigned_name() {
        return null;
    }

    public void setSigned_name(String string) {
    }

    public String toString() {
        return null;
    }
}

