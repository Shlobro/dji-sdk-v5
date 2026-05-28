/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

public interface ModelTransform<From, To> {
    public To transFrom(From var1);

    public From transTo(To var1);
}

