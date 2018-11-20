package com.gs

import com.gs.Test2.test3.{printByName, printByValue, square}
import com.gs.Test2.test4._

object Test2 {

  def main(args: Array[String]): Unit = {
//    printByValue(square(10))
//    printByName(square(10))
//    test()
    demo4()
  }

  var i = 100
  i += 1

  val x = 200
  //x = 100 error(不可变）

  var y:Double = 234

  //给一个匿名
  type S = scala.collection.mutable.Stack[Int]  //alias
  //var s:S = S(1,2,3,4) error 不可以这么用
  var s:S = scala.collection.mutable.Stack[Int](1,2,3,4,5)


  object test3{

    def square(x: Int): Int = {
      println(x)
      x * x
    }

    //call by value 传值
    def printByValue(x: Any):Unit = { println(x);println(x) }
    //call by name 传函数
    def printByName(x: => Any): Unit = { println(x);println(x)}
  }

  //循环
  object test4{
    def demo1(): Unit ={
      //use Range
      (1 to 100 by 5).map( x => {
        var y = x * 2
        println(y)
        y
      })

      (1 to 100).filter(_%2 == 0).map(_ => x*2)
      (1 until 30 by 5).filter(_%2 == 0).map(_*2)

      var num: Int = 0
      while (num < 100){
        println(num)
        num += 10
      }

      do{
        println(num)
        num = num + 5
      }while(num < 200)
    }

    //There is no break or continue
    def test(): Unit = {
      while (true) {
        val rand = Math.random()
        if(rand < 0.1) return
        println(rand)
      }
      println("Done")
    }

    def demo2()={
      val num: Int = 10
      for(i: Int <- 1 to num){
        println(1*100)
      }
      (1 to num)foreach(println)
      val ss = List[String]("gao","sen")
      for(s <- ss) println(s)

      //There is no break or continue
      for(i: Int <- 1 until 100;if i%2 == 0){
        println(2*i)
      }
    }

    import scala.util.control.Breaks._
    def demo3()={
      println("Start")
      val l = List[Int](1,2,3,4,5,6,7,8,9,10)
      //将需要break的代码块用breakable包起来
      breakable{
        for(x <- l){
          println(2*x)
          if(x > 6) break
        }
      }
      println("Done")
    }

    def demo4()={
      for(i <- Array(1,3,6)){
        for(j <- 5 to 10){
          println(i + j)
        }
      }
      println("_________")
      for(i <- Array(1,3,6); j <- 5 to 10) println(i + j)
    }


  }

}




