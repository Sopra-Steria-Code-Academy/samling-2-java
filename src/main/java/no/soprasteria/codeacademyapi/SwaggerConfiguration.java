package no.soprasteria.codeacademyapi;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//URL: http://localhost:8080/swagger-ui/index.html
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
                .version("v0.0.1").termsOfService("https://mysuperimportanttermsofservice.ai")
                .license(new License().name("Super Important NO license").url("theurl.com"))
                .contact(new Contact().name("Magnus Kongshem").email("magnus.kongshem@soprasteria.com"))
            );
    }
}
