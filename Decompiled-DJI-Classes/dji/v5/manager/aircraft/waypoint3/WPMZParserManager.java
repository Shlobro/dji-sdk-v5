/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dji.sdk.wpmz.value.mission.Wayline
 *  dji.sdk.wpmz.value.mission.WaylineWaylinesParseInfo
 */
package dji.v5.manager.aircraft.waypoint3;

import android.content.Context;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineWaylinesParseInfo;
import java.util.List;

public class WPMZParserManager {
    public static final String TEMPLATE_FILE = "template.kml";
    public static final String WAYLINE_FILE = "waylines.wpml";
    private static final String VERSION = "1.0.4";

    private WPMZParserManager() {
    }

    public static void unZipFolder(Context context, String string2, String string3, boolean bl) {
    }

    public static void zipFiles(Context context, List<String> list, String string2) throws Exception {
    }

    public static WaylineWaylinesParseInfo getCurrentKmzInfo() {
        return null;
    }

    public static List<Wayline> getWaylines(String string2) {
        return null;
    }
}

