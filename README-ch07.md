docker push ghcr.io/codingkiddo/catalog-service:0.0.7-SNAPSHOT


docker rm -fv polar-postgres

docker build --build-arg JAR_FILE=target/catalog-service-0.0.7-SNAPSHOT.jar -t catalog-service .


docker run -d \
--name polar-postgres \
--net catalog-network \
-e POSTGRES_USER=user \
-e POSTGRES_PASSWORD=password \
-e POSTGRES_DB=polardb_catalog \
-p 5432:5432 \
postgres:14.4


docker run -d \
--name catalog-service \
--net catalog-network \
-p 9001:9001 \
-e SPRING_DATASOURCE_URL=jdbc:postgresql://polar-postgres:5432/polardb_catalog \
-e SPRING_PROFILES_ACTIVE=testdata \
catalog-service

docker run -d \
--name catalog-service \
--net catalog-network \
-p 9001:9001 \
-e SPRING_DATASOURCE_URL=jdbc:postgresql://polar-postgres:5432/polardb_catalog \
-e SPRING_PROFILES_ACTIVE=testdata \
catalog-service


https://dev.to/asizikov/using-github-container-registry-with-kubernetes-38fb

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



echo -n "username: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" | base64


{
    "auths":
    {
        "ghcr.io":
            {
                "auth":"dXNlcm5hbWU6Z2hwXzRKSXV5VFBSTERubzF0WGtKc05ZV1g1REVNV0RVZjNrOWlQYw=="
            }
    }
}



echo -n  '{"auths":{"ghcr.io":{"auth":"dXNlcm5hbWU6Z2hwXzRKSXV5VFBSTERubzF0WGtKc05ZV1g1REVNV0RVZjNrOWlQYw=="}}}' | base64


eyJhdXRocyI6eyJnaGNyLmlvIjp7ImF1dGgiOiJkWE5sY201aGJXVTZaMmh3WHpSS1NYVjVWRkJTVEVSdWJ6RjBXR3RLYzA1WlYxZzFSRVZOVjBSVlpqTnJPV2xRWXc9PSJ9fX0=

and store it at as dockerconfigjson.yaml file.

kind: Secret
type: kubernetes.io/dockerconfigjson
apiVersion: v1
metadata:
  name: dockerconfigjson-github-com
  labels:
    app: app-name
data:
  .dockerconfigjson: eyJhdXRocyI6eyJnaGNyLmlvIjp7ImF1dGgiOiJkWE5sY201aGJXVTZaMmh3WHpSS1NYVjVWRkJTVEVSdWJ6RjBXR3RLYzA1WlYxZzFSRVZOVjBSVlpqTnJPV2xRWXc9PSJ9fX0=



https://github.com/mkjelland/spring-boot-postgres-on-k8s-sample/blob/master/README.md

kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc polar-postgres -o jsonpath="{.spec.clusterIP}")



kubectl exec -it polar-postgres-9984cb64c-z2s8z -- psql -h localhost -U user --password -p 5432 polardb_catalog

kubectl get svc polar-postgres -o jsonpath="{.spec.clusterIP}"

kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc polar-postgres -o jsonpath="{.spec.clusterIP}")


kind: Secret
type: kubernetes.io/dockerconfigjson
apiVersion: v1
metadata:
  name: dockerconfigjson-github-com
  labels:
    app: app-name
data:
  .dockerconfigjson: eyJhdXRocyI6eyJnaGNyLmlvIjp7ImF1dGgiOiJZMjlrYVc1bmEybGtaRzg2WjJod1h6UktTWFY1VkZCU1RFUnViekYwV0d0S2MwNVpWMWcxUkVWTlYwUlZaak5yT1dsUVl3PT0ifX19
  
  
  
  
  sudo ufw allow from 192.168.64.1 to any port 9001
  
  sudo ufw allow from 192.168.64.1
  
  
  
  
kubectl apply -f k8s/deployment.yml
kubectl logs deployment/catalog-service
kubectl delete -f k8s/deployment.yml