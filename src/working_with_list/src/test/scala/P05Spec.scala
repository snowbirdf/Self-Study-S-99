import org.scalatest.{DiagrammedAssertions, FlatSpec}

class P05Spec extends FlatSpec with DiagrammedAssertions {

  behavior of "P05Spec"

  it should "reverse argument list" in  {
    assert(P05.reverse(List(1,2,3,4,5)) === List(5,4,3,2,1))
    assert(P05.reverse(Nil) === Nil)
  }
}
