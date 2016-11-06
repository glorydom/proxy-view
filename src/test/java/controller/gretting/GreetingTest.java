package controller.gretting;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by huihui.b.zhang on 11/5/2016.
 */
public class GreetingTest extends TestCase {
    public void testHandleRequestView() throws Exception{
        Greeting controller = new Greeting();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("pages/hello.jsp", modelAndView.getViewName());
    }
}
