package com.polarbookshop.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;

@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
		
		
		try (KubernetesClient client = new KubernetesClientBuilder()
			    .withConfig(new ConfigBuilder()
			        .withMasterUrl("https://api.sandbox.x8i5.example.com:6443")
			        .withOauthToken("sha256~secret")
			        .withNamespace("default")
			        .withCaCertFile("/home/foo/.minikube/ca.crt")
			        .withClientCertFile("/home/foo/.minikube/profiles/minikube/client.crt")
			        .withClientKeyFile("/home/foo/.minikube/profiles/minikube/client.key")
			        .withClientKeyAlgo("RSA")
			        .build())
			    .build()) {

			}

	}

}
