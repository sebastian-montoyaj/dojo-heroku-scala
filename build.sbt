name := """heroku-scala"""
organization := "co.edu.udea"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.jscience" % "jscience" % "4.3.1"
)

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )