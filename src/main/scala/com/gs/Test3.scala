package com.gs

import scala.collection.mutable
import scala.runtime.Nothing$
import scala.util.{Failure, Success, Try}

object Test3 {
//  var d = ("Mile",123,3.5)
//  d = new Tuple3("dfad",33,3)
//  val e = new Tuple3[String,String,Int]("gao","sen",22)
//
//  var x = new Tuple22(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)
//  //x = new Tuple23(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23) error Tuple max is 22
//
//  //对Tuple进行遍历操作
//  d.productIterator.foreach(s => println())
//  d.productIterator.map(x => x+"!").foreach(s => println(s))
//
//  println(d._2)
//
//  val (name,verb,any) = d

  def main(args: Array[String]): Unit = {
    //demo1()
    to_int("555") match{
      case Some(v) => println("The value is : %s".format(v))
      case None => println("Convert failed")
    }
    println(to_int("xx").getOrElse(0))

    divideBy(100,0) match {
      case Left(s) => println(s)
      case Right(v) => println("right = %d".format(v))
    }

    Try(100/0) match {
      case Success(a) => println("The value is : %d".format(a))
      case Failure(b) => println("Failed!")
    }
  }

  def demo1()={
    val a1 = Array(1,2,3,4)
    val a2 = Array(100,200,300,400)

    val result = (a1 ++ a2).groupBy(x => x%2 == 0)

    val a = (a1 ++ a2).slice(2,4)

    val a3 = (a1 ++ a2).reverse

    //排序
    a3.sorted

    a3.sortWith(_ > _)

    a3.sortWith((x,y) => x > y)

    a3.sortWith((x,y) => x < y)

    a3.sortBy( x => x)

    a3.sortBy(x => x * -1)

    //以3个为一组进行切分
    val x = a3.grouped(3)

    x.next()
    x.next()


    println(result)
    println(a)
    println(a3)

    import scala.collection.mutable._
    var lb = ListBuffer(1,2,3,4)
    lb += 100
    lb += (21,33)
    88 +=: lb
    List(44,77) ++=:lb
  }

  //集合运算
  def demo2()={
    var s = Set(1,2,4)
    var t = Set(1,3,5,6)

    t & s
    t intersect s
    t | s
    t union s
    t &~ s
    t diff s

    s.+(3)
    val st = s++t

    var m = Map("a" -> 1,"b" -> 2)

  }

  //多线程编程 Synchronized
  import scala.collection.mutable.{Map,SynchronizedMap,HashMap}
  def demo4 ={

  }

  //枚举类型 Enumeration
  object WeekDay extends Enumeration{
    type WeekDay = Value
    val Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday = Value
  }

//  object Weekday extends Enumeration{
//    type WeekDay = Value
//    val Monday = Value("Monday")
//    //...
//  }
  val monday = WeekDay.Monday

  monday.toString

  val sunday = WeekDay.withName("Sunday")

  WeekDay(1)

  WeekDay.maxId

  def isWeekend(wd: WeekDay.Value):Boolean = {
    wd match {
      case WeekDay.Saturday => true
      case WeekDay.Sunday => true
      case _ => false
    }
  }

  isWeekend(WeekDay.Monday)

  def demo5():Unit={

  }
  def demo6():Null={
    null
  }
//  def demo7():Nothing={
  //    val s: Nothing =
  //    s
  //  }

  //case object Nil extends List[Nothing]
  //object None extends Option[Nothing]

  //Option 类型示例
  //Option --> Some ,None
  def to_int(x: Any): Option[Int] = {
    try{
      Some(x.toString().toInt)
    }
    catch{
      case e: java.lang.Exception => None
    }
  }

  def to_int1(s: Any) = Try(s.toString.toInt).toOption.getOrElse(0)

  //Either --> value1,value2  (返回两个完全不同的数据类型）
  def divideBy(x: Int,y: Int):Either[String,Int] = if(y == 0) Left("Dude,can't divide by 0") else Right(x/y)

  //Try --> Success,Failure
  Try(100/0)
  Try(200/33)

  //匿名函数
  def ic = (x: Int) => x+1

}




