/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml;

import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo;", "", "fileType", "Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo$KMLFileType;", "(Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo$KMLFileType;)V", "getFileType", "()Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo$KMLFileType;", "missionType", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "getMissionType", "()Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "setMissionType", "(Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;)V", "KMLFileType", "wpmzsdk_release"})
public final class KMLFileParseInfo {
    @NotNull
    private final KMLFileType fileType;
    @NotNull
    private MissionType missionType;

    public KMLFileParseInfo(@NotNull KMLFileType fileType) {
        Intrinsics.checkNotNullParameter((Object)((Object)fileType), (String)"fileType");
        this.fileType = fileType;
        this.missionType = MissionType.Waypoint;
    }

    @NotNull
    public final KMLFileType getFileType() {
        return this.fileType;
    }

    @NotNull
    public final MissionType getMissionType() {
        return this.missionType;
    }

    public final void setMissionType(@NotNull MissionType missionType) {
        Intrinsics.checkNotNullParameter((Object)((Object)missionType), (String)"<set-?>");
        this.missionType = missionType;
    }

    @Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo$KMLFileType;", "", "(Ljava/lang/String;I)V", "MISSION", "ORIGINAL", "UNKNOWN", "wpmzsdk_release"})
    public static final class KMLFileType
    extends Enum<KMLFileType> {
        public static final /* enum */ KMLFileType MISSION = new KMLFileType();
        public static final /* enum */ KMLFileType ORIGINAL = new KMLFileType();
        public static final /* enum */ KMLFileType UNKNOWN = new KMLFileType();
        private static final /* synthetic */ KMLFileType[] $VALUES;

        public static KMLFileType[] values() {
            return (KMLFileType[])$VALUES.clone();
        }

        public static KMLFileType valueOf(String value) {
            return Enum.valueOf(KMLFileType.class, value);
        }

        static {
            $VALUES = kMLFileTypeArray = new KMLFileType[]{KMLFileType.MISSION, KMLFileType.ORIGINAL, KMLFileType.UNKNOWN};
        }
    }
}

