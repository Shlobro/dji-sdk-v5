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

public class CapabilityIndexBean
implements KeepProguard {
    @SerializedName(value="productType")
    private String productType;
    @SerializedName(value="supportedComponentIndexType")
    private List<String> supportedComponentIndexType;
    @SerializedName(value="capabilityFile")
    private String capabilityFile;

    public String getProductType() {
        return null;
    }

    public void setProductType(String string2) {
    }

    public List<String> getSupportedComponentIndexType() {
        return null;
    }

    public void setSupportedComponentIndexType(List<String> list) {
    }

    public String getCapabilityFile() {
        return null;
    }

    public void setCapabilityFile(String string2) {
    }
}

