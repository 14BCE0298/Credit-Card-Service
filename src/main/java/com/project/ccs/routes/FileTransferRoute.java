package com.project.ccs.routes;

import org.apache.camel.builder.RouteBuilder;

public class FileTransferRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("file:/home/vishal/Documents/projects/Credit-Card-Service/src/main/resources?noop=true")
                .to("file:/home/vishal/Documents/projects/Credit-Card-Service/src/main/resources/out");
    }
}
