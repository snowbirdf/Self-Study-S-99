import org.scalatest.{DiagrammedAssertions, FlatSpec}

class P02Spec extends FlatSpec with DiagrammedAssertions {
   "lastButOne" should "return last but one element" in {
     assert(P02.lastButOne(List(1,1,2,3,5,8)) === 5)
     assert(P02.lastButOne(List("A","B","CD","E")) === "CD")
   }

  it should "throw error if list doesn't have enough element" in {
    intercept[Throwable](P02.lastButOne(Nil))
    intercept[Throwable](P02.lastButOne(List(1)))
    intercept[Throwable](P02.lastButOne(List()))
  }
}
