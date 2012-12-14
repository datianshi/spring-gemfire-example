#!/bin/sh

#mvn exec:java -Dserver-port=40405 -DpropertiesFile=server2.properties
server=
if [ "$1" == "server" ];
then
 shift 
 server="-Dserver-port=$1"
 shift
fi

property=

if [ "$1" == "property" ];
then
 shift
 property="-DpropertiesFile=$1"
 shift
fi

command="mvn exec:java $server $property"
echo $command
eval $command
