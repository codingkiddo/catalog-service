# Build
custom_build (
	# Name of the container image
	ref = 'ghcr.io/codingkiddo/catalog-service:0.0.7-SNAPSHOT', 
	skips_local_docker = True, 
	# Command to build the container image
	command = './mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=ghcr.io/codingkiddo/catalog-service:0.0.7-SNAPSHOT',
	deps = ['src']
)

# Deploy
k8s_yaml(['k8s/deployment.yml'])

# Manage
k8s_resource('catalog-service', port_forwards=['9001'])