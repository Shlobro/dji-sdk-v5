/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value;

import dji.sdk.keyvalue.key.DJIKey;

public class KeyParam {
    private int productId;
    private int componentIndex;
    private int subComponentType;
    private int subComponentIndex;
    private boolean subComponentSet;

    public int getProductId() {
        return 0;
    }

    public int getComponentIndex() {
        return 0;
    }

    public int getSubComponentType() {
        return 0;
    }

    public int getSubComponentIndex() {
        return 0;
    }

    public boolean getSubComponentSet() {
        return false;
    }

    public KeyParam(DJIKey<?> dJIKey) {
    }

    public KeyParam(DJIKey.ActionKey<?, ?> actionKey) {
    }
}

