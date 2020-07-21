package com.boss.demo.config;

/*import org.apache.catalina.connector.Connector; //内置tomcat时打开注释
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory; //内置tomcat时打开注释
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory; //内置jetty时打开注释
import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer; //内置jetty时打开注释
import org.eclipse.jetty.server.*;//内置jetty时打开注释*/
import io.undertow.Undertow;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.embedded.jetty.JettyServerCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "nossl")
public class HttpsSupportConfig {

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    //内置undertow配置--------START//

    /**
     * --内置undertow配置
     * 内置under https ssl支持
     *
     * @return
     */
    @Bean
    public UndertowServletWebServerFactory ServletWebServerFactory() {
        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
        factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
            @Override
            public void customize(Undertow.Builder builder) {
                builder.addHttpListener(port, "0.0.0.0");
            }
        });
        return factory;
    }
    //内置undertow配置 -----end
    //内置tomcat配置-----start

    /**
     * 内置tommcat配置
     * 内置tomcat https ssl支持
     *
     * @return
     */
    /*@Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.addAdditionalTomcatConnectors(createHttpConnector());
        return tomcat;
    }*/

    /**
     * 内置tomcat配置
     * 内置tomcat https ssl支持
     *
     * @return
     */
    //内置tomcat时打开以下配置
    /*
    private Connector createHttpConnector() {
        Connector connector = new Connector("org.apache.coyote.httpll.HttpllNioProtocol");
        connector.setScheme("http");
        connector.setPort(port);
        connector.setSecure(false);
        return connector;
    }*/

    //内置tomcat配置-----end
    //内置jetty配置------------------start

    /**
     * 内置jetty配置
     * 内置jetty https ssl支持
     *
     * @return
     */

    /*@Bean
    public EmbeddedServletContainnerFactory servletContainer() {
        JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory();
        factory.addServerCustomizers(new JettyServerCustomizer(){

            @Override
            public void customize(Server server) {
                //HTTP
                ServerConnector connector = new ServerConnector(server);
                connector.setPort(port);

                server.addConnector(connector);
            }
        });
        return factory;
    }*/

    //内置jetty配置------------------end
}
