/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.sdk.keyvalue.key.ComponentType;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import java.util.List;

public interface ICapabilityManager {
    public String getCapabilityFilePath();

    public String getCapabilityMSDKVersion();

    public List<String> getSupportedProductList();

    public boolean isKeySupported(String var1, String var2, ComponentType var3, String var4);

    public boolean isKeySupported(String var1, String var2);

    public boolean isCameraKeySupported(String var1, String var2, String var3);

    public <T> boolean isKeySupported(DJIKeyInfo<T> var1);

    public boolean isProductSupported(String var1);

    public List<String> getSupportLens(String var1);

    public List<String> getSupportLens(String var1, String var2, String var3);

    public void setComponetIndex(int var1);

    public int getComponentIndex();

    public int getCapabilityKeyCount(String var1);
}

