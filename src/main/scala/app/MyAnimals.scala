package app


 abstract class Animal{
  def speak ():String
}

class Cat extends Animal {
  override def speak(): String =  "Meow"
}
class Dog extends Animal{
  override def speak(): String =  "Woof"
}

object MyAnimals extends scala.App {

  val jess : Animal = new Cat()
  val lassie : Animal = new Dog()
  val fred: Meowth = new Meowth(40, false)
  val bill: BorderTerrier = new BorderTerrier()
  val jack: Wolf = new Wolf()
  val kev: PersianCat = new PersianCat()

  println(jack.speak())
  println (kev.speak())
  println(jess.speak())
  println(lassie.speak())
  println(fred.speak())
  println(bill.hunt())

}

class Wolf extends Dog{
  override def speak(): String =  "Howl!!"

}

class BorderTerrier extends Dog{
  def hunt(): String = "Border Terrier is hunting"
}

class PersianCat extends Cat {
  }

class Meowth(coins: Int, TeamRocket: Boolean) extends Cat {
 private val rocket : String = if (TeamRocket){
   "I am in team Rocket"
 } else {"I am not in team Rocket"}
  override def speak(): String = s"That's right, I have $coins coins,$rocket "

}
