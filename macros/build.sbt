
name := "macros"

scalaVersion := "2.10.4"

organization := "com.github.joprice"
 
libraryDependencies <++= scalaVersion { sversion =>
 Seq(
   "org.scalamacros" %% "quasiquotes" % "2.0.0-M8",
   "org.scala-lang" % "scala-reflect" % sversion,
   "org.scala-lang" % "scala-compiler" % sversion
 )
}

scalacOptions ++= Seq(
 "-Xlog-free-terms"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.0" cross CrossVersion.full)


