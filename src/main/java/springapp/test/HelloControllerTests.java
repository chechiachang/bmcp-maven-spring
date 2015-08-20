/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.test;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;
import springapp.web.HelloController;

/**
 *
 * @author davidchang
 */
public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}
