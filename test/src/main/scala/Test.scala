package com.github.joprice

object Test {

  class Treatment extends Placebo

  object Treatment extends Treatment

  class Cured(name: String)

  val treatment = new Treatment()

  // refernce types
  val cured: Cured = treatment.cured

  // primitives
  val healed: Int = treatment.count

  // generics
  val withArgs: Map[String, Seq[Int]] = treatment.ingredients(true)

  val chained: List[Double] = treatment.ingredients.mix.filter { s: String => 
    s.split("\\.").isEmpty
  }

  val i: List[Float] = Treatment("Test")

  val result: Seq[String] = Treatment.run(1,2,3)
}


