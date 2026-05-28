/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.areacode;

import android.content.Context;
import dji.areacode.AreaCodeChangedCallback;
import dji.areacode.AreaCodeEvent;
import dji.areacode.AreaCodeHandler;
import dji.areacode.AreaCodeImpl;
import dji.areacode.AreaCodeStrategy;
import dji.areacode.CityInfo;

public class DJIAreaCodeManager {
    private static volatile DJIAreaCodeManager instance;
    private AreaCodeImpl areacode_module;
    private static final String areacodeAssestPath = "areacode";
    public static final String STR_AREA_CODE_CHINA = "CN";
    public static final String STR_AREA_CODE_JAPAN = "JP";
    public static final String STR_AREA_CODE_HONGKONG = "HK";
    public static final String STR_AREA_CODE_MACAU = "MO";
    public static final String STR_AREA_CODE_US = "US";
    public static final String STR_AREA_CODE_CANADA = "CA";
    public static final String STR_AREA_CODE_FRANCE = "FR";
    public static final String STR_AREA_CODE_DE = "DE";
    public static final String STR_AREA_CODE_KR = "KR";

    protected DJIAreaCodeManager() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIAreaCodeManager getInstance() {
        return null;
    }

    public void init(Context context) {
    }

    public void uninit() {
    }

    public void setAreaCodeHandler(AreaCodeHandler areaCodeHandler) {
    }

    public AreaCodeEvent getAreaCode(int n, int n2) {
        return null;
    }

    public String getAreaCodeFromLocal(int n, int n2) {
        return null;
    }

    public CityInfo getLastCityInfo(int n, int n2) {
        return null;
    }

    public int addAreaCodeObserver(int n, int n2, AreaCodeChangedCallback areaCodeChangedCallback) {
        return 0;
    }

    public void removeAreaCodeObserver(int n) {
    }

    public void removeAllAreaCodeObserver() {
    }

    public boolean isChina(int n, int n2) {
        return false;
    }

    public boolean isHongKong(int n, int n2) {
        return false;
    }

    public boolean isMacau(int n, int n2) {
        return false;
    }

    public boolean isUnitedStates(int n, int n2) {
        return false;
    }

    public boolean isCanada(int n, int n2) {
        return false;
    }

    public boolean isJanpan(int n, int n2) {
        return false;
    }

    public boolean isFrance(int n, int n2) {
        return false;
    }

    public boolean isGermany(int n, int n2) {
        return false;
    }

    public boolean isKorea(int n, int n2) {
        return false;
    }

    public void UpdateAreaCode(int n, int n2, AreaCodeStrategy areaCodeStrategy, String string2) {
    }

    public void CancelAreaCodeMockStatus(int n, int n2) {
    }

    public void TriggerAreaCodecCompute(int n, int n2, AreaCodeChangedCallback areaCodeChangedCallback) {
    }

    public boolean RemoveAreaCodeCacheFile() {
        return false;
    }

    private static /* synthetic */ void lambda$TriggerAreaCodecCompute$3(AreaCodeChangedCallback areaCodeChangedCallback, int n, int n2, String string2, int n3, AreaCodeStrategy areaCodeStrategy) {
    }

    private static /* synthetic */ void lambda$TriggerAreaCodecCompute$2(AreaCodeChangedCallback areaCodeChangedCallback, int n, int n2, String string2, int n3, AreaCodeStrategy areaCodeStrategy) {
    }

    private static /* synthetic */ void lambda$addAreaCodeObserver$1(AreaCodeChangedCallback areaCodeChangedCallback, int n, int n2, String string2, int n3, AreaCodeStrategy areaCodeStrategy) {
    }

    private static /* synthetic */ void lambda$addAreaCodeObserver$0(AreaCodeChangedCallback areaCodeChangedCallback, int n, int n2, String string2, int n3, AreaCodeStrategy areaCodeStrategy) {
    }
}

