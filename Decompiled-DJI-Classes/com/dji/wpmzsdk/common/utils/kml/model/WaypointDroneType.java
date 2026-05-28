/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.ProductType;

public enum WaypointDroneType {
    PM430(0, ProductType.PM430),
    P4R(1, ProductType.P4R),
    COMMON(2, ProductType.UNKNOWN),
    PM320(3, ProductType.PM320),
    PM320_T_RTK(4, ProductType.PM320),
    WM265_E(5, ProductType.WM265),
    WM265_T(6, ProductType.WM265),
    WM265_M(7, ProductType.WM265),
    PM431(8, ProductType.PM431);

    private final int value;
    private final ProductType productType;

    private WaypointDroneType(int value, ProductType productType) {
        this.value = value;
        this.productType = productType;
    }

    public int value() {
        return this.value;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public static WaypointDroneType find(int value) {
        WaypointDroneType result = PM430;
        WaypointDroneType[] values = WaypointDroneType.values();
        for (int i = 0; i < values.length; ++i) {
            if (values[i].value != value) continue;
            result = values[i];
            break;
        }
        return result;
    }
}

