package com.gs.Mixin

class D extends A with B with  C {
  override def print(s: String): Unit = super.print(s)

  override def work(s: String): Unit = super.work(s)

}
