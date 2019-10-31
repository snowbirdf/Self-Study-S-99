import org.scalatest.{DiagrammedAssertions, FlatSpec}

class P03Spec extends FlatSpec with DiagrammedAssertions {
   "nth" should "return element in the specific　order" in {
     assert(P03.nth(2, List(1,1,2,3,5,8)) ===  2)
     assert(P03.nth(0, List(1,2,3,5,8)) === 1)
     assert(P03.nth(3, List("a","bc","d","ef")) === "ef")
   }

  it should "be error when list doesn't have enough number of element" in {
    intercept[Throwable](
      P03.nth(3, List(1, 2, 3))
    )
    intercept[Throwable](
      P03.nth(0, Nil)
    )
  }
}
