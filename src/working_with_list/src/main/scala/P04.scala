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

  def lengthTailRecursive[T](list :List[T]):Int = {
    def tailRecursive(result: Int, list:List[T]): Int = list match {
      case Nil => result
      case _ :: tail => tailRecursive(result + 1, tail)
    }

    tailRecursive(0, list)
  }

  def lengthFoldLeft[T](list: List[T]): Int = {
    list.foldLeft(0)((result, _) => result + 1)
  }
}
