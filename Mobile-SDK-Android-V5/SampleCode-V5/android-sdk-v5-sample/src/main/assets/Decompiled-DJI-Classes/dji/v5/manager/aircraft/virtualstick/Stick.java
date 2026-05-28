/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.virtualstick;

import dji.v5.manager.aircraft.virtualstick.IStick;

public class Stick
implements IStick {
    public static final int MAX_STICK_POSITION_ABS = 660;
    private int verticalPosition;
    private int horizontalPosition;

    @Override
    public void setVerticalPosition(int n) {
    }

    @Override
    public void setHorizontalPosition(int n) {
    }

    @Override
    public int getVerticalPosition() {
        return 0;
    }

    @Override
    public int getHorizontalPosition() {
        return 0;
    }
}

