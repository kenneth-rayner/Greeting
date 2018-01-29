package app

abstract class Potion {
  val brewed: String
}

final class PolyjuicePotion extends Potion {
  val brewed = "Polyjuice Potion brewed"
}

final class DraughtOfLivingDeath extends Potion {
  val brewed = "Draught Of Living Death Potion brewed"
}

class Ingredient(val name: String)

object Aconite extends Ingredient("Aconite")
object AddersFork extends Ingredient("Adder's Fork")
object DragonHorn extends Ingredient("Dragon Horn")
object EyeOfNewt extends Ingredient("Eye Of Newt")
object Moonstone extends Ingredient("Moonstone")
object DeathCap extends Ingredient("Death Cap")
object ReemBlood extends Ingredient("Re'em Blood")
object PearlDust extends Ingredient("Pearl Dust")
object NifflersFancy extends Ingredient("Niffler's Fancy")
object Nightshade extends Ingredient("Nightshade")

class BrewingException extends Exception

object Cauldron {

  def brew(ingredient1: Ingredient, ingredient2: Ingredient, ingredient3: Ingredient): Potion = {
    if(ingredient1.name == Aconite.name && ingredient2.name == DragonHorn.name && ingredient3.name == PearlDust.name) {
      new PolyjuicePotion
    } else if(ingredient1.name == Nightshade.name && ingredient2.name == Moonstone.name && ingredient3.name == DeathCap.name) {
      new DraughtOfLivingDeath
    } else {
      throw new BrewingException()
    }
  }

}

object PotionBrewingGame extends App {
  println(Cauldron.brew(Aconite, DragonHorn, PearlDust).brewed)
  println(Cauldron.brew(Nightshade, Moonstone, DeathCap).brewed)
  println(Cauldron.brew(ReemBlood, Nightshade, AddersFork))
}