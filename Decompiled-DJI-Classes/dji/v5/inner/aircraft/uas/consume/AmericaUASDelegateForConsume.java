/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.aircraft.uas.consume;

import dji.v5.inner.aircraft.uas.DefaultUASDelegate;
import dji.v5.manager.aircraft.uas.AreaStrategy;
import dji.v5.manager.diagnostic.DJIDeviceHealthInfo;
import java.util.List;

public class AmericaUASDelegateForConsume
extends DefaultUASDelegate {
    public static final String REMOTE_ID_NORMAL = "0x1B080003";
    public static final String REMOTE_ID_CANNOT_TAKE_OFF_LINK_ERROR = "0x161000B5";
    public static final String REMOTE_ID_CANNOT_TAKE_OFF_USER_LOCATION_UNAVALIABLE = "0x161000B4";
    public static final String REMOTE_ID_USER_LOCATION_ABNORMAL = "0x1B080001";
    public static final String REMOTE_ID_LINK_ERROR = "0x1B080002";
    private List<DJIDeviceHealthInfo> deviceHealthInfoList;

    public AmericaUASDelegateForConsume(boolean bl, AreaStrategy areaStrategy) {
    }

    @Override
    public void init() {
    }

    @Override
    public void furtherUpdateRemoteIDStatus() {
    }

    private /* synthetic */ void lambda$init$0(List list) {
    }
}

