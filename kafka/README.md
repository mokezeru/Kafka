#To run zookeeper Server
$ cd bin/windows
$ zookeeper-server-start.bat ../../config/zookeeper.properties

#To start kafka Server
$ cd bin/windows
$ kafka-server-start.bat ../../config/server.properties

#To test the POST method
http://localhost:9000/kafka/publish/?message=test