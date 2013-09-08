name := "wepay-scala"

description := "A scala library for WePay payments processing."

organization := "me.frmr.wepay-scala"

version := "0.8.5"

scalaVersion := "2.9.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
  "net.liftweb" %% "lift-common" % "2.5.1",
  "net.liftweb" %% "lift-util" % "2.5.1",
  "net.liftweb" %% "lift-json" % "2.5.1",
  "net.databinder" %% "dispatch-core" % "0.8.10",
  "net.databinder" %% "dispatch-http" % "0.8.10",
  "net.databinder" %% "dispatch-lift-json" % "0.8.10",
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.1",
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)

scalacOptions in (Compile, doc) ++= Opts.doc.title("WePay-Scala API Reference")

parallelExecution in Test := false
