package no.soprasteria.codeacademyapi;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public GroupedOpenApi helloApi(){
        return GroupedOpenApi.builder().group("hello").pathsToMatch("/api/v1/hello/**").build();
    }
    @Bean
    public GroupedOpenApi chatAPI(){
        return GroupedOpenApi.builder().group("mysecretchat").pathsToMatch("/chat/**").build();
    }

    @Bean
    public OpenAPI mySecretChat() {
        return new OpenAPI()
            .info(new Info().title("My Code Academy API")
                .description("With spring and swagger and kebab")
                .version("v0.0.1")
            );
    }
}
