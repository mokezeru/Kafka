#To run zookeeper Server
$ cd bin/windows
$ zookeeper-server-start.bat ../../config/zookeeper.properties

#To start kafka Server
$ cd bin/windows
$ kafka-server-start.bat ../../config/server.properties

#To test the GET method
 http://localhost:9001/greetings?message=message