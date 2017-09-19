package com.greenfoarfece.ms.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

	@Bean
	public UiConfiguration uiConfig() {
		// @formatter:off
		return new UiConfiguration(
			"validatorUrl",
			"list",
			"alpha",
			"schema",
			UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
			false,
			true,
			60000L
		);
	}

}
