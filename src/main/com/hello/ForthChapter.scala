package main.com.hello

import java.util

object ForthChapter {
  def main(args: Array[String]) {
    var scores = Map(("jack", 100), ("tom", 80), ("lucy", 90))
    println("scores=" + scores)
    var jimScore = scores.getOrElse("jim", 0)
    println("jimScore=" + jimScore)
    val jackScore = scores("jack")
    println("jackScore=" + jackScore)
    scores += ("jim" -> 88)
    jimScore = scores.getOrElse("jim", 0)
    println("jimScore=" + jimScore)
    for (v <- scores.values) print(v + ", ")
    println()
    val t = (3, 3.14, "Jack")
    println("t=" + t)
    val second1 = t._2
    println("second1=" + second1)
    val second2 = t _2;
    println("second2=" + second2)
    val (first, second, third) = t
    println("first=" + first)
    println("second=" + second)
    println("third=" + third)
    val (first3, second3, _) = t
    println("first3=" + first3)
    println("second3=" + second3)
    val np ="New York".partition(_.isUpper)
    println(np)
    val symbols = Array("<", "-", ">")
    print("symbols=")
    for (e <- symbols) print(e + ", ")
    println()
    val counts = Array(2, 10, 2)
    print("counts=")
    for (e <- counts) print(e + ", ")
    println()
    val pairs = symbols.zip(counts)
    print("pairs=")
    for (e <- pairs) print(e)
    println()
    for((s, n) <- pairs) print(s * n)
    println()


  }
}
