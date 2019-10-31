object P03 {
  def nth[T](n: Int, list: List[T]) : T = {
    if(list.size <= n) {
      sys.error("list doesn't have enogh element")
    } else {
      list(n)
    }
  }
}
