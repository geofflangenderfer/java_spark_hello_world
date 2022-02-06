## Install dependencies
- [sdkman](https://sdkman.io/install)
- maven[1]

[1]
```
# to find latest maven version
# sdk list maven
sdk install maven 3.8.4
```

## Run it
```
$ bash run.sh
compiled successfully
22/02/06 12:53:03 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
22/02/06 12:53:03 INFO SparkContext: Running Spark version 2.4.7
22/02/06 12:53:03 INFO SparkContext: Submitted application: Java Spark SQL basic example
22/02/06 12:53:03 INFO SecurityManager: Changing view acls to: g
22/02/06 12:53:03 INFO SecurityManager: Changing modify acls to: g
22/02/06 12:53:03 INFO SecurityManager: Changing view acls groups to:
22/02/06 12:53:03 INFO SecurityManager: Changing modify acls groups to:
22/02/06 12:53:03 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(g); groups with view permissions: Set(); users  with modify permissions: Set(g); groups with modify permissions: Set()
22/02/06 12:53:04 INFO Utils: Successfully started service 'sparkDriver' on port 61086.
22/02/06 12:53:04 INFO SparkEnv: Registering MapOutputTracker
22/02/06 12:53:04 INFO SparkEnv: Registering BlockManagerMaster
22/02/06 12:53:04 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
22/02/06 12:53:04 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
22/02/06 12:53:04 INFO DiskBlockManager: Created local directory at /private/var/folders/4s/6nbhf11j0bq0d7m_8v_9x52w0000gs/T/blockmgr-452e3f5f-5150-45b2-833e-6a1f5b2db8bd
22/02/06 12:53:04 INFO MemoryStore: MemoryStore started with capacity 366.3 MB
22/02/06 12:53:04 INFO SparkEnv: Registering OutputCommitCoordinator
22/02/06 12:53:04 INFO Utils: Successfully started service 'SparkUI' on port 4040.
22/02/06 12:53:04 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://192.168.1.29:4040
22/02/06 12:53:04 INFO SparkContext: Added JAR file:/Users/g/.sdkman/candidates/spark/2.4.7/hello_world/spark-sql/java_translation/target/simple-project-1.0.jar at spark://192.168.1.29:61086/jars/simple-project-1.0.jar with timestamp 1644180784429
22/02/06 12:53:04 INFO Executor: Starting executor ID driver on host localhost
22/02/06 12:53:04 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 61088.
22/02/06 12:53:04 INFO NettyBlockTransferService: Server created on 192.168.1.29:61088
22/02/06 12:53:04 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
22/02/06 12:53:04 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 192.168.1.29, 61088, None)
22/02/06 12:53:04 INFO BlockManagerMasterEndpoint: Registering block manager 192.168.1.29:61088 with 366.3 MB RAM, BlockManagerId(driver, 192.168.1.29, 61088, None)
22/02/06 12:53:04 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 192.168.1.29, 61088, None)
22/02/06 12:53:04 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 192.168.1.29, 61088, None)
+----+-------+
| age|   name|
+----+-------+
|null|Michael|
|  30|   Andy|
|  19| Justin|
+----+-------+

$
```
