lazy val root = Project("play-eof-test", file("."))
  .enablePlugins(PlayScala)
  .settings(
    scalaVersion := "2.13.7",
    libraryDependencies += guice,
    resolvers += Resolver.sonatypeRepo("snapshots")
  )
