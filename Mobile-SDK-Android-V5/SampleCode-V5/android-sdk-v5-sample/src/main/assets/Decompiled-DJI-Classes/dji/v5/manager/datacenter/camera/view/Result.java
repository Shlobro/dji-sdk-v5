/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.camera.view;

public final class Result
extends Enum<Result> {
    public static final /* enum */ Result SUCCESS_BUT_OUT_OF_SCREEN = new Result(1);
    public static final /* enum */ Result SUCCESS = new Result(0);
    public static final /* enum */ Result FAILED = new Result(-1);
    public static final /* enum */ Result INVALID_DRONE_POSITION = new Result(-2);
    public static final /* enum */ Result INVALID_POINT_POSITION = new Result(-3);
    public static final /* enum */ Result GIMBAL_ATTI_ERROR = new Result(-4);
    public static final /* enum */ Result CAMEAR_ERROR = new Result(-5);
    private int data;
    private static Result[] mValues;
    private static final /* synthetic */ Result[] $VALUES;

    public static Result[] values() {
        return null;
    }

    public static Result valueOf(String string2) {
        return null;
    }

    private Result(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean _equals(int n) {
        return false;
    }

    public static Result[] getValues() {
        return null;
    }

    public static Result find(int n) {
        return null;
    }

    private static /* synthetic */ Result[] $values() {
        return null;
    }

    static {
        $VALUES = Result.$values();
    }
}

