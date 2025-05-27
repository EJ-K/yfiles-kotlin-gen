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
external interface IRectangle : ISize {
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
   * Gets the center x-coordinate of the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23centerX">Online Documentation</a>
   */
  final val centerX: Double
  
  /**
   * Gets the center y-coordinate of the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23centerY">Online Documentation</a>
   */
  final val centerY: Double
  
  /**
   * Gets the maximum x-coordinate of the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23maxX">Online Documentation</a>
   */
  final val maxX: Double
  
  /**
   * Gets the maximum y-coordinate of the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23maxY">Online Documentation</a>
   */
  final val maxY: Double
  
  /**
   * Gets the current size of the rectangle as [Size].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23size">Online Documentation</a>
   */
  final val size: Size
  
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
   * Gets the current x-coordinate of this point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23x">Online Documentation</a>
   */
  val x: Double
  
  /**
   * Gets the current y-coordinate of this point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23y">Online Documentation</a>
   */
  val y: Double
  
  /**
   * Determines whether the given rectangle contains the provided point.
   * @param [point] The point to test.
   * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
   * @return `true` iff the point lies inside the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23IRectangle-defaultmethod-contains">Online Documentation</a>
   */
  final fun contains(
    point: IPoint,
    eps: Double  = definedExternally,
  ): Boolean = definedExternally
  
  /**
   * Determines whether the given rectangle contains the provided rectangle.
   * @param [other] The rectangle to test.
   * @param [eps] A positive value allows for fuzzy hit testing.
   * @return `true` if the given rectangle contains the provided rectangle, `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23IRectangle-defaultmethod-containsRectangle">Online Documentation</a>
   */
  final fun containsRectangle(
    other: IRectangle,
    eps: Double  = definedExternally,
  ): Boolean = definedExternally
  
  /**
   * Creates a [Rect] instance with the current values of this rectangle.
   * @return A [Rect] that holds the values of the `rectangle` at the time of the invocation.
   * @see [Rect.toMutableRectangle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRectangle%23IRectangle-defaultmethod-toRect">Online Documentation</a>
   */
  final fun toRect(): Rect = definedExternally

  
  companion object : InterfaceMetadata<IRectangle> {
  }
}
