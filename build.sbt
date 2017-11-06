name := "SparkWordCount"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.1")

/*
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.concat
}
*/

mainClass in assembly := Some("spark.WordCount")