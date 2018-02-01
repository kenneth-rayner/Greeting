import app.Models.BankAccount

val names =List("Adam","Daniel","Adam","David")

  for (name <- names){
    println(name)
  }
  for (name <-names if name != "Daniel"){
    println(name)
  }
for (name <-names if name != "Daniel")
  yield name



  val filterNames = for(name <-names if name !="Daniel"
  )
    yield name
println(filterNames)

  val ages = List(1,25,34,18)

  val nested = for(name <-names if name != "Daniel";
  if name != "David"; age <-ages) yield s"name: $name,age $age"
println(nested)

  class BankAccount(num:String){
    override def toString:String =s"accountNumber:$num"
  }

  val accounts = for (num<-1 to 10)
    yield new BankAccount(s"$num")
  val personWithAccounts = List(
    ("adam",
      List(
    accounts(0),
    accounts(1)
  )
  ),
  ("daniel", List (accounts(1))),
  ("michael", List (accounts(2))),
  ("chris", List (accounts(3))),
  ("connor", List (accounts(4)))
  )
  for (p <-personWithAccounts;
       accounts <-p._2) yield s"${p._1} ${accounts}"


for(b <- 1to 5 by 2){
  println(b)
}