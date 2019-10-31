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

  "lengthTailRecursive" should "return list length" in {
    assert(P04.lengthTailRecursive(List(1,2,3)) === 3)
    assert(P04.lengthTailRecursive(List("a")) === 1)
  }

  it should "return 0 when empty List" in {
    assert(P04.lengthTailRecursive(Nil) === 0)
    assert(P04.lengthTailRecursive(List()) === 0)
  }


  "lengthFoldLeft" should "return list length" in {
    assert(P04.lengthFoldLeft(List(1,2,3)) === 3)
    assert(P04.lengthFoldLeft(List("a")) === 1)
  }

  it should "return 0 when empty List" in {
    assert(P04.lengthFoldLeft(Nil) === 0)
    assert(P04.lengthFoldLeft(List()) === 0)
  }

}
