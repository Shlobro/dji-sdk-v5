/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.thirdparty.afinal.annotation.sqlite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.FIELD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Id {
    public String column() default "";
}

