/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.analytics.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface TrackEvent {
    public String eventName() default "";

    public String category() default "";

    public String result() default "";
}

