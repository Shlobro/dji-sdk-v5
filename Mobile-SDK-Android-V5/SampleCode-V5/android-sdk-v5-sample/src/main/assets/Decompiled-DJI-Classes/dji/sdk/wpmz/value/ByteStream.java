/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value;

public interface ByteStream {
    public int toBytes(byte[] var1, int var2);

    public int fromBytes(byte[] var1, int var2);

    public int serializedLength();
}

