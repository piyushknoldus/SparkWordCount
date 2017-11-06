# SparkWordCount
This is the test project that executes the spark wordcount using the jar file.

The aim is to run the application via creating jar.

    To create Jar file -

    Go to the project directory (in my case - ~/workstation/SparkWordCount) and type - sbt assembly

    This will create a jar file in your ../target/scala-2.12 folder with named as SparkWordCount-assembly-1.0.jar.

    To execute the app with jar file -

    java -jar /path-to-your-jar

    e.g - java -jar /home/knoldus/workstation/SparkWordCount/target/scala-2.12/SparkWordCount-assembly-1.0.jar /path-toinputFile /path-to-outputFile

