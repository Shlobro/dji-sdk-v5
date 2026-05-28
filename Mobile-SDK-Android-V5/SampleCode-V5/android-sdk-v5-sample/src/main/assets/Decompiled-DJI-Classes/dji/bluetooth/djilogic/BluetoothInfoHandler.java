/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.djilogic;

import dji.sdk.keyvalue.value.product.ProductType;
import java.util.Map;

public class BluetoothInfoHandler {
    private static String PREFIX_OSMO_MOBILE_3 = "HG302";
    private static String PREFIX_OSMO_MOBILE_3_2 = "OM3";
    private static String PREFIX_OSMO_MOBILE_3_3 = "OsmoMobile3";
    private static String PREFIX_OSMO_MOBILE_4 = "OM4";
    private static String PREFIX_OSMO_MOBILE_5 = "OM5";
    private static String PREFIX_OSMO_MOBILE_6 = "OM6";
    private static String PREFIX_OSMO_MOBILE_5_SE = "OMSE";
    private Map<Byte, ProductType> productB;

    private static boolean IsDJIProduct(byte[] byArray) {
        return false;
    }

    public static int getDJIBleId(byte[] byArray) {
        return 0;
    }

    public static ProductType getProductTypeFromManufactureData(byte[] byArray) {
        return null;
    }

    public static int getBootTimesFromManufactureData(byte[] byArray) {
        return 0;
    }

    public static ProductType getProductTypeFromName(String string2) {
        return null;
    }

    public static String getUUIDFromManufactureData(byte[] byArray) {
        return null;
    }

    public static boolean getIsParingFromManufactureData(ProductType productType, byte[] byArray) {
        return false;
    }

    public static byte[] getManufacturerData(byte[] byArray) {
        return null;
    }
}

