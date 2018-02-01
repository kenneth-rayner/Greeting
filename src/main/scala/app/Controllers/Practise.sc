class Greeter(prefix: String, suffix: String){
  def greet(name:String):Unit =
    println(prefix + name + suffix)
}
val greeter  = new Greeter("Hello, ", "!")
greeter.greet("Ken")

case class Point(x:Int , y: Int)
val point = new Point(1,2)
val point2 = new Point(1,2)
val point3 = new Point(2,3)

if(point == point2){
  println(point + " and " + point2 + " are the same.")
} else{
  println(point + " and " + point2 + " are different.")
}
if(point == point3){
  println(point + " and " + point3 + " are the same.")
} else{
  println(point + " and " + point3 + " are different.")
}
if(point2 == point3){
  println(point2 + " and " + point3 + " are the same.")
} else{
  println(point2 + " and " + point3 + " are different.")
}

object IdFactory{
  private var counter =0
  def create():Int ={

    counter +=1
    counter
  }
}
val newId: Int = IdFactory.create()
println(newId)
val newId2:Int =IdFactory.create()
println(newId2)

abstract class A{
  val message:String
}
class B extends A{
  val message = "I am an instance of class B"
}
class C extends B
val c = new C
println(c.message)

val names3 = List("dd","aa","bb")
for (name <-names3) {
  println(name)
}
for(a <- 1 until 4){
  println (s"Value of a:$a")
}

  for(a <- 1 to 10 if a !=3; if a%2 ==1){
    println (s"Value of a:$a")
  }

val names2 = List("aa","bb","cc","dd")
val filters2 =for(
  name2 <-names2 if name2 != "aa";if name2 != "bb"
)  yield name2

println(filters2)


val ages4 = List(1,5,31,14)
val names4 = List("adam","david","daniel","david")
val filtered = for(
  name4<-names4 if name4 != "david";if name4 !="daniel";
  age4 <-ages4
) yield s"name:$name4, age:$age4"

println(filtered)













val numbers =List(1,2,3,4,5,6)
def sumAndMultiplyBy(list:List[Int],
             f:Int =>Int)=
numbers.map(n =>f(n)).sum

val timesTwo =(n : Int)=> n * 2
val timesThree = (n : Int) => n*3
val timesTwoThentimesThree = timesTwo andThen timesThree

sumAndMultiplyBy(numbers, timesTwo)
sumAndMultiplyBy(numbers, timesThree)
sumAndMultiplyBy(numbers,timesTwoThentimesThree)

//all the same:
//list.map(timesTwo).map(timesThree)
//list.map(timesTwo andThen timesThree)





















