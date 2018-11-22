package com.gs

object Test4 {

  def main(args: Array[String]): Unit = {
    val list = List(1,2,4,6,8)
    println(filters(list,3))

  }

  def filters(xs:List[Int],threshold:Int) = {
    def process(ys:List[Int]):List[Int] = {
      if(ys.isEmpty)
        ys
      else if(ys.head<threshold)
        ys.head :: process(ys.tail)
      else
        process(ys.tail)
    }
    process(xs)
  }

  //currying
  def demo1 = {
    def modN(n: Int)(x: Int) = ((x % n) == 0)

    //此处 _ 表示函数的地址。
    val fi = modN(2) _

    val f2 = modN(3) (_)
  }

  //给参数名称可以乱序调用
  def printName(first: String,last: String): Unit ={
    println(first + " + ")
  }

}
