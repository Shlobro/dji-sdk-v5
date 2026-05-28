/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.common.DoubleRect;
import dji.v5.manager.intelligent.AutoSensingTargetType;

@Keep
public class AutoSensingTarget {
    private AutoSensingTargetType targetType;
    private int targetIndex;
    private DoubleRect rect;
    private String label;

    public AutoSensingTargetType getTargetType() {
        return null;
    }

    public void setTargetType(AutoSensingTargetType autoSensingTargetType) {
    }

    public int getTargetIndex() {
        return 0;
    }

    public void setTargetIndex(int n) {
    }

    public DoubleRect getRect() {
        return null;
    }

    public void setRect(DoubleRect doubleRect) {
    }

    public String getLabel() {
        return null;
    }

    public void setLabel(String string2) {
    }
}

