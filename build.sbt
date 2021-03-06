
lazy val scalatestSandbox = (project in file(".")).settings(
  organization := "sandbox",
  name := "scalatest-sandbox",
  version := "1.0.-SNAPSHOT",
  scalaVersion := "2.12.0",

  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.0" % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
  )
)
