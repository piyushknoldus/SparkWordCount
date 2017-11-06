package spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by knoldus on 3/11/17.
  */

object WordCount {
  def main(args: Array[String]) {
    print("\nEnter input file and output file path (space seprated)")
    val values = scala.io.StdIn.readLine()
    val filesPath = values.split(" ")
    val inputFile = filesPath(0)
    val outputFile = filesPath(1)
    val conf = new SparkConf().setAppName("wordCount").setMaster("local[2]").set("spark.executor.memory","1g");

    // Create a Scala Spark Context.
    val sc = new SparkContext(conf)
    // Load our input data.
    val input =  sc.textFile(inputFile)
    // Split up into words.
    val words = input.flatMap(line => line.split(" "))
    // Transform into word and count.
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    // Save the word count back out to a text file, causing evaluation.
    counts.saveAsTextFile(outputFile)
  }
}
