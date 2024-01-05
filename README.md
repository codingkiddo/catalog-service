# catalog-service


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


https://www.baeldung.com/spring-retry
docker login ghcr.io --username codingkiddo



docker run --name polar-postgres -e POSTGRES_PASSWORD=welcome123 -e POSTGRES_DB=polardb_catalog -p 5432:5432 postgres:14.4


docker run --name polar-postgres --net catalog-network -e POSTGRES_PASSWORD=welcome123 -e POSTGRES_DB=polardb_catalog -p 5432:5432 postgres:14.4


docker build -t config-service .

docker run -d --name config-service --net catalog-network -p 8888:8888 config-service
docker run -d --name config-service --platform linux/amd64 --net catalog-network -p 8888:8888 config-service


docker tag 8c5f8eaffff2 ghcr.io/codingkiddo/config-service:latest
docker push ghcr.io/codingkiddo/config-service:latest
 
 
------------------------------- 
 
docker build -t catalog-service .


docker tag 108fcbe8bb19 ghcr.io/codingkiddo/catalog-service:latest
docker push ghcr.io/codingkiddo/catalog-service:latest


docker run -d --name catalog-service \
--net catalog-network --platform linux/amd64 \
-p 9002:9002 \
-e SPRING_CLOUD_CONFIG_URI=http://config-service:8888 \
-e SPRING_DATASOURCE_USERNAME=postgres \
-e SPRING_DATASOURCE_PASSWORD=welcome123 \
-e SPRING_DATASOURCE_URL=jdbc:postgresql://polar-postgres:5432/polardb_catalog \
-e SPRING_PROFILES_ACTIVE=testdata \
catalog-service

docker rm -f config-service catalog-service polar-postgres