import org.scalatest.{DiagrammedAssertions, FlatSpec}

class P04Spec extends FlatSpec with  DiagrammedAssertions {
  "length" should "return list length" in {
    assert(P04.length(List(1,2,3)) === 3)
    assert(P04.length(List("a")) === 1)
  }

  it should "return 0 when empty List" in {
    assert(P04.length(Nil) === 0)
    assert(P04.length(List()) === 0)
  }

  "lengthRecursive" should "return list length" in {
    assert(P04.lengthRecursive(List(1,2,3)) === 3)
    assert(P04.lengthRecursive(List("a")) === 1)
  }

  it should "return 0 when empty List" in {
    assert(P04.lengthRecursive(Nil) === 0)
    assert(P04.lengthRecursive(List()) === 0)
  }

}
