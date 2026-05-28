/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.model;

import androidx.annotation.Keep;
import dji.component.flysafe.model.FlyfrbPolygonMainElement;
import dji.csdk.flysafe.LimitArea;
import dji.csdk.flysafe.UtmissLimitArea;

@Keep
public class FlyfrbAreaJniElement
extends FlyfrbPolygonMainElement {
    public int source;

    public static FlyfrbAreaJniElement convertFromProtobuf(LimitArea limitArea) {
        return null;
    }

    public static FlyfrbAreaJniElement convertFromProtobuf(UtmissLimitArea utmissLimitArea) {
        return null;
    }
}

