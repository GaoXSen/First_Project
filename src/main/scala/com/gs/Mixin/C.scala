package com.gs.Mixin

trait C {
  def work(s: String): Unit = {
    println(s + "from C")
  }
}
