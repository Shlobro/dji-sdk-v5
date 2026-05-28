/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.key;

import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.value.base.DJIValue;

public class DJIKeyInfo<T> {
    private int componentType;
    private int subComponentType;
    private IDJIValueConverter<T, ? extends DJIValue> converter;
    protected boolean canGet;
    protected boolean canSet;
    protected boolean canListen;
    protected boolean canPerformAction;
    protected boolean mIsEvent;
    private String identifier;
    protected String innerIdentifier;

    DJIKeyInfo(int n, int n2, String string, IDJIValueConverter<T, ? extends DJIValue> iDJIValueConverter) {
    }

    public DJIKeyInfo<T> canGet(boolean bl) {
        return null;
    }

    public DJIKeyInfo<T> canSet(boolean bl) {
        return null;
    }

    public DJIKeyInfo<T> canListen(boolean bl) {
        return null;
    }

    public DJIKeyInfo<T> setIsEvent(boolean bl) {
        return null;
    }

    public DJIKeyInfo<T> canPerformAction(boolean bl) {
        return null;
    }

    public DJIKeyInfo<T> setInnerIdentifier(String string) {
        return null;
    }

    public boolean isCanGet() {
        return false;
    }

    public boolean isCanSet() {
        return false;
    }

    public boolean isCanListen() {
        return false;
    }

    public boolean isCanPerformAction() {
        return false;
    }

    public boolean isEvent() {
        return false;
    }

    public String getIdentifier() {
        return null;
    }

    public String getInnerIdentifier() {
        return null;
    }

    public int getComponentType() {
        return 0;
    }

    public int getSubComponentType() {
        return 0;
    }

    public IDJIValueConverter getTypeConverter() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }
}

