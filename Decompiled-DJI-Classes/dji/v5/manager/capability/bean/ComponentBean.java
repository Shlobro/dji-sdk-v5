/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package dji.v5.manager.capability.bean;

import com.google.gson.annotations.SerializedName;
import dji.v5.common.KeepProguard;
import dji.v5.manager.capability.bean.KeyInfoBean;
import java.util.List;

public class ComponentBean
implements KeepProguard {
    @SerializedName(value="className")
    private String className;
    @SerializedName(value="keyList")
    private List<KeyInfoBean> keyList;

    public String getClassName() {
        return null;
    }

    public void setClassName(String string2) {
    }

    public List<KeyInfoBean> getKeyList() {
        return null;
    }

    public void setKeyList(List<KeyInfoBean> list) {
    }
}

