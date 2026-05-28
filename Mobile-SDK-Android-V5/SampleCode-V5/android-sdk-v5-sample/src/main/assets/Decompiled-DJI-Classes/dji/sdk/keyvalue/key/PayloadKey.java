/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.key.DJIPayloadKey;
import dji.sdk.keyvalue.msdkkeyinfo.KeyPayloadConnection;
import java.util.List;

@Keep
public class PayloadKey
extends DJIPayloadKey {
    public static final DJIKeyInfo<Boolean> KeyConnection2 = new KeyPayloadConnection().canGet(false).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);

    public static List<DJIKeyInfo<?>> getKeyList() {
        return null;
    }

    static {
        keyList.add(KeyConnection2);
    }
}

