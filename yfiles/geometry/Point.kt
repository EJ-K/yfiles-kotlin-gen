// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * Represents a point in two-dimensional Cartesian coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given values for the [x][Point] and [y][Point] properties.
 * @param [x] The x-coordinate.
 * @param [y] The y-coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-constructor-Point">Online Documentation</a>
 * 
 * @property x
 * Gets the x-coordinate of the point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23x">Online Documentation</a>
 * 
 * @property y
 * Gets the y-coordinate of the point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23y">Online Documentation</a>
 */
external class Point (
final override val x: Double,
final override val y: Double) : IPoint, IComparable<Point> {
  /**
   * Gets whether this instance is a horizontally oriented vector.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23isHorizontalVector">Online Documentation</a>
   */
  final val isHorizontalVector: Boolean
  
  /**
   * Gets whether this instance is a vertically oriented vector.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23isVerticalVector">Online Documentation</a>
   */
  final val isVerticalVector: Boolean
  
  /**
   * Creates a normalized version of this vector.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23normalized">Online Documentation</a>
   */
  final val normalized: Point
  
  /**
   * Gets the squared length of the vector that has [x][Point] and [y][Point] as its components.
   * @see [vectorLength]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23squaredVectorLength">Online Documentation</a>
   */
  final val squaredVectorLength: Double
  
  /**
   * Gets the length of the vector that has [x][Point] and [y][Point] as its components.
   * @see [squaredVectorLength]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23vectorLength">Online Documentation</a>
   */
  final val vectorLength: Double
  
  /**
   * Adds the given vector to this point.
   * @param [point] The vector.
   * @return The result of the vector addition.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-add">Online Documentation</a>
   */
  fun add(
    point: Point,
  ): Point
  
  /**
   * Adds the given vector to this point.
   * @param [point] The vector.
   * @return The result of the vector addition.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plus(
    point: Point,
  ): Point
  
  /**
   * Comparable implementation.
   * @param [other] The object to compare with the current instance.
   * @return A value that indicates the relative order of the objects being compared. The return value has these meanings:
   *   - -1 if this object's x- or y-coordinate is less than the compared object's x- or y-coordinate.
   *   - 1 if this object's x- or y-coordinate is greater than the compared object's x- or y-coordinate.
   *   - 0 if both the x- and y-coordinates are equal.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-compareTo">Online Documentation</a>
   */
  override operator fun compareTo(
    other: Point,
  ): Int
  
  /**
   * Determines the distance between this point and a line segment.
   * @param [start] The coordinates of the first point of the line.
   * @param [end] The coordinates of the second point of the line.
   * @return The distance between this point and the closest point on the line segment.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-distanceToSegment">Online Documentation</a>
   */
  fun distanceToSegment(
    start: Point,
    end: Point,
  ): Double
  
  /**
   * Determines whether the two given points have the same coordinates with respect to a certain given `eps`.
   * @param [other] The other point to check for equality against this point.
   * @param [eps] A positive value allows for fuzzy equality testing. If the `other` point's coordinates are within epsilon of this point's coordinates, the points are considered equal.
   * @return Whether both coordinates are equal with respect to the given epsilon.
   * @throws ArgumentError Thrown if the value of the given epsilon is negative.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-equalsEps">Online Documentation</a>
   */
  fun equalsEps(
    other: Point,
    eps: Double,
  ): Boolean
  
  /**
   * Create a constrained copy of this instance that lies within the given non-empty `rectangle`.
   * @param [rectangle] The rectangle to constrain this instance by.
   * @return A constrained copy of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getConstrained">Online Documentation</a>
   */
  fun getConstrained(
    rectangle: Rect,
  ): Point
  
  /**
   * Calculates the projection of this point onto a line.
   * @param [anchor] An anchor for the infinite line.
   * @param [direction] A direction vector for the infinite line.
   * @return The point on the line that is closest to this point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getProjectionOnLine">Online Documentation</a>
   */
  fun getProjectionOnLine(
    anchor: Point,
    direction: Point,
  ): Point
  
  /**
   * Calculates the projection of this point onto a ray.
   * @param [rayStart] The start of the segment.
   * @param [direction] The direction of the ray.
   * @return The point on the ray that is closest to this point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getProjectionOnRay">Online Documentation</a>
   */
  fun getProjectionOnRay(
    rayStart: Point,
    direction: Point,
  ): Point
  
  /**
   * Calculates the projection of this point onto a segment.
   * @param [start] The start of the segment.
   * @param [end] The end of the segment.
   * @return The point on the segment that is closest to this point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getProjectionOnSegment">Online Documentation</a>
   */
  fun getProjectionOnSegment(
    start: Point,
    end: Point,
  ): Point
  
  /**
   * Determines if the point lies close to this point given an epsilon.
   * @param [other] The coordinates of the other point.
   * @param [hitTestRadius] The hit test epsilon.
   * @return Whether the distance between the two points is smaller than `hitTestRadius`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-hits">Online Documentation</a>
   */
  fun hits(
    other: Point,
    hitTestRadius: Double,
  ): Boolean
  
  /**
   * Determines whether this point hits the line segment with respect to a given `radius`.
   * @param [start] The starting point of the line segment to test.
   * @param [end] The ending point of the line segment to test.
   * @param [radius] The hit test radius.
   * @return Whether this point hits the given line segment within the radius.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-hitsLineSegment">Online Documentation</a>
   */
  fun hitsLineSegment(
    start: Point,
    end: Point,
    radius: Double,
  ): Boolean
  
  /**
   * Determines whether a polygonal line is hit by this point given an epsilon.
   * @param [points] The list of points that is treated as a polygon
   * @param [radius] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
   * @return Whether the point hits the polygon.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-hitsPolyline">Online Documentation</a>
   */
  fun hitsPolyline(
    points: IEnumerable<IPoint>,
    radius: Double,
  ): Boolean
  
  /**
   * Multiplies the given factor with this instance using scalar multiplication and returns the result as new instance.
   * @param [factor] The factor to scale the components by.
   * @return The result of the scalar multiplication.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-multiply">Online Documentation</a>
   */
  fun multiply(
    factor: Double,
  ): Point
  
  /**
   * Multiplies the given factor with this instance using scalar multiplication and returns the result as new instance.
   * @param [factor] The factor to scale the components by.
   * @return The result of the scalar multiplication.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-multiply">Online Documentation</a>
   */
  @JsName("multiply")
  final operator fun times(
    factor: Double,
  ): Point
  
  /**
   * Negates the coordinates of this instance.
   * @return The result of the negation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-negate">Online Documentation</a>
   */
  fun negate(): Point
  
  /**
   * Calculates the scalar product of this and the given vector.
   * @param [other] The other vector.
   * @return The scalar product (`X*other.X + Y*other.Y`)
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-scalarProduct">Online Documentation</a>
   */
  infix fun scalarProduct(
    other: Point,
  ): Double
  
  /**
   * Subtracts the given vector from this instance and returns the result as new instance.
   * @param [point] The vector.
   * @return The result of the vector subtraction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-subtract">Online Documentation</a>
   */
  fun subtract(
    point: Point,
  ): Point
  
  /**
   * Subtracts the given vector from this instance and returns the result as new instance.
   * @param [point] The vector.
   * @return The result of the vector subtraction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-subtract">Online Documentation</a>
   */
  @JsName("subtract")
  final operator fun minus(
    point: Point,
  ): Point
  
  /**
   * Creates a [MutablePoint] that has the same coordinates as this instance.
   * @return A [MutablePoint] with the same coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-toMutablePoint">Online Documentation</a>
   */
  fun toMutablePoint(): MutablePoint
  /**
   * @return [x]
   */    
  @JsName("__ygen_x_negy__")
  final operator fun component1(): Double
  /**
   * @return [y]
   */    
  @JsName("__ygen_y_negy__")
  final operator fun component2(): Double
  
  
  
  companion object : ClassMetadata<Point> {
    /**
     * Gets a [Point] instance that has both [x][Point] and [y][Point] set to `0`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23ORIGIN">Online Documentation</a>
     */
     val ORIGIN: Point
    
    /**
     * Returns the Euclidean distance between two points.
     * @param [p1] An arbitrary point
     * @param [p2] An arbitrary point
     * @return The Euclidean distance between p1 and p2.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-distance(IPoint,IPoint)">Online Documentation</a>
     */
    fun distance(
      p1: IPoint,
      p2: IPoint,
    ): Double
    
    /**
     * Returns the Euclidean distance between two points.
     * @param [x1] x-coordinate of the first point
     * @param [y1] y-coordinate of the first point
     * @param [x2] x-coordinate of the second point
     * @param [y2] y-coordinate of the second point
     * @return the Euclidean distance between the first and second point
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-distance(number,number,number,number)">Online Documentation</a>
     */
    fun distance(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
    ): Double
    
    /**
     * Calculates a linear interpolation between two points.
     * @param [point1] The point where `t` is `0`.
     * @param [point2] The point where `t` is `1`.
     * @param [t] The parameter that defines where to estimate the value on the interpolated line.
     * @return The interpolated value.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-interpolate">Online Documentation</a>
     */
    fun interpolate(
      point1: Point,
      point2: Point,
      t: Double,
    ): Point
    
    /**
     * Returns a point that geometrically lies in the middle of the line formed by the given points.
     * @param [p1] an arbitrary instance of [Point].
     * @param [p2] an arbitrary instance of [Point].
     * @return a point that geometrically lies in the middle of the line formed by the given points.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-midPoint">Online Documentation</a>
     */
    fun midPoint(
      p1: Point,
      p2: Point,
    ): Point
    
    /**
     * Calculates the scalar product of the two given points.
     * @param [point1] The first point.
     * @param [point2] The second point.
     * @return The scalar product of the two points.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-scalarProduct">Online Documentation</a>
     */
    fun scalarProduct(
      point1: Point,
      point2: Point,
    ): Double
    
    /**
     * Returns a copy of the given point with exchanged x- and y-coordinates.
     * @param [p] An arbitrary instance of [Point].
     * @return A copy of the given point with exchanged x- and y-coordinates.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-swap">Online Documentation</a>
     */
    fun swap(
      p: Point,
    ): Point
  }
}
