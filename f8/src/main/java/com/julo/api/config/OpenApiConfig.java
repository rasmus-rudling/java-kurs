package com.julo.api.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.apache.catalina.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAP() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product Management API")
                        .version("3.0")
                        .description("API for managing products in an e-commerce system")
                        .termsOfService("http://example.com/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        .contact(new Contact()
                                .name("AP Support")
                                .url("http://example.com/support")
                                .email("support@example.com"))
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Product Management Wiki Documentation")
                        .url("https://example.com/docs"));
//                .servers(List.of(
//                        new Server().url("http://localhost:8080").description("Development server"),
//                        new Server().url("https://api.example.com").description("Production server")
//                ));
    }
}