run:
	docker build -t app-java .
	docker run -ti --rm --name run-app-java app-java