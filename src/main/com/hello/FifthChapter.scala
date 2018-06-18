package main.com.hello

import main.com.hello.entity.{Counter, Network, Person}

object FifthChapter {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment()
    println(myCounter.current)
    val jack = new Person
    println(jack.age)
    jack.age = 22
    println(jack.age)
    val chatter = new Network
    val myFace = new Network
    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")


  }
}
