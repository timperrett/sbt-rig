
libraryDependencies <+= (sbtVersion) { sv =>
  "org.scala-sbt" % "scripted-plugin" % sv
}

addSbtPlugin("io.verizon.build" % "sbt-rig" % "1.0.2")
