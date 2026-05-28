/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.key;

import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKeyInfo;

public class DJIKey<T> {
    protected final int mProductId;
    protected final int mComponentIndex;
    protected final int mSubComponentIndex;
    protected int mSubComponentType;
    protected boolean mSubComponentSet;
    protected final DJIKeyInfo<T> mKeyInfo;

    protected DJIKey(int n, int n2, int n3, int n4, DJIKeyInfo dJIKeyInfo) {
    }

    protected DJIKey(int n, int n2, int n3, DJIKeyInfo dJIKeyInfo) {
    }

    public int getProductId() {
        return 0;
    }

    public int getComponentType() {
        return 0;
    }

    public int getComponentIndex() {
        return 0;
    }

    public int getSubComponentType() {
        return 0;
    }

    public boolean getSubComponentSet() {
        return false;
    }

    public void setSubComponentSet(boolean bl) {
    }

    public int getSubComponentIndex() {
        return 0;
    }

    public DJIKeyInfo<T> getKeyInfo() {
        return null;
    }

    public String getKeyIdentifier() {
        return null;
    }

    public String getKeyInnerIdentifier() {
        return null;
    }

    public boolean canGet() {
        return false;
    }

    public boolean canSet() {
        return false;
    }

    public boolean canListen() {
        return false;
    }

    public boolean canPerformAction() {
        return false;
    }

    public static <T> DJIKey<T> create(DJIKeyInfo<T> dJIKeyInfo) {
        return null;
    }

    public static <T> DJIKey<T> create(DJIKeyInfo<T> dJIKeyInfo, int n) {
        return null;
    }

    public static <T> DJIKey<T> create(DJIKeyInfo<T> dJIKeyInfo, int n, int n2) {
        return null;
    }

    @Deprecated
    public static <T> DJIKey<T> create(DJIKeyInfo<T> dJIKeyInfo, int n, int n2, int n3) {
        return null;
    }

    public static <T> DJIKey<T> create(DJIKeyInfo<T> dJIKeyInfo, int n, int n2, int n3, int n4) {
        return null;
    }

    public static <T, ResultType> ActionKey<T, ResultType> create(DJIActionKeyInfo<T, ResultType> dJIActionKeyInfo) {
        return null;
    }

    public static <T, ResultType> ActionKey<T, ResultType> create(DJIActionKeyInfo<T, ResultType> dJIActionKeyInfo, int n) {
        return null;
    }

    public static <T, ResultType> ActionKey create(DJIActionKeyInfo<T, ResultType> dJIActionKeyInfo, int n, int n2) {
        return null;
    }

    @Deprecated
    public static <T, ResultType> ActionKey create(DJIActionKeyInfo<T, ResultType> dJIActionKeyInfo, int n, int n2, int n3) {
        return null;
    }

    public static <T, ResultType> ActionKey create(DJIActionKeyInfo<T, ResultType> dJIActionKeyInfo, int n, int n2, int n3, int n4) {
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

    public static class ActionKey<T, ResultType>
    extends DJIKey<T> {
        protected ActionKey(int n, int n2, int n3, DJIActionKeyInfo<T, ResultType> dJIActionKeyInfo) {
        }

        protected ActionKey(int n, int n2, int n3, int n4, DJIActionKeyInfo<T, ResultType> dJIActionKeyInfo) {
        }

        public DJIActionKeyInfo<T, ResultType> getKeyInfo() {
            return null;
        }
    }
}

