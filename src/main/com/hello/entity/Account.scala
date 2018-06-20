package main.com.hello.entity

class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount }
}

object Account {
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber}
}