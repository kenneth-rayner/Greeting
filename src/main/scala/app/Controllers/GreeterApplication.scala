package app.Controllers

import app.Models.{CashISASavingsAccount, Person, SavingsAccount}
import app.Views.Prompt


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
  val personWithCashIsa = new Person("Loyal customer",56,List(withdrawFromIsa))
  val superAccount =new CashISASavingsAccount("1223468",0.00,depositThreshold =800.00).deposit(1000.00).withdraw(00.00)
  val superPersonWithIsa = new Person("Fred", 56, List(superAccount))

  println(superPersonWithIsa.speak())
  val nameSet = Set ("Adam","Mark","Dave","Adam")
  println(nameSet)

  val name = Prompt.ask("What is your name?")
  val age : String = Prompt.ask("How old are you?")
  val p = new Person(name, age.toInt,Nil)
 // val child = new Person("David")
  //val p2  = new Person ("Ken","Rayner")

   println(p.speak())
 // println(child.speak())
  // println(p2.speak())

 // println(personWithCashIsa.speak())




}
