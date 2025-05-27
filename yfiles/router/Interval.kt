// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class represents a one-dimensional closed interval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval">Online Documentation</a>
 * 
 * @constructor Creates a new [Interval] between the given bounds.
 * @param [bound1] the first interval bound
 * @param [bound2] the second interval bound
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-constructor-Interval">Online Documentation</a>
 */
external open class Interval  ( bound1: Double ,
 bound2: Double ) : YObject {

/**
 * Gets the midpoint of the interval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23center">Online Documentation</a>
 */
open val center: Double
/**
 * Gets the upper bound of the interval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23max">Online Documentation</a>
 */
open val max: Double
/**
 * Gets the lower bound of the interval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23min">Online Documentation</a>
 */
open val min: Double
/**
 * Gets the size of the interval, i.e., the difference between the [upper bound][max] and the [lower bound][min].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23size">Online Documentation</a>
 */
open val size: Double
/**
 * Checks whether or not the given value lies within the interval.
 * @param [value] the value to check
 * @return `true` if the value lies within the interval, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-contains">Online Documentation</a>
 */
 open  operator fun contains( value: Double ):Boolean
/**
 * Checks whether or not the given [interval][Interval] fully covers this [interval][Interval] given a small epsilon value.
 * @param [other] the other interval
 * @param [eps] the epsilon value that determines the extended range of the other interval
 * @return `true` if this interval is fully covered by the other interval, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-coveredBy">Online Documentation</a>
 */
 open   fun coveredBy( other: Interval ,
 eps: Double  = definedExternally):Boolean
/**
 * Returns the distance between the value and this [interval][Interval].
 * @param [value] the value to which the distance is calculated
 * @return the distance between the value and the interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-distanceTo(number)">Online Documentation</a>
 */
 open infix   fun distanceTo( value: Double ):Double
/**
 * Returns the distance between this [interval][Interval] and the given [interval][Interval].
 * @param [other] the other interval to which the distance is calculated
 * @return the distance between this interval and the given interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-distanceTo(Interval)">Online Documentation</a>
 */
 open infix   fun distanceTo( other: Interval ):Double
/**
 * Returns the [interval][Interval] bound that is closest to the given value.
 * @param [value] the value for which the closest interval bound will be returned
 * @return 
 *   - the `value`, if the given value lies within the interval, or
 *   - the lower bound, if the given value is smaller than or equal to the lower bound, or
 *   - the upper bound, if the given value is greater than or equal to the upper bound
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-getClosest">Online Documentation</a>
 */
 open   fun getClosest( value: Double ):Double
/**
 * Checks whether or not this [interval][Interval] and the given [interval][Interval] cover the same range.
 * @param [other] the other interval
 * @param [eps] the maximum distance between the two minimum and the two maximum values
 * @return `true` if the intervals cover the same range, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-hasSameRange">Online Documentation</a>
 */
 open   fun hasSameRange( other: Interval ,
 eps: Double  = definedExternally):Boolean
/**
 * Checks whether or not this [interval][Interval] intersects with the given [interval][Interval], considering the given minimum intersection length.
 * @param [other] the other interval to check
 * @param [minIntersection] the minimum length of the intersection of the intervals
 * @return `true` if the intervals intersect at least by the given minimum length, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-intersects">Online Documentation</a>
 */
 open   fun intersects( other: Interval ,
 minIntersection: Double  = definedExternally):Boolean
/**
 * Checks whether or not the lower bound of this [interval][Interval] is greater than the upper bound of the given interval.
 * @param [other] the interval to compare
 * @return `true` if the current interval is on the right of the given one, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-isGreaterThan">Online Documentation</a>
 */
 open infix   fun isGreaterThan( other: Interval ):Boolean
/**
 * Checks whether or not the upper bound of this [interval][Interval] is smaller than the lower bound of the given interval.
 * @param [other] the interval to compare
 * @return `true` if the current interval is on the left of the given one, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-isLessThan">Online Documentation</a>
 */
 open infix   fun isLessThan( other: Interval ):Boolean

companion object : ClassMetadata<Interval> {
/**
 * Returns the bridging [interval][Interval] between the given [intervals][Interval].
 * @param [i1] the first interval
 * @param [i2] the second interval
 * @return the bridging interval between the given intervals or `null` if the intervals intersect
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateBridge">Online Documentation</a>
 */
 final   fun calculateBridge( i1: Interval ,
 i2: Interval ):Interval?
/**
 * Returns the intersection of the given [intervals][Interval].
 * @param [i1] the first interval
 * @param [i2] the second interval
 * @return the intersection of the given intervals or `null` if the intervals do not intersect
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateIntersection">Online Documentation</a>
 */
 final   fun calculateIntersection( i1: Interval ,
 i2: Interval ):Interval?
/**
 * Returns the spanning rectangle between the given [intervals][Interval].
 * @param [horizontal] the interval that defines the location and length of the rectangle in horizontal dimension
 * @param [vertical] the interval that defines the location and length of the rectangle in vertical dimension
 * @return the spanning rectangle between the given intervals
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateSpanningRectangle">Online Documentation</a>
 */
 final   fun calculateSpanningRectangle( horizontal: Interval ,
 vertical: Interval ):YRectangle
/**
 * Returns the union of the given [intervals][Interval].
 * @param [i1] the first interval
 * @param [i2] the second interval
 * @return the union of the given intervals
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateUnion(Interval,Interval)">Online Documentation</a>
 */
 final   fun calculateUnion( i1: Interval ,
 i2: Interval ):Interval
/**
 * Returns the union of the given [intervals][Interval] and the given value.
 * @param [interval] the interval to be extended
 * @param [value] the value to be in the union
 * @return the union of the given interval and the given value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Interval%23Interval-method-calculateUnion(Interval,number)">Online Documentation</a>
 */
 final   fun calculateUnion( interval: Interval ,
 value: Double ):Interval
}
}
