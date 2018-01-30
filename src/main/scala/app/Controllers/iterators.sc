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

  iter.hasNext()
  iter.next()

  iter.hasNext()
  iter.next()