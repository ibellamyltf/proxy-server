name := "proxy-server"

version := "1.0"

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-http" % "6.25.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)