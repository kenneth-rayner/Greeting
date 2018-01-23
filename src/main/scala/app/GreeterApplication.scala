package app

import scala.io.StdIn

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


  val name = Prompt.ask("What is your name?")
  val age : String = Prompt.ask("How old are you?")
  val p = new Person(name, age.toInt)
  println(p.speak())



}
