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

public class ManagerBean
implements KeepProguard {
    @SerializedName(value="className")
    private String className;
    @SerializedName(value="methodList")
    private List<MethodInfo> methodList;

    public String getClassName() {
        return null;
    }

    public void setClassName(String string2) {
    }

    public List<MethodInfo> getMethodList() {
        return null;
    }

    public void setMethodList(List<MethodInfo> list) {
    }

    public static class MethodInfo {
        @SerializedName(value="methodName")
        private String methodName;

        public String getMethodName() {
            return null;
        }

        public void setMethodName(String string2) {
        }
    }
}

