import app.Models.BankAccount

class Iterator (var list : List[Int]){

  var position = -1

  def hasNext() : Boolean ={
    list.nonEmpty
  }
  def next():Int = {
   val value =list.head
    list = list.tail
    value
  }




}
val iter = new Iterator(List(4,5,6))

  iter.hasNext()
  iter.next()

  iter.hasNext()
  iter.next()



//  iter.hasNext()
  //iter.next()

  //iter.hasNext()
 // iter.next()





val ints = List(1,2,3,4,5,6,7)
val total =ints.foldLeft[Int](0)((acc, num)=> {
val sum = acc + num
println(s"$acc + $num=$sum")
sum})
total
val totals = ints.foldLeft(0)(_+_)
println(totals)

val string = List("Kev ","Kev ","Liam")
val teamHandsome = string.foldLeft[String]("")((acc, num)=>(acc + num))
  println(teamHandsome)
