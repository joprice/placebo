
name := "placebo"

organization := "com.github.joprice"

scalaVersion := "2.10.4"

lazy val macros = project

lazy val test = project.dependsOn(macros)
                       .aggregate(macros)

