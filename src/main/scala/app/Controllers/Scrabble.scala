import scala.io.StdIn

class Scrabble (word : String) {

  val word1 = word.toList

  val    letters    :    Map[Char,    Int]    =    Map(
    'a'    ->    1,
    'e'    ->    1,
    'i'    ->    1,
    'o'    ->    1,
    'n'    ->    1,
    'r'    ->    1,
    't'    ->    1,
    'l'    ->    1,
    's'    ->    1,
    'u'    ->    1,
    'd' -> 2,
    'g' -> 2,
    'b' -> 3,
    'c' -> 3,
    'm' -> 3,
    'p' -> 3,
    'f' -> 4,
    'h' -> 4,
    'v' -> 4,
    'w' -> 4,
    'y' -> 4,
    'k' -> 5,
    'j' -> 8,
    'x' -> 8,
    'q' -> 10,
    'z' -> 10,
  )

  val totalScore = word1.foldLeft(0)( _ + letters(_))
  println("is a valid word.")

  val doubleScore = StdIn.readLine("Was your word a Double Score? ")
  val tripleScore = StdIn.readLine("Was your word a Triple Score? ")

  if(doubleScore == "yes") {

    println(totalScore * 2)

  }
  else if (tripleScore == "yes") {

    println(totalScore * 3)

  }
  else {
    println(totalScore)
  }
}

object ScrabbleCalc extends App {

  val userWord = StdIn.readLine("Please enter a word: ")
  //val word : Scrabble = new Scrabble(userWord)
  //val word = ""
  val dict = scala.io.Source.fromFile("/usr/share/dict/british-english").getLines.toSet

  if (dict.contains(userWord)) {

    val word: Scrabble = new Scrabble(userWord)

  }

  else {

    println("Word is not valid.")

  }
}