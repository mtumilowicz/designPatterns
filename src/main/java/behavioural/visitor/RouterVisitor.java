package behavioural.visitor;

import behavioural.visitor.router.DLinkRouter;
import behavioural.visitor.router.LinkSysRouter;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public interface RouterVisitor {
    String visit(DLinkRouter router);
    String visit(LinkSysRouter router);
}
