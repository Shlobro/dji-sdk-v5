/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.utils;

import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.KeyTools;
import dji.sdk.keyvalue.key.ProductKey;
import dji.sdk.keyvalue.value.product.ProductType;

public class ProductUtil {
    public static final DJIKey<ProductType> PRODUCT_TYPE_KEY = KeyTools.createKey(ProductKey.KeyProductType);

    public static ProductType productType() {
        return null;
    }

    public static boolean isM30Product() {
        return false;
    }

    public static boolean isM300Product() {
        return false;
    }

    public static boolean isM3EProduct() {
        return false;
    }

    public static boolean isM4EProduct() {
        return false;
    }

    public static boolean isMini3Pro() {
        return false;
    }

    public static boolean isMini4Pro() {
        return false;
    }

    public static boolean isMini3() {
        return false;
    }

    public static boolean isM350Product() {
        return false;
    }

    public static boolean isM400Product() {
        return false;
    }

    public static boolean isMini3Series() {
        return false;
    }

    public static boolean isIndustryMachine(ProductType productType) {
        return false;
    }

    public static boolean isIndustryMachine() {
        return false;
    }

    public static boolean isConsumeMachine() {
        return false;
    }

    public static boolean isConsumeMachine(ProductType productType) {
        return false;
    }

    public static boolean isM4DProduct() {
        return false;
    }

    public static boolean isM3ELittleBattery() {
        return false;
    }

    public static boolean isIndustryV3() {
        return false;
    }

    public static MachineType findMachineType(ProductType productType) {
        return null;
    }

    public static MachineType findMachineType() {
        return null;
    }

    private ProductUtil() {
    }

    public static final class MachineType
    extends Enum<MachineType> {
        public static final /* enum */ MachineType INDUSTRY = new MachineType();
        public static final /* enum */ MachineType CONSUME = new MachineType();
        private static final /* synthetic */ MachineType[] $VALUES;

        public static MachineType[] values() {
            return null;
        }

        public static MachineType valueOf(String string) {
            return null;
        }

        private static /* synthetic */ MachineType[] $values() {
            return null;
        }

        static {
            $VALUES = MachineType.$values();
        }
    }
}

