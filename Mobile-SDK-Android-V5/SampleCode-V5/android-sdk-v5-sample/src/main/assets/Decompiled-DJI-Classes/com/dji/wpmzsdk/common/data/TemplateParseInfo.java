/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.data;

import com.dji.wpmzsdk.common.data.Template;
import dji.sdk.wpmz.value.mission.WPMLParseErrorMsg;
import java.util.ArrayList;
import java.util.List;

public class TemplateParseInfo {
    WPMLParseErrorMsg error;
    List<Template> templates = new ArrayList<Template>();

    public TemplateParseInfo() {
    }

    public TemplateParseInfo(WPMLParseErrorMsg error, List<Template> templates) {
        if (error != null) {
            this.error = error;
        }
        if (templates != null) {
            this.templates = templates;
        }
    }

    public WPMLParseErrorMsg getError() {
        return this.error;
    }

    public void setError(WPMLParseErrorMsg error) {
        this.error = error;
    }

    public List<Template> getTemplates() {
        return this.templates;
    }

    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }
}

