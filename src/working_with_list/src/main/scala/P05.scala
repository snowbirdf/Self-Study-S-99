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

  def reverseRecursiveOnlyTail[T](list: List[T]): List[T] = {
    def tailRecursive[T](result: List[T], list: List[T]): List[T] = {
      list match {
        case Nil => result
        case x :: tail => tailRecursive(x :: result , tail)
      }
    }

    tailRecursive(Nil:List[T],list)

  }


}
