### To run zookeeper Server
```
$ cd bin/windows
$ zookeeper-server-start.bat ../../config/zookeeper.properties
```
### To start kafka Server
```
$ cd bin/windows
$ kafka-server-start.bat ../../config/server.properties
```
### To create Kafka topic "test"
```
$ cd bin/windows
$ kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test
```
### To list down topics:
```
$ kafka-topics.bat --list --bootstrap-server localhost:9092
```
### To create and send a message on topic "test"
```
$ kafka-console-producer.bat --broker-list localhost:9092 --topic test
This is my message
```
### To consume a message from the topic "test"
```
$ kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
This is my message
```
### To test the POST method
```
http://localhost:9000/kafka/publish/?message=test
```
