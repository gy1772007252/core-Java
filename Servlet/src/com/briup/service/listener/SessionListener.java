package com.briup.service.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

@WebListener
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        /*HttpSession session = httpSessionEvent.getSession();
        session.setAttribute("name", "session");
        System.out.println("sessionCreated");*/
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        //System.out.println("sessionDestroyed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        //System.out.println("session attributeAdded : " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        //System.out.println("session attributeRemoved : " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        //System.out.println("session attributeReplaced : " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue());
    }
}
