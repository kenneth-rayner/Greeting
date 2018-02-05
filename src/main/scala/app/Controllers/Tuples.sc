//import app.Models.BankAccount

class BankAccount(val accountNUmber : Int)
class Quiz(val quizName:  String)
class Person(val name : String)

val p1 = new Person ("Adam")
val b1 = new BankAccount(123456)
val q1 = new Quiz ("quizzie")

val t : (Person, BankAccount,Quiz) = (p1,b1,q1)

t._1.name
t._2.accountNUmber
t._3.quizName




