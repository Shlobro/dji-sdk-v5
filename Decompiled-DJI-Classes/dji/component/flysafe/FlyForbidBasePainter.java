/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe;

public class FlyForbidBasePainter {
    public static final int AREA_TYPE_PRIVATE_AIRPORT = 14;
    public static final int AREA_TYPE_HELICOPTER = 19;
    protected final int mColorTransparent;

    protected boolean needDrawOuterCircle(int n, int n2) {
        return false;
    }

    public void destroy() {
    }

    public static final class DrawShape
    extends Enum<DrawShape> {
        public static final /* enum */ DrawShape SIMPLE_MARKER = new DrawShape();
        public static final /* enum */ DrawShape POLYGON = new DrawShape();
        public static final /* enum */ DrawShape CIRCLE = new DrawShape();
        private static final /* synthetic */ DrawShape[] $VALUES;

        public static DrawShape[] values() {
            return null;
        }

        public static DrawShape valueOf(String string) {
            return null;
        }

        private static /* synthetic */ DrawShape[] $values() {
            return null;
        }

        static {
            $VALUES = DrawShape.$values();
        }
    }
}

