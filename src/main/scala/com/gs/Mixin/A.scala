package com.gs.Mixin

trait A {
  def print(s: String): Unit = {
    println(s + "from A")
  }

}
