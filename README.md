# IOpipe Logger Adapter for log4j2 (Java)

[![Download](https://api.bintray.com/packages/iopipe/iopipe-logger-log4j2/iopipe-logger-log4j2/images/download.svg) ](https://bintray.com/iopipe/iopipe-logger-log4j2/iopipe-logger-log4j2/_latestVersion)[![CircleCI](https://circleci.com/gh/iopipe/iopipe-java-logger-log4j2.svg?style=svg&circle-token=b9a08049964f555f38ab316ba535369aa5fe8252)](https://circleci.com/gh/iopipe/iopipe-java-logger-log4j2)[![Javadocs](https://www.javadoc.io/badge/com.iopipe/iopipe-logger-log4j2.svg)](https://www.javadoc.io/doc/com.iopipe/iopipe-logger-log4j2)

Support for [Log4j2](https://logging.apache.org/log4j/2.x/) using the IOpipe
Logger Plugin. This plugin is to be used with
the [IOpipe Java Agent](https://github.com/iopipe/iopipe-java).

It is licensed under the Apache 2.0.

# Building With The Adapter

Your `pom.xml` file may be modified to include the following dependency:

```xml
<dependency>
  <groupId>com.iopipe</groupId>
  <artifactId>iopipe-logger-log4j2</artifactId>
</dependency>
```

Due to the way shading works, you will be required to always use the
[Log4j2 Transformer](https://github.com/edwgiz/maven-shaded-log4j-transformer)
if you wish to support multiple appenders within your project and its
dependencies. Not doing so may result in not being able to use multiple various
plugins with Log4j2.

# Configuration

Configuring your project to use this adapter for Log4j2 will be the same as
configuring other appenders as specified in the [configuration documentation](https://logging.apache.org/log4j/2.x/manual/configuration.html).

Using the following as an example `log4j2.xml` resource at a very basic level
to report to IOpipe (the error level may be modified accordingly as needed):

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="error">
  <Appenders>
    <IOpipe name="IOpipe">
    </IOpipe>
  </Appenders>
  <Loggers>
    <Root level="error">
      <AppenderRef ref="IOpipe" />
    </Root>
  </Loggers>
</Configuration>
```

