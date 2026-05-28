/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package dji.v5.manager.capability.bean;

import com.google.gson.annotations.SerializedName;
import dji.v5.common.KeepProguard;
import java.util.List;

public class KeyInfoBean
implements KeepProguard {
    @SerializedName(value="keyName")
    private String keyName;
    @SerializedName(value="supportedLens")
    private List<String> supportedLens;

    public String getKeyName() {
        return null;
    }

    public void setKeyName(String string2) {
    }

    public List<String> getSupportedLens() {
        return null;
    }

    public void setSupportedLens(List<String> list) {
    }
}

