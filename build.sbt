sonatypeSettings
name         := "paper-scala-js"
version      := "0.5-SNAPSHOT"
scalaVersion := "2.12.2"

enablePlugins(ScalaJSPlugin)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-encoding", "UTF-8",
  "-language:implicitConversions",
  "-language:reflectiveCalls"
)
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
jsDependencies += "org.webjars.npm" % "paper"  % "0.11.4" / "paper-full.min.js" commonJSName "paper"

publishMavenStyle       := true
publishArtifact in Test := false
pomIncludeRepository    := { _ => false }

publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := {
  <url>https://github.com/yoeluk/paper-scala-js</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
    </license>
  </licenses>
  <scm>
    <connection>https://github.com/yoeluk/paper-scala-js.git</connection>
    <developerConnection>scm:git:git@github.com:yoeluk/paper-scala-js.git</developerConnection>
    <url>github.com/yoeluk/paper-scala-js</url>
  </scm>
  <developers>
    <developer>
      <id>yoeluk</id>
      <name>Yoel RGD</name>
      <url>https://github.com/yoeluk/</url>
    </developer>
  </developers>
}