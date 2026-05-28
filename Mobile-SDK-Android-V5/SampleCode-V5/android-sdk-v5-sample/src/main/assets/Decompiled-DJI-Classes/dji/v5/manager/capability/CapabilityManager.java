/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.capability;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.key.ComponentType;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.v5.manager.capability.bean.KeyInfoBean;
import dji.v5.manager.capability.bean.MSDKCapabilityData;
import dji.v5.manager.interfaces.ICapabilityManager;
import java.util.List;

public class CapabilityManager
implements ICapabilityManager {
    private static final String DEFALUT_VER = "N/A";
    private static final String LENS_TAG = "CAMERA_LENS_";
    private MSDKCapabilityData data;
    private List<String> supportList;
    private List<String> keyList;
    private List<String> defalutLensNameList;
    private int componentIndex;

    private CapabilityManager() {
    }

    private void init() {
    }

    public static ICapabilityManager getInstance() {
        return null;
    }

    @Override
    public String getCapabilityFilePath() {
        return null;
    }

    @Override
    public String getCapabilityMSDKVersion() {
        return null;
    }

    @Override
    public List<String> getSupportedProductList() {
        return null;
    }

    @Override
    public boolean isKeySupported(String string2, String string3, ComponentType componentType, String string4) {
        return false;
    }

    @Override
    public boolean isKeySupported(String string2, String string3) {
        return false;
    }

    @Override
    public boolean isCameraKeySupported(String string2, String string3, String string4) {
        return false;
    }

    @Override
    public <T> boolean isKeySupported(DJIKeyInfo<T> dJIKeyInfo) {
        return false;
    }

    @Override
    public boolean isProductSupported(String string2) {
        return false;
    }

    private List<KeyInfoBean> getComponentKeyInfoList(@NonNull String string2, String string3, ComponentType componentType) {
        return null;
    }

    private List<String> getAllKeyList(String string2) {
        return null;
    }

    private List<String> getKeyNameList(@NonNull String string2, String string3, ComponentType componentType) {
        return null;
    }

    private <T> boolean isCameraKeySupport(DJIKeyInfo<T> dJIKeyInfo) {
        return false;
    }

    @Override
    public List<String> getSupportLens(String string2) {
        return null;
    }

    @Override
    public List<String> getSupportLens(String string2, String string3, String string4) {
        return null;
    }

    @Override
    public void setComponetIndex(int n) {
    }

    @Override
    public int getComponentIndex() {
        return 0;
    }

    @Override
    public int getCapabilityKeyCount(String string2) {
        return 0;
    }

    private List<String> getSupportLensShowNameList(List<String> list) {
        return null;
    }

    private List<String> getDefaultLensNameList() {
        return null;
    }

    /* synthetic */ CapabilityManager(1 var1_1) {
    }

    private static class LazyLoader {
        private static final CapabilityManager INSTANCE = new CapabilityManager(null);

        private LazyLoader() {
        }

        static /* synthetic */ CapabilityManager access$100() {
            return null;
        }
    }
}

