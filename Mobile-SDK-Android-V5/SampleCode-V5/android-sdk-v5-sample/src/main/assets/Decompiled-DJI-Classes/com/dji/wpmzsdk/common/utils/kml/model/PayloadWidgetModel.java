/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

public class PayloadWidgetModel {
    private static final String TAG = "PayloadWidgetModel";

    private PayloadWidgetModel() {
    }

    public static enum TypeEnum {
        BUTTON(1),
        SWITCH(2),
        SEEK_BAR(3),
        SPINNER(4),
        INPUT_VIEW(5),
        TEXT_VIEW(6),
        UNKNOWN(0);

        private int value;

        public int getValue() {
            return this.value;
        }

        private TypeEnum(int value) {
            this.value = value;
        }

        public static TypeEnum find(int value) {
            TypeEnum[] values;
            for (TypeEnum typeEnum : values = TypeEnum.values()) {
                if (typeEnum.value != value) continue;
                return typeEnum;
            }
            return UNKNOWN;
        }
    }
}

