import scala.math._
case class Circle (r: Int) {
  def perimeter: Int = (2 * Pi * r).toInt
  def area: Int = (Pi * (r * r)).toInt
}
