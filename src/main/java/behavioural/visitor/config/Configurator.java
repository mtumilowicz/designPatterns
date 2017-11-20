package behavioural.visitor.config;

import behavioural.visitor.RouterVisitor;
import behavioural.visitor.router.DLinkRouter;
import behavioural.visitor.router.LinkSysRouter;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class Configurator implements RouterVisitor {
    
    private final ConfigurationType type;

    Configurator(ConfigurationType type) {
        this.type = type;
    }

    @Override
    public String visit(DLinkRouter router) {
        return type + ", " + router.getType();
    }

    @Override
    public String visit(LinkSysRouter router) {
        return type + ", " + router.getType();
    }
}
