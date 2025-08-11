package com.alura.ForumHub.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {

        @Bean
        public OpenAPI customOpenAPI() {
                return new OpenAPI()
                                .components(new Components()
                                                .addSecuritySchemes("bearer-key",
                                                                new SecurityScheme().type(SecurityScheme.Type.HTTP)
                                                                                .scheme("bearer")
                                                                                .bearerFormat("JWT")))
                                .info(new Info()
                                                .title("Fórum Hub API")
                                                .description("API Rest do Challenge Fórum Hub, com CRUD de usuários, "
                                                                +
                                                                "tópicos e de respostas.")
                                                .contact(new Contact()
                                                                .name("backend")
                                                                .email("backend@forum.com"))
                                                .license(new License()
                                                                .name("Apache 2.0")
                                                                .url("http://forum.hub/api/licenca")));
        }
}