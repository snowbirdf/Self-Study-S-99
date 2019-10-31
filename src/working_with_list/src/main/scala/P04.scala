object P04 {
  def length[T](list :List[T]): Int = {
    list.length
  }

  def lengthRecursive[T](list :List[T]): Int = {
    list match {
      case Nil => 0
      case _ :: Nil => 1
      case _ :: tail => 1 + lengthRecursive(tail)
    }
  }
}
