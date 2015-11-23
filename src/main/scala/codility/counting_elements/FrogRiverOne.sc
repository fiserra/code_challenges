import scala.annotation.tailrec

def solution(X: Int, A: Array[Int]): Int = {
  var sum = ((X + 1) * X) / 2
  var set = Set[Int]()
  var earliest = -1

  while (sum > 0) {
    earliest += 1
    val elem = A(earliest)
    if (!set.contains(elem)) {
      sum -= A(earliest)
      set += elem
    }
  }

  earliest
}


def solution2(X: Int, A: Array[Int]): Int = {
  @tailrec
  def innerSolution(sum: Int, time: Int, set: Set[Int]): Int = {
    if(sum == 0) time - 1
    else {
      if(time > A.length - 1) return -1
      val elem = A(time)
      if (!set.contains(elem)) {
        innerSolution(sum - elem,  time  + 1, set + elem)
      } else {
        innerSolution(sum,  time  + 1, set)
      }
    }
  }
  innerSolution(((X + 1) * X) / 2, 0, Set[Int]())
}


solution(5, Array(1, 3, 1, 4, 2, 3, 5, 4))
solution2(5, Array(1, 3, 1, 4, 2, 3, 4))