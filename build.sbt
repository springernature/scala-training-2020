organization := "com.springer.training"
name := "scala-training-2020"

version := "0.2"

scalaVersion := "2.12.10"

resolvers += "marklogic repo" at "https://developer.marklogic.com/maven2"

val dependencies = Seq(
  "org.apache.commons" % "commons-lang3" % "3.9",
  "commons-io" % "commons-io" % "2.6",
  "com.marklogic" % "marklogic-xcc" % "8.0.9",
"me.moocar" % "logback-gelf" % "0.9.6" from "http://repo.tools.springer-sbm.com/repos/logback-gelf-0.9.6.jar"
)

libraryDependencies ++= dependencies