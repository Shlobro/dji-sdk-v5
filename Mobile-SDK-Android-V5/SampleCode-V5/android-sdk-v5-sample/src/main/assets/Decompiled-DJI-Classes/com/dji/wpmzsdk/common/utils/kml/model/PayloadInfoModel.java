/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import java.util.List;

public class PayloadInfoModel {
    private String name;
    private List<PayloadWidgetInfo> widgetModels;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PayloadWidgetInfo> getWidgetModels() {
        return this.widgetModels;
    }

    public void setWidgetModels(List<PayloadWidgetInfo> widgetModels) {
        this.widgetModels = widgetModels;
    }

    public static class PayloadWidgetInfo {
        private int index;
        private String name;
        private int type;
        private int value;
        private int minValue;
        private int maxValue;

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getMinValue() {
            return this.minValue;
        }

        public void setMinValue(int minValue) {
            this.minValue = minValue;
        }

        public int getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(int maxValue) {
            this.maxValue = maxValue;
        }
    }
}

