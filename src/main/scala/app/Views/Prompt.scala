package app.Views

import scala.io.StdIn

object Prompt{

  def ask(message : String) = StdIn.readLine(message)
  def reply(message: String) = println(message)

}
