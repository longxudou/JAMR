resolvers += "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

// addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
// addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.7.0-SNAPSHOT")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
