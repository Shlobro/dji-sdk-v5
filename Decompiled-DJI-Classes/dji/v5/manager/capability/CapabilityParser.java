/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.manager.capability;

import android.content.Context;
import dji.sdk.keyvalue.key.ComponentType;
import dji.v5.manager.capability.bean.CapabilityBean;
import dji.v5.manager.capability.bean.DJIValueBean;
import dji.v5.manager.capability.bean.MSDKCapabilityData;
import dji.v5.manager.capability.bean.ProductCapability;
import java.util.HashMap;
import java.util.List;

public class CapabilityParser {
    private final MSDKCapabilityData msdkCapabilityData;
    public static final String JSON_ROOT_DIR = "ProductCapability/";
    private final String CAPABLITY_FILE_INDEX = "MSDKV5Capability.json";
    public static final String KEY_PARAM_DIR = "KeyParamRange/";

    private CapabilityParser() {
    }

    public String getRootDir() {
        return null;
    }

    public static CapabilityParser getInstance() {
        return null;
    }

    public boolean loadData() {
        return false;
    }

    String parseJsonFile(Context context, String string2) {
        return null;
    }

    public HashMap<String, CapabilityBean> parseComponent(ProductCapability productCapability, ComponentType componentType) {
        return null;
    }

    public MSDKCapabilityData getData() {
        return null;
    }

    public List<String> getValueParamList(String string2) {
        return null;
    }

    public DJIValueBean getValueBean(String string2) {
        return null;
    }

    /* synthetic */ CapabilityParser(1 var1_1) {
    }

    private static class LazyHolder {
        private static final CapabilityParser INSTANCE = new CapabilityParser(null);

        private LazyHolder() {
        }

        static /* synthetic */ CapabilityParser access$100() {
            return null;
        }
    }
}

