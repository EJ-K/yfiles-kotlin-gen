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
 * A mutable rectangle in 2D coordinate space with double precision values stored in an instance of [IMutablePoint] and [IMutableSize].
 * @see [IRectangle]
 * @see [IMutableRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided values to initialize the position and size.
 * @param [x] The x coordinate of the upper left corner of the rectangle.
 * @param [y] The y coordinate of the upper left corner of the rectangle.
 * @param [width] The width of the rectangle.
 * @param [height] The height of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(number,number,number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets or sets the x coordinate of the upper left corner of this instance from the [location] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23x">Online Documentation</a>
 * 
 * @property y
 * Gets or sets the y coordinate of the upper left corner of this instance from the [location] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23y">Online Documentation</a>
 * 
 * @property width
 * Gets or sets the width of this instance from the [size] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23width">Online Documentation</a>
 * 
 * @property height
 * Gets or sets the height of this instance from the [size] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23height">Online Documentation</a>
 */
external  class MutableRectangle  (
final override var x: Double,
final override var y: Double,
final override var width: Double,
final override var height: Double) : IMutableRectangle, IOrientedRectangle, ICloneable<MutableRectangle> {
/**
 * Creates a new empty instance located at the origin with width and height set to `-1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle()">Online Documentation</a>
 */
 constructor()
/**
 * Creates a new instance initialized to the values of the provided argument.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(IRectangle)">Online Documentation</a>
 */
 constructor( rectangle: IRectangle )
/**
 * Creates a new instance using the provided implementation for the storage of the position and size of the rectangle.
 * @param [location] The provider for the dynamic position of this instance.
 * @param [size] The provider for the dynamic size of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(IMutablePoint,IMutableSize)">Online Documentation</a>
 */
 constructor( location: IMutablePoint ,
 size: IMutableSize )
/**
 * Creates a new instance using the provided values to initialize the position and size.
 * @param [location] The coordinates of the upper left corner of the rectangle.
 * @param [size] The size of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-constructor-MutableRectangle(Point,Size)">Online Documentation</a>
 */
 constructor( location: Point ,
 size: Size )

/**
 * Gets the x coordinate of the [location].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23anchorX">Online Documentation</a>
 */
final override var anchorX: Double
/**
 * Gets the y coordinate of the [location] plus the [ISize.height].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23anchorY">Online Documentation</a>
 */
final override var anchorY: Double
/**
 * Gets the position of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23location">Online Documentation</a>
 */
final var location: IPoint
/**
 * Gets the size of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23size">Online Documentation</a>
 */
final var size: ISize
/**
 * Gets the x value of the up vector which is always `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23upX">Online Documentation</a>
 */
final override val upX: Double
/**
 * Gets the y value of the up vector which is always `-1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23upY">Online Documentation</a>
 */
final override val upY: Double
/**
 * Gets or sets the x coordinate of the lower right corner of this instance using the [location] and [size] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23x2">Online Documentation</a>
 */
final var x2: Double
/**
 * Gets or sets the y coordinate of the lower right corner of this instance using the [location] and [size] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23y2">Online Documentation</a>
 */
final var y2: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-method-clone">Online Documentation</a>
 */
 final override   fun clone():MutableRectangle
/**
 * Moves this rectangle by applying the offset to the [location]
 * @param [delta] The offset to move the rectangle's position by.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MutableRectangle%23MutableRectangle-method-moveBy">Online Documentation</a>
 */
 final   fun moveBy( delta: Point )

companion object : ClassMetadata<MutableRectangle> {
}
}
