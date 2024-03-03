name := """play-bootstrap-core"""
organization := "com.adrianhurt"

version := "1.6.1-P28"

scalaVersion := "3.3.1"
crossScalaVersions := Seq("3.3.1")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"


lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayFilters, PlayLogback /*, PlayAkkaHttpServer */)

libraryDependencies := libraryDependencies.value.filterNot(m => m.name == "twirl-api" || m.name == "play-server") ++ Seq(
  playCore % "provided"
)

