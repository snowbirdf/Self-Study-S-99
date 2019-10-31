object P05 {
  def reverse[T](list: List[T]) : List[T] = {
    list.reverse
  }

  def reverseRecursive[T](list: List[T]) :List[T] = {
    list match {
      case Nil => Nil
      case x :: tail => reverseRecursive(tail) ++ List(x)
    }
  }


}
