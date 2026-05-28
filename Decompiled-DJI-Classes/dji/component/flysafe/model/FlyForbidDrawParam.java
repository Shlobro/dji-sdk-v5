/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.model;

import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import dji.component.flysafe.FlyForbidBasePainter;
import dji.component.flysafe.FlyForbidProtocol;
import dji.component.flysafe.model.FlyForbidElement;
import dji.component.flysafe.model.FlyfrbPolygonItem;
import java.util.List;

public class FlyForbidDrawParam {
    private long mMainAreaID;
    private long mAreaID;
    private DJILatLng mCenterPoint;
    private int mRadius;
    private int mSearchRadius;
    private FlyForbidProtocol.LevelType mLevel;
    private int mHeight;
    private int mType;
    private Object mAreaMapObject;
    private FlyForbidBasePainter.DrawShape mDrawShapeType;
    private boolean isUnlocked;
    private boolean isSpecialUnlock;
    private long mStartAt;
    private long mEndAt;
    private String mPoints;
    private List<DJILatLng> mConvertedPoints;

    public static FlyForbidDrawParam copyFromFlyForbidElement(FlyForbidElement flyForbidElement) {
        return null;
    }

    public static FlyForbidDrawParam copyFromFlyfrbPolygonItem(FlyfrbPolygonItem flyfrbPolygonItem, long l2, int n, int n2, boolean bl, long l3, long l4) {
        return null;
    }

    public static FlyForbidDrawParam copyFromFlyfrbCircleSpecialUnlock(DJILatLng dJILatLng, double d2) {
        return null;
    }

    public static FlyForbidDrawParam copyFromFlyfrbPolygonSpecialUnlock(List<DJILatLng> list) {
        return null;
    }

    public DJILatLng getCenterPoint() {
        return null;
    }

    public int getRadius() {
        return 0;
    }

    public int getSearchRadius() {
        return 0;
    }

    public FlyForbidProtocol.LevelType getLevel() {
        return null;
    }

    public int getHeight() {
        return 0;
    }

    public int getType() {
        return 0;
    }

    public Object getAreaMapObject() {
        return null;
    }

    public void setAreaMapObject(Object object) {
    }

    public FlyForbidBasePainter.DrawShape getDrawShapeType() {
        return null;
    }

    public boolean isUnlocked() {
        return false;
    }

    public long getStartAt() {
        return 0L;
    }

    public long getEndAt() {
        return 0L;
    }

    public String getPoints() {
        return null;
    }

    public List<DJILatLng> getConvertedPoints() {
        return null;
    }

    public long getAreaID() {
        return 0L;
    }

    public long getMainAreaID() {
        return 0L;
    }
}

