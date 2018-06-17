package main.com.hello

object HelloScala {
  /**
    * 这是我的第一个scala程序
    * 下面程序输出 Hello Scala
    */
  def main(args: Array[String]): Unit = {
    println(" Hello Scala!")
    println("abs1=" + Fun.abs(100))
    println("fac1=" + Fun.fac(1))
    println("fac2=" + Fun.fac(2))
    println("fac3=" + Fun.fac(3))
    println("fac4=" + Fun.fac(4))
    println("fac5=" + Fun.fac(5))
    println("decorate1=" + Fun.decorate("Hello"))
    println("decorate2=" + Fun.decorate("Hello", " --- ", " --- "))
    println("decorate3=" + Fun.decorate(left = "<<<<<", str = "Hello", right = ">>>>>"))
    println("sum1=" + Fun.sum(1, 2, 3, 4, 5))
    println("sum2=" + Fun.sum(1 to 5: _*))
    println("sum3=" + Fun.sum(1 to 100: _*))
    println("recursiveSum1=" + Fun.recursiveSum(1))
    println("recursiveSum2=" + Fun.recursiveSum(1, 2, 3, 4, 5))
    println("recursiveSum3=" + Fun.recursiveSum(1 to 100: _*))
  }


}
