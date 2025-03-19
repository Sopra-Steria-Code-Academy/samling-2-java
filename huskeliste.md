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
- Swagger: http://localhost:8080/swagger-ui/index.html
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
