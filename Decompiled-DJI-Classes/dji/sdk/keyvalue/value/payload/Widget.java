/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.CustomizeRcButtonConfig;
import dji.sdk.keyvalue.value.payload.DetailSubItem;
import dji.sdk.keyvalue.value.payload.IconFileSet;
import dji.sdk.keyvalue.value.payload.WidgetType;
import java.util.List;
import org.json.JSONObject;

public class Widget
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WidgetType type;
    Integer index;
    Integer value;
    String name;
    String hintMsg;
    Integer iconLocation;
    IconFileSet iconFileSet;
    List<String> subItems;
    List<DetailSubItem> subItemDetails;
    CustomizeRcButtonConfig customRcButtonConfig;

    public Widget() {
    }

    public Widget(WidgetType widgetType, Integer n, Integer n2, String string, String string2, Integer n3, IconFileSet iconFileSet, List<String> list, List<DetailSubItem> list2, CustomizeRcButtonConfig customizeRcButtonConfig) {
    }

    public static Widget fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public WidgetType getType() {
        return null;
    }

    public void setType(WidgetType widgetType) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public String getHintMsg() {
        return null;
    }

    public void setHintMsg(String string) {
    }

    public Integer getIconLocation() {
        return null;
    }

    public void setIconLocation(Integer n) {
    }

    public IconFileSet getIconFileSet() {
        return null;
    }

    public void setIconFileSet(IconFileSet iconFileSet) {
    }

    public List<String> getSubItems() {
        return null;
    }

    public void setSubItems(List<String> list) {
    }

    public List<DetailSubItem> getSubItemDetails() {
        return null;
    }

    public void setSubItemDetails(List<DetailSubItem> list) {
    }

    public CustomizeRcButtonConfig getCustomRcButtonConfig() {
        return null;
    }

    public void setCustomRcButtonConfig(CustomizeRcButtonConfig customizeRcButtonConfig) {
    }

    public String toString() {
        return null;
    }
}

