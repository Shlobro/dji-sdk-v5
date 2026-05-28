/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package dji.v5.manager.capability.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DJIValueBean {
    @SerializedName(value="valueParamList")
    private List<String> valueParamList;
    @SerializedName(value="dependKeyName")
    private String dependKeyName;
    @SerializedName(value="dependKeyValue")
    private String dependKeyValue;

    public List<String> getValueParamList() {
        return null;
    }

    public void setValueParamList(List<String> list) {
    }

    public String getDependKeyName() {
        return null;
    }

    public void setDependKeyName(String string2) {
    }

    public String getDependKeyValue() {
        return null;
    }

    public void setDependKeyValue(String string2) {
    }
}

