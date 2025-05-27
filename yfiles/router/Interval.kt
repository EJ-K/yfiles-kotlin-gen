// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata

/**
 * This class represents a one-dimensional closed interval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval">Online Documentation</a>
 * 
 * @constructor Creates a new [Interval] between the given bounds.
 * @param [bound1] the first interval bound
 * @param [bound2] the second interval bound
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-constructor-Interval">Online Documentation</a>
 */
external class Interval (
  bound1: Double,
  bound2: Double,
)  {
  /**
   * Gets the midpoint of the interval.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23center">Online Documentation</a>
   */
  final val center: Double
  
  /**
   * Gets the upper bound of the interval.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23maximum">Online Documentation</a>
   */
  final val maximum: Double
  
  /**
   * Gets the lower bound of the interval.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23minimum">Online Documentation</a>
   */
  final val minimum: Double
  
  /**
   * Gets the size of the interval, i.e., the difference between the [upper bound][Interval] and the [lower bound][Interval].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23size">Online Documentation</a>
   */
  final val size: Double
  
  /**
   * Checks whether or not the given value lies within the interval.
   * @param [value] the value to check
   * @return `true` if the value lies within the interval, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-contains">Online Documentation</a>
   */
  operator fun contains(
    value: Double,
  ): Boolean
  
  /**
   * Checks whether or not the given [Interval] fully covers this [Interval] given a small epsilon value.
   * @param [other] the other interval
   * @param [eps] the epsilon value that determines the extended range of the other interval
   * @return `true` if this interval is fully covered by the other interval, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-coveredBy">Online Documentation</a>
   */
  fun coveredBy(
    other: Interval,
    eps: Double  = definedExternally,
  ): Boolean
  
  /**
   * Returns the distance between the value and this [Interval].
   * @param [value] The value to which the distance is calculated
   * @return The distance between the value and the interval
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-distanceTo(number)">Online Documentation</a>
   */
  infix fun distanceTo(
    value: Double,
  ): Double
  
  /**
   * Returns the distance between this [Interval] and the given [Interval].
   * @param [other] the other interval to which the distance is calculated
   * @return the distance between this interval and the given interval
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-distanceTo(Interval)">Online Documentation</a>
   */
  infix fun distanceTo(
    other: Interval,
  ): Double
  
  /**
   * Returns the [Interval] bound that is closest to the given value.
   * @param [value] The value for which the closest interval bound will be returned
   * @return 
   *   - The `value`, if the given value lies within the interval, or
   *   - The lower bound, if the given value is smaller than or equal to the lower bound, or
   *   - The upper bound, if the given value is greater than or equal to the upper bound
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-getClosest">Online Documentation</a>
   */
  fun getClosest(
    value: Double,
  ): Double
  
  /**
   * Checks whether or not this [Interval] and the given [Interval] cover the same range.
   * @param [other] the other interval
   * @param [eps] the maximum distance between the two minimum and the two maximum values
   * @return `true` if the intervals cover the same range, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-hasSameRange">Online Documentation</a>
   */
  fun hasSameRange(
    other: Interval,
    eps: Double  = definedExternally,
  ): Boolean
  
  /**
   * Checks whether or not this [Interval] intersects with the given [Interval], considering the given minimum intersection length.
   * @param [other] the other interval to check
   * @param [minIntersection] the minimum length of the intersection of the intervals
   * @return `true` if the intervals intersect at least by the given minimum length, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-intersects">Online Documentation</a>
   */
  fun intersects(
    other: Interval,
    minIntersection: Double  = definedExternally,
  ): Boolean
  
  /**
   * Checks whether or not the lower bound of this [Interval] is greater than the upper bound of the given interval.
   * @param [other] the interval to compare
   * @return `true` if the current interval is on the right of the given one, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-isGreaterThan">Online Documentation</a>
   */
  infix fun isGreaterThan(
    other: Interval,
  ): Boolean
  
  /**
   * Checks whether or not the upper bound of this [Interval] is smaller than the lower bound of the given interval.
   * @param [other] the interval to compare
   * @return `true` if the current interval is on the left of the given one, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-isLessThan">Online Documentation</a>
   */
  infix fun isLessThan(
    other: Interval,
  ): Boolean
  
  companion object : ClassMetadata<Interval> {
    /**
     * Returns the bridging [Interval] between the given [Interval]s.
     * @param [i1] the first interval
     * @param [i2] the second interval
     * @return the bridging interval between the given intervals or `null` if the intervals intersect
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateBridge">Online Documentation</a>
     */
    fun calculateBridge(
      i1: Interval,
      i2: Interval,
    ): Interval?
    
    /**
     * Returns the intersection of the given [Interval]s.
     * @param [i1] the first interval
     * @param [i2] the second interval
     * @return the intersection of the given intervals or `null` if the intervals do not intersect
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateIntersection">Online Documentation</a>
     */
    fun calculateIntersection(
      i1: Interval,
      i2: Interval,
    ): Interval?
    
    /**
     * Returns the spanning rectangle between the given [Interval]s.
     * @param [horizontal] the interval that defines the location and length of the rectangle in horizontal dimension
     * @param [vertical] the interval that defines the location and length of the rectangle in vertical dimension
     * @return the spanning rectangle between the given intervals
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateSpanningRectangle">Online Documentation</a>
     */
    fun calculateSpanningRectangle(
      horizontal: Interval,
      vertical: Interval,
    ): Rect
    
    /**
     * Returns the union of the given [Interval]s.
     * @param [i1] the first interval
     * @param [i2] the second interval
     * @return the union of the given intervals
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateUnion(Interval,Interval)">Online Documentation</a>
     */
    fun calculateUnion(
      i1: Interval,
      i2: Interval,
    ): Interval
    
    /**
     * Returns the union of the given [Interval]s and the given value.
     * @param [interval] the interval to be extended
     * @param [value] the value to be in the union
     * @return the union of the given interval and the given value
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateUnion(Interval,number)">Online Documentation</a>
     */
    fun calculateUnion(
      interval: Interval,
      value: Double,
    ): Interval
  }
}
