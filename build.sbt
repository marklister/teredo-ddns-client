import AssemblyKeys._ // put this at the top of the file

assemblySettings

name := "FreeDns"

version := "1.01"

scalaVersion := "2.9.2"

resolvers += "bitcoinj-snapshot" at "http://nexus.bitcoinj.org/content/repositories/snapshots"

resolvers += "bitcoinj-release" at "http://nexus.bitcoinj.org/content/repositories/releases"

resolvers += "Maven Central" at "http://repo2.maven.org/maven2/"

resolvers += "Maven Central Mirror" at "http://mirrors.ibiblio.org/pub/mirrors/maven2"

resolvers += "Maven Central Mirror" at "http://maven.antelink.com/content/repositories/central/"

//libraryDependencies += "org.apache.derby" % "derby" % "10.8.2.2"

//libraryDependencies += "com.madgag" % "sc-light-jdk15on" % "1.47.0.2"

//libraryDependencies += "cglib" % "cglib-nodep" % "2.2.2"

//libraryDependencies += "com.google.guava" % "guava" % "11.0"

//libraryDependencies += "com.google.protobuf" % "protobuf-java" % "2.4.1"

//libraryDependencies += "junit" % "junit" % "4.8.2"

//libraryDependencies += "org.easymock" % "easymock" % "3.0"

//libraryDependencies += "org.objenesis" % "objenesis" % "1.2"

//libraryDependencies += "org.slf4j" % "slf4j-api" % "1.6.2"

//libraryDependencies += "org.slf4j" % "slf4j-jdk14" % "1.6.2"

//libraryDependencies += "com.google" % "bitcoinj" % "0.4.1"

mainClass in assembly := Some("org.catch22.freedns.FreeDns")

