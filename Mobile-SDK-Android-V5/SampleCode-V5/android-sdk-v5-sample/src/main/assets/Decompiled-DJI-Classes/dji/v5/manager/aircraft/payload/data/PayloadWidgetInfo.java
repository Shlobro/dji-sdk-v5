/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.aircraft.payload.data;

import androidx.annotation.Nullable;
import dji.v5.manager.aircraft.payload.widget.FloatingWindowWidget;
import dji.v5.manager.aircraft.payload.widget.PayloadWidget;
import dji.v5.manager.aircraft.payload.widget.SpeakerWidget;
import dji.v5.manager.aircraft.payload.widget.TextInputBoxWidget;
import java.util.List;

public class PayloadWidgetInfo {
    @Nullable
    private List<PayloadWidget> mainInterfaceWidgetList;
    @Nullable
    private List<PayloadWidget> configInterfaceWidgetList;
    @Nullable
    private TextInputBoxWidget textInputBoxWidget;
    @Nullable
    private FloatingWindowWidget floatingWindowWidget;
    @Nullable
    private SpeakerWidget speakerWidget;

    public List<PayloadWidget> getMainInterfaceWidgetList() {
        return null;
    }

    public TextInputBoxWidget getTextInputBoxWidget() {
        return null;
    }

    public FloatingWindowWidget getFloatingWindowWidget() {
        return null;
    }

    public SpeakerWidget getSpeakerWidget() {
        return null;
    }

    public List<PayloadWidget> getConfigInterfaceWidgetList() {
        return null;
    }

    public String toString() {
        return null;
    }
}

