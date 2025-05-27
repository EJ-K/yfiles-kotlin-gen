// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * A mutable point in 2D coordinate space with double precision coordinates.
 * @see [IPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint">Online Documentation</a>
 * 
 * @constructor Creates an instance using the given coordinate pair.
 * @param [x] The x coordinate
 * @param [y] The y coordinate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23MutablePoint-constructor-MutablePoint(number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets or sets the x coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23x">Online Documentation</a>
 * 
 * @property y
 * Gets or sets the y coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23y">Online Documentation</a>
 */
external  class MutablePoint  (
final override var x: Double,
final override var y: Double) : IMutablePoint, ICloneable<MutablePoint> {
/**
 * Creates the point with initially `0.0` values for [x] and [y].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23MutablePoint-constructor-MutablePoint()">Online Documentation</a>
 */
 constructor()
/**
 * Creates an instance using the given coordinate pair.
 * @param [point] The coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23MutablePoint-constructor-MutablePoint(IPoint)">Online Documentation</a>
 */
 constructor( point: IPoint )

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23MutablePoint-method-clone">Online Documentation</a>
 */
 final override   fun clone():MutablePoint
/**
 * Moves this instance by adding the provided offsets to the coordinates of this point.
 * @param [delta] The offset to add to this point's x coordinate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23MutablePoint-method-moveBy">Online Documentation</a>
 */
 final   fun moveBy( delta: Point )
/**
 * Normalizes this point as if it was a vector.
 * @see [Point.normalized]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutablePoint%23MutablePoint-method-normalize">Online Documentation</a>
 */
 final   fun normalize()

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

companion object : ClassMetadata<MutablePoint> {
}
}
