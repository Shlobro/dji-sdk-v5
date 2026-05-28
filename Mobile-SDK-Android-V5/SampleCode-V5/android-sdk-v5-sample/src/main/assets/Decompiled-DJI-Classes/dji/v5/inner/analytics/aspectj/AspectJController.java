/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.JoinPoint
 *  org.aspectj.lang.annotation.AfterReturning
 *  org.aspectj.lang.annotation.Aspect
 *  org.aspectj.lang.annotation.Pointcut
 */
package dji.v5.inner.analytics.aspectj;

import dji.v5.utils.common.LogUtils;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJController {
    private static final String TAG = LogUtils.getTag("AspectJController");
    private static final String ANNOTATION_METHOD = "execution(* *(..)) && @annotation(dji.v5.inner.analytics.annotation.TrackEvent)";
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static /* synthetic */ AspectJController ajc$perSingletonInstance;

    @Pointcut(value="execution(* *(..)) && @annotation(dji.v5.inner.analytics.annotation.TrackEvent)")
    public void annotationPointcut() {
    }

    @AfterReturning(pointcut="annotationPointcut()", returning="returnValue")
    public void weaveJoinPoint(JoinPoint joinPoint, Object object) {
    }

    public void performJoinPoint(JoinPoint joinPoint, Object object) {
    }

    public void doTrack(String string, String string2, Map<String, Object> map) {
    }

    static {
        try {
            AspectJController.ajc$postClinit();
        }
        catch (Throwable throwable) {
            ajc$initFailureCause = throwable;
        }
    }

    public static AspectJController aspectOf() {
        return null;
    }

    public static boolean hasAspect() {
        return false;
    }

    private static /* synthetic */ void ajc$postClinit() {
    }
}

