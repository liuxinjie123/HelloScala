package main.com.hello

import scala.collection.mutable.ArrayBuffer

object Fun {
  /**
    * 取绝对值
    * @param x
    * @return |x|
    */
  def abs(x: Double) = if (x >= 0) x else -x

  /**
    * 阶乘
    * @param n
    * @return n的阶乘值
    */
  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n) r = r * i
    r
  }

  /**
    * 阶乘2
    * @param n
    * @return n的阶乘值
    */
  def fac2(n: Int): Int = if (n <= 1) 1 else n * fac2(n-1)

  /**
    * 封装 字符串
    * @param str    字符串
    * @param left   字符串左边字符
    * @param right  字符串右边字符
    * @return       封装好的字符串
    */
  def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

  /**
    * 求和
    * @param args   长度可变的int列表
    * @return       参数求和值
    */
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  /**
    * 求和
    * @param args   长度可变的int列表
    * @return       参数求和值
    */
  def recursiveSum(args: Int*): Int = {
    if (args.length == 0) 0
    else args.head + recursiveSum(args.tail: _*)
  }

  /**
    * 封装字符串
    * @param s     字符串
    */
  def box(s: String): Unit = {
    val border = " - " + s.length + " - \n"
    print(border + "|" + s + "|\n" + border)
  }

  /**
    * 去掉除非负数和第一个负数之外的其他数
    */
  def array1(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var first = true
    val indexes = for (i <- 0 until a.length if first || a(i) >= 0) yield {
      if (a(i) < 0) first = false; i
    }
    for (j <- 0 until indexes.length) a(j) = a(indexes(j))
    a.trimEnd(a.length - indexes.length)
    a
  }

  def array2(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var first = true
    var n = a.length
    var i = 0
    while (i < n) {
      if (a(i) > 0) {
        i += 1
      } else {
        if (first) {
          first = false
          i += 1
        } else {
          a.remove(i)
          n -= 1
        }
      }
    }
    a
  }

}
