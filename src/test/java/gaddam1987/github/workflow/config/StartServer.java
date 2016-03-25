package gaddam1987.github.workflow.config;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by svn_admin on 25/03/2016.
 */
public class StartServer {
    private static Logger logger = LoggerFactory.getLogger(StartServer.class);

    public static void main(String[] args) throws Exception {
        int port = 9090;
        logger.info("Starting test server on port {}", port);
        String webappDirLocation = "src/main/webapp/";
        Server server = new Server(port);
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/workflow");
        webAppContext.setDescriptor("src/main/webapp/WEB-INF/web.xml");
        webAppContext.setResourceBase(webappDirLocation);
        webAppContext.setParentLoaderPriority(true);
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
