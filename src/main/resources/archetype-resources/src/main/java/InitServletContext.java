#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

// 为当前WEB应用程序初始化
public class InitServletContext implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String logName = servletContext.getInitParameter("${artifactId}");
        System.setProperty("${artifactId}", logName);
        final Logger logger = Logger.getLogger(getClass());
        logger.info("Initialize " + logName + "for log4j.");
    }
}
