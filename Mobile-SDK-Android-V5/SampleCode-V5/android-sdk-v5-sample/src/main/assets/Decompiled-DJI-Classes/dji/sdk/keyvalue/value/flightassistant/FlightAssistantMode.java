/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class FlightAssistantMode
extends Enum<FlightAssistantMode>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightAssistantMode NONE = new FlightAssistantMode(0);
    public static final /* enum */ FlightAssistantMode QUICKSHOT = new FlightAssistantMode(100);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_SLASH = new FlightAssistantMode(101);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_ROCKET = new FlightAssistantMode(102);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_CIRCLE = new FlightAssistantMode(103);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_HELIX = new FlightAssistantMode(104);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_PAPERPLANE = new FlightAssistantMode(105);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_COMET = new FlightAssistantMode(106);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_CROSSINGANDBACK = new FlightAssistantMode(107);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_PLANET = new FlightAssistantMode(108);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_ZOLLY = new FlightAssistantMode(109);
    public static final /* enum */ FlightAssistantMode QUICKSHOT_DOLLYZOOM = new FlightAssistantMode(110);
    public static final /* enum */ FlightAssistantMode PANO = new FlightAssistantMode(200);
    public static final /* enum */ FlightAssistantMode PANO_1X3 = new FlightAssistantMode(201);
    public static final /* enum */ FlightAssistantMode PANO_3X3 = new FlightAssistantMode(202);
    public static final /* enum */ FlightAssistantMode PANO_180 = new FlightAssistantMode(203);
    public static final /* enum */ FlightAssistantMode PANO_SPHERE = new FlightAssistantMode(204);
    public static final /* enum */ FlightAssistantMode PANO_SUPERRESOLUTION = new FlightAssistantMode(205);
    public static final /* enum */ FlightAssistantMode TRIPOD = new FlightAssistantMode(300);
    public static final /* enum */ FlightAssistantMode HYPERLAPSE = new FlightAssistantMode(400);
    public static final /* enum */ FlightAssistantMode HYPERLAPSE_FREE = new FlightAssistantMode(401);
    public static final /* enum */ FlightAssistantMode HYPERLAPSE_TRACE = new FlightAssistantMode(402);
    public static final /* enum */ FlightAssistantMode HYPERLAPSE_CIRCLE = new FlightAssistantMode(403);
    public static final /* enum */ FlightAssistantMode HYPERLAPSE_ORIENTATION = new FlightAssistantMode(404);
    public static final /* enum */ FlightAssistantMode SMARTEYE = new FlightAssistantMode(500);
    public static final /* enum */ FlightAssistantMode SMARTEYE_SPOTLIGHT = new FlightAssistantMode(501);
    public static final /* enum */ FlightAssistantMode SMARTEYE_POI = new FlightAssistantMode(502);
    public static final /* enum */ FlightAssistantMode SMARTEYE_FOLLOW = new FlightAssistantMode(503);
    public static final /* enum */ FlightAssistantMode SMARTEYE_PARALLEL = new FlightAssistantMode(504);
    public static final /* enum */ FlightAssistantMode MASTERSHOT = new FlightAssistantMode(600);
    public static final /* enum */ FlightAssistantMode MASTERSHOT_NORMAL = new FlightAssistantMode(601);
    public static final /* enum */ FlightAssistantMode VIDEO_HS = new FlightAssistantMode(700);
    public static final /* enum */ FlightAssistantMode TELE_LENS = new FlightAssistantMode(800);
    public static final /* enum */ FlightAssistantMode UNKNOWN = new FlightAssistantMode(65535);
    private int value;
    private static final FlightAssistantMode[] allValues;
    private static final /* synthetic */ FlightAssistantMode[] $VALUES;

    public static FlightAssistantMode[] values() {
        return null;
    }

    public static FlightAssistantMode valueOf(String string) {
        return null;
    }

    private FlightAssistantMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightAssistantMode find(int n) {
        return null;
    }

    private static /* synthetic */ FlightAssistantMode[] $values() {
        return null;
    }

    static {
        $VALUES = FlightAssistantMode.$values();
        allValues = FlightAssistantMode.values();
    }
}

