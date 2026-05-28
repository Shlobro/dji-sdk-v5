/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.manager.dataprotect.ProtectedData;
import java.util.List;

public interface IDataProtectionManager {
    public void init();

    public void destroy();

    public boolean authorizeAccessToProtectedData(List<ProtectedData> var1);

    public boolean deAuthorizeAccessToProtectedData(List<ProtectedData> var1);

    public boolean deAuthorizeAccessToAllProtectedData();

    public boolean isAccessibleToProtectedData(ProtectedData var1);

    public void agreeToProductImprovement(boolean var1);

    public boolean isAgreeToProductImprovement();

    public String getMSDKLogPath();

    public boolean clearMSDKLog();

    public void enableMSDKLog(boolean var1);

    public boolean isMSDKLogEnabled();
}

