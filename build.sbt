enablePlugins(ScalaJSPlugin)
workbenchSettings
version := "0.1-SNAPSHOT"
scalaVersion := "2.12.1"
//scalaVersion := "2.11.8"
jsDependencies += RuntimeDOM
mainClass in Compile := Some("missingmethod.Main")
bootSnippet := ""

