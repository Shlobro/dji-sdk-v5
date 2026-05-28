/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.javalib.base;

import dji.bluetooth.javalib.base.BleDataReceiveListener;

public interface BleDataInterface {
    public boolean sendExternalData(byte[] var1);

    public boolean sendData(byte[] var1);

    public void listenReceiveData(BleDataReceiveListener var1);

    public int getMTU();
}

