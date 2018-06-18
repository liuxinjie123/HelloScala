package main.com.hello.entity

class Counter {
  private var value = 0  //必须初始化字段
  def increment() { value += 1}  //方法默认是公有的
  def current = value
  def isLess(other: Counter) = value < other.value
}
