case class Rectangle (a: Int, b: Int) extends Figure {
  def perimeter: Long = 2 * (a + b)
  def area: Long = a * b
}
