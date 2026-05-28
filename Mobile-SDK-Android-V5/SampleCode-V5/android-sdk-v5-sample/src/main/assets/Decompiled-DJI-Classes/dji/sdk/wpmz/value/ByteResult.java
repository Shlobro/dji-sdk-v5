/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value;

public class ByteResult<T> {
    public T result;
    public int endIndex;

    public ByteResult(T result, int endIndex) {
        this.endIndex = endIndex;
        this.result = result;
    }
}

