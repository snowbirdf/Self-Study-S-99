object P01 extends App {

  def last[A](lst: List[A]) : A  = {
    lst.last
  }

  def lastRecursive[A](list : List[A]): A = {
    list match {
      case head :: Nil => head
      case _ :: tail => lastRecursive(tail)
      case _ => throw new NoSuchElementException()
    }
  }

}
