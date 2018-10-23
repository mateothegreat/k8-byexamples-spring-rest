VERSION	?= $(shell git rev-parse HEAD)
APP		?= k8-byexamples-spring-rest
IMAGE	?= $(APP):$(VERSION)

.PHONY: build

build:

	docker build -t $(IMAGE) .
