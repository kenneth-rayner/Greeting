package app.Models

object Pet extends App {

 sealed trait Pet {
    val name: String
    def speak(): String
  }

 final class Dog(override val name: String) extends Pet {
   override def speak() : String = {

     "Woof"
   }
 }

  final class Cat(override val name: String) extends Pet {
    override def speak(): String = {

      "Meow"
    }
  }

   val dog = new Dog("lassie")
   val cat = new Cat("tiddles")

   println(dog.speak())
   println(cat.speak())
   println(dog.name)
   println(cat.name)

}