package app


import scala.io.StdIn


abstract class BankAccount(accountNumber: String, val balance: Double){
  def withdraw(amount: Double): BankAccount
  def deposit(amount: Double): BankAccount

  override def toString: String = s"Account number:$accountNumber \nBalance: $balance"
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

    private val depositThreshold: Double = 200.00

    override def deposit(amount: Double): BankAccount = {
      if (amount > depositThreshold) {
        val difference = amount - depositThreshold
        println(s"You can't deposit more than £$depositThreshold, Excess: $difference")

        new CashISASavingsAccount(accountNumber, balance + depositThreshold)
      }
      else {
        new CashISASavingsAccount(accountNumber, balance + amount)
      }
    }
  }
   class Person(name: String, age : Int,private val bankAccount: BankAccount){

  def this(name: String, age: Int)= this(
    name = name,
    age = age,
    bankAccount = new SavingsAccount("123",0.00))

  def this (name: String) = this(
    name=name,
    age = 0,
    bankAccount = new SavingsAccount("1234",0.00)
  )
def this(firstName:String,
         lastName:String) = this(
  name = s"$firstName $lastName",
  age =0,
  bankAccount = new SavingsAccount("12345",0.00)
)
  private val years : String = if(age==1)"year" else " years"

  def speak() : String = {
    if(name == "adam") {
      "You don't get a hello"
    }
    else {
       s"Hello $name, you are $age$years old.\nYour bank details are as follows:\n${bankAccount} "
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

 // println(savingsAccount.balance)
  //println(savingsPlus100.balance)
  //println(CashISASavingsAccount.balance)
  //println(CashISASavingsAccountplus100.balance)
  //println(CashISASavingsAccountminus100.balance)


  val cashIsa = new CashISASavingsAccount("12345",0.00)
  val isaDeposited = cashIsa.deposit(1000.00)
  val withdrawFromIsa = isaDeposited.withdraw(200.00)
  val personWithCashIsa = new Person("Loyal customer",56,withdrawFromIsa)

//  val name = Prompt.ask("What is your name?")
  //val age : String = Prompt.ask("How old are you?")
 // val p = new Person(name, age.toInt)
 // val child = new Person("David")
  //val p2  = new Person ("Ken","Rayner")

//  println(p.speak())
 // println(child.speak())
  // println(p2.speak())

  println(personWithCashIsa.speak())




}
