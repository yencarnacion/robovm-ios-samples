robovm-ios-samples
==========

robovm-ios-samples is copyrighted free software by Yamir Encarnación <yencarnacion@webninjapr.com>. You can redistribute it and/or modify it under the terms of the MIT License (see the file MIT.txt).

The purpose of robovm-ios-samples is to show the [gradle-robovm-plugin](https://github.com/yencarnacion/gradle-robovm-plugin) in action.

## Setup

1. Install Xcode (tested with 5.1)
2. Install [JDK 7](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
3. Download and extract [robovm-0.0.10.tar.gz](http://download.robovm.org/robovm-0.0.10.tar.gz) to one of these places:
 * $ROBOVM_HOME
 * ~/Applications/robovm/
 * ~/.robovm/home/
 * /usr/local/lib/robovm/
 * /opt/robovm/
 * /usr/lib/robovm/

## Usage

To see the Java Sample in Action:
```bash
$ gradlew :HelloJava:compileJava
$ gradlew :HelloJava:compileRobovm
```

To see the Scala Sample in Action:
```bash
$ gradlew :HelloScala:compileScala
$ gradlew :HelloScala:compileRobovm
```

