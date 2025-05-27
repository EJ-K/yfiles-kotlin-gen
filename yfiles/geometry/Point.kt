// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.algorithms.Point2D
import yfiles.algorithms.YPoint
import yfiles.algorithms.YVector
import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata

/**
 * Represents an immutable point in two-dimensional Cartesian coordinates with [double precision][Number].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point">Online Documentation</a>
 * 
 * @constructor Initializes a new instance using the given values for the [x] and [y] properties.
 * @param [x] The x coordinate.
 * @param [y] The y coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-constructor-Point">Online Documentation</a>
 * 
 * @property x
 * Gets the X coordinate of the point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23x">Online Documentation</a>
 * 
 * @property y
 * Gets the Y coordinate of the point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23y">Online Documentation</a>
 */
external  class Point  (
final override val x: Double,
final override val y: Double) : IPoint {

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
 * Gets the normalized version of this vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23normalized">Online Documentation</a>
 */
final val normalized: Point
/**
 * Gets the squared length of the vector that has [x] and [y] as its components.
 * @see [vectorLength]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23squaredVectorLength">Online Documentation</a>
 */
final val squaredVectorLength: Double
/**
 * Gets the length of the vector that has [x] and [y] as its components.
 * @see [squaredVectorLength]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23vectorLength">Online Documentation</a>
 */
final val vectorLength: Double
/**
 * Adds the given vector and this instance and returns the result as new instance.
 * @param [otherPoint] The second point.
 * @return The result of the vector addition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-add">Online Documentation</a>
 */
 final   fun add( otherPoint: Point ):Point

/**
 * Adds the given vector and this instance and returns the result as new instance.
 * @param [otherPoint] The second point.
 * @return The result of the vector addition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plus( otherPoint: Point ):Point
/**
 * Determines the distance between this point and a line segment.
 * @param [start] The coordinates of the first point of the line.
 * @param [end] The coordinates of the second point of the line.
 * @return The distance between this point and the closest point on the line segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-distanceToSegment">Online Documentation</a>
 */
 final   fun distanceToSegment( start: Point ,
 end: Point ):Double
/**
 * Determines whether the two given points have the same coordinates with respect to a certain given `eps`.
 * @param [other] The other point to check for equality against this point.
 * @param [eps] The epsilon value.
 * @return Whether both coordinates are equal with respect for the given epsilon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-equalsEps">Online Documentation</a>
 */
 final   fun equalsEps( other: Point ,
 eps: Double ):Boolean
/**
 * Create a constrained copy of this instance that lies within the given non-empty `rectangle`.
 * @param [rectangle] The rectangle to constrain this instance by.
 * @return A constrained copy of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getConstrained">Online Documentation</a>
 */
 final   fun getConstrained( rectangle: Rect ):Point
/**
 * Calculates the projection of this point onto a line.
 * @param [anchor] An anchor for the infinite line.
 * @param [direction] A direction vector for the infinite line.
 * @return The point on the line that is closest to this point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getProjectionOnLine">Online Documentation</a>
 */
 final   fun getProjectionOnLine( anchor: Point ,
 direction: Point ):Point
/**
 * Calculates the projection of this point onto a ray.
 * @param [rayStart] The start of the segment.
 * @param [direction] The direction of the ray.
 * @return The point on the ray that is closest to this point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getProjectionOnRay">Online Documentation</a>
 */
 final   fun getProjectionOnRay( rayStart: Point ,
 direction: Point ):Point
/**
 * Calculates the projection of this point onto a segment.
 * @param [start] The start of the segment.
 * @param [end] The end of the segment.
 * @return The point on the segment that is closest to this point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-getProjectionOnSegment">Online Documentation</a>
 */
 final   fun getProjectionOnSegment( start: Point ,
 end: Point ):Point
/**
 * Determines if the point lies close to this point given an epsilon.
 * @param [other] The coordinates of the other point.
 * @param [hitTestRadius] The hit test epsilon.
 * @return Whether the distance between the two points is smaller than `hitTestRadius`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-hits">Online Documentation</a>
 */
 final   fun hits( other: Point ,
 hitTestRadius: Double ):Boolean
/**
 * Determines whether this point hits the line segment with respect to a given `radius`.
 * @param [start] The starting point of the line segment to test.
 * @param [end] The ending point of the line segment to test.
 * @param [radius] The hit test radius.
 * @return Whether this point hits the given line segment within the radius.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-hitsLineSegment">Online Documentation</a>
 */
 final   fun hitsLineSegment( start: Point ,
 end: Point ,
 radius: Double ):Boolean
/**
 * Determines whether a polygonal line is hit by this point given an epsilon.
 * @param [points] The list of points that is treated as a polygon
 * @param [radius] A positive value allows for fuzzy hit testing. If the point lies outside the given object but it's distance is less than or equal to that value, it will be considered a hit.
 * @return Whether the point hits the polygon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-hitsPolyline">Online Documentation</a>
 */
 final   fun hitsPolyline( points: IEnumerable<IPoint> ,
 radius: Double ):Boolean
/**
 * Multiplies the given factor with this instance using scalar multiplication and returns the result as new instance.
 * @param [factor] The factor to scale the components by.
 * @return The result of the scalar multiplication.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-multiply(number)">Online Documentation</a>
 */
 final   fun multiply( factor: Double ):Point

/**
 * Multiplies the given factor with this instance using scalar multiplication and returns the result as new instance.
 * @param [factor] The factor to scale the components by.
 * @return The result of the scalar multiplication.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-multiply(number)">Online Documentation</a>
 */
@JsName("multiply")
  final operator fun times( factor: Double ):Point
/**
 * Applies the given matrix to this instance by calling [Matrix.transform] and returns the result.
 * @param [matrix] The matrix to use for the transformation.
 * @return The result of the transformation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-multiply(Matrix)">Online Documentation</a>
 */
 final   fun multiply( matrix: Matrix ):Point

/**
 * Applies the given matrix to this instance by calling [Matrix.transform] and returns the result.
 * @param [matrix] The matrix to use for the transformation.
 * @return The result of the transformation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-multiply(Matrix)">Online Documentation</a>
 */
@JsName("multiply")
  final operator fun times( matrix: Matrix ):Point
/**
 * Calculates the scalar product of this and the given vector.
 * @param [other] The other vector.
 * @return The scalar product (`X*other.X + Y*other.Y`)
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-scalarProduct">Online Documentation</a>
 */
 final infix   fun scalarProduct( other: Point ):Double
/**
 * Subtracts the given vector from this instance and returns the result as new instance.
 * @param [otherPoint] The second point.
 * @return The result of the vector subtraction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-subtract">Online Documentation</a>
 */
 final   fun subtract( otherPoint: Point ):Point

/**
 * Subtracts the given vector from this instance and returns the result as new instance.
 * @param [otherPoint] The second point.
 * @return The result of the vector subtraction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-subtract">Online Documentation</a>
 */
@JsName("subtract")
  final operator fun minus( otherPoint: Point ):Point
/**
 * Creates a [MutablePoint] that has the same coordinates as this instance.
 * @return A [MutablePoint] with the same coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-toMutablePoint">Online Documentation</a>
 */
 final   fun toMutablePoint():MutablePoint
/**
 * Creates a [Point2D] from a given [Point].
 * @return The [Point2D].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-defaultmethod-toPoint2D">Online Documentation</a>
 */
   fun toPoint2D():Point2D
/**
 * Creates a [YPoint] from a given [Point].
 * @return The [YPoint].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-defaultmethod-toYPoint">Online Documentation</a>
 */
   fun toYPoint():YPoint
/**
 * Creates a [YVector] from a given [Point].
 * @return The [YVector].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-defaultmethod-toYVector">Online Documentation</a>
 */
   fun toYVector():YVector

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
 * Gets a [Point] instance that has both [x] and [y] set to `0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23ORIGIN">Online Documentation</a>
 */
 val ORIGIN: Point
/**
 * Performs an explicit conversion from [MutablePoint] to [Point].
 * @param [p] The point to convert.
 * @return The result of the conversion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-convertFrom">Online Documentation</a>
 */
@JsName("convertFrom")
  operator fun invoke( p: MutablePoint ):Point
/**
 * Performs an implicit conversion from [Point] to [MutablePoint].
 * @param [point] The point to convert.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-convertToMutablePoint">Online Documentation</a>
 */
   fun convertToMutablePoint( point: Point ):MutablePoint
/**
 * Calculates a linear interpolation between two points.
 * @param [point1] The point where `t` is `0`.
 * @param [point2] The point where `t` is `1`.
 * @param [t] The parameter that defines where to estimate the value on the interpolated line.
 * @return The interpolated value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-interpolate">Online Documentation</a>
 */
 final   fun interpolate( point1: Point ,
 point2: Point ,
 t: Double ):Point
/**
 * Calculates the scalar product of the two given points.
 * @param [point1] The first point.
 * @param [point2] The second point.
 * @return The scalar product of the two points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point%23Point-method-scalarProduct">Online Documentation</a>
 */
 final   fun scalarProduct( point1: Point ,
 point2: Point ):Double
}
}
