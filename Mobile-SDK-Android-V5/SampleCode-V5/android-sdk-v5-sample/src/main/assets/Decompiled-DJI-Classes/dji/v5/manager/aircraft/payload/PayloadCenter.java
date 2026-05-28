/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.payload;

import dji.v5.inner.aircraft.payload.manager.OnboardManager;
import dji.v5.inner.aircraft.payload.manager.PayloadBaseManager;
import dji.v5.manager.aircraft.aibox.IntelligentBoxManager;
import dji.v5.manager.aircraft.payload.PayloadIndexType;
import dji.v5.manager.interfaces.IIntelligentBoxManager;
import dji.v5.manager.interfaces.IPayloadCenter;
import dji.v5.manager.interfaces.IPayloadManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class PayloadCenter
implements IPayloadCenter {
    private final AtomicBoolean isInit;
    private static final HashMap<PayloadIndexType, IPayloadManager> PAYLOAD_MANAGER_HASH_MAP = new HashMap();
    private static final HashMap<PayloadIndexType, IIntelligentBoxManager> INTELLIGENT_BOX_MANAGER_MAP = new HashMap();

    public static IPayloadCenter getInstance() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public Map<PayloadIndexType, IPayloadManager> getPayloadManager() {
        return null;
    }

    @Override
    public Map<PayloadIndexType, IIntelligentBoxManager> getIntelligentBoxManager() {
        return null;
    }

    private PayloadCenter() {
    }

    /* synthetic */ PayloadCenter(1 var1_1) {
    }

    static {
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.LEFT_OR_MAIN, new PayloadBaseManager(PayloadIndexType.LEFT_OR_MAIN.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.RIGHT, new PayloadBaseManager(PayloadIndexType.RIGHT.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.UP, new PayloadBaseManager(PayloadIndexType.UP.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.EXTERNAL, new OnboardManager(PayloadIndexType.EXTERNAL.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.PORT_1, new PayloadBaseManager(PayloadIndexType.PORT_1.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.PORT_2, new PayloadBaseManager(PayloadIndexType.PORT_2.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.PORT_3, new PayloadBaseManager(PayloadIndexType.PORT_3.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.PORT_4, new PayloadBaseManager(PayloadIndexType.PORT_4.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.PORT_5, new PayloadBaseManager(PayloadIndexType.PORT_5.value()));
        PAYLOAD_MANAGER_HASH_MAP.put(PayloadIndexType.PORT_6, new PayloadBaseManager(PayloadIndexType.PORT_6.value()));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.LEFT_OR_MAIN, new IntelligentBoxManager(PayloadIndexType.LEFT_OR_MAIN));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.RIGHT, new IntelligentBoxManager(PayloadIndexType.RIGHT));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.UP, new IntelligentBoxManager(PayloadIndexType.UP));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.EXTERNAL, new IntelligentBoxManager(PayloadIndexType.EXTERNAL));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.PORT_1, new IntelligentBoxManager(PayloadIndexType.PORT_1));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.PORT_2, new IntelligentBoxManager(PayloadIndexType.PORT_2));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.PORT_3, new IntelligentBoxManager(PayloadIndexType.PORT_3));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.PORT_4, new IntelligentBoxManager(PayloadIndexType.PORT_4));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.PORT_5, new IntelligentBoxManager(PayloadIndexType.PORT_5));
        INTELLIGENT_BOX_MANAGER_MAP.put(PayloadIndexType.PORT_6, new IntelligentBoxManager(PayloadIndexType.PORT_6));
    }

    private static class LazyHolder {
        private static final PayloadCenter INSTANCE = new PayloadCenter(null);

        private LazyHolder() {
        }

        static /* synthetic */ PayloadCenter access$000() {
            return null;
        }
    }
}

