/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  org.jetbrains.annotations.NotNull
 */
package dji.v5.manager.datacenter.camera;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2={"Ldji/v5/manager/datacenter/camera/ConsumerSeiType;", "", "value", "", "desc", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getDesc", "()Ljava/lang/String;", "ASSIST_INFO", "AR", "ROI", "AI", "EIS", "FOV", "aircraft_release"})
public final class ConsumerSeiType
extends Enum<ConsumerSeiType> {
    private final int value;
    @NotNull
    private final String desc;
    public static final /* enum */ ConsumerSeiType ASSIST_INFO = new ConsumerSeiType(1, "\u98de\u673a\u671d\u5411");
    public static final /* enum */ ConsumerSeiType AR = new ConsumerSeiType(4, "ar\u4fe1\u606f");
    public static final /* enum */ ConsumerSeiType ROI = new ConsumerSeiType(6, "roi\u753b\u9762\u878d\u5408");
    public static final /* enum */ ConsumerSeiType AI = new ConsumerSeiType(7, "ai\u8bc6\u522b");
    public static final /* enum */ ConsumerSeiType EIS = new ConsumerSeiType(9, "\u7535\u5b50\u9632\u6296");
    public static final /* enum */ ConsumerSeiType FOV = new ConsumerSeiType(10, "fov \u4fe1\u606f");
    private static final /* synthetic */ ConsumerSeiType[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private ConsumerSeiType(int n2, String string3) {
    }

    public final int getValue() {
        return 0;
    }

    @NotNull
    public final String getDesc() {
        return null;
    }

    public static ConsumerSeiType[] values() {
        return null;
    }

    public static ConsumerSeiType valueOf(String string2) {
        return null;
    }

    @NotNull
    public static EnumEntries<ConsumerSeiType> getEntries() {
        return null;
    }

    private static final /* synthetic */ ConsumerSeiType[] $values() {
        return null;
    }

    static {
        $VALUES = ConsumerSeiType.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

