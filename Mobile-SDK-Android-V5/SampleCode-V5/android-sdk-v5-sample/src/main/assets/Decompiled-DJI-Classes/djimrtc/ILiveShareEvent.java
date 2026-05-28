/*
 * Decompiled with CFR 0.152.
 */
package djimrtc;

import djimrtc.event.DJILiveShareConnectionEvent;
import djimrtc.event.DJILiveShareInfoEvent;
import djimrtc.event.DJILiveSharePinPointEvent;
import djimrtc.event.DJILiveSharePlayEvent;
import djimrtc.event.DJILiveShareReadyEvent;
import djimrtc.event.DJILiveShareStatusEvent;
import djimrtc.event.DJILiveShareVideoAtrributeEvent;

public interface ILiveShareEvent {
    public void registerConnectionEvent(DJILiveShareConnectionEvent var1);

    public void registerPlayEvent(DJILiveSharePlayEvent var1);

    public void registerPinPointEvent(DJILiveSharePinPointEvent var1);

    public void registerLiveStatusEvent(DJILiveShareStatusEvent var1);

    public void registerLiveShareInfoEvent(DJILiveShareInfoEvent var1);

    public void registerVideoAttributeEvent(DJILiveShareVideoAtrributeEvent var1);

    public void registerReadyEvent(DJILiveShareReadyEvent var1);
}

