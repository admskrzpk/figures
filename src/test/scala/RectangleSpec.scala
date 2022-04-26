import org.scalatest.flatspec._
import org.scalatest.matchers._

class RectangleSpecSpec extends AnyFlatSpec with should.Matchers {
  behavior of "Rectangle"
  it should "return correct area of Rectangle" in {
    val firstRectangle = Rectangle(3,2)
    val actual = firstRectangle.area
    val expected = 6
    actual shouldBe expected
  }
  it should "return correct perimeter of Rectangle" in {
    val secondRectangle = Rectangle(5,4)
    val actual = secondRectangle.perimeter
    val expected = 18
    actual shouldBe expected
  }
}