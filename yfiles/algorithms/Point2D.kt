// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * Represents a two-dimensional point located at `(x, y)`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D">Online Documentation</a>
 * 
 * @constructor Creates a new instance at the given location.
 * @param [x] The x coordinate of the new point
 * @param [y] The x coordinate of the new point
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-constructor-Point2D(number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets the x coordinate of this point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23x">Online Documentation</a>
 * 
 * @property y
 * Gets the y coordinate of this point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23y">Online Documentation</a>
 */
external open class Point2D  (
open val x: Double,
open val y: Double) : ICloneable<Point2D> {
/**
 * Creates a new instance that is located at `(0, 0)`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-constructor-Point2D()">Online Documentation</a>
 */
 constructor()

/**
 * Sets the location of this point to the same values as for the given point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23location">Online Documentation</a>
 */
open var location: Point2D
@Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
get
/**
 * Creates a new instance of this class that has the same values as this objects.
 * @return a new instance of this class that has the same values as this objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-clone">Online Documentation</a>
 */
 override   fun clone():Point2D
/**
 * Calculates the distance between this points and another one.
 * @param [p] The second point.
 * @return the distance between this points and another one.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-distance(Point2D)">Online Documentation</a>
 */
 open infix   fun distance( p: Point2D ):Double
/**
 * Calculates the distance between this points and another one, given as its coordinates.
 * @param [px] The x coordinate of the second point.
 * @param [py] The y coordinate of the second point.
 * @return the distance between this points and another one, given as its coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-distance(number,number)">Online Documentation</a>
 */
 open   fun distance( px: Double ,
 py: Double ):Double
/**
 * Calculates the squared distance between this points and another one.
 * @param [p] The second point.
 * @return the squared distance between this points and another one.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-distanceSq(Point2D)">Online Documentation</a>
 */
 open infix   fun distanceSq( p: Point2D ):Double
/**
 * Calculates the squared distance between this points and another one, given as its coordinates.
 * @param [px] The x coordinate of the second point.
 * @param [py] The y coordinate of the second point.
 * @return the squared distance between this points and another one, given as its coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-distanceSq(number,number)">Online Documentation</a>
 */
 open   fun distanceSq( px: Double ,
 py: Double ):Double
/**
 * Sets the location of this point to the given coordinates.
 * @param [x] the new x coordinate
 * @param [y] the new y coordinate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-setLocation">Online Documentation</a>
 */
 open   fun setLocation( x: Double ,
 y: Double )
/**
 * Creates a [Point] from a given [Point2D].
 * @return The [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-defaultmethod-toPoint">Online Documentation</a>
 */
   fun toPoint():Point

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

companion object : ClassMetadata<Point2D> {
/**
 * Calculates the distance between two points, given as their coordinates.
 * @param [x1] The x coordinate of the first point.
 * @param [y1] The y coordinate of the first point.
 * @param [x2] The x coordinate of the second point.
 * @param [y2] The y coordinate of the second point.
 * @return the distance between two points, given as their coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-distance">Online Documentation</a>
 */
 final   fun distance( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ):Double
/**
 * Calculates the squared distance between two points, given as their coordinates.
 * @param [x1] The x coordinate of the first point.
 * @param [y1] The y coordinate of the first point.
 * @param [x2] The x coordinate of the second point.
 * @param [y2] The y coordinate of the second point.
 * @return the squared distance between two points, given as their coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Point2D%23Point2D-method-distanceSq">Online Documentation</a>
 */
 final   fun distanceSq( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ):Double
}
}
