package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * example application
 *
 * @author super
 * @create 2018-01-21 1:08
 **/
@SpringBootApplication
public class ExampleApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    protected ServletContextListener listener() {
        return new ServletContextListener() {

            public void contextInitialized(ServletContextEvent servletContextEvent) {
                logger.info("ServletContext initialized");
            }

            public void contextDestroyed(ServletContextEvent servletContextEvent) {
                logger.info("ServletContext destroyed");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

}
