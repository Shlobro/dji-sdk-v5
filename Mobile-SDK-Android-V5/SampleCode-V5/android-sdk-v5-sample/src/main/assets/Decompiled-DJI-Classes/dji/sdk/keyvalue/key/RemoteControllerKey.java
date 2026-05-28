/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.key.DJIRemoteControllerKey;
import dji.sdk.keyvalue.msdkkeyinfo.KeyControlMode;
import dji.sdk.keyvalue.msdkkeyinfo.KeyControllingGimbal;
import dji.sdk.keyvalue.msdkkeyinfo.KeyMultiControlChannel;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.MultiControlChannel;
import dji.sdk.keyvalue.value.remotecontroller.ControlMode;
import java.util.List;

@Keep
public class RemoteControllerKey
extends DJIRemoteControllerKey {
    public static final DJIKeyInfo<ControlMode> KeyControlMode = new KeyControlMode().canGet(true).canSet(true).canListen(false).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<MultiControlChannel> KeyMultiControlChannel = new KeyMultiControlChannel().canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
    public static final DJIKeyInfo<ComponentIndexType> KeyControllingGimbal = new KeyControllingGimbal().canGet(false).canSet(true).canListen(false).canPerformAction(false).setIsEvent(false);

    public static List<DJIKeyInfo<?>> getKeyList() {
        return null;
    }

    static {
        keyList.add(KeyControlMode);
        keyList.add(KeyMultiControlChannel);
        keyList.add(KeyControllingGimbal);
    }
}

