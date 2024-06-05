package no.soprasteria.codeacademyapi;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder().group("code").pathsToMatch("/hello/**","/chat/**").build();
    }

    @Bean
    public OpenAPI mySecretChat() {
        return new OpenAPI()
            .info(new Info().title("My secret chat API")
                .description("With spring and swagger")
                .version("v0.0.1")
            );
    }
}
