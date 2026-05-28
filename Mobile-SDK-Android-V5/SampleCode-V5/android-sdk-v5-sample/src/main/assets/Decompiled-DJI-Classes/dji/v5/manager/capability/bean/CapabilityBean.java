/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package dji.v5.manager.capability.bean;

import com.google.gson.annotations.SerializedName;
import dji.v5.common.KeepProguard;
import dji.v5.manager.capability.bean.ComponentBean;

public class CapabilityBean
implements KeepProguard {
    @SerializedName(value="supportedMSDKVersion")
    private String supportedMSDKVersion;
    @SerializedName(value="productType")
    private String productType;
    @SerializedName(value="supportedMinFirmwareVersion")
    private String supportedMinFirmwareVersion;
    @SerializedName(value="component")
    private ComponentBean componentBean;

    public String getSupportedMSDKVersion() {
        return null;
    }

    public void setSupportedMSDKVersion(String string2) {
    }

    public String getProductType() {
        return null;
    }

    public void setProductType(String string2) {
    }

    public String getSupportedMinFirmwareVersion() {
        return null;
    }

    public void setSupportedMinFirmwareVersion(String string2) {
    }

    public ComponentBean getComponentBean() {
        return null;
    }

    public void setComponentBean(ComponentBean componentBean) {
    }
}

