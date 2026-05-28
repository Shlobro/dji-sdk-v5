/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.airlink.WlmLinkQualityLevelInfo;
import dji.v5.manager.aircraft.lte.LTELinkType;
import dji.v5.manager.aircraft.lte.LTEPrivatizationServerInfo;

@Keep
public class LTELinkInfo {
    private WlmLinkQualityLevelInfo lteLinkQualityLevelInfo;
    private LTELinkType LTELinkType;
    private LTEPrivatizationServerInfo aircraftPrivatizationServerInfo;
    private LTEPrivatizationServerInfo remoteControllerPrivatizationServerInfo;

    public WlmLinkQualityLevelInfo getLinkQualityLevel() {
        return null;
    }

    public LTELinkType getLTELinkType() {
        return null;
    }

    public LTEPrivatizationServerInfo getAircraftPrivatizationServerInfo() {
        return null;
    }

    public LTEPrivatizationServerInfo getRemoteControllerPrivatizationServerInfo() {
        return null;
    }

    public LTELinkInfo setLteLinkQualityLevelInfo(WlmLinkQualityLevelInfo wlmLinkQualityLevelInfo) {
        return null;
    }

    public LTELinkInfo setLTELinkType(LTELinkType lTELinkType) {
        return null;
    }

    public LTELinkInfo setAircraftPrivatizationServerInfo(LTEPrivatizationServerInfo lTEPrivatizationServerInfo) {
        return null;
    }

    public LTELinkInfo setRemoteControllerPrivatizationServerInfo(LTEPrivatizationServerInfo lTEPrivatizationServerInfo) {
        return null;
    }
}

