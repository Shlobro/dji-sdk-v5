/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.upgrade.UpgradeModelType;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

@Keep
public class CacheDeviceInfos {
    public String firmwareVersion;
    public String enforceString;
    public NativeObjects.UpgradeComponentProductType componentProductType;
    public ProductType productModel;
    public UpgradeModelType modelType;

    public String toString() {
        return null;
    }
}

