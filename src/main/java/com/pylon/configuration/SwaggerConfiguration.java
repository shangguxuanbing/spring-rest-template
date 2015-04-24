package com.pylon.configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by simon on 4/22/15.
 */
@Configuration
@EnableSwagger
public class SwaggerConfiguration {

    private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin customImplementation() {

        final String[] visibleApis = { "/books.*", "/metric.*", "/sample.*" };

        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(
                apiInfo()).includePatterns(visibleApis);
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Vault Backend Platform API", "API for Vault",
                "Vault Backend Platform API", "vault-seoul-dev@7even.com",
                "Vault Backend Platform API", "Vault Backend Platform API License URL");
        return apiInfo;
    }

}
