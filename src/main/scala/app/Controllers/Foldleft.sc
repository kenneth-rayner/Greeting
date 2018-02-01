class Product(val name: String, val category: String, val price: Int) {
  override def toString(): String = {
    s"$name - $category ($price)"
  }
}

val bread = new Product("Bread", "Food", 80)
val milk = new Product("Milk", "Food", 60)
val washingUpLiquid = new Product("Washing up liquid", "Household", 100)
val bleach = new Product("Bleach", "Household", 70)
val basket = List(bread, milk, milk, washingUpLiquid, bleach)

basket.foldRight(0)(_.price + _)
basket.foldRight(0)((prod, acc) =>prod.price + acc)
basket.foldLeft(0)((acc, prod) =>acc + prod.price)

val filtered:List[Product] =basket.filter(p => p.category =="Food")

basket.filter(p => p.category =="Food")
.foldRight(0)(_.price + _)

basket.map(_.price * 0.9).foldRight(0d)(_ + _)
basket.map(_.price * 0.9).foldRight(0.0)(_ + _)

val washDiscountPrice =(washingUpLiquid.price*0.5)
val othersTotal= basket.filter(p => p.name !="Washing up" +
  " liquid").map(_.price).foldLeft(0d)(_+_)
val totalB4TenPercentDisc=washDiscountPrice +othersTotal
val totalAfterDisc =totalB4TenPercentDisc * 0.9
println(totalAfterDisc)


val washingUpTotal=basket.filter(p => p.name == "Washing up" +
  " liquid").map(_.price * 0.5).foldRight(0d)(_ + _)
val everyThingElseTotal = basket.filter(p=>p.name != "Washing up" +
  " liquid").map(_.price).foldRight(0d)(_ +_)
washingUpTotal +everyThingElseTotal

val totalb4Disc =basket.map(fred => if(fred.name == "Washing up" +
  " liquid")fred.price * 0.5 else fred.price).foldRight(0d)(_ + _)
val totalAfterDiscount =totalb4Disc * 0.9
println(totalAfterDiscount)


val list = List(1,2,3,4,5)

list.foldLeft(0)((acc,num) => {
  println("acc is " + acc + " and num is " + num);
  acc + num
})

list.foldRight(0)(_ + _)
list.foldLeft(1)(_ * _)