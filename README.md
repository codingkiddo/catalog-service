# Catalog Service



## Links

Coyote tomcat
https://www.google.com/search?q=Coyote+tomcat&sca_esv=f0954a09cd36ddc6&sxsrf=ADLYWILm0Ixmu0zxYH_15MvWYcIse4pg-w%3A1737257231057&ei=D3GMZ9-NA7yNseMP_5_20Q8&ved=0ahUKEwif0Y_B64CLAxW8RmwGHf-PPfoQ4dUDCBA&uact=5&oq=Coyote+tomcat&gs_lp=Egxnd3Mtd2l6LXNlcnAiDUNveW90ZSB0b21jYXQyBRAAGIAEMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIJEAAYFhjHAxgeSK8TUD9Yww9wAXgBkAEAmAF8oAGNBaoBAzYuMbgBA8gBAPgBAZgCCKACqQXCAgcQIxiwAxgnwgIKEAAYsAMY1gQYR8ICDRAAGIAEGLADGEMYigXCAg4QABiwAxjkAhjWBNgBAcICExAuGIAEGLADGEMYyAMYigXYAQHCAgQQIxgnwgIKEAAYgAQYQxiKBcICEBAAGIAEGLEDGEMYgwEYigXCAg0QLhiABBixAxhDGIoFwgINEAAYgAQYsQMYQxiKBcICBRAuGIAEwgILEAAYgAQYkQIYigXCAgsQLhiABBiRAhiKBcICFBAuGIAEGJcFGNwEGN4EGN8E2AEBwgIKEC4YgAQYFBiHAsICChAAGIAEGBQYhwKYAwCIBgGQBhO6BgYIARABGAmSBwM2LjKgB7FU&sclient=gws-wiz-serp


source code analysis tools / Source code vulnerability scanning

https://www.google.com/search?q=Source+code+vulnerability+scanning&oq=Source+code+vulnerability+scanning&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIKCAEQABgKGBYYHjIICAIQABgWGB4yCAgDEAAYFhgeMggIBBAAGBYYHjIICAUQABgWGB4yCAgGEAAYFhgeMg0IBxAAGIYDGIAEGIoFMg0ICBAAGIYDGIAEGIoFMg0ICRAAGIYDGIAEGIoF0gEHNDQ5ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8


https://www.youtube.com/results?search_query=Source+code+vulnerability+scanning
https://github.com/snoopysecurity/Vulnerable-Code-Snippets


https://github.com/snoopysecurity/Vulnerable-Code-Snippets/tree/07669239ed45467b3c169b9747b3ccdc229632ca



code analysis tools

https://www.google.com/search?q=code+analysis+tools+&sca_esv=774f3e418b721159&sxsrf=ADLYWIIpq76jsZA2SBNsz5oPBo1cd8f7uw%3A1737300769867&ei=IRuNZ-DUNPOfseMPh8St4Q0&ved=0ahUKEwig6YXajYKLAxXzT2wGHQdiK9wQ4dUDCBA&uact=5&oq=code+analysis+tools+&gs_lp=Egxnd3Mtd2l6LXNlcnAiFGNvZGUgYW5hbHlzaXMgdG9vbHMgMgoQABiABBgUGIcCMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDILEAAYgAQYhgMYigUyCxAAGIAEGIYDGIoFSNo8UCtYkDVwBHgBkAEAmAGqA6AB1geqAQkwLjIuMS4wLjG4AQPIAQD4AQGYAgigAu4HwgIKEAAYsAMY1gQYR8ICDRAAGIAEGLADGEMYigXCAgsQABiABBiRAhiKBcICBhAAGBYYHpgDAIgGAZAGCpIHCTQuMi4xLjAuMaAHqBk&sclient=gws-wiz-serp


tekton CI/CD

https://www.google.com/search?q=tekton&oq=tekton&gs_lcrp=EgZjaHJvbWUyDggAEEUYORhDGIAEGIoFMgwIARAAGEMYgAQYigUyDAgCEAAYQxiABBiKBTIMCAMQABhDGIAEGIoFMgwIBBAAGEMYgAQYigUyDAgFEAAYQxiABBiKBTIHCAYQABiABDINCAcQLhjHARjRAxiABDIHCAgQABiABDIHCAkQABiABNIBCDI5MTVqMGo5qAIAsAIB&sourceid=chrome&ie=UTF-8

## Useful Commands

./mvnw clean install
java -jar build/libs/catalog-service-0.0.1-SNAPSHOT.jar

./mvnw test -Dtest=com.polarbookshop.catalogservice.domain.BookValidationTests



http POST :9001/books author="Lyra Silverstar" title="Northern Lights" isbn="1234567891" price=9.90


http POST :9001/books author="Jon Snow" title="" isbn="123ABC456Z" price=9.90







This application is part of the Polar Bookshop system and provides the functionality for managing
the books in the bookshop catalog. It's part of the project built in the
[Cloud Native Spring in Action](https://www.manning.com/books/cloud-native-spring-in-action) book
by [Thomas Vitale](https://www.thomasvitale.com).

## Useful Commands

| Gradle Command	         | Description                                   |
|:---------------------------|:----------------------------------------------|
| `./gradlew bootRun`        | Run the application.                          |
| `./gradlew build`          | Build the application.                        |
| `./gradlew test`           | Run tests.                                    |
| `./gradlew bootJar`        | Package the application as a JAR.             |
| `./gradlew bootBuildImage` | Package the application as a container image. |

After building the application, you can also run it from the Java CLI:

```bash
java -jar build/libs/catalog-service-0.0.1-SNAPSHOT.jar
```

## Container tasks

Run Catalog Service as a container

```bash
docker run --rm --name catalog-service -p 8080:8080 catalog-service:0.0.1-SNAPSHOT
```

### Container Commands

| Docker Command	              | Description       |
|:-------------------------------:|:-----------------:|
| `docker stop catalog-service`   | Stop container.   |
| `docker start catalog-service`  | Start container.  |
| `docker remove catalog-service` | Remove container. |

## Kubernetes tasks

### Create Deployment for application container

```bash
kubectl create deployment catalog-service --image=catalog-service:0.0.1-SNAPSHOT
```

### Create Service for application Deployment

```bash
kubectl expose deployment catalog-service --name=catalog-service --port=8080
```

### Port forwarding from localhost to Kubernetes cluster

```bash
kubectl port-forward service/catalog-service 8000:8080
```

### Delete Deployment for application container

```bash
kubectl delete deployment catalog-service
```

### Delete Service for application container

```bash
kubectl delete service catalog-service
```
