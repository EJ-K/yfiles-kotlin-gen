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
 * Interface for mutable rectangles aligned to the axes in 2D coordinate space with double precision coordinates.
 * @see [ISize]
 * @see [IPoint]
 * @see [MutableRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle">Online Documentation</a>
 */
external interface IMutableRectangle : IMutableSize, IRectangle {
  /**
   * Gets or sets the x-coordinate for this point.
   * @see [IPoint.x]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23x">Online Documentation</a>
   */
  override var x: Double
  
  /**
   * Gets or sets the y-coordinate for this point.
   * @see [IPoint.y]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23y">Online Documentation</a>
   */
  override var y: Double
  
  /**
   * Adds a rectangle to another one.
   * @param [rectangle2] The rectangle to be added.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IRectangle)">Online Documentation</a>
   */
  final fun add(
    rectangle2: IRectangle,
  ): Unit = definedExternally
  
  /**
   * Adds a rectangle to another one.
   * @param [rectangle2] The rectangle to be added.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IRectangle)">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    rectangle2: IRectangle,
  ): Unit = definedExternally
  
  /**
   * Adds a point to a rectangle, possibly enlarging the rectangle.
   * @param [point] The coordinate to include in the bounds.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IPoint)">Online Documentation</a>
   */
  final fun add(
    point: IPoint,
  ): Unit = definedExternally
  
  /**
   * Adds a point to a rectangle, possibly enlarging the rectangle.
   * @param [point] The coordinate to include in the bounds.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-add(IPoint)">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    point: IPoint,
  ): Unit = definedExternally
  
  /**
   * Sets the center of the rectangle to the provided value.
   * @param [center] The new center coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setCenter">Online Documentation</a>
   */
  final fun setCenter(
    center: Point,
  ): Unit = definedExternally
  
  /**
   * Applies a new position to a given mutable rectangle.
   * @param [location] The new location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setLocation(IPoint)">Online Documentation</a>
   */
  final fun setLocation(
    location: IPoint,
  ): Unit = definedExternally
  
  /**
   * Applies a new position to a given mutable rectangle.
   * @param [x] The new x-coordinate.
   * @param [y] The new y-coordinate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setLocation(number,number)">Online Documentation</a>
   */
  final fun setLocation(
    x: Double,
    y: Double,
  ): Unit = definedExternally
  
  /**
   * Applies a new position and size to a given mutable rectangle.
   * @param [newRectangle] The bounds to set for the `rectangle`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setShape(IRectangle)">Online Documentation</a>
   */
  final fun setShape(
    newRectangle: IRectangle,
  ): Unit = definedExternally
  
  /**
   * Applies a new position and size to a given mutable rectangle.
   * @param [position] The new location.
   * @param [size] The new size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setShape(IPoint,ISize)">Online Documentation</a>
   */
  final fun setShape(
    position: IPoint,
    size: ISize,
  ): Unit = definedExternally
  
  /**
   * Applies a new position and size to a given mutable rectangle.
   * @param [x] The new x-coordinate of the upper left corner of the rectangle.
   * @param [y] The new y-coordinate of the upper left corner of the rectangle.
   * @param [width] The new width of the rectangle.
   * @param [height] The new height of the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableRectangle%23IMutableRectangle-defaultmethod-setShape(number,number,number,number)">Online Documentation</a>
   */
  final fun setShape(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
  ): Unit = definedExternally

  
  companion object : InterfaceMetadata<IMutableRectangle> {
  }
}
