package com.cloudfx.cloudselect.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MainController {

	@Value("${app.name}")
	private String appName;

	@Value("${app.version}")
	private String version;


	@GetMapping(value = "/api/test")
	public String getAppName() {
		return appName + " - " + version;
	}

}
