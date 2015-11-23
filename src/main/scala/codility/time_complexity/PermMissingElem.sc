import scala.collection.mutable
val A = Array(2, 3, 1, 5)
val map: mutable.Set[Int] = mutable.Set((1 to A.length + 1).toArray :_*)
A.foreach(el => map.remove(el))
map.head



