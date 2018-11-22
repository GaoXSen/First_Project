package com.gs.Mixin

class E extends A with C with B {
  //默认调用最后一个。
//  override def print(s: String): Unit = super.print(s)
//  override def work(s: String): Unit = super.work(s)
  //指定调用
  override def print(s: String): Unit = super[A].print(s)
  override def work(s: String): Unit = super[C].work(s)

}
