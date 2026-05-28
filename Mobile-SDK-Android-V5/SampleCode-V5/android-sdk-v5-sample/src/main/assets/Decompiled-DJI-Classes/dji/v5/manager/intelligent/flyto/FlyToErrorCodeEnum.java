/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  kotlin.Metadata
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 */
package dji.v5.manager.intelligent.flyto;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b/\b\u0087\u0081\u0002\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0\u00a8\u00062"}, d2={"Ldji/v5/manager/intelligent/flyto/FlyToErrorCodeEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_ERROR", "DBUS_NULLPTR", "BAD_GPSSIGNAL", "ABSPOS_INVALID", "PLANNING_FAIL", "HOME_NOTSET", "RC_LOST", "MODE_SOEMAYRUNOUT", "MODE_SWITCH_PLANNING_ALGO", "MODE_HEIGHT_EXCEED_LIMIT", "GOAL_MEETHORLIM", "GOAL_MEETHORLIM_RADIUS", "GOAL_MEETVERLIM", "GOAL_MEETVERLIM_TOP", "GOAL_MEETVERLIM_BOTTOM", "GOAL_SOEMAYRUNOUT", "SWITCH_PLANNING_ALGO", "PREVENT_MOTOR_ERRO", "GOAL_INVALID", "MAX_SPEED_INVALID", "VERSION_INVALID", "STATE_MACHINE_INVALID", "MEA_INVALID", "UAV_MEETHORLIM", "UAV_MEETHORLIM_RADIUS", "UAV_MEETVERLIM", "UAV_MEETVERLIM_TOP", "UAV_MEETVERLIM_BOTTOM", "UAV_TAKEOFF_FAIL", "GOAL_BLOCKKEDBY_OBSTACLE", "OBSTACLE_TOO_CLOSE", "ROUTE_BLOCKED", "UAV_MEETVFENCE", "USER_CONTROL_RC", "USER_REQUEST_STOP", "PREEMPIBY_LOWBATHOME", "PREEMPTBY_LOWBATLAND", "PREEMPTBY_ADSB", "PREEMPTBY_HIGHERPRIORITY_MIS", "UNKNOWN", "UNRECOGNIZED", "Companion", "aircraft_release"})
@Keep
public final class FlyToErrorCodeEnum
extends Enum<FlyToErrorCodeEnum> {
    @NotNull
    public static final Companion Companion;
    private final int value;
    @NotNull
    private static final FlyToErrorCodeEnum[] allValues;
    public static final /* enum */ FlyToErrorCodeEnum NO_ERROR;
    public static final /* enum */ FlyToErrorCodeEnum DBUS_NULLPTR;
    public static final /* enum */ FlyToErrorCodeEnum BAD_GPSSIGNAL;
    public static final /* enum */ FlyToErrorCodeEnum ABSPOS_INVALID;
    public static final /* enum */ FlyToErrorCodeEnum PLANNING_FAIL;
    public static final /* enum */ FlyToErrorCodeEnum HOME_NOTSET;
    public static final /* enum */ FlyToErrorCodeEnum RC_LOST;
    public static final /* enum */ FlyToErrorCodeEnum MODE_SOEMAYRUNOUT;
    public static final /* enum */ FlyToErrorCodeEnum MODE_SWITCH_PLANNING_ALGO;
    public static final /* enum */ FlyToErrorCodeEnum MODE_HEIGHT_EXCEED_LIMIT;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_MEETHORLIM;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_MEETHORLIM_RADIUS;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_MEETVERLIM;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_MEETVERLIM_TOP;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_MEETVERLIM_BOTTOM;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_SOEMAYRUNOUT;
    public static final /* enum */ FlyToErrorCodeEnum SWITCH_PLANNING_ALGO;
    public static final /* enum */ FlyToErrorCodeEnum PREVENT_MOTOR_ERRO;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_INVALID;
    public static final /* enum */ FlyToErrorCodeEnum MAX_SPEED_INVALID;
    public static final /* enum */ FlyToErrorCodeEnum VERSION_INVALID;
    public static final /* enum */ FlyToErrorCodeEnum STATE_MACHINE_INVALID;
    public static final /* enum */ FlyToErrorCodeEnum MEA_INVALID;
    public static final /* enum */ FlyToErrorCodeEnum UAV_MEETHORLIM;
    public static final /* enum */ FlyToErrorCodeEnum UAV_MEETHORLIM_RADIUS;
    public static final /* enum */ FlyToErrorCodeEnum UAV_MEETVERLIM;
    public static final /* enum */ FlyToErrorCodeEnum UAV_MEETVERLIM_TOP;
    public static final /* enum */ FlyToErrorCodeEnum UAV_MEETVERLIM_BOTTOM;
    public static final /* enum */ FlyToErrorCodeEnum UAV_TAKEOFF_FAIL;
    public static final /* enum */ FlyToErrorCodeEnum GOAL_BLOCKKEDBY_OBSTACLE;
    public static final /* enum */ FlyToErrorCodeEnum OBSTACLE_TOO_CLOSE;
    public static final /* enum */ FlyToErrorCodeEnum ROUTE_BLOCKED;
    public static final /* enum */ FlyToErrorCodeEnum UAV_MEETVFENCE;
    public static final /* enum */ FlyToErrorCodeEnum USER_CONTROL_RC;
    public static final /* enum */ FlyToErrorCodeEnum USER_REQUEST_STOP;
    public static final /* enum */ FlyToErrorCodeEnum PREEMPIBY_LOWBATHOME;
    public static final /* enum */ FlyToErrorCodeEnum PREEMPTBY_LOWBATLAND;
    public static final /* enum */ FlyToErrorCodeEnum PREEMPTBY_ADSB;
    public static final /* enum */ FlyToErrorCodeEnum PREEMPTBY_HIGHERPRIORITY_MIS;
    public static final /* enum */ FlyToErrorCodeEnum UNKNOWN;
    public static final /* enum */ FlyToErrorCodeEnum UNRECOGNIZED;
    private static final /* synthetic */ FlyToErrorCodeEnum[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private FlyToErrorCodeEnum(int n2) {
    }

    public final int getValue() {
        return 0;
    }

    public static FlyToErrorCodeEnum[] values() {
        return null;
    }

    public static FlyToErrorCodeEnum valueOf(String string2) {
        return null;
    }

    @NotNull
    public static EnumEntries<FlyToErrorCodeEnum> getEntries() {
        return null;
    }

    private static final /* synthetic */ FlyToErrorCodeEnum[] $values() {
        return null;
    }

    public static final /* synthetic */ FlyToErrorCodeEnum[] access$getAllValues$cp() {
        return null;
    }

    static {
        NO_ERROR = new FlyToErrorCodeEnum(0);
        DBUS_NULLPTR = new FlyToErrorCodeEnum(1);
        BAD_GPSSIGNAL = new FlyToErrorCodeEnum(2);
        ABSPOS_INVALID = new FlyToErrorCodeEnum(3);
        PLANNING_FAIL = new FlyToErrorCodeEnum(4);
        HOME_NOTSET = new FlyToErrorCodeEnum(5);
        RC_LOST = new FlyToErrorCodeEnum(6);
        MODE_SOEMAYRUNOUT = new FlyToErrorCodeEnum(17);
        MODE_SWITCH_PLANNING_ALGO = new FlyToErrorCodeEnum(18);
        MODE_HEIGHT_EXCEED_LIMIT = new FlyToErrorCodeEnum(19);
        GOAL_MEETHORLIM = new FlyToErrorCodeEnum(513);
        GOAL_MEETHORLIM_RADIUS = new FlyToErrorCodeEnum(514);
        GOAL_MEETVERLIM = new FlyToErrorCodeEnum(515);
        GOAL_MEETVERLIM_TOP = new FlyToErrorCodeEnum(516);
        GOAL_MEETVERLIM_BOTTOM = new FlyToErrorCodeEnum(517);
        GOAL_SOEMAYRUNOUT = new FlyToErrorCodeEnum(518);
        SWITCH_PLANNING_ALGO = new FlyToErrorCodeEnum(519);
        PREVENT_MOTOR_ERRO = new FlyToErrorCodeEnum(1025);
        GOAL_INVALID = new FlyToErrorCodeEnum(1026);
        MAX_SPEED_INVALID = new FlyToErrorCodeEnum(1027);
        VERSION_INVALID = new FlyToErrorCodeEnum(1028);
        STATE_MACHINE_INVALID = new FlyToErrorCodeEnum(1029);
        MEA_INVALID = new FlyToErrorCodeEnum(1030);
        UAV_MEETHORLIM = new FlyToErrorCodeEnum(1537);
        UAV_MEETHORLIM_RADIUS = new FlyToErrorCodeEnum(1538);
        UAV_MEETVERLIM = new FlyToErrorCodeEnum(1539);
        UAV_MEETVERLIM_TOP = new FlyToErrorCodeEnum(1540);
        UAV_MEETVERLIM_BOTTOM = new FlyToErrorCodeEnum(1541);
        UAV_TAKEOFF_FAIL = new FlyToErrorCodeEnum(1542);
        GOAL_BLOCKKEDBY_OBSTACLE = new FlyToErrorCodeEnum(1543);
        OBSTACLE_TOO_CLOSE = new FlyToErrorCodeEnum(1544);
        ROUTE_BLOCKED = new FlyToErrorCodeEnum(1545);
        UAV_MEETVFENCE = new FlyToErrorCodeEnum(1546);
        USER_CONTROL_RC = new FlyToErrorCodeEnum(2049);
        USER_REQUEST_STOP = new FlyToErrorCodeEnum(2050);
        PREEMPIBY_LOWBATHOME = new FlyToErrorCodeEnum(2051);
        PREEMPTBY_LOWBATLAND = new FlyToErrorCodeEnum(2052);
        PREEMPTBY_ADSB = new FlyToErrorCodeEnum(2053);
        PREEMPTBY_HIGHERPRIORITY_MIS = new FlyToErrorCodeEnum(2054);
        UNKNOWN = new FlyToErrorCodeEnum(65535);
        UNRECOGNIZED = new FlyToErrorCodeEnum(-1);
        $VALUES = FlyToErrorCodeEnum.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        Companion = new Companion(null);
        allValues = FlyToErrorCodeEnum.values();
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u000b"}, d2={"Ldji/v5/manager/intelligent/flyto/FlyToErrorCodeEnum$Companion;", "", "<init>", "()V", "allValues", "", "Ldji/v5/manager/intelligent/flyto/FlyToErrorCodeEnum;", "[Ldji/v5/manager/intelligent/flyto/FlyToErrorCodeEnum;", "find", "value", "", "aircraft_release"})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final FlyToErrorCodeEnum find(int n) {
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}

