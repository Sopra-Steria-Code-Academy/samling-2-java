# Spring
- Vis at endepunktet fungerer
- Lag et nytt POST endepunkt som lager en Book.
- `@RequestMapping(value = "/book/create", method = RequestMethod.PUT, produces = "application/json")
  public ResponseEntity<Book> createBook(@RequestBody Book book) {`
- Lag entiteten Book med lombok og en konstruktør
- `@Schema(example = "Eple")`
- Lag et endepunkt for å slette en bok
- `@RequestMapping(value = "/world/remove", method = RequestMethod.DELETE, produces = "text/plain")
  public ResponseEntity<String> deleteBooks(@RequestParam Integer bookId) {
  return ResponseEntity.ok("I have deleted the book with id " + bookId);
  }`
# Swagger
- Legg til dependencies
- Lag SwaggerConfiguration
- `@Configuration
  public class SwaggerConfiguration {`
- `@Bean
  public GroupedOpenApi helloApi(){
  return GroupedOpenApi.builder().group("hello").pathsToMatch("/hello/**").build();
  }`
- `@Bean
  public OpenAPI mySecretChat() {
  return new OpenAPI()
  .info(new Info().title("My secret chat API")
  .description("With spring and swagger and kebab")
  .version("v0.0.1")
  );
  }`

# OpenAPI
- Hva er openAPI? Hvorfor bruker man openAPI? Fordeler?
  - Kvalitet. 
  - Konsistent. 
  - Flytter definisjoner vekk fra java-koden
  - En kilde til sannhet
  - Kan også generere klient-kode(hopper bukk over det i dag)
- Forklar kort hva openAPI i praksis gjør.
- Legg til dependency i pom
- Lag openAPI fila
- `{
  "openapi": "3.0.3",
  "info": {
  "description": "CodeAcademy API",
  "version": "0.0.1",
  "title": "CodeAcademy API"
  },
  "servers": [
  {
  "url": "/",
  "description": "MyServer"
  }
  ],
  "paths": {

  },
  "components": {
  "schemas": {
  "ChatMessageDTO": {
  "type": "object",
  "properties": {
  "author": {
  "type": "string",
  "example": "Mozart"
  },
  "message": {
  "type": "string",
  "example": "Er dritings"
  },
  "messageTime": {
  "type": "string",
  "example": "2024-01-01T00:00:00Z"
  }
  },
  "required": [
  "author",
  "message",
  "messageTime"
  ]
  }
  }
  }
  }
  `
- ```json 
  {"/chat": {
  "description": "This is a top description for the entire enpoint chat...",
  "post": {
  "operationId": "writeChatMessage",
  "description": "Create a chat message for a chat",
  "summary": "Returns the created chat message",
  "tags": [
  "Chat"
  ],
  "x-magnus": true,
  "requestBody": {
  "required": true,
  "content": {
  "application/json": {
  "schema": {
  "$ref": "#/components/schemas/ChatMessageDTO"
  }
  }
  }
  },
  "responses": {
  "200": {
  "description": "OK",
  "content": {
  "application/json": {
  "schema": {
  "$ref": "#/components/schemas/ChatMessageDTO"
  }
  }
  }
  },
  "403": {
  "description": "Uautentisert. Du må bruke maskinporten din dust"
  },
  "500": {
  "description": "Doffen har daua"
  }
  }
  }} }```
- Link til der mustache defaults ligger: https://github.com/OpenAPITools/openapi-generator/tree/v7.3.0/modules/openapi-generator/src/main/resources

# Metrikker

- `public class Metrics {
  public static void init() throws IOException {
  JvmMetrics.builder().register();
  HTTPServer.builder()
  .port(25086)
  .buildAndStart();
  }
  }`
- `public static Gauge numberOfGets = Gauge.builder().name("numberOfGets").register();`
