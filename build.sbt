lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js jQuery"

normalizedName := "scalajs-jquery"

version := "0.9.2-SNAPSHOT"

organization := "be.doeraene"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0")

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.9.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

homepage := Some(url("http://scala-js.org/"))

licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause"))

scmInfo := Some(ScmInfo(
    url("https://github.com/scala-js/scala-js-jquery"),
    "scm:git:git@github.com:scala-js/scala-js-jquery.git",
    Some("scm:git:git@github.com:scala-js/scala-js-jquery.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>sjrd</id>
      <name>Sébastien Doeraene</name>
      <url>https://github.com/sjrd/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }
