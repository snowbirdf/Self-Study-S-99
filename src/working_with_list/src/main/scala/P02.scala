object P02 {
    def lastButOne[T](list:List[T]): T = {
        list match {
          case h1 :: _ :: Nil => h1
          case _ :: _ :: tail => lastButOne(tail)
          case _ => sys.error("this list doesn't have enough element")
        }
    }
}
