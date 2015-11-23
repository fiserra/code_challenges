def solution(X: Int, Y: Int, D: Int): Int =
  if ((Y - X) % D == 0) (Y - X) / D
  else (Y - X) / D + 1


solution(10, 85, 30)