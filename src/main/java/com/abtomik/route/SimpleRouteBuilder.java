package com.abtomik.route;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:/tmp/inputFolder").split().tokenize("\n").to("jms:topic:dexter");
		
	}

}
