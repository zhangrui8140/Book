import handler.HelloWorldHandler;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

import org.eclipse.jetty.servlet.ServletHandler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import servlet.HelloServlet;

public class ExampleServer {
    public static void main( String[] args ) throws Exception
    {
        Server server = new Server();

        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8000);
        server.setConnectors(new Connector[] { connector });

        /*ServletHandler handler = new ServletHandler();
        server.setHandler(handler);

        handler.addServletWithMapping(DispatcherServlet.class, "/*");

        server.start();
        server.join();*/

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        WebApplicationContext webApplicationContext=new
        DispatcherServlet dispatcherServlet=new DispatcherServlet();
        dispatcherServlet
        context.addServlet(DefaultServlet.class, "/hello");
        //context.addServlet(AsyncEchoServlet.class, "/echo/*");

        HandlerCollection handlers = new HandlerCollection();
        handlers.setHandlers(new Handler[] { context, new DefaultHandler() });
        server.setHandler(handlers);
        server.setHandler(new HelloWorldHandler());

        server.start();
        server.join();
    }
}
