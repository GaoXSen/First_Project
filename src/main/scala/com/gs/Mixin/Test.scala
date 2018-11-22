package com.gs.Mixin

object Test {
  def main(args: Array[String]): Unit = {
    val d = new D();d.print("123");d.work("abc")
    val c = new E();c.print("123");c.work("abc")
  }
}
