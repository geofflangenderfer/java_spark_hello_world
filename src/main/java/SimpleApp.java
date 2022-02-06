/* SimpleApp.java */
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class SimpleApp {
  public static void main(String[] args) {
    SparkSession spark = SparkSession
      .builder()
      .appName("Java Spark SQL basic example")
      .config("spark.some.config.option", "some-value")
      .getOrCreate();
    spark.sparkContext().setLogLevel("ERROR");

    Dataset<Row> df = spark.read().json("people.json");

    // Displays the content of the DataFrame to stdout
    df.show();
    // +----+-------+
    // | age|   name|
    // +----+-------+
    // |null|Michael|
    // |  30|   Andy|
    // |  19| Justin|
    // +----+-------+

    spark.stop();
  }
}
