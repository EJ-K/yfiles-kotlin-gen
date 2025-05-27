// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * A horizontal or vertical [Interval] that additionally stores a y- (in the horizontal case) or x-coordinate (in the vertical case).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval">Online Documentation</a>
 * 
 * @constructor Creates a new [OrthogonalInterval] instance with the given interval bounds.
 * @param [range] the given range
 * @param [location] the location in the two-dimensional coordinate system
 * @param [vertical] `true` if the orthogonal interval is vertical, `false` if it is horizontal
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-constructor-OrthogonalInterval(Interval,number,boolean)">Online Documentation</a>
 * 
 * @property range
 * Gets the range of this [OrthogonalInterval].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23range">Online Documentation</a>
 * 
 * @property location
 * Gets the vertical coordinate for horizontal intervals or the horizontal coordinate for vertical intervals, respectively.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23location">Online Documentation</a>
 * 
 * @property vertical
 * Gets whether or not the [OrthogonalInterval] is oriented vertically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23vertical">Online Documentation</a>
 */
external class OrthogonalInterval (
final val range: Interval,
final val location: Double,
final val vertical: Boolean)  {
  /**
   * Creates a new [OrthogonalInterval] instance using the `from` and `to` values as interval bounds.
   * @param [from] the start of the interval bounds
   * @param [to] the end of the interval bounds
   * @param [location] the location in the two-dimensional coordinate system
   * @param [vertical] `true` if the orthogonal interval is vertical, `false` if it is horizontal
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-constructor-OrthogonalInterval(number,number,number,boolean)">Online Documentation</a>
   */ constructor(
    from: Double,
    to: Double,
    location: Double,
    vertical: Boolean,
  )
  /**
   * Gets the center of this [OrthogonalInterval] in the 2D-coordinate system.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23center">Online Documentation</a>
   */
  final val center: Point
  
  /**
   * Gets the upper bound of the [OrthogonalInterval].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23maximum">Online Documentation</a>
   */
  final val maximum: Double
  
  /**
   * Gets the lower bound of the [OrthogonalInterval].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23minimum">Online Documentation</a>
   */
  final val minimum: Double
  
  /**
   * Gets the length of the [OrthogonalInterval].
   * @see [Interval.size]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23size">Online Documentation</a>
   */
  final val size: Double
  
  /**
   * Checks whether or not this [OrthogonalInterval] is fully covered by the given [OrthogonalInterval].
   * @param [other] the other orthogonal interval
   * @return `true` if this orthogonal interval is fully covered by the other orthogonal interval, `false` otherwise
   * @throws ArgumentError if the orthogonal intervals have different orientations
   * @see [PartitionCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-coveredBy">Online Documentation</a>
   */
  infix fun coveredBy(
    other: OrthogonalInterval,
  ): Boolean
  
  /**
   * Determines whether or not this [OrthogonalInterval] crosses the given one.
   * @param [other] the other orthogonal interval
   * @return `true` if this orthogonal interval crosses the given one, `false` otherwise
   * @throws ArgumentError if the given orthogonal intervals have the same orientation
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-crosses">Online Documentation</a>
   */
  infix fun crosses(
    other: OrthogonalInterval,
  ): Boolean
  
  /**
   * Returns the distance of the [range][OrthogonalInterval]s of this [OrthogonalInterval] and the given [OrthogonalInterval].
   * @param [other] the other orthogonal interval
   * @return `0` if the orthogonal intervals [intersect][OrthogonalInterval] each other, otherwise the minimal distance between the orthogonal intervals is returned
   * @throws ArgumentError if the orthogonal intervals have different orientations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-distanceTo">Online Documentation</a>
   */
  infix fun distanceTo(
    other: OrthogonalInterval,
  ): Double
  
  /**
   * Checks whether or not this [OrthogonalInterval] and the given [OrthogonalInterval] cover the same range.
   * @param [other] the other orthogonal interval
   * @return `true` if the orthogonal intervals cover the same range, `false` otherwise
   * @throws ArgumentError if the orthogonal intervals have different orientations
   * @see [PartitionCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-hasSameRange">Online Documentation</a>
   */
  infix fun hasSameRange(
    other: OrthogonalInterval,
  ): Boolean
  
  /**
   * Checks whether or not this [OrthogonalInterval] intersects the given [OrthogonalInterval] and the intersection has a given minimum intersection size.
   * @param [other] the other orthogonal interval
   * @param [minIntersection] the minimum size of the intersection
   * @return `true` if this interval intersects the given other orthogonal interval, `false` otherwise
   * @throws ArgumentError if the orthogonal intervals have different orientations
   * @see [PartitionCell]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-intersects">Online Documentation</a>
   */
  fun intersects(
    other: OrthogonalInterval,
    minIntersection: Double  = definedExternally,
  ): Boolean
  
  /**
   * Returns the Manhattan distance of this [OrthogonalInterval] and the given [OrthogonalInterval].
   * @param [other] the other orthogonal interval
   * @return the Manhattan distance between this interval and the given one
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-manhattanDistanceTo">Online Documentation</a>
   */
  infix fun manhattanDistanceTo(
    other: OrthogonalInterval,
  ): Double
  
  companion object : ClassMetadata<OrthogonalInterval> {
    /**
     * Calculates the intersection of the given [OrthogonalInterval]s.
     * @param [i1] the first orthogonal interval
     * @param [i2] the second orthogonal interval
     * @return the shared orthogonal interval of both given orthogonal intervals
     * @throws ArgumentError if the orthogonal intervals have different orientations
     * @see [intersects]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-calculateIntersection">Online Documentation</a>
     */
    fun calculateIntersection(
      i1: OrthogonalInterval,
      i2: OrthogonalInterval,
    ): OrthogonalInterval?
    
    /**
     * Calculates the union of the given [OrthogonalInterval]s.
     * @param [i1] the first orthogonal interval
     * @param [i2] the second orthogonal interval
     * @return the union of both given orthogonal intervals
     * @throws ArgumentError if the orthogonal intervals have different orientations
     * @see [intersects]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalInterval%23OrthogonalInterval-method-calculateUnion">Online Documentation</a>
     */
    fun calculateUnion(
      i1: OrthogonalInterval,
      i2: OrthogonalInterval,
    ): OrthogonalInterval
  }
}
