## Catalog Microservice

### Getting Started

run:

```bash
$ mvn -pl catalog-service-application spring-boot:run -Dspring-boot.run.profiles=development
```

REST API:

```bash
http://localhost:8090/catalog/studio/<id> - Get studio by id
```