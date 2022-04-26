import org.scalatest.flatspec._
import org.scalatest.matchers._

class CircleSpec extends AnyFlatSpec with should.Matchers {
  behavior of "Circle"
  it should "return correct area of Circle" in {
    val firstCircle = Circle(4)
    val actual = firstCircle.area
    val expected = 50
    actual shouldBe expected
  }
  it should "return correct perimeter of Circle" in {
    val secondCircle = Circle(5)
    val actual = secondCircle.perimeter
    val expected = 31
    actual shouldBe expected
  }
}
