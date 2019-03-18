name := "sangria"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria" % "1.4.2",
  "com.typesafe.akka" %% "akka-http" % "10.1.3"
)