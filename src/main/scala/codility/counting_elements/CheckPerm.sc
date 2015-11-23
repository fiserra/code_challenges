val array = Array(0, 1, 2, 3)
val array2 = Array(1, 2, 3, 0)
val array3 = Array(4, 2, 3, 1)

def checkPerm(A: Array[Int]): Int = {
  val testable =  1 to A.length
  if (A.length != testable.length) 0
  else {
    val map = scala.collection.mutable.Map[Int, Int]()
    for (i <- A.indices) {
      map(A(i)) =  map.getOrElse(A(i), 0) + 1
      map(testable(i)) = map.getOrElse(testable(i), 0) - 1

      if(map.get(A(i)).contains(0)) map.remove(A(i))
      if(map.get(testable(i)).contains(0)) map.remove(testable(i))
    }
    if(map.isEmpty) 1
    else 0
  }
}

checkPerm(array)
checkPerm(array3)

