package behavioural.visitor;

import behavioural.visitor.config.Configurator;
import behavioural.visitor.config.LinuxConfigurator;
import behavioural.visitor.config.MacConfigurator;
import behavioural.visitor.router.DLinkRouter;
import behavioural.visitor.router.LinkSysRouter;
import behavioural.visitor.router.Router;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class VisitorTest {
    private final Configurator macConfigurator = new MacConfigurator();
    private final Configurator linuxConfigurator = new LinuxConfigurator();
    private final Router dLink = new DLinkRouter();
    private final Router linkSys = new LinkSysRouter();

    @Test
    public void testDLink() {
        assertEquals("MAC, D_LINK", dLink.accept(macConfigurator));
        assertEquals("LINUX, D_LINK", dLink.accept(linuxConfigurator));
    }

    @Test
    public void testLinkSys() {
        assertEquals("MAC, LINK_SYS", linkSys.accept(macConfigurator));
        assertEquals("LINUX, LINK_SYS", linkSys.accept(linuxConfigurator));
    }
}
