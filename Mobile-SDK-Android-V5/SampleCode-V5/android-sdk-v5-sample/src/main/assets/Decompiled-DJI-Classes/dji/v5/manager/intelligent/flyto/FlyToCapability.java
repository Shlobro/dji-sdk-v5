/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent.flyto;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.common.DoubleMinMax;
import dji.sdk.keyvalue.value.flightcontroller.FlyToMode;
import java.util.List;

@Keep
public class FlyToCapability {
    private List<FlyToMode> supportedFlyModes;
    private final DoubleMinMax heightRange;

    private List<FlyToMode> getSupportedFlyModes() {
        return null;
    }

    public void setSupportedFlyModes(List<FlyToMode> list) {
    }

    public DoubleMinMax getHeightRange() {
        return null;
    }
}

