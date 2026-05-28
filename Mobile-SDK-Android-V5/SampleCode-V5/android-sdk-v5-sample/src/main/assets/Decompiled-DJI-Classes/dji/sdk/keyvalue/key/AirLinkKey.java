/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.key.DJIAirlinkKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.msdkkeyinfo.KeySignalQuality;
import dji.sdk.keyvalue.msdkkeyinfo.KeyVideoDataRate;
import java.util.List;

@Keep
public class AirLinkKey
extends DJIAirlinkKey {
    public static final DJIKeyInfo<Integer> KeySignalQuality = new KeySignalQuality().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<Double> KeyVideoDataRate = new KeyVideoDataRate().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);

    public static List<DJIKeyInfo<?>> getKeyList() {
        return null;
    }

    static {
        keyList.add(KeySignalQuality);
        keyList.add(KeyVideoDataRate);
    }
}

