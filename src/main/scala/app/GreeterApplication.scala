package app


import scala.io.StdIn


abstract class BankAccount(accountNumber: String, val balance: Double){
  def withdraw(amount: Double): BankAccount
  def deposit(amount: Double): BankAccount
}

class SavingsAccount(accountNumber:String,balance: Double) extends BankAccount(accountNumber, balance) {

  override def withdraw(amount: Double): BankAccount = {
    if ((balance - amount) < 0) {
      println(s"You have insufficient funds")
      this
    } else {
      val deducted = balance - amount
      println(s"Balance after deductions:$deducted")
      new SavingsAccount(accountNumber, deducted)
    }
  }

  override def deposit(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance + amount)
}

  final class CashISASavingsAccount(accountNumber: String, balance :Double) extends BankAccount(accountNumber, balance) {
    override def withdraw(amount: Double): BankAccount = {
      println(s"You can't withdraw yet, your money is locked in for 3 years!!!!")
      this
    }

    override def deposit(amount: Double): BankAccount = {
      new CashISASavingsAccount(accountNumber, balance + amount)
    }
  }
class Person(name: String, age : Int){

  private val years : String = if(age>1)"years" else " year"

  def speak() : String = {
    if(name == "adam") {
      "You don't get a hello"
    }
    else {
       s"Hello $name, your are $age $years old"
    }
  }
}
object Prompt{

  def ask(message : String) = StdIn.readLine(message)

}

object GreeterApplication extends App{

  val savingsAccount = new SavingsAccount("12345",100.00)
  val savingsPlus100 = savingsAccount.deposit(50.00)

  val CashISASavingsAccount = new CashISASavingsAccount("12345",100.00)
  val CashISASavingsAccountplus100= CashISASavingsAccount.deposit(50.00)
  val CashISASavingsAccountminus100= CashISASavingsAccount.withdraw(50.00)

  println(savingsAccount.balance)
  println(savingsPlus100.balance)
  println(CashISASavingsAccount.balance)
  println(CashISASavingsAccountplus100.balance)
  println(CashISASavingsAccountminus100.balance)



  val name = Prompt.ask("What is your name?")
  val age : String = Prompt.ask("How old are you?")
  val p = new Person(name, age.toInt)
  println(p.speak())


}
