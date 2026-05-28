/*
 * Decompiled with CFR 0.152.
 */
package dji.areacode;

import dji.areacode.AreaCodeChangedCallback;
import dji.areacode.AreaCodeEvent;
import dji.areacode.AreaCodeHandler;
import dji.areacode.AreaCodeMgr;
import dji.areacode.AreaCodeStrategy;
import dji.areacode.CityInfo;

public class AreaCodeImpl
extends AreaCodeMgr {
    private static volatile AreaCodeMgr areacode_module = AreaCodeImpl.Create();

    @Override
    public AreaCodeEvent GetAreaCode(int n, int n2) {
        return null;
    }

    @Override
    public CityInfo GetLastCityInfo(int n, int n2) {
        return null;
    }

    @Override
    public int AddAreaCodeObserver(int n, int n2, AreaCodeChangedCallback areaCodeChangedCallback) {
        return 0;
    }

    @Override
    public void RemoveAreaCodeObserver(int n) {
    }

    @Override
    public void RemoveAllAreaCodeObserver() {
    }

    @Override
    public void SetAreacodeHandle(AreaCodeHandler areaCodeHandler) {
    }

    @Override
    public void UpdateAreaCode(int n, int n2, AreaCodeStrategy areaCodeStrategy, String string2) {
    }

    @Override
    public void TriggerAreaCodecCompute(int n, int n2, AreaCodeChangedCallback areaCodeChangedCallback) {
    }

    @Override
    public void CancelAreaCodeMockStatus(int n, int n2) {
    }

    @Override
    public boolean RemoveAreaCodeCacheFile() {
        return false;
    }
}

