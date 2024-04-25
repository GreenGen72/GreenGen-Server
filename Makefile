HAS_DOCKER := $(shell command -v docker 2> /dev/null)
ifndef HAS_DOCKER
$(error "Docker não está instalado. Por favor, instale o Docker para continuar.")
endif

.PHONY: run
run:
	@echo "Iniciando os contêineres Docker..."
	cd docker && docker compose up -d && cd ..
	@echo "Iniciando o aplicativo Spring Boot em modo de desenvolvimento..."
	./mvnw spring-boot:run -Dspring-boot.run.profiles=dev