/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.Nullable
 */
package com.dji.flysafe.mapkit.core.core.maps;

import android.view.View;
import androidx.annotation.Nullable;
import com.dji.flysafe.mapkit.core.core.callback.MapScreenShotListener;
import com.dji.flysafe.mapkit.core.core.callback.OnCameraChangeFinishListener;
import com.dji.flysafe.mapkit.core.core.callback.OnCameraChangeListener;
import com.dji.flysafe.mapkit.core.core.camera.DJICameraUpdate;
import com.dji.flysafe.mapkit.core.core.maps.DJIInfoWindow;
import com.dji.flysafe.mapkit.core.core.maps.DJIProjection;
import com.dji.flysafe.mapkit.core.core.maps.DJIUiSettings;
import com.dji.flysafe.mapkit.core.core.models.DJICameraPosition;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJICircle;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJICircleOptions;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIMarker;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIMarkerOptions;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIPolygon;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIPolygonOptions;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIPolyline;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIPolylineOptions;

public interface DJIMap {
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_NIGHT = 3;
    public static final int MAP_TYPE_HYBRID = 4;

    public DJIMarker addMarker(DJIMarkerOptions var1);

    public Object getMap();

    public void animateCamera(DJICameraUpdate var1);

    public void addOnCameraChangeListener(OnCameraChangeListener var1);

    public void removeAllOnCameraChangeListeners();

    public void addOnCameraChangeFinishListener(OnCameraChangeFinishListener var1);

    public void removeAllOnCameraChangeFinishListeners();

    public void setCameraPosition(DJICameraPosition var1);

    public DJICameraPosition getCameraPosition();

    public void moveCamera(DJICameraUpdate var1);

    public void setInfoWindowAdapter(InfoWindowAdapter var1);

    public void setMapType(MapType var1);

    public void setMapType(int var1);

    public DJIPolyline addPolyline(DJIPolylineOptions var1);

    public DJIPolygon addPolygon(DJIPolygonOptions var1);

    public DJICircle addSingleCircle(DJICircleOptions var1);

    public DJIUiSettings getUiSettings();

    public void removeOnCameraChangeListener(OnCameraChangeListener var1);

    public void removeOnMarkerClickListener(OnMarkerClickListener var1);

    public void removeAllOnMarkerClickListener();

    public void setOnInfoWindowClickListener(OnInfoWindowClickListener var1);

    public void setOnMarkerClickListener(OnMarkerClickListener var1);

    public void setOnMapClickListener(OnMapClickListener var1);

    public void removeOnMapClickListener(OnMapClickListener var1);

    public void setOnMapLongClickListener(OnMapLongClickListener var1);

    public void removeAllOnMapClickListener();

    public void removeOnMapLongClickListener(OnMapLongClickListener var1);

    public void removeAllOnMapLongClickListener();

    public void setOnMarkerDragListener(OnMarkerDragListener var1);

    public void removeOnMarkerDragListener(OnMarkerDragListener var1);

    public void removeAllOnMarkerDragListener();

    public void snapshot(MapScreenShotListener var1);

    public DJIProjection getProjection();

    public void clear();

    public static interface OnMarkerDragListener {
        public void onMarkerDragStart(DJIMarker var1);

        public void onMarkerDrag(DJIMarker var1);

        public void onMarkerDragEnd(DJIMarker var1);
    }

    public static interface OnMapLongClickListener {
        public void onMapLongClick(DJILatLng var1);
    }

    public static interface OnInfoWindowClickListener {
        public void onInfoWindowClick(DJIMarker var1);
    }

    public static interface OnMapClickListener {
        public void onMapClick(DJILatLng var1);
    }

    public static interface OnMarkerClickListener {
        public boolean onMarkerClick(DJIMarker var1);
    }

    public static interface InfoWindowAdapter {
        @Nullable
        public DJIInfoWindow getInfoWindow(DJIMarker var1);

        @Nullable
        public View getInfoContents(DJIMarker var1);
    }

    public static final class MapType
    extends Enum<MapType> {
        public static final /* enum */ MapType Normal = new MapType(1);
        public static final /* enum */ MapType Satellite = new MapType(2);
        public static final /* enum */ MapType Night = new MapType(3);
        public static final /* enum */ MapType Hybrid = new MapType(4);
        int value;
        private static final /* synthetic */ MapType[] $VALUES;

        public static MapType[] values() {
            return null;
        }

        public static MapType valueOf(String string) {
            return null;
        }

        private MapType(int n2) {
        }

        public int getValue() {
            return 0;
        }

        private static /* synthetic */ MapType[] $values() {
            return null;
        }

        static {
            $VALUES = MapType.$values();
        }
    }
}

