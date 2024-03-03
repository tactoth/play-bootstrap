name := """play-bootstrap"""
organization := "com.adrianhurt"

version := "1.6.1-P28-B4"

scalaVersion := "3.3.1"
crossScalaVersions := Seq("3.3.1")

resolvers ++= Seq(
  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies := libraryDependencies.value.filterNot(m => m.name == "twirl-api" || m.name == "play-server") ++ Seq(
  playCore % "provided",
  filters % "provided",
  "com.adrianhurt" %% "play-bootstrap-core" % "1.6.1-P28",
  specs2 % Test
)

lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayFilters, PlayLogback /*, PlayAkkaHttpServer */)

// PlayKeys.playOmnidoc := false

//*******************************
// Maven settings
//*******************************

publishMavenStyle := true

organization := "com.adrianhurt"

description := "This is a collection of input helpers and field constructors for Play Framework to render Bootstrap HTML code."