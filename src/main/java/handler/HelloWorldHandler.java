package handler;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldHandler extends AbstractHandler {
    @Override
    public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        // Declare response encoding and types
        httpServletResponse.setContentType("text/html; charset=utf-8");

        // Declare response status code
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);

        // Write back response
        httpServletResponse.getWriter().println("<h1>Hello World</h1>");

        // Inform jetty that this request has now been handled
        request.setHandled(true);
    }
}
