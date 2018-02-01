val dict = scala.io.Source.fromFile("/usr/share/dict/british-english").getLines.toSet
val checker = new ScrabbleScore(dict)
checker.wordExists(apple)