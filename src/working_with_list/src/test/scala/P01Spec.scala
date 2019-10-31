import org.scalatest.{DiagrammedAssertions, FlatSpec}

class P01Spec extends FlatSpec with DiagrammedAssertions {
  "last"  should "return last element of list" in {
    assert(P01.last(List(1,1,2,3,4,8)) === 8)
    assert(P01.last(List("A","b","C", "D", "E", "f")) === "f")
    assert(P01.last(List(1.1,2.00,0.18,3.14)) === 3.14)
  }

  it should "throw Exception when argument List is Nil or No Element" in {
    intercept[NoSuchElementException]{
      P01.last(Nil)
    }

    intercept[NoSuchElementException]{
      P01.last(List())
    }
  }

  "lastRecursive"  should "return last element of list" in {
    assert(P01.last(List(1,1,2,3,4,8)) === 8)
    assert(P01.last(List("A","b","C", "D", "E", "f")) === "f")
    assert(P01.last(List(1.1,2.00,0.18,3.14)) === 3.14)
  }

  it should "throw Exception when argument List is Nil or No Element" in {
    intercept[NoSuchElementException]{
      P01.last(Nil)
    }

    intercept[NoSuchElementException]{
      P01.last(List())
    }
  }

}
