// Does not quit on EOF (-1) anymore
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.12+1-f35a1c22-SNAPSHOT")

// Like above, but also debugs "Character detected: ..." via println
//addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.12+2-f95484fb-SNAPSHOT")

resolvers += Resolver.sonatypeRepo("snapshots")
