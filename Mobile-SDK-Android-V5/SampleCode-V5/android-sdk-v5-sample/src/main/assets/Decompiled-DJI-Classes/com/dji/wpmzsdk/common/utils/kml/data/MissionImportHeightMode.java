/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.data;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0007"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/data/MissionImportHeightMode;", "", "(Ljava/lang/String;I)V", "RELATIVE", "WGS84", "EGM96", "Companion", "wpmzsdk_release"})
public final class MissionImportHeightMode
extends Enum<MissionImportHeightMode> {
    @NotNull
    public static final Companion Companion;
    public static final /* enum */ MissionImportHeightMode RELATIVE;
    public static final /* enum */ MissionImportHeightMode WGS84;
    public static final /* enum */ MissionImportHeightMode EGM96;
    private static final /* synthetic */ MissionImportHeightMode[] $VALUES;

    public static MissionImportHeightMode[] values() {
        return (MissionImportHeightMode[])$VALUES.clone();
    }

    public static MissionImportHeightMode valueOf(String value) {
        return Enum.valueOf(MissionImportHeightMode.class, value);
    }

    @JvmStatic
    @NotNull
    public static final MissionImportHeightMode from(int idx) {
        return Companion.from(idx);
    }

    static {
        RELATIVE = new MissionImportHeightMode();
        WGS84 = new MissionImportHeightMode();
        EGM96 = new MissionImportHeightMode();
        $VALUES = missionImportHeightModeArray = new MissionImportHeightMode[]{MissionImportHeightMode.RELATIVE, MissionImportHeightMode.WGS84, MissionImportHeightMode.EGM96};
        Companion = new Companion(null);
    }

    @Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/data/MissionImportHeightMode$Companion;", "", "()V", "from", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionImportHeightMode;", "idx", "", "wpmzsdk_release"})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MissionImportHeightMode from(int idx) {
            return MissionImportHeightMode.values()[idx];
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

