package com.gs.Mixin

trait B {
  def print(s: String): Unit = {
    println(s + "from B")
  }
  def work(s: String): Unit = {
    println(s + "from B")
  }

}
