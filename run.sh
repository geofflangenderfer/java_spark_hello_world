mvn --quiet package && echo "compiled successfully"
spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/simple-project-1.0.jar
