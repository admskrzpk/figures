import org.scalatest.flatspec._
import org.scalatest.matchers._

class TriangleSpec extends AnyFlatSpec with should.Matchers {
  behavior of "Triangle"
  it should "return correct area of Triangle" in {
    val firstTriangle = Triangle(6,2,1)
    val actual = firstTriangle.area
    val expected = 4
    actual shouldBe expected
  }
  it should "return correct perimeter of Triangle" in {
    val secondTriangle = Triangle(4,5,6)
    val actual = secondTriangle.perimeter
    val expected = 15
    actual shouldBe expected
  }
}
