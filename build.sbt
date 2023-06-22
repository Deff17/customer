ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "spark-project-template"
  )

libraryDependencies ++=Seq(
  "org.apache.spark" %% "spark-sql" % "3.4.0",
  "com.softwaremill.macwire" %% "macros" % "2.5.8",

  "org.scalactic" %% "scalactic" % "3.2.16",
  "org.scalatest" %% "scalatest" % "3.2.16" % "test",

)
