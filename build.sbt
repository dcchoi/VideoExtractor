name := "VideoExtractor"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "org.scalaj" % "scalaj-http_2.11" % "2.3.0"

libraryDependencies ++= {
  val AkkaVersion       = "2.4.17"
  val AkkaHTTPVersion   = "10.0.5"

  val Json4sVersion     = "3.5.1"
  Seq(
    "com.typesafe.akka" %% "akka-slf4j"      % AkkaVersion,
    "com.typesafe.akka" %% "akka-http"       % AkkaHTTPVersion,

    "ch.qos.logback"    %  "logback-classic" % "1.1.2",
    "org.json4s"        %% "json4s-native"   % Json4sVersion,
    "org.json4s"        %% "json4s-ext"      % Json4sVersion
  )
}
libraryDependencies += "ch.megard" %% "akka-http-cors" % "0.1.11"
