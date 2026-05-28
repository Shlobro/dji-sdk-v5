/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.error;

import dji.v5.common.error.IDJIError;

public class RxError
extends Throwable {
    private transient IDJIError djiError;

    public RxError(IDJIError iDJIError) {
    }

    public IDJIError getDjiError() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}

