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

public class MSDKV5Capability
implements KeepProguard {
    @SerializedName(value="supportedMSDKVersion")
    private String supportedMSDKVersion;
    @SerializedName(value="productType")
    private String productType;
    @SerializedName(value="supportedProductList")
    private List<SupportedProductList> supportedProductList;

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

    public List<SupportedProductList> getSupportedProductList() {
        return null;
    }

    public void setSupportedProductList(List<SupportedProductList> list) {
    }

    public static class SupportedProductList {
        @SerializedName(value="productType")
        private String productType;
        @SerializedName(value="capabilityFile")
        private String capabilityFile;

        public String getProductType() {
            return null;
        }

        public void setProductType(String string2) {
        }

        public String getCapabilityFile() {
            return null;
        }

        public void setCapabilityFile(String string2) {
        }
    }
}

