package com.github.joprice.placebo

import scala.language.experimental.macros
import scala.language.dynamics
import scala.reflect.macros.Context

trait Placebo extends Dynamic {

  def applyDynamic(name: String)(args: Any*) = macro Placebo.contextImpl

  def selectDynamic(name: String) = macro Placebo.contextImplSelect

}

object Placebo {

  def contextImpl(c: Context)(name: c.Expr[String])(args: c.Expr[Any]*) = dud(c)

  def contextImplSelect(c: Context)(name: c.Expr[String]) = dud(c)

  def dud(c: Context) = {
    import c.universe._
    reify((???): Nothing with Placebo)
  }

}


