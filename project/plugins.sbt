logLevel := Level.Warn
resolvers += Classpaths.typesafeReleases
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.5")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.2.2")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")