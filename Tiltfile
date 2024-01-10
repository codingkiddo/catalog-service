# Build
custom_build (
	# Name of the container image
	ref = 'catalog-service', 
	skips_local_docker = True, 
	# Command to build the container image
	command = './mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=$EXPECTED_REF',
	deps = ['src']
)

# Deploy
k8s_yaml(['k8s/deployment.yml'])

# Manage
k8s_resource('catalog-service', port_forwards=['9002'])