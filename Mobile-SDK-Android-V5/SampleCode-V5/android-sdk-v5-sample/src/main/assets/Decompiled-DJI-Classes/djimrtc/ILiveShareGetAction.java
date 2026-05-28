/*
 * Decompiled with CFR 0.152.
 */
package djimrtc;

import djimrtc.DJILiveShareType;

public interface ILiveShareGetAction {
    public String getRtspUrl();

    public DJILiveShareType getChannelType();

    public boolean isRunning();
}

