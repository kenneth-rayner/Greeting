package app.Controllers

object filter extends App{

  val names =List("Adam","Daniel","Adam","David")

  for (name <- names){
    println(name)
    }
  for (name <-names if name != "daniel"){
    println(name)
  }
  val filterNames = for(name <-names if name !="daniel"
  )
    yield name


 val ages = List(1,25,34,18)

 val nested = for(name <-names if name != "daniel":
if name != "david" age <-ages) yield s"name: $name,age $age"
