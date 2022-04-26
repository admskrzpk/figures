import org.scalatest.flatspec._
import org.scalatest.matchers._

class SquareSpec extends AnyFlatSpec with should.Matchers {
  behavior of "Square"
  it should "return correct area of Square" in {
    val firstSquare = Square(3)
    val actual = firstSquare.area
    val expected = 9
    actual shouldBe expected
  }
  it should "return correct perimeter of Square" in {
    val secondSquare = Square(2)
    val actual = secondSquare.perimeter
    val expected = 8
    actual shouldBe expected
  }
}