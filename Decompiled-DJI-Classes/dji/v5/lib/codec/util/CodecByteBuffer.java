/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.lib.codec.util;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

public class CodecByteBuffer {
    private ByteBuffer mInnerBuffer;

    public CodecByteBuffer() {
    }

    public CodecByteBuffer(int n) {
    }

    private void checkCapacity(int n) {
    }

    public synchronized void write(byte by) {
    }

    public synchronized void write(byte[] byArray, int n, int n2) {
    }

    public synchronized void write(ByteBuffer byteBuffer, int n) {
    }

    public synchronized void clear() {
    }

    @NonNull
    public synchronized byte[] array() {
        return null;
    }

    @NonNull
    public synchronized byte[] copyArray() {
        return null;
    }

    public synchronized int offset() {
        return 0;
    }

    public synchronized int position() {
        return 0;
    }

    public synchronized void setPosition(int n) {
    }

    public synchronized int capacity() {
        return 0;
    }

    public synchronized void insert(byte[] byArray, int n, int n2, int n3) {
    }

    public synchronized void remove(int n, int n2) {
    }

    public synchronized int length() {
        return 0;
    }

    public synchronized void get(byte[] byArray, int n, int n2) {
    }

    @NonNull
    public synchronized ByteBuffer asReadOnlyBuffer() {
        return null;
    }
}

