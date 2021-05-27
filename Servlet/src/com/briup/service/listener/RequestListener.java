package com.briup.service.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        //System.out.println("requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        /*System.out.println("requestInitialized");
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        servletRequest.setAttribute("name", "request");*/
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //System.out.println("request attributeAdded : " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //System.out.println("request attributeRemoved : " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //System.out.println("request attributeRemoved : " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue());
    }
}
