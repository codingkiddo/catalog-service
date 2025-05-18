# Catalog Service



<b>This chapter covers </b>
<ul>
<li>Configuring Spring with properties and profiles</li>
<li>Applying external configuration with Spring Boot</li>
<li>Implementing a configuration server with Spring
Cloud Config Server</li>
<li>Configuring applications with Spring Cloud Config
Client</li>

</ul>


# 

./mvnw clean install java -jar build/libs/catalog-service-0.0.4-SNAPSHOT.jar
./mvnw test -Dtest=com.polarbookshop.catalogservice.domain.BookValidationTests


java -jar target/catalog-service-0.0.4-SNAPSHOT.jar --polar.greeting="Fuck You"
java -Dpolar.greeting="Fuck You JVM" -jar target/catalog-service-0.0.4-SNAPSHOT.jar 
java -Dpolar.greeting="Fuck You JVM" -jar target/catalog-service-0.0.4-SNAPSHOT.jar --polar.greeting="Fuck You"
POLAR_GREETING="Welcome to the catalog from ENV" java -jar target/catalog-service-0.0.4-SNAPSHOT.jar

java -Dspring.profiles.active=dev -jar target/catalog-service-0.0.4-SNAPSHOT.jar
java -Dspring.profiles.active=testdata -jar target/catalog-service-0.0.4-SNAPSHOT.jar



http POST :9001/books author="Lyra Silverstar" title="Northern Lights" isbn="1234567891" price=9.90
http GET :9001/books
http POST :9001/books author="Jon Snow" title="" isbn="123ABC456Z" price=9.90










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





http POST :9001/books author="Lyra Silverstar" title="Northern Lights" isbn="1234567891" price=9.90


http POST :9001/books author="Jon Snow" title="" isbn="123ABC456Z" price=9.90





