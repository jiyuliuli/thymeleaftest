package com.example.demo;

import ch.qos.logback.core.net.server.ServerSocketListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.websocket.server.ServerEndpoint;

@Configuration
public class WebsocketConfig {
@Bean
    public ServerEndpointExporter endpointExporter () {
    return new ServerEndpointExporter();
}


}
