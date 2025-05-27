// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.InterfaceMetadata

/**
 * Interface for rectangles aligned to the axes in 2D coordinate space with double precision coordinates.
 * @see [IMutableRectangle]
 * @see [IMutablePoint]
 * @see [ISize]
 * @see [IPoint]
 * @see [MutableRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle">Online Documentation</a>
 */
external interface IRectangle : ISize, IPoint {
/**
 * Gets the coordinates of the bottom left corner of the rectangle as a [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23bottomLeft">Online Documentation</a>
 */
final val bottomLeft: Point
/**
 * Gets the coordinates of the bottom right corner of the rectangle as a [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23bottomRight">Online Documentation</a>
 */
final val bottomRight: Point
/**
 * Gets the coordinates of the center of the rectangle as a [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23center">Online Documentation</a>
 */
final val center: Point
/**
 * Determines whether the specified rectangle is empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23isEmpty">Online Documentation</a>
 */
final val isEmpty: Boolean
/**
 * Gets the maximum X coordinate of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23maxX">Online Documentation</a>
 */
final val maxX: Double
/**
 * Gets the maximum Y coordinate of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23maxY">Online Documentation</a>
 */
final val maxY: Double
/**
 * Gets the coordinates of the top left corner of the rectangle as a [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23topLeft">Online Documentation</a>
 */
final val topLeft: Point
/**
 * Gets the coordinates of the top right corner of the rectangle as a [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23topRight">Online Documentation</a>
 */
final val topRight: Point
/**
 * Determines whether the given rectangle contains the provided point.
 * @param [point] The point to test.
 * @return `true` iff the point lies inside the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23IRectangle-defaultmethod-contains">Online Documentation</a>
 */
  final operator fun contains( point: IPoint ):Boolean = definedExternally
/**
 * Copies the current values of the rectangle to [Rect] struct.
 * @return A [Rect] that holds the values of the `rectangle` at the time of the invocation.
 * @see [IMutableRectangle.reshape]
 * @see [Rect.toMutableRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23IRectangle-defaultmethod-toRect">Online Documentation</a>
 */
  final  fun toRect():Rect = definedExternally

companion object : InterfaceMetadata<IRectangle> {
}
}

inline val  IRectangle.isNotEmpty: Boolean
    get() = !isEmpty
