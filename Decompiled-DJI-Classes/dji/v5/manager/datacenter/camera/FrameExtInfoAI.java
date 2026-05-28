/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.camera;

import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import java.util.Map;

public class FrameExtInfoAI {
    static final int DJI_TARGET_LIMIT_CNT = 128;
    static final int DJI_TM_OBJ_GROUP_OBJ_2D_BOX_WITH_DISTANCE = 10;
    static final int DJI_TM_OBJ_GROUP_OBJ_TYPE_COUNT = 12;
    static final int DJI_TM_FRAME_INFO_INVALID = 0;
    static final int DJI_TM_FRAME_INFO_BASE = 1;
    private byte[] data;
    private int size;
    private int position;
    private int version;
    private long timestamp;
    private int frameIdType;
    private int groupCount;
    private int groupType;
    private int trackId;
    private int targetNum;
    private PerTargetInfo[] perTargetInfoArray;
    private GpsConverter mGpsConverter;
    private Map<Integer, Integer> mCounter;

    public int getVersion() {
        return 0;
    }

    public long getTimestamp() {
        return 0L;
    }

    public PerTargetInfo[] getPerTargetInfoArray() {
        return null;
    }

    public Map<Integer, Integer> getCounter() {
        return null;
    }

    public int getTrackId() {
        return 0;
    }

    public FrameExtInfoAI(byte[] byArray, int n, int n2) {
    }

    public void parse(GpsConverter gpsConverter) {
    }

    static /* synthetic */ int access$002(FrameExtInfoAI frameExtInfoAI, int n) {
        return 0;
    }

    static /* synthetic */ byte[] access$100(FrameExtInfoAI frameExtInfoAI) {
        return null;
    }

    static /* synthetic */ int access$200(FrameExtInfoAI frameExtInfoAI) {
        return 0;
    }

    static /* synthetic */ int access$212(FrameExtInfoAI frameExtInfoAI, int n) {
        return 0;
    }

    static /* synthetic */ long access$302(FrameExtInfoAI frameExtInfoAI, long l2) {
        return 0L;
    }

    static /* synthetic */ int access$402(FrameExtInfoAI frameExtInfoAI, int n) {
        return 0;
    }

    static /* synthetic */ int access$400(FrameExtInfoAI frameExtInfoAI) {
        return 0;
    }

    static /* synthetic */ int access$502(FrameExtInfoAI frameExtInfoAI, int n) {
        return 0;
    }

    static /* synthetic */ int access$602(FrameExtInfoAI frameExtInfoAI, int n) {
        return 0;
    }

    static /* synthetic */ int access$702(FrameExtInfoAI frameExtInfoAI, int n) {
        return 0;
    }

    static /* synthetic */ int access$700(FrameExtInfoAI frameExtInfoAI) {
        return 0;
    }

    static /* synthetic */ int access$802(FrameExtInfoAI frameExtInfoAI, int n) {
        return 0;
    }

    static /* synthetic */ int access$800(FrameExtInfoAI frameExtInfoAI) {
        return 0;
    }

    static /* synthetic */ PerTargetInfo[] access$902(FrameExtInfoAI frameExtInfoAI, PerTargetInfo[] perTargetInfoArray) {
        return null;
    }

    static /* synthetic */ PerTargetInfo[] access$900(FrameExtInfoAI frameExtInfoAI) {
        return null;
    }

    static /* synthetic */ int access$600(FrameExtInfoAI frameExtInfoAI) {
        return 0;
    }

    static /* synthetic */ Map access$1002(FrameExtInfoAI frameExtInfoAI, Map map) {
        return null;
    }

    static /* synthetic */ GpsConverter access$1100(FrameExtInfoAI frameExtInfoAI) {
        return null;
    }

    public static interface GpsConverter {
        public LocationCoordinate3D convert(float var1, float var2, float var3);
    }

    public class PerTargetInfo {
        int targetId;
        int targetState;
        int targetType;
        TargetFiledBBoxContent targetFiledBBoxContent;
        LocationCoordinate3D targetFiledPositionContent;
        final /* synthetic */ FrameExtInfoAI this$0;

        public PerTargetInfo(FrameExtInfoAI frameExtInfoAI) {
        }

        public int getTargetId() {
            return 0;
        }

        public int getTargetState() {
            return 0;
        }

        public int getTargetType() {
            return 0;
        }

        public TargetFiledBBoxContent getTargetFiledBBoxContent() {
            return null;
        }

        public LocationCoordinate3D getTargetFiledPositionContent() {
            return null;
        }

        public void setTargetId() {
        }

        public void setTargetState() {
        }

        public void setTargetType() {
        }

        public void setTargetFiledBBoxContent() {
        }

        public void setPerTargetInfo() {
        }

        public class TargetFiledBBoxContent {
            int boxCenterX;
            int boxCenterY;
            int boxCenterWidth;
            int boxCenterLength;
            long distance;
            final /* synthetic */ PerTargetInfo this$1;

            public TargetFiledBBoxContent(PerTargetInfo perTargetInfo) {
            }

            public int getBoxCenterX() {
                return 0;
            }

            public int getBoxCenterY() {
                return 0;
            }

            public int getBoxCenterWidth() {
                return 0;
            }

            public int getBoxCenterLength() {
                return 0;
            }

            void setBoxCenterX() {
            }

            void setBoxCenterY() {
            }

            void setBoxCenterWidth() {
            }

            void setBoxCenterLength() {
            }

            void setDistance() {
            }

            void setPosition() {
            }

            void setTargetFiledBBoxContent() {
            }
        }
    }

    private class PrimaryInfoParser {
        final /* synthetic */ FrameExtInfoAI this$0;

        private PrimaryInfoParser(FrameExtInfoAI frameExtInfoAI) {
        }

        public void setVersion() {
        }

        public void setFcTimestamp() {
        }

        public void setFrameInfoType() throws IllegalArgumentException {
        }

        public void setTrackId() {
        }

        public void skip(int n) {
        }

        public void setGroupCount() throws IllegalArgumentException {
        }

        public void setGroupType() throws IllegalArgumentException {
        }

        public int readNumber(int n) {
            return 0;
        }

        public int skipNumber(int n) {
            return 0;
        }

        public void setTargetNum() throws IllegalArgumentException {
        }

        public void setPerTargetInfo() {
        }

        void setPrimaryInfoParser() {
        }

        /* synthetic */ PrimaryInfoParser(FrameExtInfoAI frameExtInfoAI, 1 var2_2) {
        }
    }
}

