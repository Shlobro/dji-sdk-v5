/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.datalink.usb;

public final class ProductUsbInfo {
    private String mManufacturer;
    private String mModel;
    public static final ProductUsbInfo HG210 = new ProductUsbInfo("DJI", "HG210");
    public static final ProductUsbInfo HG211 = new ProductUsbInfo("DJI", "HG211");
    public static final ProductUsbInfo OSMO = new ProductUsbInfo("DJI", "T600");
    public static final ProductUsbInfo Aircraft = new ProductUsbInfo("DJI", "T600");
    public static final ProductUsbInfo WM160 = new ProductUsbInfo("DJI", "WM160");
    public static final ProductUsbInfo WM231 = new ProductUsbInfo("DJI", "com.dji.logiclink");
    public static final ProductUsbInfo WM170 = new ProductUsbInfo("DJI", "com.dji.logiclink");
    public static final ProductUsbInfo LinkDevice = new ProductUsbInfo("DJI", "com.dji.link");

    private ProductUsbInfo(String string, String string2) {
    }

    public String getManufacturer() {
        return null;
    }

    public String getModel() {
        return null;
    }
}

