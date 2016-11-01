
lazy val scalatestSandbox = (project in file(".")).settings(
  organization := "sandbox",
  name := "scalatest-sandbox",
  version := "1.0.-SNAPSHOT",
  scalaVersion := "2.11.8",

  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.0" % "test"
  )
)
