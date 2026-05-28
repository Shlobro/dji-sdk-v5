/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.bluetooth.le.ScanFilter
 *  android.bluetooth.le.ScanResult
 */
package dji.bluetooth.javalib.base;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import java.util.List;

@TargetApi(value=21)
public interface BleScanFilter {
    public List<ScanFilter> getScanFilters();

    public boolean filterScanRecord(byte[] var1);

    public boolean filterScanResult(ScanResult var1);

    public int getDJIBleId(byte[] var1);
}

