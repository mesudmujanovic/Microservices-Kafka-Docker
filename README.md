Install Kafka with Docker Hub
https://hub.docker.com/r/apache/kafka
docker exec --workdir /opt/kafka/bin/ -it broker sh
/opt/kafka/bin $ ./kafka-topics.sh --bootstrap-server localhost:
9092 --create --topic test-topic
/opt/kafka/bin $ ./kafka-console-producer.sh --bootstrap-server
localhost:9092 --topic test-topic
>hello
>world
>^C/opt/kafka/bin $ ./kafka-console-consumer.sh --bootstrap-serv
er localhost:9092 --topic test-topic --from-beginning
hello
world
