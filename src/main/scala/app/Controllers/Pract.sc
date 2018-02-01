class Quiz(val title: String, val name : String, val score : Int) {

  override def toString: String = s"Name: $name"

}

val quizzes = List(
  new Quiz("part 1", "michael", 8),
  new Quiz("part 1", "pan", 1),
  new Quiz("part 1", "andrew", 9),
  new Quiz("part 1", "shannon", 7),
  new Quiz("part 1", "connor", 0),
  new Quiz("part 2", "michael", 6),
  new Quiz("part 2", "connor", 9)
)

val connorsResults = quizzes.filter(q => q.name == "connor")

val total = (total : Int, quiz: Quiz) => total + quiz.score


connorsResults.foldLeft(0)(total)

val double = (n : Int) => n * 2

val plusOne = (n : Int) => n + 1

val add = (acc : Int, n : Int) => acc + n

val nums = List(1, 2, 3, 6, 8, 12, 45, 68)
nums.map(double).foldLeft(0)(add)

val doublePlusOne = double andThen plusOne
nums.map(doublePlusOne)