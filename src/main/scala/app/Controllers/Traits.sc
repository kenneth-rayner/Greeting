import scala.io.Source

trait Pet {
  val name: String
}

final class Cat(override val name: String) extends Pet

final class Dog(override val name: String) extends Pet


trait Logging {

  def log : Boolean

}
trait LoggingToFile extends Logging {

  override def log: Boolean = {
    val file = Source.fromFile("").getLines()
    true
  }
}
trait Walking{
  def walk:String
}

trait DogWalking extends Walking{

  override def walk = "trot"
}

trait CatWalking extends Walking {
  override def walk = "swag"

}
val pets: List[Pet with Walking] = List(
  new Dog("Lassie") with DogWalking,
  new Cat ("anna") with CatWalking
)

pets.foreach(p=> println(p.walk)
}


 /** trait LogginToFileEncryptted  extends LoggingToFile {
    override def log    = ???


}
val rb = new SAccount()with LogginToFileEncryptted{

}
val rh = new SAccount()with LogginToFileEncryptted{

}
abstract class Bank
class SAccount extends Bank
val acc = new SAccount() with LoggingToFile
val acc2 = new SAccount()
acc.log
// acc2.log will not work as acc2 did not extend LogginToFile
/**Without traints we would have to achieve thi by defining
  * pointless abstract classes to share behaviours.
  * We overcome this using traits to mix in behaviours */
rb.log
*/