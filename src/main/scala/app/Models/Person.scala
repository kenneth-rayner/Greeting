package app.Models

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
