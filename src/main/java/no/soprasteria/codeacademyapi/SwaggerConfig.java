package no.soprasteria.codeacademyapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi helloApi(){
        return GroupedOpenApi.builder().group("helloworld").pathsToMatch("/v1/hello/**").build();
    }

    @Bean
    public OpenAPI hello() {
        return new OpenAPI()
                .info(new Info().title("My secret chat API")
                        .description("With spring and swagger and kebab")
                        .version("v0.0.1")
                );
    }

}
