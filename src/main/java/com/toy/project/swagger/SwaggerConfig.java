package com.toy.project.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

//	private static final String BEARER_TOKEN_PREFIX = "Bearer";

	@Bean
	public OpenAPI openAPI() {
//		 시큐리티 와 연계
//		String securityJwtName = "JWT";
//				SecurityRequirement securityRequirement = new SecurityRequirement().addList(securityJwtName);
//				Components components = new Components()
//						.addSecuritySchemes(securityJwtName, new SecurityScheme()
//								.name(securityJwtName)
//								.type(SecurityScheme.Type.HTTP)
//								.scheme(BEARER_TOKEN_PREFIX)
//								.bearerFormat(securityJwtName));
//


		return new OpenAPI()
				.info(new Info().title("주니어 신사 API").version("1.0").description("토이프로젝트 BE API 화면입니다."));
//				.addSecurityItem(securityRequirement)
//				.components(components);
	}
}
