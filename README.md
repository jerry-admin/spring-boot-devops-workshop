# Build

mvn -Dsite=dev -Dmaven.test.skip=true  clean package


# API

## Log 输出

http://domain/<context-path>/demo/echo?greeting=hello

## ERROR 输出

http://domain/<context-path>/demo/ex?msg=hello


