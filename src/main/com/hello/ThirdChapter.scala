package main.com.hello

object ThirdChapter {
  def main(args: Array[String]): Unit = {
    val numArray = new Array[Int](10)
    for (i <- 0 until numArray.length) println(i + " --- " + numArray(i))
    val strArray = new Array[Int](10)
    for (i <- 0 until strArray.length) println(i + " --- " + strArray(i))
    val s = Array("Hello", "Scala")
    for (i <- 0 until s.length) println(i + " --- " + s(i))
    import scala.collection.mutable.ArrayBuffer
    val b = ArrayBuffer[Int]()
    b += 1;
    println(b)
    b += (1, 2, 3, 4)
    println(b)
    b ++= Array(8, 13, 22)
    println(b)
    b.trimEnd(5)
    println(b)
    b.insert(2, 6)
    println(b)
    b.insert(2, 7, 8, 9)
    println(b)
    b.remove(2)
    println(b)
    b.remove(2, 3)
    println(b)
    for (i <- 0 until (10, 2)) print(i + ", ")
    println()
    val c = for (elem <- b) yield 2 * elem
    println("c=" + c)
    val d = for (elem <- b if (elem % 2 == 0)) yield  2 * elem
    println("d=" + d)
    val e = b.filter(_ % 2 == 0).map(2 * _)
    println("e=" + e)
    val f = c.filter{_ % 2 == 0} map{2 * _}
    println("f=" + f)
    var a = ArrayBuffer(1, 2, -3, 4, -5, 7, 0)
    println("a=" + a)
    a = Fun.array2(a)
    println("a=" + a)
    println("sum(a)=" + a.sum)
    val b1 = ArrayBuffer(1, 3, 99, 6, 0)
    val b1Sorted = b1.sortWith(_ < _)
    println("b1=" + b1)
    println("b1Sorted=" + b1Sorted)
    val b1Desending = b1.sortWith(_ > _)
    println("b1Desending=" + b1Desending)
    val a2 = Array(1, 3, 0, 66, 8, 12)
    print("a2=")
    for (i <- a2) print(i + ", ")
    println()
    scala.util.Sorting.quickSort(a2)
    print("a2=")
    for (i <- a2) print(i + ", ")
    println()
    val a2Str = a2.mkString(", ")
    println("a2Str=" + a2Str)
    val a2Str2 = a2.mkString("[", ", ", "]")
    println("a2Str2=" + a2Str2)
    b1.append(1, 2, 3, 4, 5)
    println("b1=" + b1)
    b1.appendAll(a2)
    println("b1=" + b1)
    println("b1(>0).count=" + b1.count(_>0))
    println("b1(<0).count=" + b1.count(_<=0))
    b1 += 6 -= 7
    println("b1=" + b1)
    import scala.collection.mutable.ArrayBuffer
    val command = ArrayBuffer("ls", "-al", "/")
//    val pb = new ProcessBuilder(command)


  }
}
