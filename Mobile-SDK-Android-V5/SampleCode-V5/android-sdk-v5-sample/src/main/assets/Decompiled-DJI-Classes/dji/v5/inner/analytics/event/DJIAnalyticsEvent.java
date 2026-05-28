/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONObject
 */
package dji.v5.inner.analytics.event;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.KeepProguard;
import dji.v5.inner.analytics.event.eventd.Generic;
import dji.v5.inner.analytics.event.eventd.Product;
import dji.v5.inner.analytics.event.eventd.ProductLine;
import dji.v5.utils.common.LogUtils;
import java.util.Map;
import org.json.JSONObject;

public class DJIAnalyticsEvent
implements KeepProguard {
    public static final String TAG = LogUtils.getTag("DJIAnalyticsEvent");
    public static final String TABLE = "event";
    public static final String ID = "_id";
    public static final String EVENT_DATA = "event_data";
    private String eventCreatedTimestamp;
    private Generic generic;
    private ProductLine product_line;
    private Product product;
    private String flavor;
    private String reportid;
    private String type;
    private Map<String, Object> extra;

    public DJIAnalyticsEvent() {
    }

    private DJIAnalyticsEvent(EventBuilder eventBuilder) {
    }

    public String getEventCreatedTimestamp() {
        return null;
    }

    public Generic getGeneric() {
        return null;
    }

    public ProductLine getProduct_line() {
        return null;
    }

    public Product getProduct() {
        return null;
    }

    public String getFlavor() {
        return null;
    }

    public String getReportid() {
        return null;
    }

    public String getType() {
        return null;
    }

    public Map<String, Object> getExtra() {
        return null;
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    @NonNull
    public String toString() {
        return null;
    }

    /* synthetic */ DJIAnalyticsEvent(EventBuilder eventBuilder, 1 var2_2) {
    }

    public static class EventBuilder {
        private String eventCreatedTimestamp;
        private Generic generic;
        private ProductLine product_line;
        private Product product;
        private String flavor;
        private String reportid;
        private String type;
        private Map<String, Object> extra;

        public EventBuilder generic(Generic generic) {
            return null;
        }

        public EventBuilder productLine(ProductLine productLine) {
            return null;
        }

        public EventBuilder product(Product product) {
            return null;
        }

        public EventBuilder flavor(String string) {
            return null;
        }

        public EventBuilder reportid(String string) {
            return null;
        }

        public EventBuilder type(String string) {
            return null;
        }

        public EventBuilder extra(Map<String, Object> map) {
            return null;
        }

        public EventBuilder extra(JSONObject jSONObject) {
            return null;
        }

        public DJIAnalyticsEvent build() {
            return null;
        }

        static /* synthetic */ String access$000(EventBuilder eventBuilder) {
            return null;
        }

        static /* synthetic */ Generic access$100(EventBuilder eventBuilder) {
            return null;
        }

        static /* synthetic */ ProductLine access$200(EventBuilder eventBuilder) {
            return null;
        }

        static /* synthetic */ Product access$300(EventBuilder eventBuilder) {
            return null;
        }

        static /* synthetic */ String access$400(EventBuilder eventBuilder) {
            return null;
        }

        static /* synthetic */ String access$500(EventBuilder eventBuilder) {
            return null;
        }

        static /* synthetic */ String access$600(EventBuilder eventBuilder) {
            return null;
        }

        static /* synthetic */ Map access$700(EventBuilder eventBuilder) {
            return null;
        }
    }
}

